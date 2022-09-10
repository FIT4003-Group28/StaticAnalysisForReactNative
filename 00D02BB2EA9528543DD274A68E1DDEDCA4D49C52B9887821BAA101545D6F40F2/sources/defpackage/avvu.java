package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avvu  reason: default package */
/* loaded from: classes3.dex */
public class avvu implements avvp {
    public final ges a;
    public final cjqy b;
    public final avik c;
    public final Executor d;
    public final avzo e;
    public final crzm<avkr> f;
    public dltm g;
    private final avvo i;
    private final avij j;
    private final cjqq k;
    private final Executor l;
    private final away m;
    private final akfa n;
    private final avuk o;
    private final avzm p;
    private final avzp q;
    private jib r;
    private avzl s;
    private int u;
    @dzsi
    private crzp<avkr> t = null;
    public avkr h = null;

    public avvu(fd fdVar, avij avijVar, Executor executor, Executor executor2, cjqy cjqyVar, cjqq cjqqVar, avik avikVar, btvo btvoVar, away awayVar, akfa akfaVar, avuk avukVar, avzo avzoVar, avzm avzmVar, avzp avzpVar, dltm dltmVar, avvo avvoVar) {
        this.a = (ges) fdVar;
        this.o = avukVar;
        this.i = avvoVar;
        this.j = avijVar;
        this.b = cjqyVar;
        this.k = cjqqVar;
        this.c = avikVar;
        this.g = dltmVar;
        this.u = avzoVar.b(dltmVar);
        this.d = executor;
        this.l = executor2;
        this.n = akfaVar;
        this.m = awayVar;
        this.r = w(fdVar, avikVar, dltmVar);
        this.e = avzoVar;
        this.p = avzmVar;
        this.q = avzpVar;
        this.f = avijVar.C();
        dlug dlugVar = dltmVar.c;
        this.s = avzmVar.a(dlugVar == null ? dlug.c : dlugVar);
    }

    private final jib w(fd fdVar, final avik avikVar, final dltm dltmVar) {
        jhz a = jhz.a();
        a.a = dltmVar.a;
        a.f(new jmn(fdVar.getClass()));
        jhm a2 = jhm.a();
        a2.a = fdVar.Rp(R.string.OFFLINE_MENU_RENAME_AREA);
        a2.b = fdVar.Rp(R.string.OFFLINE_MENU_RENAME_AREA);
        a2.h = 2;
        a2.n = o().booleanValue();
        a2.f = cjtd.a(dtxx.bb);
        a2.d(new View.OnClickListener(avikVar, dltmVar) { // from class: avvt
            private final avik a;
            private final dltm b;

            {
                this.a = avikVar;
                this.b = dltmVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.q(this.b);
            }
        });
        a2.c = cqrt.i(cqrt.f(2131231613), ibm.b());
        a.c(a2.c());
        return a.b();
    }

    @Override // defpackage.avvp
    public synchronized jbk a() {
        if (!this.g.a.contentEquals(this.r.u)) {
            this.r = w(this.a, this.c, this.g);
        }
        return new iyl(this.r);
    }

    @Override // defpackage.avvp
    @dzsi
    public synchronized akqs b() {
        return this.s.c();
    }

    @Override // defpackage.avvp
    public synchronized dcdc<akqs> c() {
        return this.s.b();
    }

    @Override // defpackage.avvp
    public synchronized cqtd d() {
        return this.q.a(this.g, false);
    }

    @Override // defpackage.avvp
    public CharSequence f() {
        return this.a.Rp(R.string.OFFLINE_MENU_UPDATE_AREA);
    }

    @Override // defpackage.avvp
    public synchronized CharSequence g() {
        if (!this.g.r) {
            return this.a.Rp(R.string.OFFLINE_MENU_REMOVE_AREA);
        }
        return this.a.Rp(R.string.OFFLINE_MENU_DELETE_AREA);
    }

    @Override // defpackage.avvp
    public cqkl h() {
        this.o.a(v(), this.i);
        return cqkl.a;
    }

    @Override // defpackage.avvp
    public cqkl i() {
        this.o.c(v());
        return cqkl.a;
    }

    @Override // defpackage.avvp
    public cqkl j() {
        this.c.o(v());
        return cqkl.a;
    }

    @Override // defpackage.avvp
    public synchronized Boolean k() {
        boolean z;
        int i = this.u;
        z = true;
        if (i != 9 && i != 10 && i != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.avvp
    public synchronized Boolean l() {
        return Boolean.valueOf(this.u == 8);
    }

    @Override // defpackage.avvp
    public Boolean m() {
        return true;
    }

    @Override // defpackage.avvp
    public synchronized Boolean n() {
        boolean z;
        int i = this.u;
        z = true;
        if (i != 9 && i != 10) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.avvp
    public Boolean o() {
        return Boolean.valueOf(this.j.q());
    }

    @Override // defpackage.avvp
    public synchronized cjtd p() {
        return this.o.b(this.g, dtxx.av);
    }

    @Override // defpackage.avvp
    public cqkl q() {
        final dltm v = v();
        if (this.e.a(v)) {
            final cjtd a = cjtd.a(dtxx.ax);
            final cjql d = this.k.g().d(a);
            this.m.b(new Runnable(this, d, a, v) { // from class: avvs
                private final avvu a;
                private final cjql b;
                private final cjtd c;
                private final dltm d;

                {
                    this.a = this;
                    this.b = d;
                    this.c = a;
                    this.d = v;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    avvu avvuVar = this.a;
                    cjql cjqlVar = this.b;
                    cjtd cjtdVar = this.c;
                    dltm dltmVar = this.d;
                    avvuVar.b.j(cjqlVar, cjtdVar);
                    avvuVar.c.l(dltmVar);
                }
            });
            if (this.a.S()) {
                this.a.Q().g(null, 1);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.avvp
    public synchronized Boolean r() {
        boolean z;
        int i = this.u;
        z = true;
        if (i != 5 && i != 7) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.avvp
    public synchronized void s() {
        dbsk.l(this.t == null);
        crzp<avkr> crzpVar = new crzp(this) { // from class: avvr
            private final avvu a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                boolean z;
                avvu avvuVar = this.a;
                avkr l = avvuVar.f.l();
                if (l == null) {
                    return;
                }
                synchronized (avvuVar) {
                    dspd dspdVar = avvuVar.g.b;
                    avks a = avkt.a(avvuVar.h, l);
                    avvuVar.h = l;
                    dltm dltmVar = ((avkn) a).a.get(dspdVar);
                    if (dltmVar == null) {
                        dltmVar = ((avkn) a).b.get(dspdVar);
                    }
                    if (dltmVar != null) {
                        avvuVar.u(dltmVar, avvuVar.e);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    return;
                }
                avvuVar.d.execute(new Runnable(avvuVar) { // from class: avvq
                    private final avvu a;

                    {
                        this.a = avvuVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        avvu avvuVar2 = this.a;
                        if (avvuVar2.a.aD) {
                            cqkx.p(avvuVar2);
                        }
                    }
                });
            }
        };
        this.t = crzpVar;
        this.f.d(crzpVar, this.l);
    }

    @Override // defpackage.avvp
    public synchronized void t() {
        dbsk.s(this.t);
        this.f.c(this.t);
        this.t = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void u(dltm dltmVar, avzo avzoVar) {
        this.g = dltmVar;
        avzm avzmVar = this.p;
        dlug dlugVar = dltmVar.c;
        if (dlugVar == null) {
            dlugVar = dlug.c;
        }
        this.s = avzmVar.a(dlugVar);
        this.u = avzoVar.b(dltmVar);
    }

    final synchronized dltm v() {
        return this.g;
    }

    @Override // defpackage.avvp
    public CharSequence e() {
        if (!this.a.aD) {
            return "";
        }
        avzp avzpVar = this.q;
        dltm v = v();
        btlu j = this.n.j();
        if (!v.r) {
            boolean b = avzpVar.b.b(j);
            long c = avzpVar.b.c(b);
            long j2 = v.i;
            dlug dlugVar = v.c;
            if (dlugVar == null) {
                dlugVar = dlug.c;
            }
            String string = avzpVar.a.getString(R.string.OFFLINE_ONBOARDING_DOWNLOAD_SIZE, Long.valueOf(avzpVar.e(j2, dlugVar)));
            String string2 = avzpVar.a.getString(true != b ? R.string.OFFLINE_ONBOARDING_AVAILABLE_SIZE : R.string.OFFLINE_ONBOARDING_AVAILABLE_SIZE_SD, Long.valueOf(c));
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(string2).length());
            sb.append(string);
            sb.append(" ");
            sb.append(string2);
            return sb.toString();
        }
        return avzpVar.c(v, false, true);
    }
}
