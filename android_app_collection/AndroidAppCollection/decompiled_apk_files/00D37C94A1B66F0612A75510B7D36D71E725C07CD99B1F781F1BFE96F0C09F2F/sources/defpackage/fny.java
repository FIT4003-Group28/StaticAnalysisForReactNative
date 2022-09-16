package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fny  reason: default package */
/* loaded from: classes3.dex */
public final class fny implements fan {
    public final View a;
    public fmr b;
    public foa c;
    public foh d;
    protected int e = 0;
    private final fao f;
    private final fms g;
    private final fob h;
    private final foi i;

    public fny(fao faoVar, fms fmsVar, fob fobVar, foi foiVar, View view) {
        this.f = faoVar;
        this.g = fmsVar;
        this.h = fobVar;
        this.i = foiVar;
        this.a = view;
    }

    public static apos c(avaq avaqVar) {
        if (avaqVar != null) {
            apok apokVar = avaqVar.o;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 2) == 0) {
                return null;
            }
            apok apokVar2 = avaqVar.o;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apos aposVar = apokVar2.d;
            return aposVar == null ? apos.a : aposVar;
        }
        return null;
    }

    public static avbh d(avaq avaqVar) {
        if (avaqVar != null) {
            avao avaoVar = avaqVar.p;
            if (avaoVar == null) {
                avaoVar = avao.a;
            }
            if (avaoVar.b != 136076983) {
                return null;
            }
            avao avaoVar2 = avaqVar.p;
            if (avaoVar2 == null) {
                avaoVar2 = avao.a;
            }
            if (avaoVar2.b == 136076983) {
                return (avbh) avaoVar2.c;
            }
            return avbh.a;
        }
        return null;
    }

    public static avbl e(avaq avaqVar) {
        if (avaqVar != null) {
            avao avaoVar = avaqVar.p;
            if (avaoVar == null) {
                avaoVar = avao.a;
            }
            if (avaoVar.b != 119226798) {
                return null;
            }
            avao avaoVar2 = avaqVar.p;
            if (avaoVar2 == null) {
                avaoVar2 = avao.a;
            }
            if (avaoVar2.b == 119226798) {
                return (avbl) avaoVar2.c;
            }
            return avbl.a;
        }
        return null;
    }

    private final void h() {
        fmr fmrVar = this.b;
        if (fmrVar != null) {
            fmrVar.b(null);
        }
        foa foaVar = this.c;
        if (foaVar != null) {
            foaVar.b(null, null);
        }
        foh fohVar = this.d;
        if (fohVar != null) {
            fohVar.h(null, null);
        }
        this.f.a.remove(this);
        this.e = 0;
    }

    public final View a() {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return this.c.a;
            }
            if (i == 3) {
                return this.d.b;
            }
            return null;
        }
        return this.b.a;
    }

    @Override // defpackage.fan
    public final void b(agbc agbcVar) {
        if (this.e == 3) {
            this.d.b(agbcVar);
        }
    }

    public final void f() {
        fmr fmrVar = this.b;
        if (fmrVar != null) {
            fmrVar.a();
        }
        foa foaVar = this.c;
        if (foaVar != null) {
            foaVar.a();
        }
        foh fohVar = this.d;
        if (fohVar != null) {
            fohVar.f();
        }
        this.a.setVisibility(8);
    }

    public final void g(avaq avaqVar, acti actiVar) {
        if (avaqVar == null) {
            h();
            return;
        }
        apos c = c(avaqVar);
        int i = 0;
        if (c == null) {
            fmr fmrVar = this.b;
            if (fmrVar != null) {
                fmrVar.b(null);
            }
        } else {
            if (this.b == null) {
                this.b = this.g.a(((ViewStub) this.a.findViewById(R.id.toggle_button_view_stub)).inflate());
            }
            this.b.b(c);
            if (actiVar != null) {
                actiVar.u(new acte(c.v), null);
            }
            this.e = 1;
            i = 1;
        }
        avbl e = e(avaqVar);
        if (e == null) {
            foa foaVar = this.c;
            if (foaVar != null) {
                foaVar.b(null, actiVar);
            }
        } else {
            if (this.c == null) {
                this.c = this.h.a((ImageView) ((ViewStub) this.a.findViewById(R.id.notification_options_view_stub)).inflate());
            }
            this.c.b(e, actiVar);
            this.e = 2;
            i++;
        }
        avbh d = d(avaqVar);
        if (d == null) {
            foh fohVar = this.d;
            if (fohVar != null) {
                fohVar.h(null, actiVar);
            }
        } else {
            if (this.d == null) {
                this.d = this.i.a((TextView) ((ViewStub) this.a.findViewById(R.id.notification_toggle_view_stub)).inflate());
            }
            this.d.h(d, actiVar);
            this.e = 3;
            i++;
        }
        if (i > 1) {
            zep.b("More than 1 notification renderers were given");
            h();
            return;
        }
        this.f.a.add(this);
    }
}
