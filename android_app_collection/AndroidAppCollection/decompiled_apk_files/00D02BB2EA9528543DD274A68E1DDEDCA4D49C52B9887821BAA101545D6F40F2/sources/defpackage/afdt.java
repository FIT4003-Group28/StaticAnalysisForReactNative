package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afdt  reason: default package */
/* loaded from: classes2.dex */
public abstract class afdt {
    public static final afdt a;

    static {
        afdr i = i();
        i.c(afdq.a);
        a = i.a();
    }

    public static afdr i() {
        afdo afdoVar = new afdo();
        afdoVar.g(R.string.DISABLE_INCOGNITO_PROMO_FRAGMENT_DEFAULT_TOOLBAR_TITLE);
        afdoVar.f(R.string.DISABLE_INCOGNITO_PROMO_FRAGMENT_DEFAULT_TOOLBAR_TITLE);
        afdoVar.e(true);
        afdoVar.b(R.string.DISABLE_INCOGNITO_PROMO_FRAGMENT_DEFAULT_BODY_TEXT);
        afdoVar.a = Integer.valueOf((int) R.string.EXIT_INCOGNITO_SIDE_MENU_BUTTON);
        afdoVar.d(false);
        return afdoVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract boolean c();

    public abstract int d();

    public abstract int e();

    public abstract afds f();

    @dzsi
    public abstract dktk g();

    public abstract boolean h();
}
