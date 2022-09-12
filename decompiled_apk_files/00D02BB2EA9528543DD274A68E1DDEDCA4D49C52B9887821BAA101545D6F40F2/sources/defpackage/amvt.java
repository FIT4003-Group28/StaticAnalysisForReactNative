package defpackage;
/* compiled from: PG */
/* renamed from: amvt  reason: default package */
/* loaded from: classes.dex */
public final class amvt {
    public boolean a;
    public int b;
    public boolean c;

    public amvt() {
        this.b = -1;
        this.c = false;
    }

    public amvt(amvt amvtVar) {
        this.b = -1;
        this.c = false;
        this.a = amvtVar.a;
        this.b = amvtVar.b;
        this.c = amvtVar.c;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof amvt)) {
            return false;
        }
        amvt amvtVar = (amvt) obj;
        return this.a == amvtVar.a && this.b == amvtVar.b;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.h("isGpsAccurate", this.a);
        b.f("numSatInFix", this.b);
        b.h("mightBeDeadReckoned", this.c);
        return b.toString();
    }
}
