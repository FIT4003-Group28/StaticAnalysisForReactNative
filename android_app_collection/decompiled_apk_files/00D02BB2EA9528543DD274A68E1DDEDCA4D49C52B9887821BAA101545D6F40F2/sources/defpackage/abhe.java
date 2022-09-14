package defpackage;

import android.content.Context;
import defpackage.cqkp;
import java.util.List;
/* compiled from: PG */
/* renamed from: abhe  reason: default package */
/* loaded from: classes2.dex */
public abstract class abhe<T extends cqkp> extends cqiw<izf<T>> {
    public final int a;
    public int b;

    public abhe(int i) {
        super(Integer.valueOf(i));
        this.a = i;
    }

    @dzsi
    public static final cqiw<cqkp> g() {
        return new abhf();
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        List<T> Pd = ((izf) cqkpVar).Pd();
        g();
        int i2 = 0;
        while (i2 < Pd.size()) {
            int min = Math.min(this.a + i2, Pd.size());
            cqivVar.c(new abhd(this, dcdc.r(Pd.subList(i2, min)), i2));
            if (min != Pd.size()) {
                cqivVar.c(g());
            }
            i2 += this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izf<T>> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()));
    }

    public abstract cqiw<T> e();

    @dzsi
    public <T2 extends cqkp> cqmj<T2> f() {
        return cqgr.gm(cqgr.ce(ibn.d()));
    }
}
