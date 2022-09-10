package defpackage;

import android.animation.TimeInterpolator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alkb  reason: default package */
/* loaded from: classes.dex */
public final class alkb implements akyb {
    final /* synthetic */ alkc a;

    public alkb(alkc alkcVar) {
        this.a = alkcVar;
    }

    @Override // defpackage.akyb
    public final int a() {
        return this.a.b.getWidth();
    }

    @Override // defpackage.akyb
    public final int b() {
        return this.a.b.getHeight();
    }

    @Override // defpackage.akyb
    public final akzh c() {
        akzh b = this.a.c.b();
        alaa b2 = alad.b(b.p());
        if (this.a.a.c(b2)) {
            b.o(b2.a());
        }
        return b;
    }

    @Override // defpackage.akyb
    public final void d(alad aladVar, int i, @dzsi TimeInterpolator timeInterpolator) {
        this.a.a.b(aladVar, i, timeInterpolator);
    }
}
