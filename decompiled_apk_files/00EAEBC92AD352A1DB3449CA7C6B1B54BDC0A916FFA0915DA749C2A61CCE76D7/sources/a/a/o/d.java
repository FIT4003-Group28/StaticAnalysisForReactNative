package a.a.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f34a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f35b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f36c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f37d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f38e;

    public d() {
        super(null);
    }

    public d(Context context, int i) {
        super(context);
        this.f34a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f35b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.f38e == null) {
            Configuration configuration = this.f37d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f38e = resources;
        }
        return this.f38e;
    }

    private void c() {
        boolean z = this.f35b == null;
        if (z) {
            this.f35b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f35b.setTo(theme);
            }
        }
        a(this.f35b, this.f34a, z);
    }

    public int a() {
        return this.f34a;
    }

    protected void a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f36c == null) {
                this.f36c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f36c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f35b;
        if (theme != null) {
            return theme;
        }
        if (this.f34a == 0) {
            this.f34a = a.a.i.Theme_AppCompat_Light;
        }
        c();
        return this.f35b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f34a != i) {
            this.f34a = i;
            c();
        }
    }
}
