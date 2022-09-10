package defpackage;
/* compiled from: PG */
/* renamed from: bmtp  reason: default package */
/* loaded from: classes3.dex */
public class bmtp {
    public final boolean a;
    public final dcdc<bmtj> b;
    public final bmtm c;

    public bmtp(boolean z, dcdc<bmtj> dcdcVar, bmtm bmtmVar) {
        boolean z2 = true;
        if (z && dcdcVar.isEmpty()) {
            z2 = false;
        }
        dbsk.a(z2);
        this.a = z;
        dbsk.a(dcmw.a.p(dchl.k(dcdcVar, bmtn.a)));
        this.b = dcdcVar;
        this.c = bmtmVar;
    }

    public final int a() {
        return this.b.size();
    }
}
