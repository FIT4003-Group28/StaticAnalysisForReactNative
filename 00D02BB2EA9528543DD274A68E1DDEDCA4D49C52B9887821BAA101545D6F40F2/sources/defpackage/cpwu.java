package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpwu  reason: default package */
/* loaded from: classes5.dex */
public final class cpwu implements degu<Boolean> {
    final /* synthetic */ Context a;
    final /* synthetic */ cpwx b;

    public cpwu(cpwx cpwxVar, Context context) {
        this.b = cpwxVar;
        this.a = context;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            this.b.m = new claw(this.a);
        }
    }
}
