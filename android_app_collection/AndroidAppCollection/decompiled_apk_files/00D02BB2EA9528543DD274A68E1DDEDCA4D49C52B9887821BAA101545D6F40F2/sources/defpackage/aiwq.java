package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aiwq  reason: default package */
/* loaded from: classes2.dex */
final class aiwq implements degu<Boolean> {
    final /* synthetic */ aiws a;

    public aiwq(aiws aiwsVar) {
        this.a = aiwsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.al.a().f(this.a.H(), new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 2);
        }
    }
}
