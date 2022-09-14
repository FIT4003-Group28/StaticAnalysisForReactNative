package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class u0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1382c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<u0>> f1383d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1384a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1385b;

    private u0(Context context) {
        super(context);
        if (!c1.b()) {
            this.f1384a = new w0(this, context.getResources());
            this.f1385b = null;
            return;
        }
        this.f1384a = new c1(this, context.getResources());
        this.f1385b = this.f1384a.newTheme();
        this.f1385b.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof u0) || (context.getResources() instanceof w0) || (context.getResources() instanceof c1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || c1.b();
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (f1382c) {
                if (f1383d == null) {
                    f1383d = new ArrayList<>();
                } else {
                    for (int size = f1383d.size() - 1; size >= 0; size--) {
                        WeakReference<u0> weakReference = f1383d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1383d.remove(size);
                        }
                    }
                    for (int size2 = f1383d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<u0> weakReference2 = f1383d.get(size2);
                        u0 u0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (u0Var != null && u0Var.getBaseContext() == context) {
                            return u0Var;
                        }
                    }
                }
                u0 u0Var2 = new u0(context);
                f1383d.add(new WeakReference<>(u0Var2));
                return u0Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1384a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1384a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1385b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1385b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
