package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wrn  reason: default package */
/* loaded from: classes7.dex */
public final class wrn implements degu<Boolean> {
    final /* synthetic */ wro a;

    public wrn(wro wroVar) {
        this.a = wroVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.e.a().f(this.a.a, new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 2);
        }
    }
}
