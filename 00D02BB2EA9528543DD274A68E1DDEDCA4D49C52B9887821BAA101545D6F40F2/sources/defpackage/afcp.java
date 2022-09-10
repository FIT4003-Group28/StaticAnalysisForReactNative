package defpackage;

import android.app.Dialog;
/* compiled from: PG */
/* renamed from: afcp  reason: default package */
/* loaded from: classes2.dex */
final class afcp implements afdm {
    final /* synthetic */ Dialog a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ afcq c;

    public afcp(afcq afcqVar, Dialog dialog, Runnable runnable) {
        this.c = afcqVar;
        this.a = dialog;
        this.b = runnable;
    }

    @Override // defpackage.afdm
    public final void a() {
        ((ckcn) this.c.c.a(ckfn.x)).a();
        this.a.dismiss();
    }

    @Override // defpackage.afdm
    public final void b() {
        this.b.run();
        ((ckcn) this.c.c.a(ckfn.w)).a();
        this.a.dismiss();
    }
}
