package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rhr  reason: default package */
/* loaded from: classes4.dex */
public final class rhr extends rii {
    final /* synthetic */ Activity a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ rir d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhr(rir rirVar, Activity activity, String str, String str2) {
        super(rirVar);
        this.d = rirVar;
        this.a = activity;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.rii
    public final void a() {
        rhg rhgVar = this.d.f;
        qnm.b(rhgVar);
        rhgVar.setCurrentScreen(rac.a(this.a), this.b, this.c, this.f);
    }
}
