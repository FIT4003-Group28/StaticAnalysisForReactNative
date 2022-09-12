package defpackage;

import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alpt  reason: default package */
/* loaded from: classes.dex */
public final class alpt implements alpo {
    public static final /* synthetic */ int b = 0;
    private static final dcep<akry> c = dcep.B(akry.BASE);
    private final ambz A;
    public boolean a;
    private final akzh h;
    private final amii i;
    private final dbty<dbsg<amzx>> j;
    private boolean o;
    private amxf r;
    @dzsi
    private amxf s;
    private alwn t;
    @dzsi
    private alwn u;
    private final amyd w;
    private final bnsn x;
    private final btrm y;
    private final dzsj<akwr> z;
    private alyl g = alyl.o;
    private final HashSet<String> k = new HashSet<>();
    private final HashSet<String> l = new HashSet<>();
    private final int[] m = new int[1];
    private final Map<dmxl, String> n = new EnumMap(dmxl.class);
    private boolean p = false;
    private final ammk q = new alpq(this);
    private final boolean v = true;
    private boolean B = true;
    private final List<amlq> d = new ArrayList();
    private final ArrayList<amml> f = new ArrayList<>();
    private final ArrayList<alpr> e = new ArrayList<>();

    public alpt(final Resources resources, akzh akzhVar, amyd amydVar, bnsn bnsnVar, amii amiiVar, dzsj<akwr> dzsjVar, btrm btrmVar, final dbty<Boolean> dbtyVar, ambz ambzVar, boolean z) {
        this.z = dzsjVar;
        this.y = btrmVar;
        this.h = akzhVar;
        this.x = bnsnVar;
        this.w = amydVar;
        amydVar.i(amxf.ROADMAP.a(z).z);
        this.i = amiiVar;
        amxf amxfVar = amxf.ROADMAP;
        this.r = amxfVar;
        this.t = amxfVar.a(z);
        amiiVar.c();
        amiiVar.o(this.t);
        this.A = ambzVar;
        this.j = dbud.a(new dbty(resources, dbtyVar) { // from class: alpp
            private final Resources a;
            private final dbty b;

            {
                this.a = resources;
                this.b = dbtyVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                Resources resources2 = this.a;
                dbty dbtyVar2 = this.b;
                int i = alpt.b;
                return ((Boolean) dbtyVar2.a()).booleanValue() ? dbsg.i(new amzx(resources2)) : dbpy.a;
            }
        });
    }

    private final void B() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.get(i).j();
        }
    }

    private final void C(amlq amlqVar, boolean z, boolean z2) {
        if (this.d.contains(amlqVar)) {
            return;
        }
        if (amlqVar instanceof amml) {
            amml ammlVar = (amml) amlqVar;
            ammlVar.n = this.q;
            ammlVar.y = true;
            if (this.p) {
                ammlVar.r();
            }
            ammlVar.u = this.v;
            if (ammlVar.d.e()) {
                ammlVar.w(this.B);
            }
            ammlVar.t = false;
            ammlVar.B.q();
            this.f.add(ammlVar);
            ammlVar.G();
        }
        this.d.add(amlqVar);
        amlqVar.e(this.r, z, this.t);
        amlqVar.l();
        amlqVar.f();
        amii amiiVar = this.i;
        if (amiiVar == null || !z2) {
            return;
        }
        amiiVar.h(amlqVar);
    }

    private final void D(amlq amlqVar, boolean z) {
        if (!this.d.remove(amlqVar)) {
            return;
        }
        amii amiiVar = this.i;
        if (amiiVar != null && z) {
            amiiVar.i(amlqVar);
        }
        amlqVar.j();
        if (!(amlqVar instanceof amml)) {
            return;
        }
        amml ammlVar = (amml) amlqVar;
        this.f.remove(ammlVar);
        akrw akrwVar = ammlVar.e;
        if (akrwVar.c) {
            return;
        }
        ambz ambzVar = this.A;
        synchronized (ambzVar.a(akrwVar)) {
            amco amcoVar = ambzVar.a.get(akrwVar);
            if (amcoVar != null) {
                ambzVar.c.d(amcoVar);
                amcoVar.g();
                ambzVar.a.remove(akrwVar);
            }
        }
    }

    private final void E(amlq amlqVar, amlq amlqVar2, boolean z) {
        D(amlqVar, false);
        C(amlqVar2, z, false);
        amii amiiVar = this.i;
        if (amiiVar != null) {
            amiiVar.j(amlqVar, amlqVar2);
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("GMM Tile Fetch Response Codes:"));
        synchronized (this.d) {
            Iterator<amml> it = this.f.iterator();
            while (it.hasNext()) {
                amml next = it.next();
                String concat = String.valueOf(str).concat("  ");
                String valueOf = String.valueOf(next.h);
                StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 21 + String.valueOf(valueOf).length());
                sb.append(concat);
                sb.append("TileOverlay fetcher: ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
                if (next.F instanceof amaw) {
                    String valueOf2 = String.valueOf(next.d);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 10 + String.valueOf(valueOf2).length());
                    sb2.append(concat);
                    sb2.append("tileType ");
                    sb2.append(valueOf2);
                    sb2.append(":");
                    printWriter.println(sb2.toString());
                    ((amaw) next.F).d.f(String.valueOf(concat).concat("  "), printWriter);
                }
            }
        }
    }

    @Override // defpackage.amyb
    public final void Pw() {
        int i = bvos.a;
        this.i.c();
        synchronized (this.d) {
            B();
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                amlq amlqVar = this.d.get(i2);
                amlqVar.l();
                amlqVar.f();
                this.i.h(amlqVar);
            }
        }
    }

    @Override // defpackage.akyz
    public final float a(akra akraVar) {
        float f;
        synchronized (this.d) {
            int size = this.f.size();
            f = 21.0f;
            for (int i = 0; i < size; i++) {
                alvb alvbVar = this.f.get(i).l;
                f = Math.min(f, alvbVar == null ? 21.0f : alvbVar.c(akraVar));
            }
        }
        return f;
    }

    @Override // defpackage.akyz
    public final float b() {
        return this.h.g.get().s;
    }

    @Override // defpackage.alpo
    public final void d() {
    }

    @Override // defpackage.alpo
    public final void f() {
        synchronized (this.d) {
            Iterator<amml> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().h.i(true);
            }
        }
    }

    @Override // defpackage.alpo
    public final void g() {
        synchronized (this.d) {
            Iterator<amml> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().h.i(false);
            }
        }
    }

    @Override // defpackage.alpo
    public final void h() {
        synchronized (this.d) {
            B();
        }
    }

    @Override // defpackage.alpo
    public final void i() {
        synchronized (this.d) {
            Iterator<amml> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().G();
            }
        }
    }

    @Override // defpackage.alpo
    public final void j(amlq amlqVar) {
        synchronized (this.d) {
            if (!this.w.f) {
                C(amlqVar, false, true);
            } else {
                this.e.add(new alpr(1, amlqVar));
                this.x.q();
            }
        }
    }

    @Override // defpackage.alpo
    public final void k(amlq amlqVar) {
        synchronized (this.d) {
            if (!this.w.f) {
                D(amlqVar, true);
            } else {
                this.e.add(new alpr(2, amlqVar));
                this.x.q();
            }
        }
    }

    @Override // defpackage.alpo
    public final void l(amlq amlqVar, amlq amlqVar2) {
        m(amlqVar, amlqVar2, false);
    }

    @Override // defpackage.alpo
    public final void m(amlq amlqVar, amlq amlqVar2, boolean z) {
        synchronized (this.d) {
            if (!this.w.f) {
                if (z && (amlqVar2 instanceof amml) && (amlqVar instanceof amml)) {
                    ((amml) amlqVar2).s((amml) amlqVar);
                }
                E(amlqVar, amlqVar2, false);
            } else {
                this.e.add(new alps(amlqVar, amlqVar2, z));
                this.x.q();
            }
        }
    }

    @Override // defpackage.alpo
    public final void n() {
        synchronized (this.d) {
            for (amlq amlqVar : this.d) {
                if (amlqVar instanceof amml) {
                    final amml ammlVar = (amml) amlqVar;
                    final akzh akzhVar = this.h;
                    final alvb alvbVar = ammlVar.l;
                    if (alvbVar != null) {
                        ammlVar.D.execute(new Runnable(ammlVar, akzhVar, alvbVar) { // from class: ammh
                            private final amml a;
                            private final akzh b;
                            private final alvb c;

                            {
                                this.a = ammlVar;
                                this.b = akzhVar;
                                this.c = alvbVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                long d;
                                amml ammlVar2 = this.a;
                                akzh akzhVar2 = this.b;
                                alvb alvbVar2 = this.c;
                                synchronized (ammlVar2) {
                                    if (!ammlVar2.r) {
                                        akzh b2 = akzhVar2.b();
                                        dzsj<akwx> dzsjVar = ammlVar2.G;
                                        akwx a = dzsjVar != null ? dzsjVar.a() : null;
                                        if (!(alvbVar2 instanceof alva) || a == null) {
                                            d = alvbVar2.d(b2, ammlVar2.w);
                                        } else {
                                            d = ((alva) alvbVar2).e(b2, ammlVar2.w, a.a());
                                        }
                                        long j = d;
                                        boolean z = false;
                                        if (ammlVar2.o != j && !ammlVar2.w.isEmpty()) {
                                            z = true;
                                        }
                                        if (akry.BASE.equals(ammlVar2.d)) {
                                            ammlVar2.z.n(j);
                                        }
                                        if (z && (!ammlVar2.u || ammlVar2.h.f(alvbVar2, b2.g(), ammlVar2.w, null, b2.r().c, 0, false, true))) {
                                            ammlVar2.o = j;
                                            ammlVar2.m = true;
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // defpackage.alpo
    public final synchronized void o(amxf amxfVar, alwn alwnVar) {
        this.s = amxfVar;
        this.u = alwnVar;
    }

    @Override // defpackage.alpo
    public final void p(alwn alwnVar) {
        synchronized (this.d) {
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.get(i).B(alwnVar);
            }
        }
    }

    @Override // defpackage.alpo
    public final void q(boolean z) {
        synchronized (this.d) {
            this.B = z;
            Iterator<amml> it = this.f.iterator();
            while (it.hasNext()) {
                amml next = it.next();
                if (next.d.e()) {
                    next.w(z);
                }
            }
        }
    }

    @Override // defpackage.alpo
    public final boolean r() {
        synchronized (this.d) {
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                amml ammlVar = this.f.get(i);
                if (c.contains(ammlVar.d) && !ammlVar.z()) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // defpackage.alpo
    public final void s(TextView textView) {
        dbsg<amzx> a = this.j.a();
        if (a.a()) {
            amzx b2 = a.b();
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            b2.b = textView;
        }
    }

    @Override // defpackage.alpo
    public final void t() {
        synchronized (this.d) {
            this.p = true;
            Iterator<amml> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().r();
            }
        }
    }

    @Override // defpackage.alpo
    public final boolean u(String str) {
        synchronized (this.d) {
            if (!dbsd.a(str, this.g.k())) {
                alyk o = this.g.o();
                o.c(str);
                this.g = o.b();
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.alpo
    public final amml v(amml ammlVar) {
        if (!(ammlVar.F instanceof amaw)) {
            return ammlVar;
        }
        synchronized (this.d) {
            alyl alylVar = ammlVar.f;
            String str = this.n.get(ammlVar.d.H);
            if (this.g.equals(alylVar) && dbsd.a(str, alylVar.m())) {
                return ammlVar;
            }
            alyk o = alylVar.p(this.g).o();
            o.f(str);
            alyl b2 = o.b();
            amml m = ammlVar.m(b2, this.A.d(ammlVar.e, b2));
            l(ammlVar, m);
            return m;
        }
    }

    @Override // defpackage.alpo
    public final alyl w() {
        alyl alylVar;
        synchronized (this.d) {
            alylVar = this.g;
        }
        return alylVar;
    }

    @Override // defpackage.alpo
    public final void x(Map<dmxl, String> map) {
        synchronized (this.d) {
            if ((map.isEmpty() && !this.n.isEmpty()) || !map.keySet().equals(this.n.keySet())) {
                this.n.clear();
            }
            for (Map.Entry<dmxl, String> entry : map.entrySet()) {
                if (!dbsd.a(this.n.get(entry.getKey()), entry.getValue())) {
                    this.n.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public final boolean y() {
        return this.j.a().a() || this.z.a().b();
    }

    @Override // defpackage.amyc
    public final void z() {
        boolean z;
        boolean z2;
        String string;
        A();
        synchronized (this.d) {
            int size = this.e.size();
            z = false;
            for (int i = 0; i < size; i++) {
                alpr alprVar = this.e.get(i);
                int i2 = alprVar.b - 1;
                if (i2 == 0) {
                    C(alprVar.a, true, true);
                } else if (i2 != 1) {
                    alps alpsVar = (alps) alprVar;
                    if (alpsVar.d) {
                        amlq amlqVar = alpsVar.c;
                        if (amlqVar instanceof amml) {
                            amlq amlqVar2 = alprVar.a;
                            if (amlqVar2 instanceof amml) {
                                ((amml) amlqVar).s((amml) amlqVar2);
                            }
                        }
                    }
                    E(alprVar.a, alpsVar.c, true);
                } else {
                    D(alprVar.a, true);
                }
            }
            if (!this.e.isEmpty()) {
                this.x.q();
            }
            this.e.clear();
        }
        if (y()) {
            synchronized (this) {
                z2 = this.a;
                this.a = false;
            }
            if (!z2) {
                return;
            }
            synchronized (this.d) {
                this.k.clear();
                this.l.clear();
                this.m[0] = -1;
                Iterator<amml> it = this.f.iterator();
                int i3 = -1;
                while (it.hasNext()) {
                    akzh akzhVar = this.h;
                    HashSet<String> hashSet = this.k;
                    HashSet<String> hashSet2 = this.l;
                    int[] iArr = this.m;
                    int i4 = -1;
                    for (amqn amqnVar : it.next().j) {
                        amqnVar.v(akzhVar, hashSet);
                        amqnVar.G(hashSet2);
                        int w = amqnVar.w();
                        if (w > i4) {
                            i4 = w;
                        }
                    }
                    iArr[0] = i4;
                    int i5 = this.m[0];
                    if (i5 > i3) {
                        i3 = i5;
                    }
                }
                dbsg<amzx> a = this.j.a();
                if (a.a()) {
                    amzx b2 = a.b();
                    HashSet<String> hashSet3 = this.k;
                    HashSet<String> hashSet4 = this.l;
                    amxf amxfVar = this.r;
                    alwn alwnVar = this.t;
                    String j = this.g.j();
                    TextView textView = b2.b;
                    if (textView != null) {
                        if (i3 == -1) {
                            i3 = Calendar.getInstance().get(1);
                        }
                        String b3 = b2.b(hashSet3);
                        String b4 = b2.b(hashSet4);
                        if (hashSet3.isEmpty() || hashSet4.isEmpty()) {
                            if (!hashSet3.isEmpty() || !hashSet4.isEmpty()) {
                                if (hashSet4.isEmpty()) {
                                    Resources resources = b2.a;
                                    Integer valueOf = Integer.valueOf(i3);
                                    string = resources.getString(R.string.MAP_COPYRIGHTS_MAP_DATA_ONLY, valueOf, valueOf, b3);
                                } else {
                                    Resources resources2 = b2.a;
                                    Integer valueOf2 = Integer.valueOf(i3);
                                    string = resources2.getString(R.string.MAP_COPYRIGHTS_IMAGERY_ONLY, valueOf2, valueOf2, b4);
                                }
                            } else {
                                string = b2.a.getString(R.string.MAP_COPYRIGHTS_GOOGLE_ONLY, Integer.valueOf(i3));
                            }
                        } else {
                            Resources resources3 = b2.a;
                            Integer valueOf3 = Integer.valueOf(i3);
                            string = resources3.getString(R.string.MAP_COPYRIGHTS_FULL, valueOf3, valueOf3, b4, valueOf3, b3);
                        }
                        if (amxfVar != amxf.HYBRID_LEGEND && amxfVar != amxf.SATELLITE_LEGEND && ((j == null || amxfVar != amxf.ROADMAP) && !alwnVar.C)) {
                            b2.a(textView, string, R.color.qu_grey_600, R.color.gmm_white);
                        }
                        b2.a(textView, string, R.color.gmm_white, R.color.qu_grey_600);
                    }
                }
                HashSet<String> hashSet5 = this.k;
                if (this.z.a().b() && (hashSet5.contains("ZENRIN") || hashSet5.contains("Zenrin") || hashSet5.contains("zenrin"))) {
                    z = true;
                }
                if (this.o != z) {
                    this.o = z;
                    this.y.b(new alhq(z));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
        r7.r = r0;
        r7.s = null;
     */
    @Override // defpackage.amyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() {
        /*
            r7 = this;
            monitor-enter(r7)
            amxf r0 = r7.s     // Catch: java.lang.Throwable -> L66
            r1 = 0
            if (r0 != 0) goto La
            alwn r2 = r7.u     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L15
        La:
            amxf r2 = r7.r     // Catch: java.lang.Throwable -> L66
            if (r0 != r2) goto L1b
            alwn r2 = r7.u     // Catch: java.lang.Throwable -> L66
            alwn r3 = r7.t     // Catch: java.lang.Throwable -> L66
            if (r2 == r3) goto L15
            goto L1b
        L15:
            r7.s = r1     // Catch: java.lang.Throwable -> L66
            r7.u = r1     // Catch: java.lang.Throwable -> L66
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
            return
        L1b:
            if (r0 == 0) goto L21
            r7.r = r0     // Catch: java.lang.Throwable -> L66
            r7.s = r1     // Catch: java.lang.Throwable -> L66
        L21:
            alwn r0 = r7.u     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L29
            r7.t = r0     // Catch: java.lang.Throwable -> L66
            r7.u = r1     // Catch: java.lang.Throwable -> L66
        L29:
            boolean r0 = r7.y()     // Catch: java.lang.Throwable -> L66
            r1 = 1
            if (r0 == 0) goto L32
            r7.a = r1     // Catch: java.lang.Throwable -> L66
        L32:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
            java.util.List<amlq> r0 = r7.d
            monitor-enter(r0)
            java.util.List<amlq> r2 = r7.d     // Catch: java.lang.Throwable -> L63
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L63
            r3 = 0
        L3d:
            if (r3 >= r2) goto L51
            java.util.List<amlq> r4 = r7.d     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L63
            amlq r4 = (defpackage.amlq) r4     // Catch: java.lang.Throwable -> L63
            amxf r5 = r7.r     // Catch: java.lang.Throwable -> L63
            alwn r6 = r7.t     // Catch: java.lang.Throwable -> L63
            r4.e(r5, r1, r6)     // Catch: java.lang.Throwable -> L63
            int r3 = r3 + 1
            goto L3d
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            amii r0 = r7.i
            alwn r1 = r7.t
            r0.o(r1)
            amyd r0 = r7.w
            alwn r1 = r7.t
            int r1 = r1.z
            r0.i(r1)
            return
        L63:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r1
        L66:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L66
            goto L6a
        L69:
            throw r0
        L6a:
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alpt.A():void");
    }
}
