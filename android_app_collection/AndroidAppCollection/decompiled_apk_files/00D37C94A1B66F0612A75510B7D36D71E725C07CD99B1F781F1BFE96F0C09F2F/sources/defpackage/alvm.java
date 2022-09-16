package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: alvm  reason: default package */
/* loaded from: classes.dex */
public class alvm extends TemplateLayout {
    private static final ancy g = new ancy("PartnerCustomizationLayout");
    private boolean c;
    private boolean d;
    private boolean e;
    private Activity f;

    public alvm(Context context) {
        this(context, 0, 0);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    private void k(AttributeSet attributeSet, int i) {
        Window window;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alvn.c, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        if (z) {
            setSystemUiVisibility(1024);
        }
        j(alwl.class, new alwl(this, this.f.getWindow(), attributeSet, i));
        j(alwm.class, new alwm(this, this.f.getWindow()));
        j(alwi.class, new alwi(this, attributeSet, i));
        alwm alwmVar = (alwm) i(alwm.class);
        if (Build.VERSION.SDK_INT >= 27) {
            TypedArray obtainStyledAttributes2 = alwmVar.a.getContext().obtainStyledAttributes(attributeSet, alvn.e, i, 0);
            int color = obtainStyledAttributes2.getColor(1, 0);
            alwmVar.e = color;
            if (alwmVar.b != null) {
                if (alwmVar.c && !alwmVar.d) {
                    Context context = alwmVar.a.getContext();
                    color = alwg.f(context).c(context, alwe.CONFIG_NAVIGATION_BAR_BG_COLOR);
                }
                alwmVar.b.setNavigationBarColor(color);
            }
            boolean z2 = obtainStyledAttributes2.getBoolean(0, Build.VERSION.SDK_INT < 26 || (window = alwmVar.b) == null || (window.getDecorView().getSystemUiVisibility() & 16) == 16);
            if (Build.VERSION.SDK_INT >= 26 && alwmVar.b != null) {
                if (alwmVar.c) {
                    Context context2 = alwmVar.a.getContext();
                    z2 = alwg.f(context2).j(context2, alwe.CONFIG_LIGHT_NAVIGATION_BAR, false);
                }
                if (z2) {
                    alwmVar.b.getDecorView().setSystemUiVisibility(alwmVar.b.getDecorView().getSystemUiVisibility() | 16);
                } else {
                    alwmVar.b.getDecorView().setSystemUiVisibility(alwmVar.b.getDecorView().getSystemUiVisibility() & (-17));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                TypedArray obtainStyledAttributes3 = alwmVar.a.getContext().obtainStyledAttributes(new int[]{16844141});
                int color2 = obtainStyledAttributes2.getColor(2, obtainStyledAttributes3.getColor(0, 0));
                if (Build.VERSION.SDK_INT >= 28 && alwmVar.b != null) {
                    if (alwmVar.c) {
                        Context context3 = alwmVar.a.getContext();
                        if (alwg.f(context3).l(alwe.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR)) {
                            color2 = alwg.f(context3).c(context3, alwe.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR);
                        }
                    }
                    alwmVar.b.setNavigationBarDividerColor(color2);
                }
                obtainStyledAttributes3.recycle();
            }
            obtainStyledAttributes2.recycle();
        }
        this.f.getWindow().addFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.f.getWindow().clearFlags(67108864);
        this.f.getWindow().clearFlags(134217728);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected View b(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.partner_customization_layout;
        }
        return h(layoutInflater, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.setupcompat.internal.TemplateLayout
    public ViewGroup c(int i) {
        if (i == 0) {
            i = R.id.suc_layout_content;
        }
        return super.c(i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected final void d(AttributeSet attributeSet, int i) {
        boolean z = true;
        this.c = true;
        Activity a = a(getContext());
        this.f = a;
        boolean j = aqgn.j(a.getIntent());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alvn.c, i, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            ancy ancyVar = g;
            String valueOf = String.valueOf(this.f.getComponentName());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Attribute sucUsePartnerResource not found in ");
            sb.append(valueOf);
            ancyVar.b(sb.toString());
        }
        if (!j && !obtainStyledAttributes.getBoolean(2, true)) {
            z = false;
        }
        this.c = z;
        this.e = obtainStyledAttributes.hasValue(0);
        this.d = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        String.valueOf(this.f.getClass().getSimpleName()).length();
    }

    public final boolean e() {
        return this.e && aqgn.l() && alwg.f(getContext()).k();
    }

    public final boolean f() {
        return this.c && Build.VERSION.SDK_INT >= 29 && alwg.f(getContext()).k();
    }

    public final boolean g() {
        return e() && this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        alvs.a(this.f);
        alwi alwiVar = (alwi) i(alwi.class);
        alwiVar.l.b(alwiVar.e(), false);
        alwiVar.l.c(alwiVar.f(), false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        PersistableBundle persistableBundle;
        PersistableBundle persistableBundle2;
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 29 || !aqgn.j(this.f.getIntent())) {
            return;
        }
        alwi alwiVar = (alwi) i(alwi.class);
        alwd alwdVar = alwiVar.l;
        boolean e = alwiVar.e();
        boolean f = alwiVar.f();
        alwdVar.a = alwd.a(alwdVar.a, e);
        alwdVar.b = alwd.a(alwdVar.b, f);
        alwj alwjVar = alwiVar.e;
        alwj alwjVar2 = alwiVar.f;
        if (alwjVar != null) {
            persistableBundle = alwjVar.a("PrimaryFooterButton");
        } else {
            persistableBundle = PersistableBundle.EMPTY;
        }
        if (alwjVar2 != null) {
            persistableBundle2 = alwjVar2.a("SecondaryFooterButton");
        } else {
            persistableBundle2 = PersistableBundle.EMPTY;
        }
        alwd alwdVar2 = alwiVar.l;
        PersistableBundle persistableBundle3 = new PersistableBundle();
        persistableBundle3.putString("PrimaryButtonVisibility", alwdVar2.a);
        persistableBundle3.putString("SecondaryButtonVisibility", alwdVar2.b);
        alwb.a(getContext(), CustomEvent.e(MetricKey.b("SetupCompatMetrics", this.f), alvt.b(persistableBundle3, persistableBundle, persistableBundle2)));
    }

    public alvm(Context context, int i) {
        this(context, i, 0);
    }

    public alvm(Context context, int i, int i2) {
        super(context, i, i2);
        k(null, R.attr.sucLayoutTheme);
    }

    public alvm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k(attributeSet, R.attr.sucLayoutTheme);
    }

    public alvm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k(attributeSet, i);
    }
}
