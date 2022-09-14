package com.google.android.apps.gmm.transit.go.activity;

import com.google.android.gms.location.DetectedActivity;
/* compiled from: PG */
@ckor
@ckol(a = "tg-activity", b = ckok.MEDIUM)
/* loaded from: classes.dex */
public class TransitGuidanceActivityRecognitionEvent {
    private final byys activity;

    public TransitGuidanceActivityRecognitionEvent(byys byysVar) {
        this.activity = byysVar;
    }

    public TransitGuidanceActivityRecognitionEvent(@ckoo(a = "activityStr") String str) {
        byys byysVar;
        byys[] values = byys.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                byysVar = byys.UNKNOWN;
                break;
            } else if (values[i].name().equals(str)) {
                byysVar = byys.a(str);
                break;
            } else {
                i++;
            }
        }
        this.activity = byysVar;
    }

    public static byys getActivity(DetectedActivity detectedActivity) {
        int a = detectedActivity.a();
        if (a != 0) {
            if (a == 1) {
                return byys.ON_BICYCLE;
            }
            if (a == 2) {
                return byys.ON_FOOT;
            }
            if (a == 3) {
                return byys.STILL;
            }
            if (a == 5) {
                return byys.TILTING;
            }
            if (a == 7) {
                return byys.WALKING;
            }
            if (a != 8) {
                switch (a) {
                    case 12:
                        return byys.ON_STAIRS;
                    case 13:
                        return byys.ON_ESCALATOR;
                    case 14:
                        return byys.IN_ELEVATOR;
                    default:
                        return byys.UNKNOWN;
                }
            }
            return byys.RUNNING;
        }
        return byys.IN_VEHICLE;
    }

    public byys getActivity() {
        return this.activity;
    }

    @ckom(a = "activityStr")
    public String getActivityStr() {
        return this.activity.toString();
    }
}
