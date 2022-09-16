package defpackage;

import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avsa  reason: default package */
/* loaded from: classes.dex */
public final class avsa implements Closeable, avrx {
    public long a;
    public final avze b;
    public final avsb c;
    public final deig<avrx> d = deig.d();
    private final dxio<btxc> e;
    private final Executor f;
    @dzsi
    private crzp<btvo> g;

    public avsa(avpn avpnVar, avsb avsbVar, Map<dluy, avyy> map, dxio<btxc> dxioVar, Executor executor, avzj avzjVar, avze avzeVar) {
        this.b = avzeVar;
        this.c = avsbVar;
        this.e = dxioVar;
        this.f = executor;
        avyy avyyVar = map.get(dluy.PAINT);
        dbsk.s(avyyVar);
        File a = avyyVar.a(avzeVar);
        a.mkdirs();
        File b = avyyVar.b(avzeVar);
        b.mkdirs();
        File c = avpnVar.c();
        File h = avpnVar.h(avzeVar);
        File i = avpnVar.i(avzeVar);
        dlou bZ = dlov.h.bZ();
        String path = a.getPath();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlov dlovVar = (dlov) bZ.b;
        path.getClass();
        dlovVar.a |= 1;
        dlovVar.b = path;
        String path2 = b.getPath();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlov dlovVar2 = (dlov) bZ.b;
        path2.getClass();
        dlovVar2.a |= 2;
        dlovVar2.c = path2;
        avyy avyyVar2 = map.get(dluy.ROUTING);
        dbsk.s(avyyVar2);
        File a2 = avyyVar2.a(avzeVar);
        a2.mkdirs();
        File b2 = avyyVar2.b(avzeVar);
        b2.mkdirs();
        avyy avyyVar3 = map.get(dluy.SEARCH);
        dbsk.s(avyyVar3);
        File a3 = avyyVar3.a(avzeVar);
        a3.mkdirs();
        File b3 = avyyVar3.b(avzeVar);
        b3.mkdirs();
        String path3 = a2.getPath();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlov dlovVar3 = (dlov) bZ.b;
        path3.getClass();
        dlovVar3.a |= 4;
        dlovVar3.d = path3;
        String path4 = b2.getPath();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlov dlovVar4 = (dlov) bZ.b;
        path4.getClass();
        dlovVar4.a |= 8;
        dlovVar4.e = path4;
        String path5 = a3.getPath();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlov dlovVar5 = (dlov) bZ.b;
        path5.getClass();
        dlovVar5.a |= 16;
        dlovVar5.f = path5;
        String path6 = b3.getPath();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlov dlovVar6 = (dlov) bZ.b;
        path6.getClass();
        dlovVar6.a |= 32;
        dlovVar6.g = path6;
        dlsh bZ2 = dlsi.g.bZ();
        dlrl g = avzeVar.g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlsi dlsiVar = (dlsi) bZ2.b;
        g.getClass();
        dlsiVar.b = g;
        dlsiVar.a |= 1;
        dlov bK = bZ.bK();
        bK.getClass();
        dlsiVar.c = bK;
        dlsiVar.a |= 2;
        String path7 = c.getPath();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlsi dlsiVar2 = (dlsi) bZ2.b;
        path7.getClass();
        dlsiVar2.a |= 4;
        dlsiVar2.d = path7;
        bZ2.a(h.getPath());
        bZ2.a(i.getPath());
        String l = Long.toString(avzjVar.a());
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlsi dlsiVar3 = (dlsi) bZ2.b;
        l.getClass();
        dlsiVar3.a |= 16;
        dlsiVar3.f = l;
        this.a = avsbVar.a(bZ2.bK().bS());
    }

    @Override // defpackage.avrx
    public final avze a() {
        return this.b;
    }

    @Override // defpackage.avrx
    public final synchronized long b() {
        return this.c.j(this.a);
    }

    @Override // defpackage.avrx
    public final synchronized long c() {
        return this.c.i(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            this.c.b(j);
            this.a = 0L;
        }
    }

    @Override // defpackage.avrx
    public final synchronized long d() {
        return this.c.h(this.a);
    }

    @Override // defpackage.avrx
    public final dehn<avrx> e() {
        return deha.o(this.d);
    }

    public final synchronized void f() {
        crzp<btvo> crzpVar = this.g;
        if (crzpVar == null) {
            final WeakReference weakReference = new WeakReference(this);
            crzp<btvo> crzpVar2 = new crzp(weakReference) { // from class: avrz
                private final WeakReference a;

                {
                    this.a = weakReference;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    avsa avsaVar = (avsa) this.a.get();
                    btvo btvoVar = (btvo) crzmVar.l();
                    if (avsaVar == null || btvoVar == null) {
                        return;
                    }
                    avsaVar.c.d(avsaVar.a, btvoVar.getOfflineMapsParameters().bS());
                    avsaVar.c.e(avsaVar.a, btvoVar.getNavigationParametersProto().bS());
                }
            };
            this.g = crzpVar2;
            crzpVar = crzpVar2;
        }
        crzm<btvo> a = this.e.a().a();
        a.a(crzpVar, this.f);
        crzpVar.On(a);
    }

    protected final void finalize() {
        close();
    }

    public final synchronized Long g() {
        return Long.valueOf(this.c.g(this.a));
    }
}
