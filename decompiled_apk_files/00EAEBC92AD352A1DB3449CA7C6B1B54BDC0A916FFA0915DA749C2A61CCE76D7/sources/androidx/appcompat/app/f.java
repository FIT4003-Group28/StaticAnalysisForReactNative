package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: b  reason: collision with root package name */
    private static int f897b = -100;

    /* renamed from: c  reason: collision with root package name */
    private static final a.e.b<WeakReference<f>> f898c = new a.e.b<>();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f899d = new Object();

    public static f a(Activity activity, e eVar) {
        return new g(activity, eVar);
    }

    public static f a(Dialog dialog, e eVar) {
        return new g(dialog, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar) {
        synchronized (f899d) {
            c(fVar);
            f898c.add(new WeakReference<>(fVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(f fVar) {
        synchronized (f899d) {
            c(fVar);
        }
    }

    private static void c(f fVar) {
        synchronized (f899d) {
            Iterator<WeakReference<f>> it = f898c.iterator();
            while (it.hasNext()) {
                f fVar2 = it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static int j() {
        return f897b;
    }

    public int a() {
        return -100;
    }

    public abstract <T extends View> T a(int i);

    public void a(Context context) {
    }

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(Toolbar toolbar);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b(int i);

    public abstract a c();

    public abstract void c(int i);

    public abstract void c(Bundle bundle);

    public abstract void d();

    public void d(int i) {
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();
}
