package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agjz  reason: default package */
/* loaded from: classes.dex */
public final class agjz implements agwh {
    public static final /* synthetic */ int r = 0;
    private static final long s = TimeUnit.DAYS.toSeconds(30);
    public final snc a;
    public final String b;
    public final azqb c;
    public final azqb d;
    public final azqb e;
    public final agyr f;
    public final azqb g;
    public final agis h;
    public final Executor i;
    public final azqb j;
    public final azqb k;
    public final azqb l;
    public final azqb m;
    public final azqb n;
    public final azqb o;
    public final ayoi p;
    final agjy q = new agjy(this);
    private final Executor t;
    private final azqb u;
    private final ahdn v;

    public agjz(snc sncVar, String str, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, agyr agyrVar, azqb azqbVar4, agis agisVar, Executor executor, Executor executor2, azqb azqbVar5, agmu agmuVar, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, ahdn ahdnVar, azqb azqbVar10, azqb azqbVar11, ayoi ayoiVar) {
        this.a = sncVar;
        this.b = str;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        this.f = agyrVar;
        this.g = azqbVar4;
        this.h = agisVar;
        this.i = executor;
        this.t = executor2;
        this.j = azqbVar5;
        this.k = azqbVar6;
        this.l = azqbVar7;
        this.m = azqbVar8;
        this.u = azqbVar9;
        this.v = ahdnVar;
        this.n = azqbVar10;
        this.o = azqbVar11;
        this.p = ayoiVar;
        agmuVar.e(new agjt(this));
    }

    private final void H(String str) {
        agkh agkhVar = (agkh) this.n.get();
        agkhVar.f(k().size());
        agki b = agkhVar.b();
        b.c(str);
        n(b.b());
    }

    private final void I(String str) {
        agwk agwkVar = (agwk) this.o.get();
        agwkVar.f(j().size());
        agwl b = agwkVar.b();
        b.c(str);
        v(b.b());
    }

    public final void A(String str, String str2, agqn agqnVar) {
        int i;
        ylr.b();
        aglj agljVar = (aglj) this.k.get();
        attl e = agljVar.e(str);
        zgh.m(str);
        SQLiteDatabase a = agljVar.d.a.a();
        int i2 = 1;
        Cursor query = a.query("videosV2", new String[]{"offline_audio_quality"}, "id = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.moveToNext()) {
                int av = akel.av(query.getInt(0));
                if (av != 0) {
                    i2 = av;
                }
                query.close();
                i = i2;
            } else {
                query.close();
                i = 1;
            }
            ((agkg) this.l.get()).h(str, str2, null, e, null, i, agqnVar, 0, false, false, false);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(String str, String str2, agqn agqnVar, agqe agqeVar) {
        int i;
        ylr.b();
        aglj agljVar = (aglj) this.k.get();
        if (agljVar.c(str) == null) {
            return;
        }
        agqv p = agljVar.p(str);
        if ((p != null && !p.a()) || (p != null && p.l == agqe.STREAM_CORRUPT)) {
            agiw agiwVar = (agiw) this.u.get();
            if (((agis) ((axov) agiwVar.b).a).z()) {
                ((aglj) agiwVar.a.get()).M(str, false);
            }
            agljVar.x(str);
        }
        if (p == null) {
            attl e = agljVar.e(str);
            zgh.m(str);
            Cursor query = agljVar.d.a.a().query("videosV2", new String[]{"offline_source_ve_type"}, "id = ?", new String[]{str}, null, null, null, null);
            try {
                if (query.moveToNext()) {
                    int i2 = query.getInt(0);
                    query.close();
                    i = i2;
                } else {
                    query.close();
                    i = -1;
                }
                agljVar.R(str, agqeVar, e, null, i, agljVar.i(str));
                p = agljVar.p(str);
                if (p == null) {
                    return;
                }
                q(str);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } else {
            agljVar.V(str, agqeVar);
        }
        agqn agqnVar2 = p.m;
        if (agqnVar != agqnVar2) {
            agljVar.Z(str, agqnVar);
            agqnVar2 = agqnVar;
        }
        t(str);
        if (agqeVar != agqe.ACTIVE) {
            return;
        }
        if (str2 == null) {
            H(str);
        }
        I(str);
        A(str, str2, agqnVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(agqv agqvVar) {
        agqu agquVar = agqvVar.j;
        if (agquVar == null) {
            return;
        }
        long min = Math.min(Math.max(TimeUnit.MILLISECONDS.toSeconds(agquVar.b() - this.a.c()), 0L), s);
        String str = agquVar.a;
        agis agisVar = this.h;
        agio agioVar = (agio) agisVar;
        agioVar.i.schedule(new agid(agioVar, new agjn(this, str, 5)), min + 1, TimeUnit.SECONDS);
    }

    @Override // defpackage.agwh
    public final void D(String str, long j) {
        str.getClass();
        this.i.execute(new agjo(this, str, j, 1));
    }

    @Override // defpackage.agwh
    public final void E(String str, long j) {
        this.i.execute(new agjo(this, str, j));
    }

    @Override // defpackage.agwh
    public final void F(String str) {
        this.h.s(new agjn(this, str, 6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(String str, int i) {
        ylr.b();
        aglj agljVar = (aglj) this.k.get();
        if (!agljVar.D(str, i)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46);
            sb.append("[Offline] Failed removing video ");
            sb.append(str);
            sb.append(" from database");
            zep.b(sb.toString());
            return;
        }
        s(str);
        agljVar.v(str);
    }

    @Override // defpackage.agwh
    public final int a(final String str, final attl attlVar, final agqn agqnVar, final byte[] bArr, final int i) {
        if (!this.h.z()) {
            return 2;
        }
        final agqe agqeVar = agqe.ACTIVE;
        zgh.m(str);
        this.v.b(true);
        agqv e = e(str);
        if (e == null || e.s()) {
            this.h.s(new Runnable() { // from class: agjq
                @Override // java.lang.Runnable
                public final void run() {
                    agqe agqeVar2;
                    agqn agqnVar2;
                    agjz agjzVar = agjz.this;
                    String str2 = str;
                    attl attlVar2 = attlVar;
                    agqn agqnVar3 = agqnVar;
                    byte[] bArr2 = bArr;
                    int i2 = i;
                    agqe agqeVar3 = agqeVar;
                    ylr.b();
                    if (!((aghc) agjzVar.j.get()).i()) {
                        agjzVar.p(str2, 0);
                        return;
                    }
                    agqv e2 = agjzVar.e(str2);
                    if (e2 == null || e2.s()) {
                        int U = ((agvq) agjzVar.d.get()).U(attlVar2);
                        aglj agljVar = (aglj) agjzVar.k.get();
                        if (agljVar.c(str2) == null) {
                            try {
                                agqo a = ((agux) agjzVar.g.get()).a(str2);
                                agqeVar2 = agqeVar3;
                                agqnVar2 = agqnVar3;
                                if (!agljVar.ac(a, attlVar2, null, U, agqnVar2, i2, bArr2, agqeVar2)) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45);
                                    sb.append("[Offline] Failed inserting video ");
                                    sb.append(str2);
                                    sb.append(" to database");
                                    zep.b(sb.toString());
                                    agjzVar.p(str2, 2);
                                    return;
                                }
                                ((aghk) agjzVar.m.get()).b(a);
                            } catch (ExecutionException e3) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                sb2.append("[Offline] Failed requesting video ");
                                sb2.append(str2);
                                sb2.append(" for offline");
                                zep.d(sb2.toString(), e3);
                                agjzVar.p(str2, 1);
                                return;
                            }
                        } else {
                            agljVar.R(str2, agqeVar3, attlVar2, null, i2, bArr2);
                            agljVar.E(str2);
                            agqeVar2 = agqeVar3;
                            agqnVar2 = agqnVar3;
                        }
                        agjzVar.w(str2, agqeVar2 == agqe.ACTIVE);
                        if (agqeVar2 != agqe.ACTIVE) {
                            return;
                        }
                        ((agkg) agjzVar.l.get()).h(str2, null, null, attlVar2, null, U, agqnVar2, 0, false, false, false);
                        return;
                    }
                    agjzVar.q(str2);
                }
            });
        } else if (!e.u() || (e.a() && !e.y() && !e.t() && !e.r())) {
            if (e.e) {
                return 1;
            }
            this.h.s(new agjn(this, str, 1));
            return 0;
        } else {
            this.h.s(new Runnable() { // from class: agjp
                @Override // java.lang.Runnable
                public final void run() {
                    agjz.this.B(str, null, agqnVar, agqeVar);
                }
            });
        }
        return 0;
    }

    @Override // defpackage.agwh
    public final int b(String str) {
        byte[] bArr;
        zgh.m(str);
        if (this.h.z()) {
            agqv e = e(str);
            if (e == null || !e.z()) {
                attl u = ((agvq) this.d.get()).u();
                agqn agqnVar = agqn.OFFLINE_IMMEDIATELY;
                if (e == null) {
                    bArr = aadi.b;
                } else {
                    bArr = e.d;
                }
                return a(str, u, agqnVar, bArr, e == null ? -1 : e.c);
            }
            this.h.s(new agjn(this, str, 4));
            return 0;
        }
        return 2;
    }

    @Override // defpackage.agwh
    public final agqj c() {
        if (!this.h.z()) {
            return null;
        }
        return ((agkh) this.n.get()).b().b();
    }

    @Override // defpackage.agwh
    public final agqo d(String str) {
        return ((aglj) this.k.get()).c(str);
    }

    @Override // defpackage.agwh
    public final agqv e(String str) {
        if (!this.h.z()) {
            return null;
        }
        return ((aglj) this.k.get()).p(str);
    }

    @Override // defpackage.agwh
    public final agqw f() {
        if (!this.h.z()) {
            return null;
        }
        return ((agwk) this.o.get()).b().b();
    }

    @Override // defpackage.agwh
    public final ankt g() {
        return anhq.h(anii.h(anko.q(this.h.o()), new agjm(this, 1), this.t), agot.class, agix.c, anjk.a);
    }

    @Override // defpackage.agwh
    public final ankt h(final String str) {
        return anhq.h(anii.h(anko.q(this.h.o()), new ampg() { // from class: agjs
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                agjz agjzVar = agjz.this;
                Void r3 = (Void) obj;
                return ampq.i(((aglj) agjzVar.k.get()).p(str));
            }
        }, this.t), agot.class, agix.d, anjk.a);
    }

    @Override // defpackage.agwh
    public final ankt i() {
        return anhq.h(anii.h(anko.q(this.h.o()), new agjm(this), this.t), agot.class, agix.e, anjk.a);
    }

    @Override // defpackage.agwh
    public final Collection j() {
        if (!this.h.z()) {
            return amuk.q();
        }
        return ((aglj) this.k.get()).s();
    }

    @Override // defpackage.agwh
    public final List k() {
        if (!this.h.z()) {
            return amuk.q();
        }
        return ((aglj) this.k.get()).r();
    }

    @Override // defpackage.agwh
    public final List l() {
        return ((aglj) this.k.get()).m.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set m(List list) {
        agqv e;
        ylr.b();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agqo agqoVar = (agqo) it.next();
            String f = agqoVar.f();
            zgh.m(f);
            if (ymr.a(((aglj) this.k.get()).d.a.a(), "videosV2", "id = ? AND media_status = ?", new String[]{f, Integer.toString(agqe.DELETED.q)}) <= 0 && ((e = e(agqoVar.f())) == null || e.s() || ((e.u() && e.y()) || e.E()))) {
                hashSet.add(agqoVar.f());
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(agqj agqjVar) {
        int i = agqjVar.a;
        int i2 = agqjVar.b;
        int i3 = agqjVar.c;
        this.h.v(new agnu(agqjVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.h.v(new agnv());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(String str, int i) {
        String.valueOf(str).length();
        this.h.v(new agnx(str, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(String str) {
        agqv e = e(str);
        if (e == null) {
            String.valueOf(str).length();
            return;
        }
        String valueOf = String.valueOf(e.l);
        String.valueOf(str).length();
        String.valueOf(valueOf).length();
        C(e);
        this.h.v(new agnt(e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(String str) {
        agqv e = e(str);
        if (e == null) {
            return;
        }
        String valueOf = String.valueOf(e.l);
        str.length();
        String.valueOf(valueOf).length();
        this.h.v(new agnz(e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(String str) {
        String.valueOf(str).length();
        this.h.v(new agoa(str));
        ((agkh) this.n.get()).f(k().size());
        ((agwk) this.o.get()).f(j().size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(String str) {
        u(str, atsg.UNKNOWN_FAILURE_REASON);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(String str, atsg atsgVar) {
        agqv e = e(str);
        if (e == null) {
            return;
        }
        String valueOf = String.valueOf(e.l);
        long e2 = e.e();
        long d = e.d();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 73 + String.valueOf(valueOf).length());
        sb.append("[Offline] pudl event ");
        sb.append(str);
        sb.append(" status: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(e2);
        sb.append("/");
        sb.append(d);
        String sb2 = sb.toString();
        if (atsgVar != atsg.UNKNOWN_FAILURE_REASON) {
            String valueOf2 = String.valueOf(sb2);
            int i = atsgVar.H;
            String.valueOf(valueOf2).length();
        }
        this.h.v(new agog(e, atsgVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(agqw agqwVar) {
        int i = agqwVar.a;
        int i2 = agqwVar.b;
        int i3 = agqwVar.c;
        this.h.v(new agoi(agqwVar));
    }

    @Override // defpackage.agwh
    public final void w(String str, boolean z) {
        q(str);
        o();
        if (!z) {
            return;
        }
        H(str);
        I(str);
    }

    @Override // defpackage.agwh
    public final void x(String str) {
        this.h.s(new agjn(this, str));
    }

    @Override // defpackage.agwh
    public final void y(String str) {
        this.h.s(new agjn(this, str, 2));
    }

    @Override // defpackage.agwh
    public final void z(String str) {
        this.h.s(new agjn(this, str, 3));
    }
}
