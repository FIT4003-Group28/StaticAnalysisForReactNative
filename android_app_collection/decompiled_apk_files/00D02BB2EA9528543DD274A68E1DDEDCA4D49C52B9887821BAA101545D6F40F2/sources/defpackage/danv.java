package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.maps.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: danv  reason: default package */
/* loaded from: classes5.dex */
public class danv extends TemplateLayout {
    private boolean c;
    private Activity d;

    public danv(Context context) {
        this(context, 0, 0);
    }

    private void h(AttributeSet attributeSet, int i) {
        Window window;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, danw.c, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (z) {
            setSystemUiVisibility(1024);
        }
        e(dapa.class, new dapa(this, this.d.getWindow(), attributeSet, i));
        e(dapb.class, new dapb(this, this.d.getWindow()));
        e(daow.class, new daow(this, attributeSet, i));
        dapb dapbVar = (dapb) f(dapb.class);
        if (Build.VERSION.SDK_INT >= 27) {
            TypedArray obtainStyledAttributes2 = dapbVar.a.getContext().obtainStyledAttributes(attributeSet, danw.e, i, 0);
            int color = obtainStyledAttributes2.getColor(1, 0);
            dapbVar.d = color;
            if (dapbVar.b != null) {
                if (dapbVar.c) {
                    Context context = dapbVar.a.getContext();
                    color = daou.a(context).c(context, daos.CONFIG_NAVIGATION_BAR_BG_COLOR);
                }
                dapbVar.b.setNavigationBarColor(color);
            }
            boolean z2 = obtainStyledAttributes2.getBoolean(0, Build.VERSION.SDK_INT < 26 || (window = dapbVar.b) == null || (window.getDecorView().getSystemUiVisibility() & 16) == 16);
            if (Build.VERSION.SDK_INT >= 26 && dapbVar.b != null) {
                if (dapbVar.c) {
                    Context context2 = dapbVar.a.getContext();
                    z2 = daou.a(context2).j(context2, daos.CONFIG_LIGHT_NAVIGATION_BAR);
                }
                if (z2) {
                    dapbVar.b.getDecorView().setSystemUiVisibility(dapbVar.b.getDecorView().getSystemUiVisibility() | 16);
                } else {
                    dapbVar.b.getDecorView().setSystemUiVisibility(dapbVar.b.getDecorView().getSystemUiVisibility() & (-17));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                TypedArray obtainStyledAttributes3 = dapbVar.a.getContext().obtainStyledAttributes(new int[]{16844141});
                int color2 = obtainStyledAttributes2.getColor(2, obtainStyledAttributes3.getColor(0, 0));
                if (Build.VERSION.SDK_INT >= 28 && dapbVar.b != null) {
                    if (dapbVar.c) {
                        Context context3 = dapbVar.a.getContext();
                        daou a = daou.a(context3);
                        daos daosVar = daos.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR;
                        if (a.b() && a.b.containsKey(daosVar.U)) {
                            color2 = daou.a(context3).c(context3, daos.CONFIG_NAVIGATION_BAR_DIVIDER_COLOR);
                        }
                    }
                    dapbVar.b.setNavigationBarDividerColor(color2);
                }
                obtainStyledAttributes3.recycle();
            }
            obtainStyledAttributes2.recycle();
        }
        this.d.getWindow().addFlags(Integer.MIN_VALUE);
        this.d.getWindow().clearFlags(67108864);
        this.d.getWindow().clearFlags(134217728);
    }

    private static Activity i(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return i(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.partner_customization_layout;
        }
        return g(layoutInflater, 0, i);
    }

    @Override // com.google.android.setupcompat.internal.TemplateLayout
    protected final void b(AttributeSet attributeSet, int i) {
        boolean z = true;
        this.c = true;
        Activity i2 = i(getContext());
        this.d = i2;
        boolean a = dapd.a(i2.getIntent());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, danw.c, i, 0);
        if (!obtainStyledAttributes.hasValue(1)) {
            String valueOf = String.valueOf(this.d.getComponentName());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("Attribute sucUsePartnerResource not found in ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!a && !obtainStyledAttributes.getBoolean(1, true)) {
            z = false;
        }
        this.c = z;
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.setupcompat.internal.TemplateLayout
    public ViewGroup c(int i) {
        if (i == 0) {
            i = R.id.suc_layout_content;
        }
        return super.c(i);
    }

    public final boolean d() {
        return this.c && Build.VERSION.SDK_INT >= 29 && daou.a(getContext()).b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        FragmentManager fragmentManager;
        super.onAttachedToWindow();
        Activity activity = this.d;
        if (dapd.a(activity.getIntent())) {
            daoi e = daoi.e(activity.getApplicationContext());
            String a = daoc.a(activity);
            Bundle bundle = new Bundle();
            bundle.putString("screenName", daoc.a(activity));
            bundle.putString("intentAction", activity.getIntent().getAction());
            e.b(a, bundle);
            if (Build.VERSION.SDK_INT > 23 && (fragmentManager = activity.getFragmentManager()) != null && !fragmentManager.isDestroyed()) {
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag("lifecycle_monitor");
                if (findFragmentByTag == null) {
                    daod daodVar = new daod();
                    try {
                        fragmentManager.beginTransaction().add(daodVar, "lifecycle_monitor").commitNow();
                        findFragmentByTag = daodVar;
                    } catch (IllegalStateException unused) {
                        String valueOf = String.valueOf(activity.getComponentName());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("Error occurred when attach to Activity:");
                        sb.append(valueOf);
                        sb.toString();
                    }
                } else if (!(findFragmentByTag instanceof daod)) {
                    activity.getClass();
                }
                daod daodVar2 = (daod) findFragmentByTag;
            }
        }
        daow daowVar = (daow) f(daow.class);
        daowVar.g.a(daowVar.b(), false);
        daowVar.g.b(daowVar.f(), false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        PersistableBundle persistableBundle;
        PersistableBundle persistableBundle2;
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 29 || !dapd.a(this.d.getIntent())) {
            return;
        }
        daow daowVar = (daow) f(daow.class);
        daor daorVar = daowVar.g;
        boolean b = daowVar.b();
        boolean f = daowVar.f();
        daorVar.a = daor.c(daorVar.a, b);
        daorVar.b = daor.c(daorVar.b, f);
        daox daoxVar = daowVar.b;
        daox daoxVar2 = daowVar.c;
        if (daoxVar != null) {
            persistableBundle = daoxVar.a("PrimaryFooterButton");
        } else {
            persistableBundle = PersistableBundle.EMPTY;
        }
        if (daoxVar2 != null) {
            persistableBundle2 = daoxVar2.a("SecondaryFooterButton");
        } else {
            persistableBundle2 = PersistableBundle.EMPTY;
        }
        daor daorVar2 = daowVar.g;
        PersistableBundle persistableBundle3 = new PersistableBundle();
        persistableBundle3.putString("PrimaryButtonVisibility", daorVar2.a);
        persistableBundle3.putString("SecondaryButtonVisibility", daorVar2.b);
        PersistableBundle[] persistableBundleArr = {persistableBundle2};
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(persistableBundle3, persistableBundle));
        Collections.addAll(arrayList, persistableBundleArr);
        PersistableBundle persistableBundle4 = new PersistableBundle();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PersistableBundle persistableBundle5 = (PersistableBundle) arrayList.get(i);
            for (String str : persistableBundle5.keySet()) {
                daof.a(!persistableBundle4.containsKey(str), String.format("Found duplicate key [%s] while attempting to merge bundles.", str));
            }
            persistableBundle4.putAll(persistableBundle5);
        }
        daoq.a(getContext(), CustomEvent.a(MetricKey.a("SetupCompatMetrics", this.d), persistableBundle4));
    }

    public danv(Context context, int i) {
        this(context, i, 0);
    }

    public danv(Context context, int i, int i2) {
        super(context, i, i2);
        h(null, R.attr.sucLayoutTheme);
    }

    public danv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(attributeSet, R.attr.sucLayoutTheme);
    }

    public danv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h(attributeSet, i);
    }
}
