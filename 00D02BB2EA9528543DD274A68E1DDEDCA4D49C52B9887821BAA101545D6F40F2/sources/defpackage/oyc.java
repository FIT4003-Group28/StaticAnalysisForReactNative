package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oyc  reason: default package */
/* loaded from: classes7.dex */
public class oyc implements cjyu<jba> {
    private final bnjv a;
    private final dxio<ahjq> b;

    public oyc(bnjv bnjvVar, dxio<ahjq> dxioVar) {
        this.a = bnjvVar;
        this.b = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jba b(bnjv bnjvVar, dxio<ahjq> dxioVar, cjzt cjztVar, dtof dtofVar) {
        ilo c = owy.c(dtofVar);
        bnjs a = bnjvVar.a(c);
        a.a = new oyb(dtofVar, cjztVar);
        a.b = cjztVar.d;
        a.c = dxioVar.a().a();
        a.n = oyf.b(cjztVar.b, c.bY().d, dtxq.t, cjztVar.e, (dtofVar.a & 256) != 0 ? decs.a(dtofVar.h) : null);
        return a.a();
    }

    @Override // defpackage.cjyu
    public final /* bridge */ /* synthetic */ jba a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtof dtofVar = dtkuVar.d;
        if (dtofVar == null) {
            dtofVar = dtof.i;
        }
        return c(cjztVar, dtofVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jba c(cjzt cjztVar, dtof dtofVar) {
        return b(this.a, this.b, cjztVar, dtofVar);
    }
}
