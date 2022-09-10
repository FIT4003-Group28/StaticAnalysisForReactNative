package defpackage;
/* compiled from: PG */
/* renamed from: crqg  reason: default package */
/* loaded from: classes5.dex */
public class crqg {
    public final amvh a;
    public final cray b;

    public crqg(amvh amvhVar, cray crayVar) {
        dbsk.t(amvhVar, "destination");
        this.a = amvhVar;
        dbsk.t(crayVar, "navGuidanceState");
        this.b = crayVar;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("destination", this.a);
        b.b("navGuidanceState", this.b);
        return b.toString();
    }
}
