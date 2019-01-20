package weatherservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Todd Kofford
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {

	private String description;
	private String highTemperature;
	private String lowTemperature;
	private String weekday;
	private String utcTime;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Daily() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHighTemperature() {
		return highTemperature;
	}

	public void setHighTemperature(String highTemperature) {
		this.highTemperature = highTemperature;
	}

	public String getLowTemperature() {
		return lowTemperature;
	}

	public void setLowTemperature(String lowTemperature) {
		this.lowTemperature = lowTemperature;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getUtcTime() {
		return utcTime;
	}

	public void setUtcTime(String utcTime) {
		this.utcTime = utcTime;
	}

	@Override
	public String toString() {
		return "Daily [description=" + description + ", highTemperature=" + highTemperature + ", lowTemperature="
				+ lowTemperature + ", weekday=" + weekday + ", utcTime=" + utcTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((highTemperature == null) ? 0 : highTemperature.hashCode());
		result = prime * result + ((lowTemperature == null) ? 0 : lowTemperature.hashCode());
		result = prime * result + ((utcTime == null) ? 0 : utcTime.hashCode());
		result = prime * result + ((weekday == null) ? 0 : weekday.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Daily other = (Daily) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (highTemperature == null) {
			if (other.highTemperature != null) {
				return false;
			}
		} else if (!highTemperature.equals(other.highTemperature)) {
			return false;
		}
		if (lowTemperature == null) {
			if (other.lowTemperature != null) {
				return false;
			}
		} else if (!lowTemperature.equals(other.lowTemperature)) {
			return false;
		}
		if (utcTime == null) {
			if (other.utcTime != null) {
				return false;
			}
		} else if (!utcTime.equals(other.utcTime)) {
			return false;
		}
		if (weekday == null) {
			if (other.weekday != null) {
				return false;
			}
		} else if (!weekday.equals(other.weekday)) {
			return false;
		}
		return true;
	}


}