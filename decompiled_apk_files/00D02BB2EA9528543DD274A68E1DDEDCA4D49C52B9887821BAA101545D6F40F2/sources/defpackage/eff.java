package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: eff  reason: default package */
/* loaded from: classes.dex */
public class eff {
    public boolean a;
    private final Activity c;
    public final EnumMap<efe, View> b = new EnumMap<>(efe.class);
    private final crzo<Boolean> d = new crzo<>();

    public eff(Activity activity) {
        this.c = activity;
    }

    private final void f() {
        ViewGroup a = a();
        if (a == null) {
            return;
        }
        a.removeAllViews();
        for (View view : this.b.values()) {
            a.addView(view);
        }
        od.F(a, cqrp.d(4.0d).a(this.c));
        for (View view2 : this.b.values()) {
            cqkp i = cqkx.i(view2);
            if (i != null) {
                cqkx.p(i);
            }
        }
        a.requestLayout();
    }

    private final void g() {
        View findViewById = this.c.findViewById(R.id.mod_app_bar);
        if (findViewById != null) {
            findViewById.requestLayout();
        }
    }

    public final ViewGroup a() {
        return (ViewGroup) this.c.findViewById(R.id.top_popup_container);
    }

    public final boolean b(efe efeVar) {
        return this.b.containsKey(efeVar);
    }

    public final crzm<Boolean> c() {
        return this.d.a;
    }

    public final void d(efe efeVar) {
        if (!this.a || !b(efeVar)) {
            return;
        }
        this.b.remove(efeVar);
        f();
        if (!this.b.isEmpty()) {
            return;
        }
        this.a = false;
        this.d.b(false);
        ViewGroup a = a();
        if (a == null) {
            return;
        }
        a.setVisibility(8);
        cqkx.b();
        g();
    }

    public final void e(efe efeVar, View view) {
        this.b.put((EnumMap<efe, View>) efeVar, (efe) view);
        f();
        if (this.a) {
            return;
        }
        this.a = true;
        this.d.b(true);
        a().setVisibility(0);
        cqkx.b();
        g();
    }
}
