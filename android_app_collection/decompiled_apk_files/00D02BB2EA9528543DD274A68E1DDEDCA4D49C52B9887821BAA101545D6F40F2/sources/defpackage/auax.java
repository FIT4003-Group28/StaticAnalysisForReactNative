package defpackage;

import android.view.View;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: auax  reason: default package */
/* loaded from: classes2.dex */
public final class auax implements btph {
    private final auam E;
    private boolean F;
    public final btrm a;
    public final bvjj b;
    public final btvo c;
    public final auan d;
    public final auay e;
    public final aubb f;
    public final ddho g;
    public final boolean h;
    public final auam i;
    @dzsi
    public dqvj k;
    public boolean n;
    public boolean o;
    public audo q;
    @dzsi
    public audm r;
    public boolean w;
    public final audn y;
    public final audp z;
    public int A = 1;
    public dowa j = dowa.KILOMETERS;
    public int l = -1;
    public int m = -1;
    public boolean p = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public boolean v = true;
    public final View.OnAttachStateChangeListener x = new auap(this);
    public final auaq B = new auaq(this);
    public final auar C = new auar(this);
    public final auas D = new auas(this);

    public auax(btrm btrmVar, bvjj bvjjVar, btvo btvoVar, auan auanVar, auay auayVar, aubb aubbVar, ddho ddhoVar, boolean z) {
        auat auatVar = new auat(this);
        this.y = auatVar;
        auau auauVar = new auau(this);
        this.z = auauVar;
        this.a = btrmVar;
        dbsk.s(bvjjVar);
        this.b = bvjjVar;
        dbsk.s(btvoVar);
        this.c = btvoVar;
        this.d = auanVar;
        this.e = auayVar;
        this.f = aubbVar;
        this.g = ddhoVar;
        this.h = z;
        this.q = new audj(aryv.a, false);
        this.i = new auam(auauVar);
        this.E = new auam(auatVar);
        this.F = bvjjVar.m(bvjk.eT, false);
        new auav();
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void a(boolean z) {
        if (this.v == z) {
            return;
        }
        this.v = z;
        this.i.c();
    }

    public final void b() {
        dbsg dbsgVar = dbpy.a;
        int i = this.l;
        if (i >= 0) {
            dbsgVar = dbsg.i(Integer.valueOf(i));
        }
        this.q = new audj(new aryv(dbsgVar, this.j, this.A == 3), this.h);
    }

    public final void d() {
        boolean z = false;
        if (this.l >= 0 && this.n && !this.p && this.c.getNavigationParameters().a.X) {
            z = true;
        }
        if (z == this.w) {
            return;
        }
        this.w = z;
        this.t = true;
        this.E.a();
        if (this.w && !this.F) {
            this.F = true;
            this.b.S(bvjk.eT, true);
        }
        this.E.c();
        this.E.b();
        this.i.c();
    }
}
