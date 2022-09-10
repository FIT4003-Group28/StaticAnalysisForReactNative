package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: auod  reason: default package */
/* loaded from: classes2.dex */
public abstract class auod {
    public abstract auoe a();

    public abstract void b(int i);

    public abstract void c(int i);

    public abstract void d(auhx auhxVar);

    public abstract void e(ip ipVar);

    public abstract void f(boolean z);

    public abstract void g(CharSequence charSequence);

    public final auoe h() {
        auoe a = a();
        boolean z = true;
        if ((!a.f().a() || a.g().a()) && (a.f().a() || !a.g().a())) {
            z = false;
        }
        dbsk.r(z, "Exactly one of either dataElementType or ved should be null, and the other non-null, but dataElementType is %s and ved is %s", a.f(), a.g());
        return a;
    }

    @Deprecated
    public final auoe i(int i, int i2, CharSequence charSequence, Intent intent, auhw auhwVar, boolean z) {
        b(i);
        c(i2);
        g(charSequence);
        j(intent, auhwVar);
        f(z);
        return h();
    }

    public final void j(Intent intent, auhw auhwVar) {
        d(new auhx(intent, auhwVar));
    }
}
