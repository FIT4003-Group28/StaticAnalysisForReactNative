package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: amoh  reason: default package */
/* loaded from: classes.dex */
public final class amoh implements btni, btph {
    static final alyh a = new alyh(-1, 0, 0);
    private final cqat c;
    private final btmk e;
    private final dbty<Boolean> f;
    private final int i;
    private final Map<amog, amof> d = new HashMap();
    private int g = 0;
    private int h = 0;
    public int b = 0;

    static {
        dcep.G("SAMSUNG-SGH-I747", "SGH-T999", "SCH-I535", "SPH-L710", "SGH-I337", "SCH-I545", new String[0]);
    }

    public amoh(btmv btmvVar, cqat cqatVar, btml btmlVar, dbty<Boolean> dbtyVar) {
        dcjz.d();
        this.c = cqatVar;
        this.e = btmlVar.a(ckip.U);
        btmvVar.a(this, "GLTileCacheManager");
        this.f = dbtyVar;
        this.i = 64;
    }

    public static boolean f(alyh alyhVar) {
        return alyhVar.equals(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void l(amoh amohVar, int i) {
        amohVar.g -= i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void m(amoh amohVar, int i) {
        amohVar.h -= i;
    }

    private final synchronized boolean n(int i) {
        if (this.f == null || !Boolean.TRUE.equals(this.f.a())) {
            return this.b > i;
        }
        return true;
    }

    private final void o(int i) {
        if (!n(i)) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        for (Map.Entry<amog, amof> entry : this.d.entrySet()) {
            btnb<alyh, amod> f = entry.getValue().f();
            if (f != null && !f(f.a)) {
                treeSet.add(new amoe(entry.getKey(), f.a, f.b));
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!treeSet.isEmpty() && n(i)) {
            amoe amoeVar = (amoe) treeSet.first();
            amof amofVar = this.d.get(amoeVar.a);
            amofVar.o(amoeVar.b);
            boolean isEmpty = amofVar.a.isEmpty();
            if (amofVar.l() && isEmpty) {
                arrayList.add(amoeVar.a);
            }
            treeSet.remove(amoeVar);
            btnb<alyh, amod> f2 = amofVar.f();
            if (f2 != null && !f(f2.a)) {
                treeSet.add(new amoe(amoeVar.a, f2.a, f2.b));
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.d.remove((amog) arrayList.get(i2));
        }
    }

    private final amod p(amog amogVar, alyh alyhVar, boolean z, long j) {
        amof amofVar = this.d.get(amogVar);
        if (amofVar == null) {
            if (!z) {
                return null;
            }
            amofVar = new amof(this);
            this.d.put(amogVar, amofVar);
        }
        amod a2 = amofVar.a(alyhVar);
        if (a2 != null) {
            amqn amqnVar = a2.a;
            if (amqnVar == null) {
                this.e.b();
            } else if (!amqnVar.C()) {
                amofVar.o(alyhVar);
                this.e.b();
                return null;
            } else {
                this.e.a();
            }
            a2.d = j;
            return a2;
        }
        this.e.b();
        if (z) {
            amofVar.Pz(alyhVar, new amod(null, 0, 0, j));
        }
        return null;
    }

    private static String q(int i) {
        int i2 = ((i * 10) + ImageMetadata.LENS_APERTURE) / ImageMetadata.SHADING_MODE;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2 / 10);
        sb.append(".");
        sb.append(i2 % 10);
        return sb.toString();
    }

    private final synchronized void r() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<amog, amof> entry : this.d.entrySet()) {
            if (!entry.getValue().l()) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(entry.getValue().j());
                sb.append(" ");
                sb.append(entry.getKey());
            }
        }
        if (sb.length() == 0) {
            sb.append("no");
        }
        sb.append(" tiles use ");
        sb.append(q(this.g));
        sb.append("M GL, ");
        sb.append(q(this.h));
        sb.append("M J+N");
        sb.append(", count ");
        sb.append(this.b);
        sb.append("/");
        sb.append(this.d.size() * this.i);
        sb.toString();
    }

    @Override // defpackage.btph
    public final synchronized void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("GLTileCacheManager:"));
        String concat = String.valueOf(str).concat("  ");
        int i = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 31);
        sb.append(concat);
        sb.append("Java memory - used: ");
        sb.append(i);
        printWriter.println(sb.toString());
        int i2 = this.g;
        StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 29);
        sb2.append(concat);
        sb2.append("GL memory - used: ");
        sb2.append(i2);
        printWriter.println(sb2.toString());
        printWriter.print(concat);
        printWriter.printf("Tile count - used: %d, max: %d, (%.2f%%)%n", Integer.valueOf(this.b), Integer.valueOf(this.d.size() * this.i), Float.valueOf((this.b / (this.d.size() * this.i)) * 100.0f));
        for (Map.Entry<amog, amof> entry : this.d.entrySet()) {
            amof value = entry.getValue();
            int i3 = 0;
            int i4 = 0;
            for (amod amodVar : value.p()) {
                i3 += amodVar.b;
                i4 += amodVar.c;
            }
            printWriter.print(concat);
            printWriter.printf("%s - gl bytes: %d, java bytes: %d, tiles: %d%n", entry.getKey().a().b, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(value.k()));
        }
    }

    public final synchronized void a(amog amogVar) {
        amof amofVar = this.d.get(amogVar);
        if (amofVar != null) {
            amofVar.e();
            amofVar.h();
            this.d.remove(amogVar);
        }
    }

    @Override // defpackage.btni
    public final synchronized int b(float f) {
        r();
        o((int) (f * this.b));
        return 0;
    }

    @Override // defpackage.btni
    public final synchronized String c() {
        StringBuilder sb;
        int i = 0;
        for (Map.Entry<amog, amof> entry : this.d.entrySet()) {
            i += entry.getValue().k();
        }
        String q = q(this.h);
        sb = new StringBuilder(String.valueOf(q).length() + 46);
        sb.append("javaAndNativeDataSize: ");
        sb.append(q);
        sb.append(" tileCount: ");
        sb.append(i);
        return sb.toString();
    }

    public final synchronized void d(amog amogVar) {
        int i;
        amof amofVar = this.d.get(amogVar);
        if (amofVar != null) {
            amofVar.o(a);
            ArrayList arrayList = new ArrayList(amofVar.k());
            btna<alyh, amod> r = amofVar.r();
            while (true) {
                if (!r.hasNext()) {
                    break;
                }
                btnb<alyh, amod> next = r.next();
                if (f(next.a)) {
                    break;
                }
                amod amodVar = next.b;
                amqn amqnVar = amodVar.a;
                if (amqnVar != null && amqnVar.j()) {
                    amqnVar.p();
                    l(amofVar.b, amodVar.b);
                    amodVar.b = 0;
                }
                arrayList.add(next.a);
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                amofVar.o((alyh) arrayList.get(i));
            }
            amofVar.h();
            if (amofVar.l()) {
                this.d.remove(amogVar);
            }
        }
    }

    public final synchronized void e(amog amogVar, alyh alyhVar, amqn amqnVar) {
        amof amofVar = this.d.get(amogVar);
        if (amofVar == null) {
            amofVar = new amof(this);
            this.d.put(amogVar, amofVar);
        }
        amod n = amofVar.n(alyhVar);
        if (n == null) {
            amof amofVar2 = this.d.get(amogVar);
            if (amofVar2 == null) {
                return;
            }
            amofVar2.g(new amod(amqnVar, 0, 0, 0L));
            return;
        }
        if (n.a != null) {
            amofVar.g(new amod(n));
        } else {
            this.b++;
        }
        n.a = amqnVar;
        n.b = amqnVar.x();
        int y = amqnVar.y();
        n.c = y;
        this.g += n.b;
        this.h += y;
        o(this.d.size() * this.i);
    }

    public final synchronized List<alyh> g(amog amogVar, amog amogVar2, List<alyh> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (amogVar.equals(amogVar2)) {
            return arrayList;
        }
        long e = this.c.e();
        for (alyh alyhVar : list) {
            amod p = p(amogVar, alyhVar, false, e);
            if (p != null && p.a != null) {
                p(amogVar2, alyhVar, true, e);
                e(amogVar2, alyhVar, p.a);
                arrayList.add(alyhVar);
            }
        }
        return arrayList;
    }

    public final synchronized amqn h(amog amogVar, alyh alyhVar, boolean z) {
        return i(amogVar, alyhVar, z, this.c.e());
    }

    public final synchronized amqn i(amog amogVar, alyh alyhVar, boolean z, long j) {
        amod p = p(amogVar, alyhVar, z, j);
        if (p != null) {
            return p.a;
        }
        return null;
    }

    public final synchronized void j(amog amogVar) {
        k(amogVar, this.c.e());
    }

    public final synchronized void k(amog amogVar, long j) {
        amof amofVar = this.d.get(amogVar);
        if (amofVar == null) {
            amofVar = new amof(this);
            this.d.put(amogVar, amofVar);
        }
        alyh alyhVar = a;
        amod a2 = amofVar.a(alyhVar);
        if (a2 == null) {
            amofVar.Pz(alyhVar, new amod(null, 0, 0, j));
        } else {
            a2.d = j;
        }
        amofVar.h();
    }
}
