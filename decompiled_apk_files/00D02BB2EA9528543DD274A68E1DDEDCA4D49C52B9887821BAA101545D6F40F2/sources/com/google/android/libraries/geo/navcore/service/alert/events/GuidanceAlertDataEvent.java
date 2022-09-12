package com.google.android.libraries.geo.navcore.service.alert.events;
/* compiled from: PG */
@ckol(a = "gwd", b = ckok.MEDIUM)
/* loaded from: classes.dex */
public class GuidanceAlertDataEvent {
    @dzsi
    private final Double confidence;
    private final int gwdMaxDistance;
    private final int gwdMinDistance;
    private final boolean isStrict;
    private final String locationProbBallAsString;
    private final int stepDistanceFromStartM;
    private final String text;

    public GuidanceAlertDataEvent(@ckoo(a = "text") String str, @ckoo(a = "gwdMinDist") int i, @ckoo(a = "gwdMaxDist") int i2, @ckoo(a = "stepDistanceFromStartM") int i3, @dzsi @ckoo(a = "confidence") Double d, @ckoo(a = "isStrict") boolean z, @ckoo(a = "probBall") String str2) {
        this.text = str;
        this.gwdMinDistance = i;
        this.gwdMaxDistance = i2;
        this.stepDistanceFromStartM = i3;
        this.confidence = d;
        this.isStrict = z;
        this.locationProbBallAsString = str2;
    }

    @ckom(a = "confidence")
    @dzsi
    public Double getConfidence() {
        return this.confidence;
    }

    @ckom(a = "gwdMaxDist")
    public int getGwdMaxDistance() {
        return this.gwdMaxDistance;
    }

    @ckom(a = "gwdMinDist")
    public int getGwdMinDistance() {
        return this.gwdMinDistance;
    }

    @ckom(a = "probBall")
    public String getLocationProbBallAsString() {
        return this.locationProbBallAsString;
    }

    @ckom(a = "stepDistanceFromStartM")
    public int getStepDistanceFromStartM() {
        return this.stepDistanceFromStartM;
    }

    @ckom(a = "text")
    public String getText() {
        return this.text;
    }

    @ckom(a = "isStrict")
    public boolean isStrict() {
        return this.isStrict;
    }

    public String toString() {
        dbsb d = dbsc.d("GuidanceAlertDataEvent");
        d.b("text", this.text);
        d.f("gwdMinDist", this.gwdMinDistance);
        d.f("gwdMaxDist", this.gwdMaxDistance);
        d.f("stepDistanceFromStartM", this.stepDistanceFromStartM);
        d.b("confidence", this.confidence);
        d.h("isStrict", this.isStrict);
        d.b("probBall", this.locationProbBallAsString);
        return d.toString();
    }
}
