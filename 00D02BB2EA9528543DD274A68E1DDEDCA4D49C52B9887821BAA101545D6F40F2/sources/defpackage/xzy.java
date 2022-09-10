package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xzy  reason: default package */
/* loaded from: classes7.dex */
public class xzy implements xyu {
    public static final int a = Color.argb(255, 255, 235, 59);
    private final CharSequence b;
    private final CharSequence c;
    @dzsi
    private final CharSequence d;
    @dzsi
    private final Runnable e;
    @dzsi
    private final cjtd f;
    @dzsi
    private final cjtd g;

    private xzy(CharSequence charSequence, CharSequence charSequence2, @dzsi CharSequence charSequence3, @dzsi Runnable runnable, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2) {
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = runnable;
        this.f = cjtdVar;
        this.g = cjtdVar2;
    }

    public static xzy h(amvh amvhVar) {
        return i(amvhVar, null, null);
    }

    public static xzy i(amvh amvhVar, @dzsi cjtd cjtdVar, @dzsi Runnable runnable) {
        String j = amvj.j(amvhVar);
        dosw F = amvhVar.F();
        return new xzy(j, j, (F == null || F.b.size() <= 1) ? null : F.b.get(1), runnable, cjtdVar, null);
    }

    public static xzy j(Resources resources, dpgw dpgwVar, boolean z, btvo btvoVar) {
        return k(resources, dpgwVar, true, btvoVar, null, null);
    }

    public static xzy k(Resources resources, dpgw dpgwVar, boolean z, btvo btvoVar, @dzsi String str, @dzsi cjtd cjtdVar) {
        return l(resources, dpgwVar, z, btvoVar, str, null, cjtdVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    public static xzy l(Resources resources, final dpgw dpgwVar, boolean z, btvo btvoVar, @dzsi String str, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2, @dzsi Runnable runnable) {
        int a2;
        Spannable spannable;
        String str2;
        Spannable spannable2 = null;
        String str3 = (dpgwVar.a & 1024) != 0 ? dpgwVar.l : null;
        duom duomVar = (duom) dcft.l(btvoVar.getDirectionsPageParameters().n, new dbsl(dpgwVar) { // from class: xzx
            private final dpgw a;

            {
                this.a = dpgwVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dpgw dpgwVar2 = this.a;
                int i = xzy.a;
                return ((duom) obj).a.equals(dpgwVar2.j);
            }
        }, null);
        if (duomVar == null || (a2 = duol.a(duomVar.b)) == 0) {
            a2 = 1;
        }
        if (str3 != null) {
            bvsx bvsxVar = new bvsx(resources);
            bvsu c = bvsxVar.c(true != z ? R.string.TRANSIT_EXIT_VIA : R.string.TRANSIT_ENTER_VIA);
            Spannable c2 = bvsxVar.a(str3).c();
            if (a2 == 2) {
                c2.setSpan(new cjxm(c2.toString(), a, resources.getColor(R.color.google_grey900), 0.5f, 0.4f), 0, c2.length(), 33);
                c2.setSpan(new StyleSpan(Typeface.create("sans-serif-medium", 0).getStyle()), 0, c2.length(), 33);
                c2.setSpan(new AbsoluteSizeSpan(resources.getDimensionPixelSize(R.dimen.directions_transit_japan_entrance_exit_name_font_size)), 0, c2.length(), 33);
            }
            c.a(c2);
            spannable2 = c.c();
        }
        ?? g = wmb.g(str, resources);
        if (spannable2 == null) {
            spannable = g;
        } else {
            if (g != 0) {
                bvsu b = new bvsx(resources).b("%s\n%s");
                Object[] objArr = new Object[2];
                objArr[0] = true != z ? g : spannable2;
                if (true == z) {
                    spannable2 = g;
                }
                objArr[1] = spannable2;
                b.a(objArr);
                spannable2 = b.c();
            }
            spannable = spannable2;
        }
        String str4 = dpgwVar.b;
        if ((dpgwVar.a & 4) != 0) {
            douj doujVar = dpgwVar.d;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            if ((doujVar.a & 4) != 0) {
                bvsi bvsiVar = new bvsi(resources);
                bvsiVar.c(dpgwVar.b);
                douj doujVar2 = dpgwVar.d;
                if (doujVar2 == null) {
                    doujVar2 = douj.h;
                }
                bvsiVar.c(doujVar2.e);
                str2 = bvsiVar.toString();
                return new xzy(dpgwVar.b, str2, spannable, runnable, cjtdVar, cjtdVar2);
            }
        }
        str2 = str4;
        return new xzy(dpgwVar.b, str2, spannable, runnable, cjtdVar, cjtdVar2);
    }

    @Override // defpackage.xyu
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.xyu
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.xyu
    @dzsi
    public CharSequence c() {
        return this.d;
    }

    @Override // defpackage.xyu
    public Boolean d() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.xyu
    public cqkl e() {
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.xyu
    @dzsi
    public cjtd f() {
        return this.f;
    }

    @Override // defpackage.xyu
    @dzsi
    public cjtd g() {
        return this.g;
    }

    public static xzy m(Resources resources, dpgw dpgwVar, boolean z, amvh amvhVar, btvo btvoVar, @dzsi cjtd cjtdVar, @dzsi Runnable runnable) {
        if ((dpgwVar.a & 1) == 0) {
            return i(amvhVar, null, null);
        }
        return l(resources, dpgwVar, false, btvoVar, null, null, null, null);
    }
}
