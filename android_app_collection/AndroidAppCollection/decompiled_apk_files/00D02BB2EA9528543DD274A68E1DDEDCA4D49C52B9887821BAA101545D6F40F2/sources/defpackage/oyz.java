package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oyz  reason: default package */
/* loaded from: classes7.dex */
public final class oyz implements cjyu<blkw> {
    private final cjqy a;
    private final bvrb b;
    private final dxio<bbut> c;
    private final dxio<bqji> d;

    public oyz(cjqy cjqyVar, bvrb bvrbVar, dxio<bbut> dxioVar, dxio<bqji> dxioVar2) {
        this.a = cjqyVar;
        this.b = bvrbVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.cjyu
    public final /* bridge */ /* synthetic */ blkw a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        if ((dtkuVar.a & 4) != 0) {
            cjqy cjqyVar = this.a;
            bvrb bvrbVar = this.b;
            dtku dtkuVar2 = dtkxVar.b;
            if (dtkuVar2 == null) {
                dtkuVar2 = dtku.p;
            }
            dtof dtofVar = dtkuVar2.d;
            if (dtofVar == null) {
                dtofVar = dtof.i;
            }
            return new ozb(context, cjztVar, cjqyVar, bvrbVar, dtofVar, this.c, this.d);
        }
        dtku dtkuVar3 = dtkxVar.b;
        if (dtkuVar3 == null) {
            dtkuVar3 = dtku.p;
        }
        if ((dtkuVar3.a & 1) == 0) {
            return null;
        }
        dtku dtkuVar4 = dtkxVar.b;
        if (dtkuVar4 == null) {
            dtkuVar4 = dtku.p;
        }
        dtkf dtkfVar = dtkuVar4.b;
        if (dtkfVar == null) {
            dtkfVar = dtkf.n;
        }
        return new oyg(context, cjztVar, dtkfVar);
    }
}
