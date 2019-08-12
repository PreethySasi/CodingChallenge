package utility.files;

import codingChallenge.Event;
import dto.EventDto;

public class CodingChallengeUtility {
     
    public Event alertEvent(EventDto startTimeStamp, EventDto finishTimeStamp) {
        Long duration =  finishTimeStamp.getTimestamp() - startTimeStamp.getTimestamp();
        boolean isAlert = duration > 4;
        return new Event(startTimeStamp.getId(), duration, startTimeStamp.getType(), startTimeStamp.getHost(), isAlert);
    }
}