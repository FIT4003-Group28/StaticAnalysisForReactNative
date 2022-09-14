package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: asvw  reason: default package */
/* loaded from: classes2.dex */
public class asvw implements asmo {
    protected final btrm a;
    public final bvjj b;
    public final asvx c;
    protected final Executor d;
    @dzsi
    public amzi e;
    public boolean f;
    public int g;
    private final araa h;
    private final boolean i;
    private final aufc j;
    private boolean l;
    private final crzp<aufb> k = new asvt(this);
    private final aqzz m = new asvu(this);

    public asvw(btrm btrmVar, bvjj bvjjVar, araa araaVar, boolean z, aufc aufcVar, Executor executor, asvx asvxVar) {
        dbsk.s(btrmVar);
        this.a = btrmVar;
        dbsk.s(bvjjVar);
        this.b = bvjjVar;
        dbsk.s(araaVar);
        this.h = araaVar;
        this.i = z;
        this.j = aufcVar;
        this.d = executor;
        dbsk.s(asvxVar);
        this.c = asvxVar;
        this.l = false;
        this.g = 1;
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public void b() {
        this.c.c(this.b.m(bvjk.cb, false));
        this.j.i().d(this.k, this.d);
        this.h.a(this.m);
    }

    @Override // defpackage.asmo
    public void c() {
        this.h.b();
        this.j.i().c(this.k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        amzf amzfVar;
        amzh amzhVar;
        if (this.e == null) {
            return;
        }
        if (this.c.d()) {
            amzfVar = amzf.AUTO;
        } else if (this.c.a()) {
            amzfVar = amzf.NORTH;
        } else {
            amzfVar = amzf.NEEDLE;
        }
        amzi amziVar = this.e;
        dbsk.s(amziVar);
        amziVar.setDisplayMode(amzfVar);
        if (this.l) {
            amzhVar = amzh.ALWAYS_OFF;
        } else if (this.c.d()) {
            amzhVar = amzh.OFF_IF_NORTH_UP_TOP_DOWN;
        } else {
            amzhVar = amzh.ALWAYS_ON;
        }
        boolean z = true;
        if (this.g != 1) {
            z = false;
        }
        amziVar.setVisibilityMode(amzhVar, z);
    }

    public final void i(boolean z) {
        if (this.c.d() != z) {
            asvx asvxVar = this.c;
            bvrj.UI_THREAD.c();
            if (asvxVar.d() != z) {
                if (!z) {
                    asvxVar.b = 1;
                } else {
                    asvxVar.b = asvxVar.a ? 2 : 3;
                }
                asvxVar.e();
            }
            h();
        }
    }

    public final void j() {
        amzi amziVar = this.e;
        if (amziVar == null || !this.i) {
            return;
        }
        amziVar.setNeedleDrawableId(R.drawable.ic_compass_needle);
        this.e.setNorthDrawableId(true != this.f ? R.drawable.ic_compass_north : R.drawable.ic_compass_north_night);
        this.e.setBackgroundDrawableId(true != this.f ? R.drawable.button_compass_selector : R.drawable.button_compass_night_selector);
        this.e.setIsNightMode(this.f);
    }

    public final void k(int i) {
        l(true, i);
    }

    public final void l(boolean z, int i) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        this.g = i;
        h();
    }
}
