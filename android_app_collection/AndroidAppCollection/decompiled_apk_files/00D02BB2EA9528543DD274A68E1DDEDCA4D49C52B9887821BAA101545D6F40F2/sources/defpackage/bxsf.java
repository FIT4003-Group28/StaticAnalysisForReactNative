package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bxsf  reason: default package */
/* loaded from: classes4.dex */
class bxsf extends bxpd {
    final /* synthetic */ btpc a;
    final /* synthetic */ btrm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxsf(Activity activity, btpc btpcVar, btrm btrmVar) {
        super(activity);
        this.a = btpcVar;
        this.b = btrmVar;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.a.i()) {
            this.b.b(new bxtw());
        }
        return cqkl.a;
    }

    @Override // defpackage.bxpd, defpackage.jbf
    public cjtd h() {
        return cjtd.a(dtyb.bC);
    }
}
