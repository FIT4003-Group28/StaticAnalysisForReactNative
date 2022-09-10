package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
/* compiled from: PG */
/* renamed from: cqtt  reason: default package */
/* loaded from: classes.dex */
public final class cqtt {
    public static cqtd a(Bitmap bitmap) {
        return new cqtk(new Object[]{bitmap}, bitmap);
    }

    public static cqtd b(cqtd cqtdVar, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqss cqssVar, Boolean bool) {
        return new cqtl(new Object[]{cqtdVar, cqtvVar, cqtvVar2, cqtvVar3, cqssVar, bool}, cqtdVar, cqtvVar, cqtvVar2, cqtvVar3, cqssVar, bool);
    }

    public static cqtd c() {
        return new cqtm(new Object[0]);
    }

    public static cqtd d(cqtd... cqtdVarArr) {
        return new cqtn(cqtdVarArr, cqtdVarArr);
    }

    public static cqtd e(cqtd cqtdVar, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4) {
        return new cqto(new Object[]{cqtdVar, cqtvVar, cqtvVar2, cqtvVar3, cqtvVar4}, cqtdVar, cqtvVar, cqtvVar2, cqtvVar3, cqtvVar4);
    }

    public static cqtd f(cqtd cqtdVar) {
        return new cqtp(new Object[]{cqtdVar}, cqtdVar);
    }

    public static cqtd g(cqss cqssVar) {
        return p(cquy.a(), cqssVar);
    }

    public static cqtd h(cqtd cqtdVar, float f) {
        return new cqtr(new Object[]{cqtdVar, Float.valueOf(f)}, cqtdVar, Math.round(10000.0f * f));
    }

    public static cqtd i(cqtd cqtdVar, cqtv cqtvVar, cqtv cqtvVar2) {
        return new cqts(new Object[]{cqtdVar, cqtvVar, cqtvVar2}, cqtdVar, cqtvVar, cqtvVar2);
    }

    public static cqtd j(cqtd cqtdVar, cqtv cqtvVar) {
        return new cqtg(new Object[]{cqtdVar, cqtvVar}, cqtdVar, cqtvVar);
    }

    public static cqtd k(cqtd cqtdVar, cqtv cqtvVar) {
        return new cqth(new Object[]{cqtdVar, cqtvVar}, cqtdVar, cqtvVar);
    }

    public static cqtd l(cqss cqssVar, cqtv cqtvVar) {
        return m(cqssVar, cqtvVar, true, true, true, true);
    }

    public static cqtd m(cqss cqssVar, cqtv cqtvVar, boolean z, boolean z2, boolean z3, boolean z4) {
        return p(cquy.b(cqtvVar, z, z2, z3, z4), cqssVar);
    }

    public static cqtd n(cquv cquvVar, cqss cqssVar, cqtv cqtvVar) {
        return w(cquvVar, cqssVar, Paint.Style.STROKE, cqtvVar, null);
    }

    public static cqtd o(cquv cquvVar, cqss cqssVar, cqtv cqtvVar) {
        return w(cquvVar, cqssVar, Paint.Style.FILL_AND_STROKE, cqtvVar, null);
    }

    public static cqtd p(cquv cquvVar, cqss cqssVar) {
        return w(cquvVar, cqssVar, Paint.Style.FILL, null, null);
    }

    public static cqtd q(final cqvc... cqvcVarArr) {
        final cqve[] cqveVarArr = new cqve[0];
        for (cqvc cqvcVar : cqvcVarArr) {
            if (cqny.b(cqvcVar)) {
                cqta f = cqta.f();
                cqny.e(f, new cqjb(cqvcVarArr, cqveVarArr) { // from class: cqte
                    private final cqvc[] a;
                    private final cqve[] b;

                    {
                        this.a = cqvcVarArr;
                        this.b = cqveVarArr;
                    }

                    @Override // defpackage.cqjb
                    public final Object a(cqkp cqkpVar, Context context) {
                        cqvc[] cqvcVarArr2 = this.a;
                        cqvc[] cqvcVarArr3 = new cqvc[cqvcVarArr2.length];
                        cqve[] cqveVarArr2 = new cqve[0];
                        for (int i = 0; i < cqvcVarArr2.length; i++) {
                            cqvcVarArr3[i] = (cqvc) cqjv.a(cqvcVarArr2[i], cqkpVar, context);
                        }
                        return new cqvd(cqvcVarArr3);
                    }
                });
                return f;
            }
        }
        return new cqvd(cqvcVarArr);
    }

    public static cqvc r(int[] iArr, cqtd cqtdVar) {
        return v(iArr, cqtdVar, null, null);
    }

    public static cqvc s(cqtd cqtdVar, @dzsi cqss cqssVar, @dzsi PorterDuff.Mode mode) {
        return v(new int[0], cqtdVar, cqssVar, mode);
    }

    public static cqvc t(cqtd cqtdVar) {
        return s(cqtdVar, null, null);
    }

    public static cqtd u(cquv cquvVar, cqss cqssVar) {
        return w(cquvVar, cqssVar, Paint.Style.FILL, null, 31);
    }

    public static cqvc v(final int[] iArr, final cqtd cqtdVar, @dzsi final cqss cqssVar, @dzsi final PorterDuff.Mode mode) {
        if (cqny.b(cqtdVar) || cqny.b(cqssVar) || cqny.b(mode)) {
            cqvc g = cqvc.g(cqpw.a(new int[0]), cqta.f(), null, null);
            cqny.e(g, new cqjb(iArr, cqtdVar, cqssVar, mode) { // from class: cqtf
                private final int[] a;
                private final cqtd b;
                private final cqss c;
                private final PorterDuff.Mode d;

                {
                    this.a = iArr;
                    this.b = cqtdVar;
                    this.c = cqssVar;
                    this.d = mode;
                }

                @Override // defpackage.cqjb
                public final Object a(cqkp cqkpVar, Context context) {
                    return cqvc.g(cqpw.a(this.a), (cqtd) cqjv.a(this.b, cqkpVar, context), (cqss) cqjv.a(this.c, cqkpVar, context), (PorterDuff.Mode) cqjv.a(this.d, cqkpVar, context));
                }
            });
            return g;
        }
        return cqvc.g(cqpw.a(iArr), cqtdVar, cqssVar, mode);
    }

    private static cqtd w(cquv cquvVar, cqss cqssVar, Paint.Style style, @dzsi cqtv cqtvVar, @dzsi Integer num) {
        return new cqti(new Object[]{cquvVar, cqssVar, style, cqtvVar, num}, cquvVar, cqssVar, style, cqtvVar, num);
    }
}
