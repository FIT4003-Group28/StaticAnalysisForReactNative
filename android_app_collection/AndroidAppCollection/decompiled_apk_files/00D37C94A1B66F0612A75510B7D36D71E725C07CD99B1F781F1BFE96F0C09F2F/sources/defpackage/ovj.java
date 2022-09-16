package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ovj  reason: default package */
/* loaded from: classes4.dex */
public class ovj implements oui, ouh, pbv {
    private final afga A;
    protected final oxo a;
    public final int b;
    public final ovi c;
    private final ovk d;
    private final ove e = new ove();
    private final LinkedList f;
    private final List g;
    private final int h;
    private final Handler i;
    private final int j;
    private int k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private pbz q;
    private boolean r;
    private IOException s;
    private int t;
    private int u;
    private long v;
    private long w;
    private owx x;
    private MediaFormat y;
    private ovm z;

    public ovj(ovk ovkVar, afga afgaVar, int i, Handler handler, ovi oviVar, int i2, int i3) {
        this.d = ovkVar;
        this.A = afgaVar;
        this.h = i;
        this.i = handler;
        this.c = oviVar;
        this.b = i2;
        this.j = i3;
        LinkedList linkedList = new LinkedList();
        this.f = linkedList;
        this.g = Collections.unmodifiableList(linkedList);
        this.a = new oxo(afgaVar.f);
        this.k = 0;
        this.n = Long.MIN_VALUE;
    }

    private final void A() {
        if (this.c != null) {
            this.i.post(new ovf(this));
        }
    }

    private final void B() {
        if (this.c != null) {
            this.i.post(new ovf(this, 1));
        }
    }

    private final long q() {
        if (y()) {
            return this.n;
        }
        if (!this.r) {
            return ((ovq) this.f.getLast()).h;
        }
        return -1L;
    }

    private final void r() {
        this.e.b = null;
        s();
    }

    private final void s() {
        this.s = null;
        this.u = 0;
    }

    private final void t() {
        ove oveVar = this.e;
        oveVar.c = false;
        oveVar.a = this.g.size();
        ovk ovkVar = this.d;
        List list = this.g;
        long j = this.n;
        if (j == Long.MIN_VALUE) {
            j = this.l;
        }
        ovkVar.f(list, j, this.e);
        this.r = this.e.c;
    }

    private final void u() {
        ovb ovbVar = this.e.b;
        if (ovbVar == null) {
            return;
        }
        this.w = SystemClock.elapsedRealtime();
        if (ovbVar instanceof ovq) {
            ovq ovqVar = (ovq) ovbVar;
            oxo oxoVar = this.a;
            ovqVar.k = oxoVar;
            ovqVar.l = oxoVar.a.b.a();
            this.f.add(ovqVar);
            if (y()) {
                this.n = Long.MIN_VALUE;
            }
            B();
        } else {
            B();
        }
        this.q.d(ovbVar, this);
    }

    private final void v(long j) {
        this.n = j;
        this.r = false;
        pbz pbzVar = this.q;
        if (pbzVar.b) {
            pbzVar.a();
            return;
        }
        this.a.b();
        this.f.clear();
        r();
        w();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovj.w():void");
    }

    private final boolean x(int i) {
        long j;
        int i2;
        if (this.f.size() <= i) {
            return false;
        }
        long j2 = ((ovq) this.f.getLast()).h;
        ovq ovqVar = null;
        while (this.f.size() > i) {
            ovqVar = (ovq) this.f.removeLast();
            long j3 = ovqVar.g;
            this.r = false;
        }
        oxo oxoVar = this.a;
        int i3 = ovqVar.l;
        oyc oycVar = oxoVar.a;
        oya oyaVar = oycVar.b;
        int a = oyaVar.a() - i3;
        pce.b(a >= 0 && a <= oyaVar.d);
        if (a != 0) {
            oyaVar.d -= a;
            int i4 = oyaVar.g;
            int i5 = oyaVar.a;
            int i6 = ((i4 + i5) - a) % i5;
            oyaVar.g = i6;
            j = oyaVar.b[i6];
        } else if (oyaVar.e == 0 && oyaVar.d == 0) {
            j = 0;
        } else {
            int i7 = oyaVar.g;
            if (i7 == 0) {
                i7 = oyaVar.a;
            }
            j = oyaVar.c[i2] + oyaVar.b[i7 - 1];
        }
        oycVar.g = j;
        int i8 = (int) (j - oycVar.f);
        int i9 = oycVar.a;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        int size = (oycVar.c.size() - i10) - 1;
        if (i11 == 0) {
            size++;
            i11 = 0;
        }
        for (int i12 = 0; i12 < size; i12++) {
            oycVar.i.e((anuf) oycVar.c.removeLast());
        }
        oycVar.j = (anuf) oycVar.c.peekLast();
        if (i11 == 0) {
            i11 = oycVar.a;
        }
        oycVar.h = i11;
        oxoVar.d = oxoVar.a.e(oxoVar.b) ? oxoVar.b.e : Long.MIN_VALUE;
        if (this.c != null) {
            this.i.post(new ovf(this, 3));
        }
        return true;
    }

    private final boolean y() {
        return this.n != Long.MIN_VALUE;
    }

    private final void z() {
        if (this.c != null) {
            this.i.post(new ovf(this, 2));
        }
    }

    @Override // defpackage.ouh
    public final int a() {
        int i = this.k;
        boolean z = true;
        if (i != 2 && i != 3) {
            z = false;
        }
        pce.d(z);
        return this.d.a();
    }

    public int b(int i, long j, oue oueVar, oug ougVar) {
        int i2 = 0;
        pce.d(this.k == 3);
        this.l = j;
        if (this.p || y()) {
            return -2;
        }
        boolean z = !this.a.e();
        ovq ovqVar = (ovq) this.f.getFirst();
        while (z && this.f.size() > 1 && ((ovq) this.f.get(1)).l <= this.a.a()) {
            this.f.removeFirst();
            ovqVar = (ovq) this.f.getFirst();
        }
        ovm ovmVar = ovqVar.c;
        if (!ovmVar.equals(this.z)) {
            int i3 = ovqVar.b;
            long j2 = ovqVar.g;
            if (this.c != null) {
                this.i.post(new ovh(this, ovmVar, i3, j2));
            }
        }
        this.z = ovmVar;
        if (z || ovqVar.j) {
            MediaFormat e = ovqVar.e();
            owx h = ovqVar.h();
            if (!e.equals(this.y) || !pcx.p(this.x, h)) {
                oueVar.a = e;
                oueVar.b = h;
                this.y = e;
                this.x = h;
                return -4;
            }
            this.y = e;
            this.x = h;
        }
        if (!z) {
            return this.r ? -1 : -2;
        } else if (!this.a.c(ougVar)) {
            return -2;
        } else {
            long j3 = ougVar.e;
            long j4 = this.m;
            int i4 = ougVar.d;
            if (j3 < j4) {
                i2 = 134217728;
            }
            ougVar.d = i4 | i2;
            return -3;
        }
    }

    @Override // defpackage.ouh
    public final long c() {
        pce.d(this.k == 3);
        if (y()) {
            return this.n;
        }
        if (this.r) {
            return -3L;
        }
        long j = this.a.d;
        return j == Long.MIN_VALUE ? this.l : j;
    }

    @Override // defpackage.ouh
    public final long d(int i) {
        if (this.p) {
            this.p = false;
            return this.m;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ouh
    public final MediaFormat e(int i) {
        int i2 = this.k;
        boolean z = true;
        if (i2 != 2 && i2 != 3) {
            z = false;
        }
        pce.d(z);
        return this.d.b(i);
    }

    @Override // defpackage.oui
    public final ouh f() {
        pce.d(this.k == 0);
        this.k = 1;
        return this;
    }

    @Override // defpackage.ouh
    public final void g(int i) {
        boolean z = true;
        pce.d(this.k == 3);
        int i2 = this.t - 1;
        this.t = i2;
        if (i2 != 0) {
            z = false;
        }
        pce.d(z);
        this.k = 2;
        try {
            this.d.d(this.f);
            this.A.b(this);
            pbz pbzVar = this.q;
            if (pbzVar.b) {
                pbzVar.a();
                return;
            }
            this.a.b();
            this.f.clear();
            r();
            this.A.a();
        } catch (Throwable th) {
            this.A.b(this);
            pbz pbzVar2 = this.q;
            if (pbzVar2.b) {
                pbzVar2.a();
            } else {
                this.a.b();
                this.f.clear();
                r();
                this.A.a();
            }
            throw th;
        }
    }

    @Override // defpackage.ouh
    public final void h(int i, long j) {
        boolean z = true;
        pce.d(this.k == 2);
        int i2 = this.t;
        this.t = i2 + 1;
        if (i2 != 0) {
            z = false;
        }
        pce.d(z);
        this.k = 3;
        this.d.e(i);
        afga afgaVar = this.A;
        int i3 = this.h;
        afgaVar.a.add(this);
        afgaVar.b.put(this, new affz(i3));
        afgaVar.c += i3;
        this.z = null;
        this.y = null;
        this.x = null;
        this.l = j;
        this.m = j;
        this.p = false;
        v(j);
    }

    @Override // defpackage.ouh
    public final void j() {
        pce.d(this.k != 3);
        pbz pbzVar = this.q;
        if (pbzVar != null) {
            pbzVar.b();
            this.q = null;
        }
        this.k = 0;
    }

    public void k(long j) {
        pce.d(this.k == 3);
        long j2 = y() ? this.n : this.l;
        this.l = j;
        this.m = j;
        if (j2 == j) {
            return;
        }
        if (y() || !this.a.h(j)) {
            v(j);
        } else {
            boolean z = !this.a.e();
            while (z && this.f.size() > 1 && ((ovq) this.f.get(1)).l <= this.a.a()) {
                this.f.removeFirst();
            }
        }
        this.p = true;
    }

    @Override // defpackage.ouh
    public final boolean l(int i, long j) {
        pce.d(this.k == 3);
        this.l = j;
        this.d.c(j);
        w();
        return this.r || !this.a.e();
    }

    @Override // defpackage.ouh
    public final boolean m() {
        int i = this.k;
        pce.d(i == 1 || i == 2);
        if (this.k == 2) {
            return true;
        }
        if (!this.d.j()) {
            return false;
        }
        if (this.d.a() > 0) {
            String valueOf = String.valueOf(this.d.b(0).b);
            this.q = new pbz(valueOf.length() != 0 ? "Loader:".concat(valueOf) : new String("Loader:"));
        }
        this.k = 2;
        return true;
    }

    @Override // defpackage.pbv
    public final void n(pbx pbxVar) {
        SystemClock.elapsedRealtime();
        ovb ovbVar = this.e.b;
        this.d.h(ovbVar);
        if (ovbVar instanceof ovq) {
            ovq ovqVar = (ovq) ovbVar;
            ovbVar.a();
            int i = ovqVar.a;
            int i2 = ovqVar.b;
            ovm ovmVar = ovqVar.c;
            long j = ovqVar.g;
            long j2 = ovqVar.h;
            A();
        } else {
            ovbVar.a();
            int i3 = ovbVar.a;
            int i4 = ovbVar.b;
            ovm ovmVar2 = ovbVar.c;
            A();
        }
        r();
        w();
    }

    @Override // defpackage.pbv
    public final void o(pbx pbxVar, IOException iOException) {
        this.s = iOException;
        this.u++;
        this.v = SystemClock.elapsedRealtime();
        if (this.c != null) {
            this.i.post(new ovg(this, iOException));
        }
        this.d.i(this.e.b, iOException);
        w();
    }

    @Override // defpackage.pbv
    public final void p() {
        this.e.b.a();
        z();
        r();
        if (this.k == 3) {
            v(this.n);
            return;
        }
        this.a.b();
        this.f.clear();
        r();
        this.A.a();
    }

    @Override // defpackage.ouh
    public final void i() {
        IOException iOException = this.s;
        if (iOException == null || this.u <= this.j) {
            if (this.e.b != null) {
                return;
            }
            this.d.g();
            return;
        }
        throw iOException;
    }
}
