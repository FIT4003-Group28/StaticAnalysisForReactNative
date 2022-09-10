package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ozc  reason: default package */
/* loaded from: classes7.dex */
public final class ozc implements cjyu<oxs> {
    private final btrm a;
    private final bnjv b;
    private final dxio<ahjq> c;
    private final dxio<axwy> d;

    public ozc(btrm btrmVar, bnjv bnjvVar, dxio<ahjq> dxioVar, dxio<axwy> dxioVar2) {
        this.a = btrmVar;
        this.b = bnjvVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.cjyu
    public final /* bridge */ /* synthetic */ oxs a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtof dtofVar = dtkuVar.d;
        if (dtofVar == null) {
            dtofVar = dtof.i;
        }
        dtof dtofVar2 = dtofVar;
        return new oze(this.a, this.d, oyc.b(this.b, this.c, cjztVar, dtofVar2), dtofVar2, cjztVar);
    }
}
