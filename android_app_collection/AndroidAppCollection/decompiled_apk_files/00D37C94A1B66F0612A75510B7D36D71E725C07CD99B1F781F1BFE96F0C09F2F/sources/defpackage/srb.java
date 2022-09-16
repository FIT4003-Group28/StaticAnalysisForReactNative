package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: srb  reason: default package */
/* loaded from: classes4.dex */
public final class srb {
    private final sqv a;
    private final Map b;
    private final sqy c;
    private final spt d;
    private final int e;
    private final ArrayDeque f;

    public srb(sqv sqvVar, Map map, sqy sqyVar, spt sptVar, int i, ArrayDeque arrayDeque) {
        this.a = sqvVar;
        this.b = map;
        this.c = sqyVar;
        this.d = sptVar;
        this.e = i;
        this.f = arrayDeque;
    }

    public final void a(aopa aopaVar) {
        int i = 2;
        if ((((aotf) aopaVar.instance).b & 64) == 0) {
            aopaVar.copyOnWrite();
            aotf aotfVar = (aotf) aopaVar.instance;
            aotfVar.i = apfb.e(2);
            aotfVar.b |= 64;
        }
        StringWriter stringWriter = new StringWriter();
        ((Throwable) this.d.b.e(new Throwable())).printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int length = stringWriter2.length();
        long b = axra.a.get().b();
        if (b < length && b >= 0) {
            length = (int) b;
        }
        boolean z = false;
        String substring = stringWriter2.substring(0, length);
        aopaVar.copyOnWrite();
        aotf aotfVar2 = (aotf) aopaVar.instance;
        substring.getClass();
        aotfVar2.b |= 2048;
        aotfVar2.m = substring;
        aotf aotfVar3 = (aotf) aopaVar.mo39build();
        Long valueOf = Long.valueOf(aotfVar3.e);
        int f = apfb.f(aotfVar3.i);
        if (f != 0) {
            i = f;
        }
        sra sraVar = new sra(valueOf, i);
        long a = axra.a.get().a();
        synchronized (this.b) {
            Long l = (Long) this.b.get(sraVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (l == null || a <= 0 || l.longValue() + a < currentTimeMillis) {
                z = true;
            }
            if (z) {
                this.b.put(sraVar, Long.valueOf(currentTimeMillis));
            }
        }
        if (z) {
            this.c.a(aotfVar3);
        }
    }

    public final aopa b(int i) {
        aopa createBuilder = aotf.a.createBuilder();
        String packageName = this.d.a.getPackageName();
        createBuilder.copyOnWrite();
        aotf aotfVar = (aotf) createBuilder.instance;
        packageName.getClass();
        aotfVar.b |= 1;
        aotfVar.c = packageName;
        int a = this.a.a(this.d.a);
        createBuilder.copyOnWrite();
        aotf aotfVar2 = (aotf) createBuilder.instance;
        aotfVar2.b |= 2;
        aotfVar2.d = a;
        createBuilder.copyOnWrite();
        aotf.b((aotf) createBuilder.instance);
        createBuilder.copyOnWrite();
        aotf aotfVar3 = (aotf) createBuilder.instance;
        aotfVar3.b |= 8;
        aotfVar3.f = -2032180703L;
        int i2 = this.e;
        createBuilder.copyOnWrite();
        aotf aotfVar4 = (aotf) createBuilder.instance;
        aotfVar4.b |= 16;
        aotfVar4.g = i2;
        amuf f = amuk.f();
        Iterator descendingIterator = this.f.descendingIterator();
        while (descendingIterator.hasNext()) {
            f.h(Long.valueOf(((spz) descendingIterator.next()).e));
        }
        amuk g = f.g();
        createBuilder.copyOnWrite();
        aotf aotfVar5 = (aotf) createBuilder.instance;
        aotfVar5.a();
        aonk.addAll((Iterable) g, (List) aotfVar5.l);
        createBuilder.copyOnWrite();
        aotf aotfVar6 = (aotf) createBuilder.instance;
        aotfVar6.i = apfb.e(i);
        aotfVar6.b |= 64;
        return createBuilder;
    }
}
