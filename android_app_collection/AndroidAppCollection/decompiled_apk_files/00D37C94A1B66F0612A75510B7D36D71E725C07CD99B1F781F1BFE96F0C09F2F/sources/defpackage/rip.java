package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rip  reason: default package */
/* loaded from: classes4.dex */
final class rip extends rii {
    final /* synthetic */ Activity a;
    final /* synthetic */ riq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rip(riq riqVar, Activity activity) {
        super(riqVar.a);
        this.b = riqVar;
        this.a = activity;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.b.a.f;
        qnm.b(rhgVar);
        rhgVar.onActivityDestroyed(rac.a(this.a), this.g);
    }
}
