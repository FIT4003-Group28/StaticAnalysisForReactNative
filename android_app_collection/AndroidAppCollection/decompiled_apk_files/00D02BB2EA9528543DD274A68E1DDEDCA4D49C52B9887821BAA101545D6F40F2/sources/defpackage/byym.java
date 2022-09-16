package defpackage;

import android.content.DialogInterface;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byym  reason: default package */
/* loaded from: classes4.dex */
public final class byym implements byyp {
    public final ff a;
    public final byyp b;
    private final axrx c;
    private final axru d;
    private final gdc e;

    public byym(ff ffVar, axrx axrxVar, axru axruVar, byyp byypVar, gdc gdcVar) {
        this.a = ffVar;
        this.c = axrxVar;
        this.d = axruVar;
        this.b = byypVar;
        this.e = gdcVar;
    }

    public final void a(final amte amteVar, final int i, final byyo byyoVar, final boolean z) {
        if (!this.d.a("android.permission.ACCESS_FINE_LOCATION")) {
            this.c.f(new axrw(this, amteVar, i, byyoVar, z) { // from class: byyk
                private final byym a;
                private final amte b;
                private final int c;
                private final byyo d;
                private final boolean e;

                {
                    this.a = this;
                    this.b = amteVar;
                    this.c = i;
                    this.d = byyoVar;
                    this.e = z;
                }

                @Override // defpackage.axrw
                public final void a(int i2) {
                    byym byymVar = this.a;
                    amte amteVar2 = this.b;
                    int i3 = this.c;
                    byyo byyoVar2 = this.d;
                    boolean z2 = this.e;
                    if (i2 == 0) {
                        byymVar.a(amteVar2, i3, byyoVar2, z2);
                    } else {
                        Toast.makeText(byymVar.a, "Cannot start guidance as location permission is denied.", 1).show();
                    }
                }
            });
        } else if (!z) {
            ((bzcb) this.b).a(amteVar, i, byyoVar, false);
        } else if (this.d.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            ((bzcb) this.b).a(amteVar, i, byyoVar, true);
        } else {
            this.c.b("android.permission.WRITE_EXTERNAL_STORAGE", new axrw(this, amteVar, i, byyoVar) { // from class: byyl
                private final byym a;
                private final amte b;
                private final int c;
                private final byyo d;

                {
                    this.a = this;
                    this.b = amteVar;
                    this.c = i;
                    this.d = byyoVar;
                }

                @Override // defpackage.axrw
                public final void a(int i2) {
                    byym byymVar = this.a;
                    amte amteVar2 = this.b;
                    int i3 = this.c;
                    byyo byyoVar2 = this.d;
                    if (i2 == 0) {
                        byymVar.a(amteVar2, i3, byyoVar2, true);
                        return;
                    }
                    Toast.makeText(byymVar.a, "Track recording disabled", 0).show();
                    byymVar.a(amteVar2, i3, byyoVar2, false);
                }
            });
        }
    }

    @Override // defpackage.byyp
    public final void b(final amte amteVar, final int i, final byyo byyoVar) {
        bzdk c = this.b.c();
        if (c.h() == bzdj.STARTED) {
            amub b = amteVar.b(i, this.a);
            if (b == null || c.a(b)) {
                return;
            }
            String string = this.a.getString(R.string.TRANSIT_GUIDANCE_STOP_EXISTING_TRIP, new Object[]{c.j()});
            gcz a = this.e.a();
            a.j();
            a.e = string;
            a.i = cjtd.a(dtyc.cQ);
            a.h(R.string.YES_BUTTON, cjtd.a(dtyc.cS), new gdd(this, amteVar, i, byyoVar) { // from class: byyi
                private final byym a;
                private final amte b;
                private final int c;
                private final byyo d;

                {
                    this.a = this;
                    this.b = amteVar;
                    this.c = i;
                    this.d = byyoVar;
                }

                @Override // defpackage.gdd
                public final void a(DialogInterface dialogInterface) {
                    this.a.a(this.b, this.c, this.d, false);
                }
            });
            a.e(R.string.NO_BUTTON, cjtd.a(dtyc.cR), byyj.a);
            a.b();
            return;
        }
        a(amteVar, i, byyoVar, false);
    }

    @Override // defpackage.byyp
    public final bzdk c() {
        return this.b.c();
    }

    @Override // defpackage.bzgh
    public final void d(bzgf bzgfVar, bzgj bzgjVar, @dzsi Executor executor) {
        this.b.d(bzgfVar, bzgjVar, executor);
    }

    @Override // defpackage.byyp
    public final int e() {
        return this.b.e();
    }

    @Override // defpackage.byyp
    public final void f(bzdd bzddVar) {
        this.b.f(bzddVar);
    }

    @Override // defpackage.byyp
    public final void g(byys byysVar) {
        throw null;
    }

    public final void h(boolean z) {
        bzem bzemVar = ((bzcb) this.b).c;
        if (bzemVar != null) {
            ((bzfg) bzemVar).v = z;
        }
    }
}
