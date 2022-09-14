package defpackage;

import com.google.android.apps.gmm.map.internal.vector.gl.GeometryUtil;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alrj  reason: default package */
/* loaded from: classes.dex */
public final class alrj {
    public final alri a;
    public final akqn b;
    public final amxe e;
    public final boolean f;
    public final float g;
    public final int h;
    public alxa j;
    public bnrw k;
    public amnd l;
    private final List<alsn> n = new ArrayList();
    public final List<ampl> c = new ArrayList();
    public List<alxp[]> d = new ArrayList();
    public int i = 0;
    @dzsi
    public bnuv m = null;

    public alrj(alxa alxaVar, alri alriVar, akqn akqnVar, int i, float f, int i2, amxe amxeVar) {
        this.j = alxaVar;
        this.a = alriVar;
        this.b = akqnVar;
        this.f = i == 2;
        this.g = f;
        this.h = i2;
        this.k = amxeVar.o();
        this.e = amxeVar;
        amxeVar.n(false);
        StringBuilder sb = new StringBuilder(23);
        sb.append("ClientLines-");
        sb.append(i2);
        amxeVar.s = sb.toString();
        amxeVar.u = 519;
        amxeVar.s(1, 771);
        amxeVar.k(1.0f);
    }

    public static bnrw a(int i) {
        return new bnrw(2147483647L, 2147483647L, 2147483647L, i);
    }

    public static alxo d(amnd amndVar, int i) {
        return amndVar.c.get(0).c(i);
    }

    public final boolean b(dmqg dmqgVar, List<alsn> list) {
        ArrayList arrayList = new ArrayList();
        for (alsn alsnVar : list) {
            if (!this.n.contains(alsnVar)) {
                arrayList.add(alsnVar);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 8 - this.n.size() || (!arrayList.isEmpty() && !this.n.isEmpty() && !this.n.get(0).q((akuh) arrayList.get(0), this.f))) {
                return false;
            }
        }
        this.n.addAll(arrayList);
        ampl amplVar = new ampl(dmqgVar, this.b);
        this.c.add(amplVar);
        this.a.b(amplVar);
        return true;
    }

    public final void c() {
        this.e.j(this.a.c());
        this.i = 0;
        for (ampl amplVar : this.c) {
            for (ampm ampmVar : amplVar.b) {
                this.i += GeometryUtil.getMaxGeneratedVerticesForLine(Math.max(ampmVar.b.length >> 1, ampmVar.c.length >> 1), amplVar.e, ampmVar.a.length);
            }
        }
    }

    public final boolean e() {
        amnd amndVar = this.l;
        if (amndVar == null || amndVar.c.isEmpty()) {
            return false;
        }
        alxo j = this.l.c.get(0).j();
        return alww.h(this.f ? j.H : j.G, 1);
    }
}
