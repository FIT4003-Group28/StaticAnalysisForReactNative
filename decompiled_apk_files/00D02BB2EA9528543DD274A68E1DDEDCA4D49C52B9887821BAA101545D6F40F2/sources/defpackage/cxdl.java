package defpackage;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cxdl  reason: default package */
/* loaded from: classes5.dex */
final class cxdl extends cxdi implements cwwr, cxdn {
    static final dcep<String> a = dcep.G("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    public static final /* synthetic */ int f = 0;
    public final cwwo b;
    public final dxio<cxdg> d;
    public final dbty<cxev> e;
    private final Executor g;
    final ConcurrentHashMap<String, cxdh> c = new ConcurrentHashMap<>();
    private final Set<cxdh> h = Collections.newSetFromMap(new ConcurrentHashMap());

    public cxdl(cwwp cwwpVar, Executor executor, final dxio<cxdg> dxioVar, dzsj<cxfg> dzsjVar, final cxew cxewVar) {
        this.b = cwwpVar.a(dege.a, dxioVar, dzsjVar);
        this.g = executor;
        this.d = dxioVar;
        this.e = dbud.a(new dbty(cxewVar, dxioVar) { // from class: cxdj
            private final cxew a;
            private final dxio b;

            {
                this.a = cxewVar;
                this.b = dxioVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dxio dxioVar2 = this.b;
                int i = cxdl.f;
                return cxew.a(((cxdg) dxioVar2.a()).c());
            }
        });
    }

    private static eacd h(cxdh cxdhVar) {
        eacc bZ = eacd.u.bZ();
        eace bZ2 = eacf.d.bZ();
        long d = cxdhVar.d();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eacf eacfVar = (eacf) bZ2.b;
        int i = 1;
        eacfVar.a |= 1;
        eacfVar.b = d;
        int i2 = cxdhVar.d;
        if (i2 != 0) {
            int i3 = i2 - 1;
            if (i3 != 0) {
                i = i3 != 1 ? i3 != 2 ? 4 : 3 : 2;
            }
            eacf eacfVar2 = (eacf) bZ2.b;
            eacfVar2.c = i - 1;
            eacfVar2.a = 2 | eacfVar2.a;
            eacf bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eacd eacdVar = (eacd) bZ.b;
            bK.getClass();
            eacdVar.e = bK;
            eacdVar.a |= 8;
            return bZ.bK();
        }
        throw null;
    }

    private final dehn<Void> i(final String str, final eacd eacdVar, @dzsi final dzze dzzeVar, final boolean z) {
        return deha.f(new deff(this, z, str, eacdVar, dzzeVar) { // from class: cxdk
            private final cxdl a;
            private final boolean b;
            private final String c;
            private final eacd d;
            private final dzze e;

            {
                this.a = this;
                this.b = z;
                this.c = str;
                this.d = eacdVar;
                this.e = dzzeVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cxdl cxdlVar = this.a;
                boolean z2 = this.b;
                String str2 = this.c;
                eacd eacdVar2 = this.d;
                dzze dzzeVar2 = this.e;
                if (!z2 || cxdlVar.e.a().a()) {
                    dbsg<cxda> d = cxdlVar.d.a().d();
                    if (!d.a() || d.b().a()) {
                        cwwo cwwoVar = cxdlVar.b;
                        cwwi f2 = cwwj.f();
                        f2.b(true);
                        f2.c(eacdVar2);
                        cwwf cwwfVar = (cwwf) f2;
                        cwwfVar.a = str2;
                        cwwfVar.b = dzzeVar2;
                        return cwwoVar.c(f2.a());
                    }
                    return dehk.a;
                }
                return dehk.a;
            }
        }, this.g);
    }

    @Override // defpackage.cwud
    public final void Sz() {
        this.c.clear();
        this.h.clear();
    }

    @Override // defpackage.cxdi
    public final cxdh a() {
        if (!this.b.a()) {
            return cxdh.b;
        }
        return cxdh.a();
    }

    @Override // defpackage.cxdi
    public final cxdh c(String str) {
        if (a.contains(str)) {
            return cxdh.b;
        }
        if (!this.b.a()) {
            return cxdh.b;
        }
        cxdh a2 = cxdh.a();
        this.c.put(str, a2);
        this.h.add(a2);
        return a2;
    }

    @Override // defpackage.cxdi
    public final cxdh d(String str) {
        cxdh remove = this.c.remove(str);
        return cxdh.b(remove) ? cxdh.b : remove;
    }

    @Override // defpackage.cxdi
    public final dehn<Void> e(@dzsi cxdh cxdhVar, String str, int i) {
        if (!cxdh.b(cxdhVar)) {
            cxdhVar.e();
            cxdhVar.d = i;
            if (cxdh.b(cxdhVar) || dbsj.d(str)) {
                return deha.b(new IllegalArgumentException("Can't record an event that was never started or has been stopped already"));
            }
            if (a.contains(str)) {
                return deha.b(new IllegalArgumentException(String.format(Locale.US, "%s is reserved event. Dropping timer.", str)));
            }
            return i(str, h(cxdhVar), null, true);
        }
        return dehk.a;
    }

    @Override // defpackage.cxdi
    public final dehn<Void> f(String str, @dzsi String str2, @dzsi dzze dzzeVar, int i) {
        cxdh remove = this.c.remove(str);
        if (!cxdh.b(remove)) {
            remove.e();
            remove.d = i;
            if (true != dbsj.d(str2)) {
                str = str2;
            }
            return i(str, h(remove), dzzeVar, this.h.remove(remove));
        }
        return dehk.a;
    }

    @Override // defpackage.cwwr
    public final void g() {
    }
}
