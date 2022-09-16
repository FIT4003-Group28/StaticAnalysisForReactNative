package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
/* loaded from: classes.dex */
public interface d0 {
    a.g.m.z a(int i, long j);

    void a(int i);

    void a(Drawable drawable);

    void a(Menu menu, n.a aVar);

    void a(n.a aVar, g.a aVar2);

    void a(p0 p0Var);

    void a(boolean z);

    boolean a();

    void b();

    void b(int i);

    void b(boolean z);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g();

    CharSequence getTitle();

    ViewGroup h();

    Context i();

    boolean j();

    int k();

    Menu l();

    int m();

    void n();

    void o();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
