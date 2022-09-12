package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: btkr  reason: default package */
/* loaded from: classes4.dex */
final class btkr implements apkp {
    @dzsi
    final transient btkx a;
    private final boolean b;

    public btkr(btkx btkxVar) {
        this.a = btkxVar;
        this.b = false;
    }

    public btkr(btkx btkxVar, boolean z) {
        this.a = btkxVar;
        this.b = z;
    }

    @Override // defpackage.apkp
    public final void b(Activity activity) {
    }

    @Override // defpackage.apkp
    public final void c(Activity activity) {
    }

    @Override // defpackage.apkp
    public final void a(Activity activity) {
        btkx btkxVar = this.a;
        if (!this.b) {
            btkxVar.f(2);
        } else {
            btkxVar.g(true);
        }
    }
}
