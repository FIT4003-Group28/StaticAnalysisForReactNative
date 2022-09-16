package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.RichTextView;
import com.google.android.youtube.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqmv  reason: default package */
/* loaded from: classes2.dex */
public final class aqmv {
    public static int a(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int h(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static void i(TextView textView, alxh alxhVar) {
        textView.setGravity(alxhVar.h);
    }

    public static void j(TextView textView, alxh alxhVar) {
        int i;
        int i2;
        Typeface create;
        Typeface create2;
        boolean z;
        int c;
        TemplateLayout l;
        int c2;
        Context context = textView.getContext();
        if (alxhVar.a != null && alwg.f(context).l(alxhVar.a) && (c2 = alwg.f(context).c(context, alxhVar.a)) != 0) {
            textView.setTextColor(c2);
        }
        if (alxhVar.b != null && alwg.f(context).l(alxhVar.b)) {
            Context context2 = textView.getContext();
            try {
                l = l(alvm.a(context2));
            } catch (ClassCastException | IllegalArgumentException unused) {
            }
            if (l instanceof GlifLayout) {
                z = ((GlifLayout) l).e();
                if (!z && (c = alwg.f(context).c(context, alxhVar.b)) != 0) {
                    textView.setLinkTextColor(c);
                }
            }
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(new int[]{R.attr.sucFullDynamicColor});
            int[] iArr = alvn.a;
            boolean hasValue = obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            z = hasValue;
            if (!z) {
                textView.setLinkTextColor(c);
            }
        }
        if (alxhVar.c != null && alwg.f(context).l(alxhVar.c)) {
            float b = alwg.f(context).b(context, alxhVar.c, 0.0f);
            if (b > 0.0f) {
                textView.setTextSize(0, b);
            }
        }
        if (alxhVar.d != null && alwg.f(context).l(alxhVar.d) && (create2 = Typeface.create(alwg.f(context).h(context, alxhVar.d), 0)) != null) {
            textView.setTypeface(create2);
        }
        if ((textView instanceof RichTextView) && alxhVar.e != null && alwg.f(context).l(alxhVar.e) && (create = Typeface.create(alwg.f(context).h(context, alxhVar.e), 0)) != null) {
            RichTextView richTextView = (RichTextView) textView;
            RichTextView.b = create;
        }
        if (alxhVar.f != null || alxhVar.g != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (alxhVar.f == null || !alwg.f(context).l(alxhVar.f)) {
                    i = layoutParams2.topMargin;
                } else {
                    i = (int) alwg.f(context).a(context, alxhVar.f);
                }
                if (alxhVar.g == null || !alwg.f(context).l(alxhVar.g)) {
                    i2 = layoutParams2.bottomMargin;
                } else {
                    i2 = (int) alwg.f(context).a(context, alxhVar.g);
                }
                layoutParams2.setMargins(layoutParams2.leftMargin, i, layoutParams2.rightMargin, i2);
                textView.setLayoutParams(layoutParams);
            }
        }
        textView.setGravity(alxhVar.h);
    }

    public static int k(Context context) {
        char c;
        String h = alwg.f(context).h(context, alwe.CONFIG_LAYOUT_GRAVITY);
        if (h == null) {
            return 0;
        }
        String lowerCase = h.toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode == 109757538 && lowerCase.equals("start")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (lowerCase.equals("center")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return 17;
        }
        return c != 1 ? 0 : 8388611;
    }

    public static TemplateLayout l(Activity activity) {
        View findViewById;
        if (activity == null || (findViewById = activity.findViewById(R.id.suc_layout_status)) == null) {
            return null;
        }
        return (TemplateLayout) findViewById.getParent();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(android.view.View r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.setupdesign.GlifLayout
            if (r0 == 0) goto Lb
            com.google.android.setupdesign.GlifLayout r6 = (com.google.android.setupdesign.GlifLayout) r6
            boolean r6 = r6.k()
            return r6
        Lb:
            android.content.Context r6 = r6.getContext()
            r0 = 0
            android.app.Activity r1 = defpackage.alvm.a(r6)     // Catch: java.lang.Throwable -> L24
            com.google.android.setupcompat.internal.TemplateLayout r1 = l(r1)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r1 instanceof com.google.android.setupdesign.GlifLayout     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L25
            com.google.android.setupdesign.GlifLayout r1 = (com.google.android.setupdesign.GlifLayout) r1     // Catch: java.lang.Throwable -> L24
            boolean r0 = r1.k()     // Catch: java.lang.Throwable -> L24
            goto L95
        L24:
        L25:
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 2130970269(0x7f04069d, float:1.7549243E38)
            r2[r0] = r3
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r2)
            boolean r3 = r2.getBoolean(r0, r0)
            r2.recycle()
            if (r3 != 0) goto L43
            boolean r2 = defpackage.alwg.n(r6)
            if (r2 == 0) goto L41
            goto L43
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = 1
        L44:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 >= r4) goto L4b
            goto L95
        L4b:
            alwg r3 = defpackage.alwg.f(r6)
            boolean r3 = r3.k()
            if (r3 != 0) goto L56
            goto L95
        L56:
            android.app.Activity r3 = defpackage.alvm.a(r6)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L70
            com.google.android.setupcompat.internal.TemplateLayout r4 = l(r3)     // Catch: java.lang.Throwable -> L6d
            boolean r5 = r4 instanceof defpackage.alvm     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L70
            alvm r4 = (defpackage.alvm) r4     // Catch: java.lang.Throwable -> L6d
            boolean r6 = r4.f()     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L95
            goto L93
        L6d:
            goto L70
        L6f:
            r3 = 0
        L70:
            if (r3 == 0) goto L7b
            android.content.Intent r3 = r3.getIntent()
            boolean r3 = defpackage.aqgn.j(r3)
            goto L7c
        L7b:
            r3 = 0
        L7c:
            int[] r4 = new int[r1]
            r5 = 2130970203(0x7f04065b, float:1.754911E38)
            r4[r0] = r5
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r4)
            boolean r4 = r6.getBoolean(r0, r1)
            r6.recycle()
            if (r3 != 0) goto L93
            if (r4 != 0) goto L93
            goto L95
        L93:
            if (r2 != 0) goto L96
        L95:
            return r0
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqmv.m(android.view.View):boolean");
    }

    public static void n(View view) {
        int paddingStart;
        int paddingEnd;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        boolean l = alwg.f(context).l(alwe.CONFIG_LAYOUT_MARGIN_START);
        boolean l2 = alwg.f(context).l(alwe.CONFIG_LAYOUT_MARGIN_END);
        if (!m(view)) {
            return;
        }
        if (!l) {
            if (!l2) {
                return;
            }
            l2 = true;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sudMarginStart, R.attr.sudMarginEnd});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        if (l) {
            paddingStart = Math.max(0, ((int) alwg.f(context).a(context, alwe.CONFIG_LAYOUT_MARGIN_START)) - dimensionPixelSize);
        } else {
            paddingStart = view.getPaddingStart();
        }
        if (l2) {
            paddingEnd = Math.max(0, ((int) alwg.f(context).a(context, alwe.CONFIG_LAYOUT_MARGIN_END)) - dimensionPixelSize2);
        } else {
            paddingEnd = view.getPaddingEnd();
        }
        if (paddingStart == view.getPaddingStart() && paddingEnd == view.getPaddingEnd()) {
            return;
        }
        int paddingTop = view.getPaddingTop();
        if (view.getId() == R.id.sud_layout_content) {
            paddingEnd = paddingStart;
        }
        view.setPadding(paddingStart, paddingTop, paddingEnd, view.getPaddingBottom());
    }

    public static void o(ImageView imageView, int i) {
        if (imageView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = i;
            imageView.setLayoutParams(layoutParams);
        }
    }

    public static yqm p(yme ymeVar, azqb azqbVar) {
        if (s(ymeVar)) {
            return (yqm) azqbVar.get();
        }
        return null;
    }

    public static yvc q(Context context, ankw ankwVar, String str, vlk vlkVar) {
        vjf a = vjg.a(context);
        a.e("systemhealth");
        a.f("system_health.pb");
        Uri a2 = a.a();
        vlo d = vlr.d(context, ankwVar);
        d.b();
        d.c = str;
        d.d((String[]) arey.x(amtf.e(akvj.values()).f(aiyy.q).h(), String.class));
        d.e(adiz.j);
        vlr a3 = d.a();
        vli a4 = vlj.a();
        a4.f(a2);
        a4.e(awvl.a);
        a4.b(a3);
        return new yvc(vmu.b(vlkVar.a(a4.a())), awvl.a);
    }

    public static Executor r(yme ymeVar, azqb azqbVar) {
        if (s(ymeVar)) {
            return (Executor) azqbVar.get();
        }
        return null;
    }

    public static boolean s(yme ymeVar) {
        avff d = ymeVar.d();
        if (d.c) {
            avfd avfdVar = d.e;
            if (avfdVar == null) {
                avfdVar = avfd.a;
            }
            if (avfdVar.b) {
                avfd avfdVar2 = d.e;
                if (avfdVar2 == null) {
                    avfdVar2 = avfd.a;
                }
                if (avfdVar2.g) {
                    return true;
                }
                avfd avfdVar3 = d.e;
                if (avfdVar3 == null) {
                    avfdVar3 = avfd.a;
                }
                return avfdVar3.p;
            }
        }
        return false;
    }

    public static NumberFormat u(String str) {
        Currency currency = Currency.getInstance(str);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.getDefault());
        decimalFormat.setCurrency(currency);
        decimalFormat.setMaximumFractionDigits(0);
        return decimalFormat;
    }

    public static NumberFormat v() {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getPercentInstance(Locale.getDefault());
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setMaximumFractionDigits(1);
        decimalFormat.setMultiplier(1);
        return decimalFormat;
    }

    public static sdj t(final awsd awsdVar) {
        awrx awrxVar;
        int i = awsdVar.b;
        int i2 = 3;
        if (i == 0) {
            i2 = 4;
        } else if (i == 2) {
            i2 = 1;
        } else if (i == 3) {
            i2 = 2;
        } else if (i != 4) {
            i2 = 0;
        }
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                return new sdj() { // from class: akrw
                    @Override // defpackage.sdj
                    public final List a(List list) {
                        awry awryVar;
                        awsd awsdVar2 = awsd.this;
                        if (awsdVar2.b == 2) {
                            awryVar = (awry) awsdVar2.c;
                        } else {
                            awryVar = awry.a;
                        }
                        return awryVar.b;
                    }
                };
            }
            if (i3 == 1) {
                return new akrx(awsdVar, v(), 1);
            }
            if (i3 == 2) {
                if (i == 4) {
                    awrxVar = (awrx) awsdVar.c;
                } else {
                    awrxVar = awrx.a;
                }
                return new akrx(awsdVar, u(awrxVar.b));
            }
            return new akrx(awsdVar, DecimalFormat.getInstance(Locale.getDefault()), 2);
        }
        throw null;
    }
}
