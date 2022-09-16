package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cosf  reason: default package */
/* loaded from: classes5.dex */
public final class cosf extends cosl {
    final /* synthetic */ Activity a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ cosu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosf(cosu cosuVar, Activity activity, String str, String str2) {
        super(cosuVar);
        this.d = cosuVar;
        this.a = activity;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.cosl
    public final void a() {
        this.d.f.f(cobb.b(this.a), this.b, this.c, this.f);
    }
}
