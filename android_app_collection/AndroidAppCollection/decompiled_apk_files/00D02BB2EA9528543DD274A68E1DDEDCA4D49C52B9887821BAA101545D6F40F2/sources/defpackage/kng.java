package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: kng  reason: default package */
/* loaded from: classes7.dex */
public final class kng extends cqiw<kof> {
    private final int a;

    public kng(int i) {
        super(Integer.valueOf(i));
        i = i != 2 ? 1 : i;
        dbsk.l(true);
        this.a = i;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, kof kofVar, Context context, cqiv cqivVar) {
        kof kofVar2 = kofVar;
        cqivVar.c(new knf());
        int i2 = 0;
        while (i2 < Math.min(3, kofVar2.b())) {
            cqivVar.a(new kmz(this.a), kofVar2.a(i2));
            if (i2 == 0) {
                cqivVar.a(new kne(), kofVar2);
                i2 = 0;
            }
            cqivVar.c(new knf());
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<kof> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.bv(3), iue.c(kna.a), cqgr.dF(nqo.R), cqgr.ck(C()));
    }
}
