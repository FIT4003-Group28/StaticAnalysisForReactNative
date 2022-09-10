package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.util.List;
import java.util.Random;
/* compiled from: PG */
/* renamed from: aujw  reason: default package */
/* loaded from: classes.dex */
public final class aujw {
    public final boolean a;
    @dzsi
    public final aujp b;
    private final SharedPreferences c;
    private final cqat d;
    private final int e;
    private final long f;
    private dcdc<aukd> g;

    public static aujw a(SharedPreferences sharedPreferences, bvjj bvjjVar, int i, long j, boolean z, cqat cqatVar) {
        aujw aujwVar = new aujw(sharedPreferences, bvjjVar, i, j, z, cqatVar);
        aujwVar.n();
        if (aujwVar.j()) {
            aujwVar.m();
        }
        return aujwVar;
    }

    private final synchronized boolean h() {
        long b = this.d.b();
        dcdc<aukd> dcdcVar = this.g;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (Math.abs(b - dcdcVar.get(i).c) > this.f) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    private final synchronized void i() {
        long b = this.d.b();
        dccx F = dcdc.F();
        dcdc<aukd> dcdcVar = this.g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aukd aukdVar = dcdcVar.get(i);
            if (Math.abs(b - aukdVar.c) <= this.f) {
                F.g(aukdVar);
            }
        }
        this.g = F.f();
    }

    private final synchronized boolean j() {
        boolean z;
        if (h()) {
            i();
            this.g.size();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private final synchronized void k() {
        j();
        if (this.g.size() > this.e) {
            dcdc<aukd> dcdcVar = this.g;
            this.g = dcdcVar.subList(dcdcVar.size() - this.e, this.g.size());
        }
    }

    private final synchronized void l(aukb aukbVar, @dzsi akqi akqiVar) {
        aujp aujpVar;
        long b = this.d.b();
        aukc bZ = aukd.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aukd aukdVar = (aukd) bZ.b;
        aukdVar.a |= 4;
        aukdVar.c = b;
        if (akqiVar != null && this.a && (aujpVar = this.b) != null) {
            String a = aujpVar.a(akqiVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aukd aukdVar2 = (aukd) bZ.b;
            a.getClass();
            aukdVar2.a |= 8;
            aukdVar2.d = a;
        }
        aukd aukdVar3 = (aukd) bZ.b;
        aukdVar3.b = aukbVar.f;
        aukdVar3.a |= 2;
        dccx F = dcdc.F();
        F.i(this.g);
        F.g(bZ.bK());
        this.g = F.f();
        k();
        m();
    }

    private final synchronized void m() {
        dcdc<aukd> dcdcVar = this.g;
        aujy bZ = aujz.b.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aujz aujzVar = (aujz) bZ.b;
        dsrj<aukd> dsrjVar = aujzVar.a;
        if (!dsrjVar.a()) {
            aujzVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(dcdcVar, aujzVar.a);
        this.c.edit().putString("actionsList", Base64.encodeToString(bZ.bK().bS(), 0)).apply();
    }

    private final synchronized void n() {
        String string = this.c.getString("actionsList", "");
        if (string == null || string.isEmpty()) {
            this.g = dcdc.e();
            return;
        }
        try {
            this.g = dcdc.r(((aujz) dsqw.cq(aujz.b, Base64.decode(string, 0))).a);
        } catch (Exception unused) {
            this.g = dcdc.e();
        }
    }

    public final List<aukd> b() {
        if (j()) {
            m();
        }
        return this.g;
    }

    public final synchronized void c() {
        this.g = dcdc.e();
        m();
    }

    public final synchronized void d(@dzsi akqi akqiVar) {
        l(aukb.SHOWN, akqiVar);
    }

    public final synchronized void e(@dzsi akqi akqiVar) {
        l(aukb.DISMISSED, akqiVar);
    }

    public final synchronized void f(@dzsi akqi akqiVar) {
        l(aukb.CLICKED, akqiVar);
    }

    public final synchronized void g(@dzsi akqi akqiVar) {
        l(aukb.CONVERTED, akqiVar);
    }

    public aujw(SharedPreferences sharedPreferences, bvjj bvjjVar, int i, long j, boolean z, cqat cqatVar) {
        aujp aujpVar;
        this.c = sharedPreferences;
        this.e = i;
        this.f = j;
        this.a = z;
        if (!z) {
            aujpVar = null;
        } else {
            long w = bvjjVar.w(bvjk.fi, 0L);
            if (w == 0) {
                Random random = new Random();
                while (w == 0) {
                    w = random.nextLong();
                }
                bvjjVar.Z(bvjk.fi, w);
            }
            aujpVar = new aujp(w);
        }
        this.b = aujpVar;
        this.d = cqatVar;
        this.g = dcdc.e();
    }
}
