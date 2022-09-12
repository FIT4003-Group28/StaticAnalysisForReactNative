package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: amaa  reason: default package */
/* loaded from: classes2.dex */
public final class amaa implements alzp {
    private final alyl a;

    public amaa(alyl alylVar) {
        this.a = alylVar;
    }

    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        drkg n = this.a.n();
        if (n == null) {
            return;
        }
        dugv bZ = dugw.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dugw dugwVar = (dugw) bZ.b;
        n.getClass();
        dugwVar.b = n;
        dugwVar.a |= 1;
        dmlj dmljVar = (dmlj) dmlk.a.bZ();
        dmljVar.k(dugw.d, bZ.bK());
        dmxgVar.c((dmlk) dmljVar.bK());
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        return true;
    }
}
