package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import j$.util.Optional;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: irw  reason: default package */
/* loaded from: classes3.dex */
public final class irw {
    public final ayoi a;
    public final int b;
    public final int c;
    public final irv d;
    public final amqo e;
    public int f;
    public int g;
    public int h;
    public int i;
    private final azpm j;
    private final Context k;
    private final ViewGroup l;
    private final View m;
    private final View n;
    private final View o;
    private final int p;
    private int q;

    public irw(Context context, olv olvVar, ypf ypfVar, ViewGroup viewGroup, int i, int i2, int i3, irv irvVar, amqo amqoVar, Optional optional, byte[] bArr, byte[] bArr2) {
        azpm e = azpm.e();
        this.j = e;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.k = context;
        this.b = i;
        this.c = i2;
        this.l = viewGroup;
        this.m = viewGroup.findViewById(i);
        this.n = viewGroup.findViewById(i3);
        this.o = viewGroup.findViewById(i2);
        this.d = irvVar;
        this.e = amqoVar;
        this.p = zew.i(context.getResources().getDisplayMetrics(), 320);
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: irr
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                irw.this.f(view.getWidth(), false);
            }
        });
        this.q = ((Integer) optional.map(ioc.i).orElse(0)).intValue();
        this.a = ayoi.m(e.B(), olvVar.a, new aypx() { // from class: irs
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                irw irwVar = irw.this;
                ampr amprVar = (ampr) obj;
                irwVar.f = ((Integer) amprVar.a).intValue();
                irwVar.i = ((Integer) obj2).intValue();
                return (Boolean) amprVar.b;
            }
        });
        ypfVar.f(new Callable() { // from class: iru
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final irw irwVar = irw.this;
                return irwVar.a.as(new ayqb() { // from class: irt
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        irw irwVar2 = irw.this;
                        Boolean bool = (Boolean) obj;
                        if (!((Optional) irwVar2.e.get()).isPresent()) {
                            return;
                        }
                        irwVar2.e();
                        if (bool.booleanValue()) {
                            PanelsConfiguration panelsConfiguration = (PanelsConfiguration) ((Optional) irwVar2.e.get()).get();
                            if (panelsConfiguration.d()) {
                                irwVar2.d.g(panelsConfiguration.a, irwVar2.b);
                                irwVar2.d.g((PanelDescriptor) panelsConfiguration.b.orElse(null), irwVar2.c);
                            } else {
                                irwVar2.d.mP(irwVar2.b);
                                irwVar2.d.g(panelsConfiguration.a, irwVar2.c);
                            }
                        }
                        if (irwVar2.i()) {
                            irwVar2.d.j(irwVar2.b, irwVar2.g);
                        }
                        if (!irwVar2.h()) {
                            return;
                        }
                        irwVar2.d.j(irwVar2.c, irwVar2.h);
                    }
                });
            }
        });
    }

    public static void b(Context context, dp dpVar, int i) {
        int i2;
        if (dpVar instanceof gcl) {
            float i3 = zew.i(context.getResources().getDisplayMetrics(), 720);
            float f = i;
            if (f < i3) {
                i2 = 0;
            } else {
                double d = f - i3;
                Double.isNaN(d);
                i2 = (int) (d / 2.0d);
            }
            ((gcl) dpVar).aS(i2);
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("active_panel_on_single_panel_mode_key", this.q);
        return bundle;
    }

    public final void c() {
        f(this.l.getWidth(), true);
    }

    public final void d() {
        this.q = 2;
        if (h()) {
            return;
        }
        e();
    }

    public final void e() {
        int i;
        if (this.q == 0) {
            if (!((Optional) this.e.get()).isPresent()) {
                i = 0;
            } else {
                i = ((PanelsConfiguration) ((Optional) this.e.get()).get()).d() ? 1 : 2;
            }
            this.q = i;
        }
        int i2 = this.f;
        int i3 = this.i;
        if (!g()) {
            i3 = (g() || !((Optional) this.e.get()).isPresent() || !((PanelsConfiguration) ((Optional) this.e.get()).get()).d() || this.q != 1) ? 0 : i2;
        } else if (i3 <= 0) {
            i3 = this.p;
        }
        ampr a = ampr.a(Integer.valueOf(i3), Integer.valueOf(i2 - i3));
        this.g = ((Integer) a.a).intValue();
        this.h = ((Integer) a.b).intValue();
        if (g()) {
            this.m.setVisibility(0);
            zgd.t(this.m, zgd.r(this.g), ViewGroup.LayoutParams.class);
            this.n.setVisibility(0);
            this.o.setVisibility(0);
        } else {
            if (this.q == 1) {
                this.m.setVisibility(0);
                zgd.t(this.m, zgd.r(this.g), ViewGroup.LayoutParams.class);
                this.o.setVisibility(8);
            } else {
                this.m.setVisibility(8);
                this.o.setVisibility(0);
            }
            this.n.setVisibility(8);
        }
        this.d.h();
    }

    public final void f(int i, boolean z) {
        this.j.c(ampr.a(Integer.valueOf(i), Boolean.valueOf(z)));
    }

    public final boolean g() {
        return ((Optional) this.e.get()).isPresent() && ((PanelsConfiguration) ((Optional) this.e.get()).get()).d() && this.f >= zew.i(this.k.getResources().getDisplayMetrics(), 640);
    }

    public final boolean h() {
        return this.o.getVisibility() == 0;
    }

    public final boolean i() {
        return this.m.getVisibility() == 0;
    }

    public final boolean j() {
        if (!((Optional) this.e.get()).isPresent()) {
            return false;
        }
        PanelsConfiguration panelsConfiguration = (PanelsConfiguration) ((Optional) this.e.get()).get();
        if (g() || !panelsConfiguration.d() || this.m.getVisibility() != 8) {
            return false;
        }
        this.q = 1;
        e();
        return true;
    }
}
