package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: abyp  reason: default package */
/* loaded from: classes.dex */
public final class abyp {
    private static final SparseArray n = new abym();
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private final abyo o;
    private final Handler p;
    private boolean r;
    private boolean s;
    private int q = 0;
    public int a = 1;

    public abyp(Handler handler, abyo abyoVar) {
        this.o = abyoVar;
        this.p = new abyn(this, handler.getLooper());
    }

    public final int a(int i) {
        if (i == 11 || i == 10 || i == 9) {
            return 9;
        }
        if (i == 4 || i == 8 || i == 7 || i == 6) {
            return 5;
        }
        if (i != 2) {
            return i;
        }
        return 1;
    }

    public final void b() {
        this.j = false;
        h();
    }

    public final void c(int i) {
        int i2 = this.a;
        aqxo.y(i2 == 4 || i2 == 8 || i2 == 6 || i2 == 7);
        int i3 = this.a;
        if (i3 == 4 || i3 == 6 || i3 == 7) {
            this.i = false;
        }
        this.f = true;
        this.q = i;
        h();
    }

    public final void d() {
        this.r = true;
        int i = this.a;
        if (i == 6) {
            f(6);
        } else if (i == 7 || i == 8 || i == 5) {
            h();
        } else if (this.f) {
            zep.l("LiveSC: Stream was cancelled by user before it went live.");
        } else if (i == 13) {
            zep.b("LiveSC: Stream went into Error state before it went live.");
        } else {
            StringBuilder sb = new StringBuilder(22);
            sb.append("State was: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void e(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1002, i, 0));
    }

    public final void f(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1003, i, 0));
    }

    public final void g(int i) {
        Handler handler = this.p;
        handler.sendMessage(Message.obtain(handler, 1001, i, 0));
    }

    public final void h() {
        this.p.sendEmptyMessage(1000);
    }

    public final void i(boolean z) {
        int a = a(this.a);
        this.a = a;
        this.r = false;
        this.s = z;
        g(a);
    }

    public final void j(int i, boolean z, boolean z2, boolean z3) {
        MediaFormat mediaFormat;
        String sb;
        ylr.c();
        SparseArray sparseArray = n;
        String valueOf = String.valueOf((String) sparseArray.get(this.a, "UNKNOWN"));
        if (valueOf.length() != 0) {
            "update - Current state: ".concat(valueOf);
        }
        if (z && !z3 && this.a == i) {
            String str = (String) sparseArray.get(i);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
            sb2.append("Entering ");
            sb2.append(str);
            sb2.append(" state already occurred");
            zep.l(sb2.toString());
            return;
        }
        if (z) {
            String valueOf2 = String.valueOf((String) sparseArray.get(i, "UNKNOWN"));
            if (valueOf2.length() != 0) {
                "update - Entering state: ".concat(valueOf2);
            }
        }
        if (!z2 || this.a == i) {
            if (z2) {
                String valueOf3 = String.valueOf((String) sparseArray.get(i, "UNKNOWN"));
                if (valueOf3.length() != 0) {
                    "update - Exiting state: ".concat(valueOf3);
                }
            }
            this.a = i;
            boolean z4 = false;
            switch (i) {
                case 1:
                    if (this.l) {
                        this.b = 2;
                        e(5);
                        return;
                    }
                    if (z) {
                        this.b = 1;
                        this.o.q(false);
                    }
                    if (this.k) {
                        return;
                    }
                    if (this.s) {
                        e(4);
                        return;
                    } else {
                        e(2);
                        return;
                    }
                case 2:
                    if (z) {
                        this.g = false;
                        abyk abykVar = (abyk) this.o;
                        if (!abykVar.d.d()) {
                            return;
                        }
                        if ((!abykVar.q || abykVar.f.g()) && !abykVar.x()) {
                            return;
                        }
                        if (!abykVar.q) {
                            mediaFormat = abykVar.m.g(abykVar.M, abykVar.B);
                            mediaFormat.getClass();
                        } else {
                            mediaFormat = null;
                        }
                        abykVar.G = null;
                        abykVar.F = null;
                        String str2 = abykVar.z;
                        if (abykVar.q) {
                            sb = "WebRTC";
                        } else {
                            String valueOf4 = String.valueOf(mediaFormat);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 5);
                            sb3.append("RTMP:");
                            sb3.append(valueOf4);
                            sb = sb3.toString();
                        }
                        String.valueOf(str2).length();
                        String.valueOf(sb).length();
                        abzn abznVar = abykVar.l;
                        String str3 = abykVar.z;
                        boolean z5 = abykVar.q;
                        abznVar.h(str3, z5, abykVar.B, true == z5 ? null : mediaFormat, new abxt(abykVar));
                        return;
                    } else if (this.g) {
                        e(3);
                        return;
                    } else if (!z2) {
                        return;
                    } else {
                        e(4);
                        return;
                    }
                case 3:
                    if (!z) {
                        return;
                    }
                    abyo abyoVar = this.o;
                    int i2 = this.d;
                    StringBuilder sb4 = new StringBuilder(37);
                    sb4.append("Create ingestion failure: ");
                    sb4.append(i2);
                    zep.b(sb4.toString());
                    abyk abykVar2 = (abyk) abyoVar;
                    if (!abykVar2.d.d()) {
                        return;
                    }
                    abykVar2.c.r(i2);
                    return;
                case 4:
                    if (!z) {
                        if (this.f) {
                            e(9);
                            return;
                        } else if (this.j) {
                            return;
                        } else {
                            e(6);
                            return;
                        }
                    }
                    this.j = true;
                    abyk abykVar3 = (abyk) this.o;
                    if (!abykVar3.d.d()) {
                        return;
                    }
                    if (abykVar3.q) {
                        abykVar3.j.b();
                        return;
                    } else {
                        abykVar3.e(5);
                        return;
                    }
                case 5:
                    if (z) {
                        abyo abyoVar2 = this.o;
                        if (this.b == 2) {
                            z4 = true;
                        }
                        abyoVar2.q(z4);
                    }
                    if (this.k) {
                        return;
                    }
                    if (this.j) {
                        e(4);
                        return;
                    } else {
                        e(6);
                        return;
                    }
                case 6:
                    if (z) {
                        abyk abykVar4 = (abyk) this.o;
                        if (!abykVar4.d.d()) {
                            return;
                        }
                        abykVar4.j(5, abykVar4.o, abykVar4.p, abykVar4.r);
                        return;
                    } else if (!z2) {
                        if (!this.f) {
                            return;
                        }
                        e(9);
                        return;
                    } else if (!this.m && (!this.r || this.l)) {
                        e(7);
                        return;
                    } else {
                        e(8);
                        return;
                    }
                case 7:
                    if (z) {
                        abyk abykVar5 = (abyk) this.o;
                        if (!abykVar5.d.d()) {
                            return;
                        }
                        abykVar5.k(20);
                        return;
                    } else if (this.r) {
                        e(8);
                        return;
                    } else if (!this.f) {
                        return;
                    } else {
                        e(9);
                        return;
                    }
                case 8:
                    if (!z) {
                        if (!this.f) {
                            return;
                        }
                        e(9);
                        return;
                    }
                    this.b = 2;
                    abyk abykVar6 = (abyk) this.o;
                    if (!abykVar6.d.d() || !abykVar6.U) {
                        return;
                    }
                    abykVar6.N = true;
                    abykVar6.c.w();
                    return;
                case 9:
                    if (!z) {
                        if (!this.e) {
                            return;
                        }
                        e(10);
                        return;
                    }
                    abyk abykVar7 = (abyk) this.o;
                    if (abykVar7.d.d()) {
                        abykVar7.c.v();
                    }
                    if (!this.r) {
                        e(11);
                        return;
                    } else if (!this.h || this.e) {
                        e(10);
                        return;
                    } else {
                        abyk abykVar8 = (abyk) this.o;
                        if (!abykVar8.d.d()) {
                            return;
                        }
                        int i3 = abykVar8.f.c().F;
                        if (i3 > 0) {
                            abykVar8.t.postDelayed(abykVar8.v, i3);
                        }
                        abykVar8.z(null);
                        abykVar8.s();
                        abykVar8.l.e(abykVar8.z, new abxz(abykVar8));
                        abxa.b().f(astk.class, abye.class, null);
                        abxa.b().f(asto.class, abye.class, null);
                        return;
                    }
                case 10:
                    if (z) {
                        Handler handler = this.p;
                        handler.sendMessageDelayed(Message.obtain(handler, 1003, 10, 0), 3000L);
                        return;
                    } else if (!z2) {
                        return;
                    } else {
                        e(11);
                        return;
                    }
                case 11:
                    if (!z) {
                        if (!z2) {
                            return;
                        }
                        e(12);
                        return;
                    }
                    abyk abykVar9 = (abyk) this.o;
                    if (!abykVar9.d.d()) {
                        return;
                    }
                    abykVar9.t();
                    abykVar9.b(true);
                    return;
                case 12:
                    if (!z) {
                        return;
                    }
                    abyo abyoVar3 = this.o;
                    int i4 = this.q;
                    abyk abykVar10 = (abyk) abyoVar3;
                    if (!abykVar10.d.d()) {
                        return;
                    }
                    abykVar10.c.u(i4, abykVar10.X, abykVar10.I, abykVar10.H, abykVar10.N);
                    return;
                case 13:
                    if (!z) {
                        if (!z2) {
                            return;
                        }
                        e(this.c);
                        return;
                    }
                    abyk abykVar11 = (abyk) this.o;
                    if (!abykVar11.d.d()) {
                        return;
                    }
                    abykVar11.u(true, false);
                    abykVar11.c.z(new abxk(abykVar11));
                    return;
                default:
                    return;
            }
        }
        zep.l("Exiting current state already occurred");
    }

    public final boolean k() {
        int i = this.a;
        return i == 4 || i == 2 || i == 1 || i == 5 || i == 6 || i == 7 || i == 8;
    }

    public final boolean l() {
        return this.a == 8;
    }

    public final void m() {
        int i = this.a;
        if (i == 13) {
            return;
        }
        this.c = a(i);
        e(13);
    }
}
