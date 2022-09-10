package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axyo  reason: default package */
/* loaded from: classes3.dex */
public final class axyo {
    private final Activity a;
    private final akfa b;
    private final dxio<axwp> c;
    private final ilo d;
    private int e = 0;
    private int f;

    public axyo(Activity activity, akfa akfaVar, dxio<axwp> dxioVar, ilo iloVar) {
        azwv a;
        this.f = 1;
        this.a = activity;
        this.b = akfaVar;
        this.c = dxioVar;
        this.d = iloVar;
        if (btlu.i(akfaVar.j()) != btlt.GOOGLE || (a = dxioVar.a().a(azxb.f(iloVar.D, iloVar.E))) == null) {
            return;
        }
        dcde C = dcbg.b(a.n()).o(axym.a).C(axyn.a);
        dcdc h = C.h(baab.CUSTOM);
        int size = h.size();
        for (int i = 0; i < size; i++) {
            azwu azwuVar = (azwu) h.get(i);
            if (azwuVar.d() && !azwuVar.f()) {
                this.f = 5;
                this.e++;
            }
        }
        if (a.f()) {
            this.f = 4;
            this.e++;
        }
        if (C.m(baab.WANT_TO_GO)) {
            this.f = 3;
            this.e++;
        }
        if (!C.m(baab.FAVORITES)) {
            return;
        }
        this.f = 2;
        this.e++;
    }

    private final int i() {
        int i = this.f;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return 2131231722;
            }
            if (i2 == 2) {
                return 2131231720;
            }
            if (i2 == 3) {
                return 2131231723;
            }
            return i2 != 4 ? 2131231719 : 2131231721;
        }
        throw null;
    }

    public final boolean a() {
        return this.f != 1;
    }

    @Deprecated
    public final cqtd b() {
        return cqrt.g(i(), h());
    }

    public final cqtd c() {
        cqss a;
        int i = i();
        int i2 = this.f;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 1) {
                a = bael.a(baab.FAVORITES);
            } else if (i3 == 2) {
                a = bael.a(baab.WANT_TO_GO);
            } else if (i3 == 3) {
                a = baam.c(baab.STARRED_PLACES);
            } else if (i3 == 4) {
                a = bael.a(baab.CUSTOM);
            } else {
                a = ibm.x();
            }
            return cqrt.g(i, a);
        }
        throw null;
    }

    public final cqsn e() {
        if (a()) {
            int i = this.e;
            if (i > 1) {
                return cqrt.m(R.string.SAVED_WITH_PLACE_LISTS_COUNT, Integer.valueOf(i));
            }
            return cqrt.l(R.string.SAVED);
        }
        return cqrt.l(R.string.SAVE);
    }

    public final cqsn f() {
        return cqsk.a(g());
    }

    public final String g() {
        return a() ? this.e > 1 ? this.a.getString(R.string.ACCESSIBILITY_SAVED_TO_MULTIPLE_LISTS_TEXT, new Object[]{this.d.n(), Integer.valueOf(this.e)}) : this.a.getString(R.string.ACCESSIBILITY_SAVED_TO_ONE_LIST_TEXT, new Object[]{this.d.n()}) : this.a.getString(R.string.ACCESSIBILITY_SAVE_PLACE, new Object[]{this.d.n()});
    }

    public final cqtd d() {
        int i = this.f;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return cqrt.f(2131231791);
            }
            if (i2 == 2) {
                return cqrt.f(2131231794);
            }
            if (i2 == 3) {
                return cqrt.f(2131231793);
            }
            if (i2 == 4) {
                return cqrt.f(2131231790);
            }
            return cqrt.f(2131231792);
        }
        throw null;
    }

    public final cqss h() {
        int i = this.f;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return bael.a(baab.FAVORITES);
            }
            if (i2 == 2) {
                return bael.a(baab.WANT_TO_GO);
            }
            if (i2 == 3) {
                return baam.c(baab.STARRED_PLACES);
            }
            if (i2 == 4) {
                return bael.a(baab.CUSTOM);
            }
            return ire.j();
        }
        throw null;
    }
}
