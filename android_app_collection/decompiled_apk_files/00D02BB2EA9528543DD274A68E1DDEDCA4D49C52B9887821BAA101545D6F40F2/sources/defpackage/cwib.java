package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwib  reason: default package */
/* loaded from: classes5.dex */
public abstract class cwib {
    public abstract int a();

    public abstract int b();

    public abstract cwic c();

    public abstract void d(Drawable drawable);

    public abstract void e(int i);

    public abstract void f(String str);

    public abstract void g(View.OnClickListener onClickListener);

    public abstract void h(int i);

    public final cwic i() {
        boolean z = true;
        dbsk.m(a() != R.id.og_ai_not_set, "Did you forget to setId()?");
        if (b() == -1) {
            z = false;
        }
        dbsk.m(z, "Did you forget to setVeId()?");
        return c();
    }
}
