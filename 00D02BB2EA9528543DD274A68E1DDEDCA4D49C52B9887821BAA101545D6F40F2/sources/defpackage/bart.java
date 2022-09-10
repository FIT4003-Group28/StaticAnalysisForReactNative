package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bart  reason: default package */
/* loaded from: classes3.dex */
public class bart implements baqg {
    public final baqh a;
    private final gga b;
    private final axxe c;
    private final jic d;
    private final axwy e;
    @dzsi
    private final jht f;
    @dzsi
    private View.AccessibilityDelegate g;

    public bart(baqh baqhVar, gga ggaVar, axwy axwyVar, final afzv afzvVar, final dxio<akfa> dxioVar, axxe axxeVar) {
        this.a = baqhVar;
        this.b = ggaVar;
        this.e = axwyVar;
        this.c = axxeVar;
        String str = axxeVar.a().g.isEmpty() ? null : axxeVar.a().g.get(0).a;
        this.d = new jic(true == dbsj.d(str) ? "invalid_url" : str, ckqc.FIFE, ibl.i(), 250, new barr());
        final dcdc z = dcbg.b(axxeVar.b()).t(baro.a).z();
        if (z.isEmpty()) {
            this.f = null;
            return;
        }
        ddho ddhoVar = dtyd.db;
        jhu h = jhv.h();
        ((jhi) h).e = ggaVar.getResources().getString(R.string.TRIP_OVERFLOW_MENU_A11Y_HINT);
        jhm a = jhm.a();
        a.a = ggaVar.getResources().getString(R.string.TRIP_SEE_RELATED_EMAILS);
        a.f = cjtd.a(ddhoVar);
        a.n = !z.isEmpty();
        a.d(new View.OnClickListener(afzvVar, z, dxioVar) { // from class: barp
            private final afzv a;
            private final dcdc b;
            private final dxio c;

            {
                this.a = afzvVar;
                this.b = z;
                this.c = dxioVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(this.b, ((akfa) this.c.a()).j());
            }
        });
        h.d(a.c());
        this.f = h.b();
    }

    public static void j(@dzsi View view, int i) {
        View k = k(view);
        if (k != null) {
            k.setImportantForAccessibility(i);
        }
    }

    @dzsi
    private static View k(@dzsi View view) {
        if (view instanceof jhc) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View k = k(viewGroup.getChildAt(i));
            if (k instanceof jhc) {
                return k;
            }
        }
        return null;
    }

    @Override // defpackage.baqg
    public String a() {
        return this.c.a().c;
    }

    @Override // defpackage.baqg
    public String b() {
        gga ggaVar = this.b;
        dpoj dpojVar = this.c.a().e;
        if (dpojVar == null) {
            dpojVar = dpoj.e;
        }
        dpoj dpojVar2 = this.c.a().f;
        if (dpojVar2 == null) {
            dpojVar2 = dpoj.e;
        }
        return batk.o(ggaVar, dpojVar, dpojVar2, 524314);
    }

    @Override // defpackage.baqg
    public jic c() {
        return this.d;
    }

    @Override // defpackage.baqg
    @dzsi
    public jht d() {
        return this.f;
    }

    @Override // defpackage.baqg
    public cjtd e() {
        return cjtd.a(dtyd.cW);
    }

    @Override // defpackage.baqg
    public String f() {
        return a();
    }

    @Override // defpackage.baqg
    public cqkl g() {
        this.e.B(this.c);
        return cqkl.a;
    }

    @Override // defpackage.baqg
    public View.OnTouchListener h() {
        return new View.OnTouchListener(this) { // from class: barq
            private final bart a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View o = cqkx.o(this.a);
                jnq jnqVar = null;
                ViewParent parent = o != null ? o.getParent() : null;
                while (true) {
                    if (parent == null) {
                        break;
                    }
                    parent = parent.getParent();
                    if (parent instanceof jnq) {
                        jnqVar = (jnq) parent;
                        break;
                    }
                }
                if (jnqVar != null) {
                    jnqVar.requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                return false;
            }
        };
    }

    @Override // defpackage.baqg
    public View.AccessibilityDelegate i() {
        View.AccessibilityDelegate accessibilityDelegate = this.g;
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new bars(this);
        }
        this.g = accessibilityDelegate;
        return accessibilityDelegate;
    }
}
