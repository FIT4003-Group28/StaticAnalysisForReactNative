package com.google.android.apps.gmm.location.events;
/* compiled from: PG */
@ckol(a = "car-head", b = ckok.HIGH)
/* loaded from: classes.dex */
public class CarHeadingEvent {
    private final ahmn carHeading;
    private final boolean mayRecord;

    public CarHeadingEvent(@ckoo(a = "timeMs", d = true) long j, @ckoo(a = "head") float f, @ckoo(a = "sd") float f2, @ckoo(a = "rot") float f3, @ckoo(a = "use") boolean z, @dzsi @ckoo(a = "pose") ahrn ahrnVar) {
        ahmm bZ = ahmn.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ahmn ahmnVar = (ahmn) bZ.b;
        int i = ahmnVar.a | 1;
        ahmnVar.a = i;
        ahmnVar.b = j;
        int i2 = i | 2;
        ahmnVar.a = i2;
        ahmnVar.c = f;
        int i3 = i2 | 4;
        ahmnVar.a = i3;
        ahmnVar.d = f2;
        int i4 = i3 | 8;
        ahmnVar.a = i4;
        ahmnVar.e = f3;
        ahmnVar.a = i4 | 16;
        ahmnVar.f = z;
        if (ahrnVar != null) {
            duhi proto = toProto(ahrnVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ahmn ahmnVar2 = (ahmn) bZ.b;
            proto.getClass();
            ahmnVar2.g = proto;
            ahmnVar2.a |= 32;
        }
        this.carHeading = bZ.bK();
        this.mayRecord = true;
    }

    public CarHeadingEvent(ahmn ahmnVar, boolean z) {
        this.carHeading = ahmnVar;
        this.mayRecord = z;
    }

    private static ahrn fromProto(duhi duhiVar) {
        return new ahrn((float) duhiVar.a, (float) duhiVar.b, (float) duhiVar.c, (float) duhiVar.d);
    }

    private static duhi toProto(ahrn ahrnVar) {
        duhh bZ = duhi.e.bZ();
        double d = ahrnVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duhi duhiVar = (duhi) bZ.b;
        duhiVar.a = d;
        duhiVar.b = ahrnVar.b;
        duhiVar.c = ahrnVar.c;
        duhiVar.d = ahrnVar.d;
        return bZ.bK();
    }

    public ahmn getCarHeading() {
        return this.carHeading;
    }

    public String getExtraDataForTombstone() {
        return null;
    }

    @ckom(a = "head")
    public float getHeading() {
        return this.carHeading.c;
    }

    @ckom(a = "sd")
    public float getHeadingStd() {
        return this.carHeading.d;
    }

    @ckom(a = "pose")
    @dzsi
    public ahrn getPose() {
        ahmn ahmnVar = this.carHeading;
        if ((ahmnVar.a & 32) != 0) {
            duhi duhiVar = ahmnVar.g;
            if (duhiVar == null) {
                duhiVar = duhi.e;
            }
            return fromProto(duhiVar);
        }
        return null;
    }

    @ckom(a = "rot")
    public float getRateOfTurn() {
        return this.carHeading.e;
    }

    @ckom(a = "timeMs")
    public long getTimeMs() {
        return this.carHeading.b;
    }

    @ckon(a = "pose")
    public boolean hasPose() {
        return (this.carHeading.a & 32) != 0;
    }

    public boolean mayRecord() {
        return this.mayRecord;
    }

    @ckom(a = "use")
    public boolean shouldUseHeading() {
        return this.carHeading.f;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.g("timeMs", getTimeMs());
        b.e("heading", getHeading());
        b.e("rateOfTurn", getRateOfTurn());
        b.e("headingStdDev", getHeadingStd());
        b.h("shouldUseHeading", shouldUseHeading());
        b.b("pose", getPose());
        return b.toString();
    }
}
