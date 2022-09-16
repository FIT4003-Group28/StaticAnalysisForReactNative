package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rio  reason: default package */
/* loaded from: classes4.dex */
final class rio extends rii {
    final /* synthetic */ Activity a;
    final /* synthetic */ riq b;
    final /* synthetic */ rhi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rio(riq riqVar, Activity activity, rhi rhiVar) {
        super(riqVar.a);
        this.b = riqVar;
        this.a = activity;
        this.c = rhiVar;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.b.a.f;
        qnm.b(rhgVar);
        rhgVar.onActivitySaveInstanceState(rac.a(this.a), this.c, this.g);
    }
}
