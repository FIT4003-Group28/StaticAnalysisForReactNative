package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: boof  reason: default package */
/* loaded from: classes3.dex */
public class boof implements boqh {
    public static final Comparator<booq> f = new boob();
    public final booe a;
    public final boolean d;
    public boolean e;
    private final Context g;
    private final byea h;
    private final List<booq> i;
    private final String j;
    private String l;
    public final List<booq> b = dchl.a();
    public final Deque<booq> c = dclw.a();
    private final bood k = new bood(this);

    public boof(Context context, booe booeVar, byea byeaVar, @dzsi bydp bydpVar, boolean z) {
        String g;
        this.g = context;
        this.a = booeVar;
        this.h = byeaVar;
        this.d = z;
        ArrayList a = dchl.a();
        dccx F = dcdc.F();
        if (bydpVar != null) {
            for (byef byefVar : bydpVar.b) {
                if (byefVar.b.equals(this.h)) {
                    booq booqVar = new booq(context, this.k, bonn.e(byefVar.e.get(11), byefVar.e.get(12), byefVar.f.get(11), byefVar.f.get(12)));
                    this.b.add(booqVar);
                    F.g(booqVar.clone());
                    a.add(booqVar.toString());
                }
            }
        }
        if (a.isEmpty()) {
            g = context.getString(R.string.CLOSED);
        } else {
            g = dbrz.e(context.getString(R.string.BUSINESS_HOURS_TIMESPAN_SEPARATOR)).g(a);
        }
        this.l = g;
        this.j = g;
        this.i = F.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
        r4 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u() {
        /*
            r8 = this;
            java.util.Deque<booq> r0 = r8.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto L57
        L9:
            java.util.List<booq> r0 = r8.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List<booq> r0 = r8.b
            java.util.Deque<booq> r1 = r8.c
            java.lang.Object r1 = r1.removeFirst()
            booq r1 = (defpackage.booq) r1
            r0.add(r1)
            r8.i()
            return
        L22:
            java.util.Deque<booq> r0 = r8.c
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            booq r1 = (defpackage.booq) r1
            bonn r2 = r1.a()
            java.util.List<booq> r3 = r8.b
            java.lang.Object r3 = defpackage.dcft.s(r3)
            booq r3 = (defpackage.booq) r3
            bonn r3 = r3.a()
            if (r2 == 0) goto L28
            if (r3 == 0) goto L28
            boolean r2 = r2.g(r3)
            if (r2 == 0) goto L28
            java.util.List<booq> r0 = r8.b
            r0.add(r1)
            r8.i()
            return
        L57:
            booe r0 = r8.a
            boolean r1 = r8 instanceof defpackage.bopd
            if (r1 == 0) goto L66
            bonq r0 = (defpackage.bonq) r0
            bonr r0 = r0.a
            dcdc r0 = r0.i()
            goto L6e
        L66:
            bonq r0 = (defpackage.bonq) r0
            bonr r0 = r0.a
            dcdc r0 = r0.h()
        L6e:
            java.util.List r1 = r8.b()
            r2 = 0
            java.lang.Object r1 = defpackage.dcft.t(r1, r2)
            booq r1 = (defpackage.booq) r1
            if (r1 != 0) goto L7d
            r1 = r2
            goto L81
        L7d:
            bonn r1 = r1.a()
        L81:
            java.util.ArrayList r0 = defpackage.dchl.c(r0)
            int r3 = r0.indexOf(r8)
            r4 = 0
            java.util.List r5 = r0.subList(r4, r3)
            java.util.Collections.reverse(r5)
            int r5 = r3 + 1
            int r6 = r0.size()
            java.util.List r5 = r0.subList(r5, r6)
            java.util.Collections.reverse(r5)
            r0.remove(r3)
            int r3 = r0.size()
        La5:
            if (r4 >= r3) goto Ld7
            java.lang.Object r5 = r0.get(r4)
            boqh r5 = (defpackage.boqh) r5
            java.util.List r5 = r5.b()
            java.util.Iterator r5 = r5.iterator()
        Lb5:
            int r6 = r4 + 1
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Ld5
            java.lang.Object r6 = r5.next()
            boqi r6 = (defpackage.boqi) r6
            booq r6 = (defpackage.booq) r6
            bonn r6 = r6.a()
            if (r6 == 0) goto Lb5
            if (r1 == 0) goto Ld3
            boolean r7 = r6.g(r1)
            if (r7 == 0) goto Lb5
        Ld3:
            r2 = r6
            goto Ld7
        Ld5:
            r4 = r6
            goto La5
        Ld7:
            r8.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boof.u():void");
    }

    private final void v() {
        this.c.clear();
        this.b.clear();
        for (booq booqVar : this.i) {
            this.b.add(booqVar.clone());
        }
        this.a.a(this);
        i();
    }

    public byea a() {
        return this.h;
    }

    @Override // defpackage.boqh
    public List<booq> b() {
        return this.b;
    }

    public boolean c() {
        for (booq booqVar : this.b) {
            if (booqVar.b().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.boqh
    public Boolean d() {
        boolean z = true;
        if (!c()) {
            Iterator<booq> it = this.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    bonn a = it.next().a();
                    if (a != null && a.c() < a.a()) {
                        break;
                    }
                } else {
                    Iterator<booq> it2 = this.b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            if (p().booleanValue()) {
                                z = false;
                            }
                        } else if (it2.next().a() == null) {
                            break;
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.boqh
    public Boolean e() {
        return Boolean.valueOf(!this.e);
    }

    @Override // defpackage.boqh
    public Boolean f() {
        return Boolean.valueOf(this.b.isEmpty());
    }

    @Override // defpackage.boqh
    public Boolean g() {
        return Boolean.valueOf(this.i.isEmpty());
    }

    @Override // defpackage.boqh
    public String h() {
        return this.d ? this.l : this.j;
    }

    public final void i() {
        String g;
        ArrayList f2 = dchl.f(this.b.size());
        for (booq booqVar : this.b) {
            if (!booqVar.toString().isEmpty()) {
                f2.add(booqVar.toString());
            }
        }
        if (f2.isEmpty()) {
            g = this.g.getString(R.string.CLOSED);
        } else {
            g = dbrz.e(this.g.getString(R.string.BUSINESS_HOURS_TIMESPAN_SEPARATOR)).g(f2);
        }
        this.l = g;
    }

    @Override // defpackage.boqh
    public String j() {
        return this.g.getString(this.h.j);
    }

    @Override // defpackage.boqh
    @dzsi
    public String k() {
        return null;
    }

    @Override // defpackage.boqh
    public Boolean l() {
        return false;
    }

    @Override // defpackage.boqh
    public Boolean m() {
        boolean z = false;
        if (this.e && !this.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.boqh
    public Boolean n() {
        return Boolean.valueOf(!this.d);
    }

    public void o(@dzsi bonn bonnVar) {
        this.b.add(new booq(this.g, this.k, bonnVar));
        i();
        if (bonnVar != null) {
            this.a.a(this);
        }
    }

    @Override // defpackage.boqh
    public Boolean p() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.boqh
    public cqkl q() {
        if (this.e) {
            v();
        } else if (f().booleanValue() && this.d) {
            u();
        }
        this.e = !this.e;
        cqkx.p(this);
        this.a.a(this);
        return cqkl.a;
    }

    @Override // defpackage.boqh
    public cqkl r() {
        u();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.boqh
    public cqkl s() {
        v();
        cqkx.p(this);
        return cqkl.a;
    }

    public boolean t() {
        ArrayList c = dchl.c(this.i);
        ArrayList c2 = dchl.c(this.b);
        booq booqVar = new booq(this.g, this.k, null);
        c.remove(booqVar);
        c2.remove(booqVar);
        return !c.equals(c2);
    }
}
