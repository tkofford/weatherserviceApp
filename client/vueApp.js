const url = "http://localhost:9000/api/weather?location=";

const vm = new Vue({
        el: '#app',
        data: {
            today: {},
            daily: [],
            location: ""
        },
        mounted() {
          if (localStorage.location) {
            this.location = localStorage.location;
          }
          axios.get(url + this.location).then(response => {
//          axios.get(`${'https://cors-anywhere.herokuapp.com/'}http://localhost:9000/api/weather`).then(response => {
            this.today = response.data.today;
            this.daily = response.data.daily;
            this.location = this.today.city + ", " + this.today.state;
            if (localStorage.location != this.location) {
              localStorage.location = this.location;
            }

          })
        },
        methods: {
          resetLocation() {
            localStorage.location = "";
            this.location = "";
          }
        }
      });
