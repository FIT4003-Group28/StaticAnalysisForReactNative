package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wgf  reason: default package */
/* loaded from: classes7.dex */
public final class wgf implements bzml {
    public final dxio<bzmm> a;
    private final dxio<cjnf> b;
    private final View c;

    public wgf(dxio<bzmm> dxioVar, dxio<cjnf> dxioVar2, View view) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = view;
    }

    @dzsi
    private final View g() {
        return h(this.c);
    }

    @dzsi
    private static View h(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.getId() == R.id.directions_save_trip_button) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View h = h(viewGroup.getChildAt(i));
                if (h != null) {
                    return h;
                }
            }
        }
        return null;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.SAVE_TRIP_BUTTON_DIRECTIONS_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return g() != null;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a().d(dqkc.SAVE_TRIP_BUTTON_DIRECTIONS_TOOLTIP) == 0) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View g = g();
        if (g == null) {
            return false;
        }
        cjnd i = cjne.i();
        i.d(g);
        i.c(R.string.SAVE_TRIP_BUTTON_DIRECTIONS_TOOLTIP_TEXT);
        i.b(true);
        cjnb cjnbVar = (cjnb) i;
        cjnbVar.b = cjtd.a(dtxn.da);
        cjnbVar.c = new Runnable(this) { // from class: wge
            private final wgf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(dqkc.SAVE_TRIP_BUTTON_DIRECTIONS_TOOLTIP);
            }
        };
        this.b.a().a(i.a());
        return true;
    }
}
