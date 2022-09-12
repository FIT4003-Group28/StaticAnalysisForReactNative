package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: alcc  reason: default package */
/* loaded from: classes2.dex */
public final class alcc {
    private static final dcqe a = dcqe.c("alcc");
    private final Context b;
    @dzsi
    private final vtn c;
    private final vtj d;
    private final int e;
    @dzsi
    private final vtl f;
    @dzsi
    private final String g;
    private final float h;
    @dzsi
    private final Integer i;
    @dzsi
    private final Integer j;
    @dzsi
    private final Integer k;
    @dzsi
    private final Paint l;
    private final alp m;
    private final String n;
    private final boolean o;

    public alcc(alcb alcbVar) {
        this.b = alcbVar.a;
        this.c = alcbVar.b;
        this.d = alcbVar.c;
        this.e = alcbVar.d;
        this.f = alcbVar.e;
        this.h = alcbVar.f;
        this.l = alcbVar.k;
        this.g = alcbVar.n;
        this.i = alcbVar.g;
        this.j = alcbVar.h;
        this.k = alcbVar.i;
        this.m = alcbVar.l;
        this.n = dbsj.e(alcbVar.m);
        this.o = alcbVar.o;
        Integer num = alcbVar.j;
    }

    public static alcb a() {
        return new alcb();
    }

    private static boolean e(dpce dpceVar) {
        int a2 = dpcd.a(dpceVar.b);
        if (a2 != 0 && a2 == 6) {
            if ((dpceVar.a & 4) == 0) {
                return true;
            }
            douj doujVar = dpceVar.d;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            if ((doujVar.a & 2) == 0) {
                douj doujVar2 = dpceVar.d;
                if (doujVar2 == null) {
                    doujVar2 = douj.h;
                }
                if (doujVar2.d.size() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private final CharSequence f(dcdc<dpce> dcdcVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((char) 8203);
        Integer num = this.i;
        dcpe<dpce> listIterator = dcdcVar.listIterator();
        spannableStringBuilder.append(g(listIterator.next(), true, !listIterator.hasNext(), num));
        while (listIterator.hasNext()) {
            dpce next = listIterator.next();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) this.b.getString(R.string.TRANSIT_LINE_SEPARATOR));
            spannableStringBuilder2.setSpan(new albr(), 0, spannableStringBuilder2.length(), 0);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            Integer num2 = this.i;
            if (num2 != null) {
                num = Integer.valueOf(Math.max(num2.intValue() - ((int) this.l.measureText(spannableStringBuilder, 0, spannableStringBuilder.length())), 0));
            }
            spannableStringBuilder.append(g(next, false, !listIterator.hasNext(), num));
        }
        return spannableStringBuilder;
    }

    private final CharSequence g(dpce dpceVar, boolean z, boolean z2, @dzsi Integer num) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        doul doulVar = dpceVar.c;
        if (doulVar == null) {
            doulVar = doul.f;
        }
        int i = doulVar.a & 1;
        if (i != 0) {
            doul doulVar2 = dpceVar.c;
            if (doulVar2 == null) {
                doulVar2 = doul.f;
            }
            spannableStringBuilder.append((CharSequence) doulVar2.b);
        } else {
            spannableStringBuilder.append((char) 8203);
        }
        Resources resources = this.b.getResources();
        alch alchVar = new alch(dpceVar, z, z2, resources, resources.getColor(R.color.transit_line_span_default_background));
        if (i != 0) {
            alchVar.i = num;
        }
        if (i != 0) {
            alchVar.j = this.j;
        }
        alchVar.k = this.k;
        doul doulVar3 = dpceVar.c;
        if (doulVar3 == null) {
            doulVar3 = doul.f;
        }
        if (doulVar3.c) {
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
        }
        spannableStringBuilder.setSpan(alchVar, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final CharSequence b(Collection<dpce> collection) {
        CharSequence c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        dcgg t = dcgh.t(collection.iterator());
        while (true) {
            boolean z = false;
            while (t.hasNext()) {
                dpce dpceVar = (dpce) t.a();
                if (e(dpceVar)) {
                    dccx F = dcdc.F();
                    F.g((dpce) t.next());
                    while (t.hasNext()) {
                        dpce dpceVar2 = (dpce) t.a();
                        int a2 = dpcd.a(dpceVar2.b);
                        if ((a2 == 0 || a2 != 11) && !e(dpceVar2)) {
                            break;
                        }
                        dpceVar = (dpce) t.next();
                        if (e(dpceVar)) {
                            doul doulVar = dpceVar.c;
                            if (doulVar == null) {
                                doulVar = doul.f;
                            }
                            if ((doulVar.a & 1) != 0) {
                                F.g(dpceVar);
                            }
                        }
                    }
                    c = f(F.f());
                } else {
                    c = c((dpce) t.next());
                }
                if (c != null) {
                    int a3 = dpcd.a(dpceVar.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (!z && spannableStringBuilder.length() > 0 && a3 != 21) {
                        spannableStringBuilder.append((CharSequence) this.n);
                    }
                    spannableStringBuilder.append(c);
                    if (dpceVar.e || a3 == 21) {
                        z = true;
                    }
                }
            }
            return spannableStringBuilder;
        }
    }

    @dzsi
    public final CharSequence c(dpce dpceVar) {
        bvsv a2;
        String str;
        int i;
        int i2;
        if (e(dpceVar)) {
            doul doulVar = dpceVar.c;
            if (doulVar == null) {
                doulVar = doul.f;
            }
            if ((doulVar.a & 1) != 0) {
                return f(dcdc.f(dpceVar));
            }
        }
        int a3 = dpcd.a(dpceVar.b);
        String str2 = " ";
        if (a3 != 0 && a3 == 24 && (((i2 = (i = dpceVar.a) & 4) != 0 || (i & 2) != 0) && i2 != 0)) {
            douj doujVar = dpceVar.d;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            Drawable d = d(doujVar);
            if (d == null) {
                return "";
            }
            CharSequence[] charSequenceArr = new CharSequence[3];
            charSequenceArr[0] = " ";
            new bvsx(this.b.getResources());
            float f = this.e;
            if ((doujVar.a & 4) != 0) {
                str2 = doujVar.e;
            }
            charSequenceArr[1] = bvsx.i(d, f, f, str2);
            charSequenceArr[2] = " ";
            return TextUtils.concat(charSequenceArr);
        }
        int a4 = dpcd.a(dpceVar.b);
        if (a4 == 0) {
            a4 = 1;
        }
        int i3 = a4 - 1;
        if (i3 == 9) {
            Drawable drawable = this.b.getDrawable(2131233129);
            if (drawable == null) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(' ');
            new bvsx(this.b.getResources());
            spannableStringBuilder.append((CharSequence) bvsx.i(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), this.b.getString(R.string.TRANSIT_STEP_SEPARATOR)));
            spannableStringBuilder.append(' ');
            return spannableStringBuilder;
        } else if (i3 == 10) {
            return null;
        } else {
            if (i3 == 20) {
                return true != this.o ? "  •  " : "\n";
            } else if (i3 == 22 && (str = this.g) != null) {
                return str;
            } else {
                int i4 = dpceVar.a;
                if ((i4 & 4) != 0) {
                    douj doujVar2 = dpceVar.d;
                    if (doujVar2 == null) {
                        doujVar2 = douj.h;
                    }
                    Drawable d2 = d(doujVar2);
                    if (d2 == null) {
                        return null;
                    }
                    new bvsx(this.b.getResources());
                    float f2 = this.e;
                    if ((doujVar2.a & 4) != 0) {
                        str2 = doujVar2.e;
                    }
                    return bvsx.i(d2, f2, f2, str2);
                } else if ((i4 & 2) == 0) {
                    return null;
                } else {
                    doul doulVar2 = dpceVar.c;
                    if (doulVar2 == null) {
                        doulVar2 = doul.f;
                    }
                    if (doulVar2.b.isEmpty()) {
                        if ((doulVar2.a & 4) == 0) {
                            return null;
                        }
                        String str3 = doulVar2.d;
                        if (!bvoa.d(str3)) {
                            return null;
                        }
                        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(str3));
                        bvsx bvsxVar = new bvsx(this.b.getResources());
                        float f3 = this.h;
                        return bvsxVar.f(colorDrawable, (int) (0.41666666f * f3), (int) f3);
                    }
                    String b = this.m.b(doulVar2.b);
                    int i5 = doulVar2.a;
                    int i6 = i5 & 4;
                    if (i6 == 0 && (i5 & 8) == 0 && !doulVar2.c) {
                        return b;
                    }
                    if (i6 == 0 || !bvoa.d(doulVar2.d)) {
                        a2 = new bvsx(this.b.getResources()).a(b);
                    } else {
                        bvsx bvsxVar2 = new bvsx(this.b.getResources());
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2);
                        sb.append(str2);
                        sb.append(b);
                        sb.append(str2);
                        a2 = bvsxVar2.a(sb.toString());
                        a2.h(Color.parseColor(doulVar2.d));
                    }
                    if ((doulVar2.a & 8) != 0 && bvoa.d(doulVar2.e)) {
                        a2.l(Color.parseColor(doulVar2.e));
                    }
                    if (doulVar2.c) {
                        a2.i();
                    }
                    return a2.c();
                }
            }
        }
    }

    @dzsi
    private final Drawable d(douj doujVar) {
        if (this.c != null) {
            int a2 = doug.a(doujVar.b);
            if (a2 != 0 && a2 == 4 && (doujVar.a & 2) != 0) {
                return this.c.b(doujVar.c, this.d, this.f);
            }
            if (this.c == null) {
                bvoo.h("iconManager is null", new Object[0]);
                return null;
            }
            String str = alca.n(doujVar).a;
            if (str != null) {
                return this.c.g(str, bvlw.a);
            }
            return null;
        }
        bvoo.h("Component icon was found in renderable component but DirectionsIconManager was not specified.", new Object[0]);
        return null;
    }
}
