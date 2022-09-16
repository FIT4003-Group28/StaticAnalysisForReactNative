package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: mth  reason: default package */
/* loaded from: classes7.dex */
public class mth implements mte {
    private final noo a;
    private final mqf b;

    public mth(noo nooVar, ldm ldmVar, Runnable runnable, Runnable runnable2, npo npoVar, boolean z, ksh kshVar, Context context, cqat cqatVar) {
        this.a = nooVar;
        this.b = new mqf(context, cqatVar, ldmVar, kdk.NOTHING, npoVar, true, new mpn(kshVar, ldmVar, cjtd.a(dtxm.l)), runnable, null, runnable2, z, false);
    }

    @Override // defpackage.mte
    public cqkl a() {
        this.a.b();
        return cqkl.a;
    }

    @Override // defpackage.mte
    public cqkl b() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.mte
    public mpe c() {
        return this.b;
    }

    public void d(ldm ldmVar) {
        this.b.f(ldmVar);
        cqkx.p(this);
    }
}
