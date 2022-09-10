package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: akyt  reason: default package */
/* loaded from: classes.dex */
public final class akyt {
    private static final dcqe a = dcqe.c("akyt");

    static {
        new akyn();
        new akyq();
    }

    public static alad a(akzh akzhVar, float f) {
        alaa b = alad.b(akzhVar.p());
        b.c = f;
        return b.a();
    }

    public static akyc b(float f) {
        return new akyr(f);
    }

    public static alad c(akzh akzhVar, float f) {
        return a(akzhVar, akzhVar.p().k + f);
    }

    public static dbsg<akyc> d(akqs akqsVar, Rect rect, bnuw bnuwVar) {
        return (rect.right <= rect.left || rect.bottom <= rect.top) ? dbpy.a : dbsg.i(n(akqsVar, rect.left, bnuwVar.a() - rect.right, rect.top, bnuwVar.b() - rect.bottom));
    }

    public static akyc e(@dzsi alad aladVar) {
        return new akyd(aladVar);
    }

    public static akyc f(akrs akrsVar, int i, int i2, int i3, int i4) {
        return new akye(akrsVar, i, i2, i3, i4);
    }

    public static akyc g(akqq akqqVar) {
        return new akyf(akqqVar);
    }

    public static akyc h(akqq akqqVar, Rect rect) {
        return new akyg(rect, akqqVar);
    }

    public static akyc i(akqq akqqVar, float f) {
        return new akyh(akqqVar, f);
    }

    public static akyc j(akqq akqqVar, float f, Rect rect) {
        return new akyi(rect, akqqVar, f);
    }

    public static akyc k(akqq akqqVar, float f, alae alaeVar) {
        return new akyj(akqqVar, f, alaeVar);
    }

    public static akyc l(akqq akqqVar, float f) {
        return m(akqqVar, f, null);
    }

    public static akyc m(akqq akqqVar, float f, @dzsi Rect rect) {
        return new akyk(akqqVar, f, rect);
    }

    public static akyc n(akqs akqsVar, int i, int i2, int i3, int i4) {
        return new akyl(akqsVar, i, i2, i3, i4);
    }

    public static akyc o(akqs akqsVar, Rect rect) {
        return new akym(rect, akqsVar);
    }

    public static void p(akyb akybVar, int i, @dzsi TimeInterpolator timeInterpolator, akqs akqsVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        q(akybVar, i, timeInterpolator, akqsVar, i2, i3, i4, i5, i6, i7, 0.0f, 0.0f);
    }

    public static void q(akyb akybVar, int i, @dzsi TimeInterpolator timeInterpolator, akqs akqsVar, int i2, int i3, int i4, int i5, int i6, int i7, float f, float f2) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        akzh c = akybVar.c();
        int i13 = 0;
        if (i2 <= 0 || i3 <= 0) {
            bvoo.h("Not animating to bounds. Map is too small. Map width: %d Map height: %d Padding[l,r,t,b]: [%d, %d, %d, %d]", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
            return;
        }
        int i14 = i2 - (i4 + i5);
        int i15 = i3 - (i6 + i7);
        if (i14 <= 0 || i15 <= 0) {
            i8 = i2;
            i9 = i3;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            i13 = i4;
            i12 = i7;
            i8 = i14;
            i9 = i15;
            i10 = i5;
            i11 = i6;
        }
        double l = akqo.l(akqsVar, i9, i8, c.B());
        akra a2 = akqg.a(akqsVar.b);
        akra a3 = akqg.a(akqsVar.a);
        int i16 = a2.a;
        int i17 = a3.a;
        int i18 = i16 < i17 ? (1073741824 - i17) + i16 : i16 - i17;
        int i19 = a2.b;
        int i20 = a3.b;
        akra akraVar = new akra((i17 + (i18 / 2)) % 1073741824, i20 + ((i19 - i20) / 2));
        alaa a4 = alad.a();
        a4.d(akraVar);
        a4.c = (float) l;
        a4.e = f2;
        a4.d = f;
        if (i13 != i10 || i11 != i12) {
            a4.f = alae.a(i13 + (i8 * 0.5f), i11 + (i9 * 0.5f), i2, i3);
        } else {
            a4.f = alae.a;
        }
        akybVar.d(a4.a(), i, timeInterpolator);
    }

    public static akyc r(akqs akqsVar, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            if (i2 != 0) {
                z = true;
            } else {
                i2 = 0;
            }
        }
        dbsk.m(z, "Map size should not be 0");
        return new akyo(akqsVar, i, i2);
    }

    public static akyc s(akqs akqsVar, float f, float f2) {
        return new akyp(akqsVar, f, f2);
    }

    public static akyc t(float f) {
        return new akys(f);
    }
}
