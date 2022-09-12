package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: btxk  reason: default package */
/* loaded from: classes.dex */
public final class btxk {
    public static final long a = TimeUnit.HOURS.toMillis(6);
    public final dxio<ckcw> b;
    public final btwo c;
    public final cqat d;
    public final Object e;
    public final btvo f;
    public btlu g;
    @dzsi
    public Locale h;
    public long i;
    public long j;
    public String k;
    public int l;
    int m;
    public final List<btxj> n;
    public long o;
    public int p;
    @dzsi
    public btww q;
    private final dehq r;
    private final Context s;
    @dzsi
    private btxi t;
    private final Object u;
    private int v;

    public btxk(btwo btwoVar, Context context, dehq dehqVar, cqat cqatVar, dxio<ckcw> dxioVar, dxio<akfa> dxioVar2, btvo btvoVar) {
        ArrayList arrayList = new ArrayList();
        this.e = new Object();
        this.q = null;
        this.g = btlu.a;
        this.h = null;
        this.t = null;
        this.i = 0L;
        this.j = 0L;
        this.k = "";
        this.l = 0;
        this.m = 10000;
        this.u = new Object();
        this.v = 0;
        this.p = 1;
        this.n = arrayList;
        this.c = btwoVar;
        this.r = dehqVar;
        this.d = cqatVar;
        this.s = context;
        this.b = dxioVar;
        this.f = btvoVar;
        arrayList.add(new btxe(this, dxioVar2));
        arrayList.add(new btxg(this, context));
    }

    public final void a(long j, String str) {
        synchronized (this.e) {
            this.j = this.d.b() + j;
            btxi btxiVar = this.t;
            if (btxiVar != null) {
                if (dbsd.a(btxiVar.a, this.g) && this.t.b.equals(this.h) && this.t.d) {
                    return;
                }
                btxi btxiVar2 = this.t;
                btxiVar2.e = true;
                if (btxiVar2.f != null) {
                    btxiVar2.f.a();
                }
            }
            btxi btxiVar3 = new btxi(this, this.g, this.h, str, j == 0);
            this.t = btxiVar3;
            bvqd.a(this.r.d(btxiVar3, j, TimeUnit.MILLISECONDS), this.r);
            if (j == 0) {
                ((ckco) this.b.a().a(ckip.ak)).a(ckil.a(2));
            } else {
                ((ckco) this.b.a().a(ckip.ak)).a(ckil.a(1));
            }
        }
    }

    public final void b(btxi btxiVar, @dzsi dund dundVar, @dzsi btzy btzyVar) {
        synchronized (this.e) {
            if (btxiVar.e) {
                return;
            }
            boolean z = false;
            dbsk.a(btxiVar == this.t);
            this.t = null;
            if (dundVar == null) {
                long c = c(this.i, this.d);
                if (c <= 0) {
                    if (!dbsd.a(btzyVar, btzy.b) && !dbsd.a(btzyVar, btzy.k)) {
                        int i = this.m;
                        this.m = Math.min(1800000, (int) (i * 1.1f));
                        c = i;
                    }
                    c = 10000;
                }
                a(c, "retry");
                return;
            }
            long b = this.d.b();
            this.b.a().t(ckja.a, b - this.i);
            this.i = b;
            this.k = btxiVar.c;
            a(this.o, "refresh");
            this.m = 10000;
            int i2 = this.l + 1;
            this.l = i2;
            btww btwwVar = this.q;
            synchronized (this.u) {
                if (i2 <= this.v) {
                    return;
                }
                this.v = i2;
                if (btxiVar.b != null) {
                    z = true;
                }
                dbsk.l(z);
                btwwVar.a(dundVar, btxiVar.a, btxiVar.b);
            }
        }
    }

    public final long c(long j, cqat cqatVar) {
        if (j <= 0) {
            return 0L;
        }
        long j2 = this.o;
        return Math.min(j2, Math.max(0L, j2 - (cqatVar.b() - j)));
    }

    public final String d(long j) {
        return bvtb.e(this.s.getResources(), ((int) j) / 1000, bvsz.ABBREVIATED).toString();
    }

    protected final void finalize() {
        for (btxj btxjVar : this.n) {
            btxjVar.c();
        }
    }
}
