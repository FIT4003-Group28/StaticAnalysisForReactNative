package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public class aj extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f912a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static ArrayList<WeakReference<aj>> f913b;

    /* renamed from: c  reason: collision with root package name */
    private final Resources f914c;

    /* renamed from: d  reason: collision with root package name */
    private final Resources.Theme f915d;

    public static Context a(Context context) {
        if (b(context)) {
            synchronized (f912a) {
                if (f913b == null) {
                    f913b = new ArrayList<>();
                } else {
                    for (int size = f913b.size() - 1; size >= 0; size--) {
                        WeakReference<aj> weakReference = f913b.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f913b.remove(size);
                        }
                    }
                    for (int size2 = f913b.size() - 1; size2 >= 0; size2--) {
                        WeakReference<aj> weakReference2 = f913b.get(size2);
                        aj ajVar = weakReference2 != null ? weakReference2.get() : null;
                        if (ajVar != null && ajVar.getBaseContext() == context) {
                            return ajVar;
                        }
                    }
                }
                aj ajVar2 = new aj(context);
                f913b.add(new WeakReference<>(ajVar2));
                return ajVar2;
            }
        }
        return context;
    }

    private static boolean b(Context context) {
        if ((context instanceof aj) || (context.getResources() instanceof al) || (context.getResources() instanceof ar)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || ar.a();
    }

    private aj(Context context) {
        super(context);
        if (ar.a()) {
            this.f914c = new ar(this, context.getResources());
            this.f915d = this.f914c.newTheme();
            this.f915d.setTo(context.getTheme());
            return;
        }
        this.f914c = new al(this, context.getResources());
        this.f915d = null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return this.f915d == null ? super.getTheme() : this.f915d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f915d == null) {
            super.setTheme(i);
        } else {
            this.f915d.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f914c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f914c.getAssets();
    }
}
