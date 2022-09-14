package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.v7.a.a;
import android.view.LayoutInflater;
/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f711a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f712b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f713c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f714d;
    private Resources e;

    public c() {
        super(null);
    }

    public c(Context context, int i) {
        super(context);
        this.f711a = i;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f712b = theme;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return a();
    }

    private Resources a() {
        if (this.e == null) {
            if (this.f714d == null) {
                this.e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.e = createConfigurationContext(this.f714d).getResources();
            }
        }
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f711a != i) {
            this.f711a = i;
            b();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        if (this.f712b != null) {
            return this.f712b;
        }
        if (this.f711a == 0) {
            this.f711a = a.i.Theme_AppCompat_Light;
        }
        b();
        return this.f712b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f713c == null) {
                this.f713c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f713c;
        }
        return getBaseContext().getSystemService(str);
    }

    protected void a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    private void b() {
        boolean z = this.f712b == null;
        if (z) {
            this.f712b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f712b.setTo(theme);
            }
        }
        a(this.f712b, this.f711a, z);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
