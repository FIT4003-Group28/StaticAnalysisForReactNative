package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: vtb  reason: default package */
/* loaded from: classes7.dex */
public final class vtb {
    @dzsi
    vue B;
    @dzsi
    public vtw C;
    @dzsi
    public final crfl E;
    public final dbty<Boolean> F;
    @dzsi
    public bvpk G;
    @dzsi
    public bvpk H;
    public final vtn a;
    public final btrm b;
    public final bvrb c;
    public final Executor d;
    public final akox e;
    public final hwe f;
    public final Context g;
    public final atln h;
    public final btvo i;
    @dzsi
    public final bvjj j;
    public final dxio<algf> k;
    public final akzh l;
    public final alwc m;
    public final cqat n;
    public final aldd p;
    public final alec q;
    public final cjqy r;
    public final cjqq s;
    public final aufc t;
    @dzsi
    public amuj u;
    @dzsi
    public aufb w;
    @dzsi
    public amqo x;
    public final List<akte> o = new ArrayList();
    public final List<WeakReference<vtw>> v = new ArrayList();
    public final ConcurrentHashMap<Integer, cjql> y = new ConcurrentHashMap<>();
    private final AtomicBoolean I = new AtomicBoolean(false);
    public final vta z = new vta();
    private final crzp<aufb> J = new vsr(this);
    public final Object A = new Object();
    public volatile boolean D = false;

    public vtb(vtn vtnVar, btrm btrmVar, bvrb bvrbVar, Executor executor, akox akoxVar, hwe hweVar, Context context, atln atlnVar, dxio<algf> dxioVar, aldd alddVar, alec alecVar, cjqy cjqyVar, cjqq cjqqVar, aufc aufcVar, akzh akzhVar, alwc alwcVar, cqat cqatVar, btvo btvoVar, @dzsi bvjj bvjjVar, @dzsi crfl crflVar, dbty<Boolean> dbtyVar) {
        dbsk.s(vtnVar);
        this.a = vtnVar;
        dbsk.s(btrmVar);
        this.b = btrmVar;
        dbsk.s(bvrbVar);
        this.c = bvrbVar;
        dbsk.s(executor);
        this.d = executor;
        dbsk.s(akoxVar);
        this.e = akoxVar;
        dbsk.s(hweVar);
        this.f = hweVar;
        dbsk.s(context);
        this.g = context;
        this.h = atlnVar;
        this.k = dxioVar;
        this.p = alddVar;
        this.q = alecVar;
        this.r = cjqyVar;
        this.s = cjqqVar;
        dbsk.s(aufcVar);
        this.t = aufcVar;
        this.l = akzhVar;
        this.m = alwcVar;
        this.n = cqatVar;
        this.i = btvoVar;
        this.j = bvjjVar;
        this.E = crflVar;
        this.F = dbtyVar;
    }

    public static dcdc<dozz> f(amuh amuhVar, final amub amubVar, btvo btvoVar) {
        if (!amuhVar.j()) {
            return dcdc.e();
        }
        amub k = amuhVar.k();
        dpeq dpeqVar = k.s;
        if (dpeqVar == null) {
            return dcdc.e();
        }
        if (amubVar == k) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(dpeqVar.e);
            if (btvoVar.getDirectionsPageParameters().F) {
                arrayList.addAll(dpeqVar.j);
            }
            return dcdc.r(arrayList);
        } else if (amubVar.e() != 0) {
            return dcbg.b(dpeqVar.f).o(new dbsl(amubVar) { // from class: vsn
                private final amub a;

                {
                    this.a = amubVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    dozs dozsVar;
                    dozl dozlVar;
                    amub amubVar2 = this.a;
                    dozz dozzVar = (dozz) obj;
                    if (dozzVar.b == 22) {
                        dozsVar = (dozs) dozzVar.c;
                    } else {
                        dozsVar = dozs.q;
                    }
                    dozr dozrVar = dozsVar.l;
                    if (dozrVar == null) {
                        dozrVar = dozr.e;
                    }
                    if (dozrVar.b == 4) {
                        dozlVar = (dozl) dozrVar.c;
                    } else {
                        dozlVar = dozl.e;
                    }
                    return dozlVar.d == amubVar2.e();
                }
            }).z();
        } else {
            return dcdc.e();
        }
    }

    private final void h() {
        aktz aB = this.e.aj().aB();
        ArrayList arrayList = new ArrayList();
        synchronized (this.o) {
            arrayList.addAll(this.o);
            this.o.clear();
        }
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            akte akteVar = (akte) arrayList.get(i);
            aB.h(akteVar);
            aB.a(akteVar);
        }
        synchronized (this.A) {
            vtw vtwVar = this.C;
            if (vtwVar != null) {
                vtwVar.j();
            }
            vue vueVar = this.B;
            if (vueVar != null) {
                vueVar.e();
                this.B = null;
            }
        }
    }

    public final void a() {
        if (this.I.getAndSet(true)) {
            return;
        }
        btrm btrmVar = this.b;
        dceq a = dcet.a();
        a.b(amuj.class, new vtc(0, amuj.class, this));
        a.b(amqo.class, new vtc(1, amqo.class, this));
        btrmVar.g(this, a.a());
        this.t.i().d(this.J, this.d);
        synchronized (this.A) {
            vtw vtwVar = this.C;
            if (vtwVar != null) {
                vtwVar.b(this.l, this.b, this.g, this.m);
            }
            vue vueVar = this.B;
            if (vueVar != null) {
                vueVar.c();
            }
        }
    }

    public final void b() {
        if (!this.I.getAndSet(false)) {
            return;
        }
        this.t.i().c(this.J);
        this.b.a(this);
        synchronized (this.A) {
            vtw vtwVar = this.C;
            if (vtwVar != null) {
                vtwVar.j();
            }
            vue vueVar = this.B;
            if (vueVar != null) {
                vueVar.e();
                this.B = null;
            }
        }
        this.q.d();
        bvpk bvpkVar = this.G;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk bvpkVar2 = this.H;
        if (bvpkVar2 == null) {
            return;
        }
        bvpkVar2.b();
    }

    public final void c(vuv vuvVar, vsy vsyVar) {
        e(vuvVar, false, vsyVar);
    }

    public final void d() {
        synchronized (this.z) {
            vta vtaVar = this.z;
            vtaVar.a = null;
            vtaVar.c = null;
            vtaVar.b = true;
        }
        h();
    }

    public final void e(final vuv vuvVar, boolean z, vsy vsyVar) {
        dcqe.b.v(dcqz.FULL);
        final vsx vsxVar = new vsx(this, vsyVar, vuvVar);
        synchronized (this.z) {
            if (!z) {
                vta vtaVar = this.z;
                if (!vtaVar.b && vuvVar.equals(vtaVar.a)) {
                    return;
                }
            }
            vta vtaVar2 = this.z;
            vtaVar2.a = vuvVar;
            vtaVar2.c = vsxVar;
            vtaVar2.b = false;
            h();
            this.c.b(new Runnable(this, vuvVar, vsxVar) { // from class: vsl
                private final vtb a;
                private final vuv b;
                private final vsx c;

                {
                    this.a = this;
                    this.b = vuvVar;
                    this.c = vsxVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x000c, B:7:0x002b, B:8:0x0039, B:10:0x003f, B:12:0x004d, B:15:0x005b, B:22:0x006b, B:39:0x009a, B:41:0x009e, B:43:0x00a2, B:44:0x00a5, B:46:0x00a9, B:47:0x00ab, B:49:0x00c6, B:54:0x00dd, B:55:0x00df, B:77:0x0110, B:64:0x00f1, B:65:0x00f3, B:75:0x0107, B:76:0x010c, B:50:0x00d1, B:78:0x0114, B:23:0x0079, B:24:0x007e, B:25:0x0083, B:26:0x0085, B:33:0x008f, B:34:0x0091, B:83:0x012a, B:87:0x013d, B:89:0x0153, B:90:0x015a, B:92:0x015e, B:93:0x0162, B:66:0x00f4, B:68:0x00fc, B:69:0x0100, B:35:0x0092, B:36:0x0096, B:27:0x0086, B:28:0x008a, B:56:0x00e0, B:58:0x00e8, B:59:0x00ec), top: B:99:0x000c }] */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0114 A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x000c, B:7:0x002b, B:8:0x0039, B:10:0x003f, B:12:0x004d, B:15:0x005b, B:22:0x006b, B:39:0x009a, B:41:0x009e, B:43:0x00a2, B:44:0x00a5, B:46:0x00a9, B:47:0x00ab, B:49:0x00c6, B:54:0x00dd, B:55:0x00df, B:77:0x0110, B:64:0x00f1, B:65:0x00f3, B:75:0x0107, B:76:0x010c, B:50:0x00d1, B:78:0x0114, B:23:0x0079, B:24:0x007e, B:25:0x0083, B:26:0x0085, B:33:0x008f, B:34:0x0091, B:83:0x012a, B:87:0x013d, B:89:0x0153, B:90:0x015a, B:92:0x015e, B:93:0x0162, B:66:0x00f4, B:68:0x00fc, B:69:0x0100, B:35:0x0092, B:36:0x0096, B:27:0x0086, B:28:0x008a, B:56:0x00e0, B:58:0x00e8, B:59:0x00ec), top: B:99:0x000c }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 378
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vsl.run():void");
                }
            }, bvrj.BACKGROUND_THREADPOOL);
            this.c.b(new Runnable(this, vuvVar) { // from class: vsm
                private final vtb a;
                private final vuv b;

                {
                    this.a = this;
                    this.b = vuvVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:192:0x068f A[Catch: all -> 0x079e, TryCatch #2 {, blocks: (B:3:0x0010, B:4:0x0015, B:6:0x001b, B:10:0x0024, B:233:0x077c, B:16:0x003c, B:18:0x006b, B:21:0x0075, B:23:0x007d, B:28:0x008a, B:30:0x0090, B:109:0x033d, B:110:0x0346, B:112:0x0349, B:114:0x034f, B:117:0x0367, B:119:0x0371, B:120:0x039f, B:121:0x03a2, B:189:0x0670, B:190:0x0689, B:192:0x068f, B:194:0x069c, B:196:0x06a7, B:31:0x00d1, B:32:0x00de, B:34:0x00e1, B:36:0x00eb, B:38:0x00f7, B:40:0x0103, B:42:0x0107, B:44:0x011b, B:46:0x0125, B:49:0x012f, B:59:0x015a, B:61:0x0164, B:64:0x0169, B:69:0x0185, B:71:0x0188, B:76:0x0193, B:77:0x01ad, B:78:0x01b0, B:80:0x01b4, B:81:0x01ca, B:82:0x01d9, B:84:0x01df, B:88:0x01f0, B:90:0x020a, B:93:0x0221, B:97:0x022a, B:98:0x026c, B:102:0x02bd, B:107:0x031a, B:91:0x0219, B:87:0x01ec, B:99:0x02a1, B:101:0x02af, B:50:0x0134, B:52:0x0138, B:54:0x013e, B:57:0x0145, B:58:0x0156, B:103:0x02c8, B:106:0x02e0, B:108:0x032e, B:24:0x0082, B:26:0x0086, B:27:0x0088, B:122:0x03ad, B:123:0x03d3, B:125:0x03d6, B:127:0x03eb, B:129:0x0401, B:131:0x0407, B:133:0x041a, B:138:0x0430, B:137:0x042c, B:139:0x0436, B:140:0x0448, B:142:0x044e, B:144:0x045e, B:147:0x0478, B:146:0x0468, B:148:0x047c, B:149:0x0494, B:151:0x049a, B:152:0x04cf, B:154:0x04d9, B:155:0x04fd, B:157:0x051e, B:159:0x0533, B:162:0x0542, B:172:0x05b9, B:165:0x0559, B:167:0x056e, B:169:0x058b, B:170:0x0591, B:175:0x05d7, B:177:0x05e3, B:179:0x05ff, B:181:0x0605, B:182:0x060b, B:184:0x0613, B:187:0x0632, B:178:0x05fa, B:160:0x0538, B:174:0x05cb, B:188:0x0666, B:234:0x0789, B:235:0x078c, B:198:0x06ae, B:210:0x06cc, B:227:0x0739, B:211:0x06d5, B:213:0x06e0, B:215:0x06e8, B:216:0x06f1, B:218:0x06fc, B:220:0x0704, B:221:0x070d, B:222:0x0716, B:224:0x071e, B:225:0x0727, B:226:0x0730, B:236:0x078d, B:238:0x0791, B:239:0x0799), top: B:248:0x0010 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 1954
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.vsm.run():void");
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
    }

    public final bvpk g(final Future<?> future, final String str, final int i) {
        bvpk a = bvpk.a(new Runnable(future, str, i) { // from class: vsp
            private final Future a;
            private final String b;
            private final int c;

            {
                this.a = future;
                this.b = str;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Future future2 = this.a;
                String str2 = this.b;
                int i2 = this.c;
                bvrj.BACKGROUND_THREADPOOL.c();
                if (!future2.isDone()) {
                    bvoo.d(new vsz(String.format("[b/110101804] Future for '%s' did not complete after %s seconds", str2, Integer.valueOf(i2))));
                }
            }
        });
        this.c.a(a, bvrj.BACKGROUND_THREADPOOL, i * 1000);
        return a;
    }
}
