package com.google.android.apps.gmm.mylocation.events;
/* compiled from: PG */
@ckor
@ckol(a = "activity", b = ckok.MEDIUM)
/* loaded from: classes.dex */
public class ActivityRecognitionEvent {
    private final ardj activity;

    public ActivityRecognitionEvent(ardj ardjVar) {
        this.activity = ardjVar;
    }

    public ActivityRecognitionEvent(@ckoo(a = "activityString") String str) {
        ardj ardjVar;
        ardj[] values = ardj.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ardjVar = ardj.UNKNOWN;
                break;
            } else if (values[i].name().equals(str)) {
                ardjVar = ardj.a(str);
                break;
            } else {
                i++;
            }
        }
        this.activity = ardjVar;
    }

    public ardj getActivity() {
        return this.activity;
    }

    @ckom(a = "activityString")
    public String getActivityString() {
        return this.activity.toString();
    }
}
