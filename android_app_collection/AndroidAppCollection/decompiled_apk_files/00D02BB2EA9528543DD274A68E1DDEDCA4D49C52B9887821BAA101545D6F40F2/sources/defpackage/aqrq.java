package defpackage;
/* compiled from: PG */
/* renamed from: aqrq  reason: default package */
/* loaded from: classes2.dex */
public final class aqrq {
    public final bvjj a;
    public final aqwq b;
    public final apyx c;
    private final cjqy d;

    public aqrq(bvjj bvjjVar, aqwq aqwqVar, apyx apyxVar, cjqy cjqyVar) {
        this.a = bvjjVar;
        this.b = aqwqVar;
        this.c = apyxVar;
        this.d = cjqyVar;
    }

    public final void a(boolean z, boolean z2, String str) {
        ddda dddaVar;
        if (z2) {
            if (z) {
                dddaVar = ddda.aN;
            } else {
                dddaVar = ddda.aO;
            }
        } else if (z) {
            dddaVar = ddda.aQ;
        } else {
            dddaVar = ddda.aR;
        }
        ddzf bZ = ddzg.t.bZ();
        ddii bZ2 = ddij.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddij ddijVar = (ddij) bZ2.b;
        str.getClass();
        ddijVar.a |= 2;
        ddijVar.c = str;
        bZ.a(bZ2.bK());
        cjqy cjqyVar = this.d;
        cjst d = cjsu.d();
        d.d(dddaVar);
        cjry e = cjrz.e();
        e.b(ddcu.m);
        ((cjrn) e).a = bZ.bK();
        d.f(e.a());
        cjqyVar.l(d.e());
    }
}
