package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: admc  reason: default package */
/* loaded from: classes.dex */
public final class admc {
    public final admw a;
    public final Set b;
    public final Set c;
    final Set d;
    public final Set e;
    public final Set f;
    public adlz g;
    public final Set h;
    private final admi j;
    private final adeo k;
    private final adoa l;
    private final acwn m;
    private aypg o;
    private int n = 0;
    private final Handler i = new Handler(Looper.getMainLooper());

    public admc(SharedPreferences sharedPreferences, admw admwVar, acwu acwuVar, Set set, Set set2, adeo adeoVar, adoa adoaVar, snc sncVar, acwn acwnVar, adlu adluVar) {
        this.a = admwVar;
        this.k = adeoVar;
        this.l = adoaVar;
        this.m = acwnVar;
        Set a = admd.a(set);
        this.b = a;
        this.c = admd.b(set2);
        this.d = new HashSet();
        sharedPreferences.getClass();
        this.j = new admi(sharedPreferences, a, acwuVar.d, sncVar);
        this.h = new HashSet();
        this.e = admd.a(new HashSet(adluVar.a()));
        this.f = admd.b(new HashSet(adluVar.b()));
        this.o = e();
    }

    private final aypg e() {
        return this.m.l().as(new ayqb() { // from class: admb
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                admc admcVar = admc.this;
                Boolean bool = (Boolean) obj;
                String.valueOf(String.valueOf(bool)).length();
                if (bool.booleanValue()) {
                    admcVar.b.addAll(admcVar.e);
                    admcVar.c.addAll(admcVar.f);
                    return;
                }
                admcVar.b.removeAll(admcVar.e);
                admcVar.c.removeAll(admcVar.f);
            }
        });
    }

    public final void a(adlt adltVar) {
        this.d.add(adltVar);
    }

    public final synchronized void b() {
        if (this.o.e()) {
            this.o = e();
        }
        if (this.n == 0) {
            this.g = new adlz(this.i, this.j, this.b, this.c, this.d, this.k, this.l, this.a.h.B());
            for (kbe kbeVar : this.h) {
                this.g.b(kbeVar);
            }
        }
        this.n++;
    }

    public final synchronized void c() {
        ayqi.c((AtomicReference) this.o);
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            adlz adlzVar = this.g;
            synchronized (adlzVar.k) {
                adlt adltVar = adlzVar.j;
                if (adltVar != null) {
                    adltVar.c();
                    adlzVar.j = null;
                }
            }
            adlzVar.a();
            ayqi.c((AtomicReference) adlzVar.h);
            this.g = null;
        }
    }

    public final void d() {
        this.d.clear();
    }
}
