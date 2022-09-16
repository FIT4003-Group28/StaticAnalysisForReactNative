package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.google.cardboard.sdk.R;
/* compiled from: PG */
/* renamed from: ack  reason: default package */
/* loaded from: classes.dex */
public final class ack extends ContextWrapper {
    public int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public ack() {
        super(null);
    }

    private final void c() {
        if (this.b == null) {
            this.b = a().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final Resources a() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                this.e = super.getResources();
            } else {
                this.e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.e;
    }

    public final void b(Configuration configuration) {
        if (this.e == null) {
            if (this.d != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            this.d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return a().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        c();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public ack(Context context, int i) {
        super(context);
        this.a = i;
    }

    public ack(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}
