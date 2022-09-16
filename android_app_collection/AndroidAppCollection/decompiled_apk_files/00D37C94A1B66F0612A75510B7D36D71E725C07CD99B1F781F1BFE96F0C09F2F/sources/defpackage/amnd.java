package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amnd  reason: default package */
/* loaded from: classes.dex */
public final class amnd implements Runnable, amll {
    public final ammg a;
    public final long b;
    public final AtomicReference c;
    public ankt d;
    int e = 0;
    private final UUID f;
    private final ammq g;

    public amnd(ammg ammgVar, UUID uuid, ammq ammqVar, amnb amnbVar, long j) {
        this.a = ammgVar;
        this.f = uuid;
        this.g = ammqVar;
        this.b = j;
        this.c = new AtomicReference(amnbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amnc a() {
        amnc amncVar;
        int i;
        synchronized (this) {
            amnb amnbVar = (amnb) this.c.get();
            int i2 = amnbVar.d + 1;
            amnb[] amnbVarArr = new amnb[i2];
            while (amnbVar != null) {
                amnbVarArr[amnbVar.d] = amnbVar;
                amnbVar = amnbVar.e;
            }
            aopa mo52toBuilder = this.g.mo52toBuilder();
            SparseArray sparseArray = new SparseArray(i2);
            amnb amnbVar2 = null;
            for (int i3 = 0; i3 < i2; i3++) {
                amnb amnbVar3 = amnbVarArr[i3];
                Object g = amnbVar3.c.g(amlu.c);
                amlq amlqVar = g == null ? amlq.a : new amlq(1, g);
                if (amlqVar.c == 1) {
                    ((amkz) amlqVar.b).a();
                    if (amnbVar3.d != 0) {
                        amnbVar2 = amnbVar3;
                    }
                }
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                amnb amnbVar4 = amnbVarArr[i5];
                int a = amnbVar4.a();
                if (amnbVar2 != null && (i = amnbVar2.d) != 0) {
                    a = amnbVar4.d == 0 ? i : amnbVar2 == amnbVar4 ? -1 : amnbVar4.a();
                }
                aopa createBuilder = amlo.a.createBuilder();
                String str = amnbVar4.a;
                createBuilder.copyOnWrite();
                amlo amloVar = (amlo) createBuilder.instance;
                str.getClass();
                amloVar.b |= 1;
                amloVar.c = str;
                int i6 = amnbVar4.d;
                createBuilder.copyOnWrite();
                amlo amloVar2 = (amlo) createBuilder.instance;
                amloVar2.b |= 2;
                amloVar2.d = i6;
                createBuilder.copyOnWrite();
                amlo amloVar3 = (amlo) createBuilder.instance;
                amloVar3.b |= 4;
                amloVar3.e = a;
                long j = amnbVar4.b;
                createBuilder.copyOnWrite();
                amlo amloVar4 = (amlo) createBuilder.instance;
                amloVar4.b |= 8;
                amloVar4.f = j;
                int i7 = amnbVar4.f;
                if (i7 != 0) {
                    aqxo.y(true);
                    createBuilder.copyOnWrite();
                    amlo amloVar5 = (amlo) createBuilder.instance;
                    amloVar5.b |= 16;
                    amloVar5.g = 1073741823 & i7;
                    aqxo.y(true);
                    boolean z = (1073741824 & i7) != 0;
                    createBuilder.copyOnWrite();
                    amlo amloVar6 = (amlo) createBuilder.instance;
                    amloVar6.b |= 64;
                    amloVar6.h = z;
                }
                amlo amloVar7 = (amlo) createBuilder.mo39build();
                mo52toBuilder.copyOnWrite();
                ammq ammqVar = (ammq) mo52toBuilder.instance;
                amloVar7.getClass();
                aopu aopuVar = ammqVar.e;
                if (!aopuVar.c()) {
                    ammqVar.e = aopi.mutableCopy(aopuVar);
                }
                ammqVar.e.add(amloVar7);
                sparseArray.append(amnbVar4.d, amnbVar4.c);
                if (!amnbVar4.c()) {
                    i4++;
                }
            }
            if (this.e != 0) {
                aopa createBuilder2 = amku.a.createBuilder();
                aopa createBuilder3 = amkt.a.createBuilder();
                int i8 = this.e;
                createBuilder3.copyOnWrite();
                amkt amktVar = (amkt) createBuilder3.instance;
                amktVar.b |= 1;
                amktVar.c = i8;
                amkt amktVar2 = (amkt) createBuilder3.mo39build();
                createBuilder2.copyOnWrite();
                amku amkuVar = (amku) createBuilder2.instance;
                amktVar2.getClass();
                amkuVar.c = amktVar2;
                amkuVar.b = 1 | amkuVar.b;
                amku amkuVar2 = (amku) createBuilder2.mo39build();
                mo52toBuilder.copyOnWrite();
                ammq ammqVar2 = (ammq) mo52toBuilder.instance;
                amkuVar2.getClass();
                ammqVar2.h = amkuVar2;
                ammqVar2.b |= 16;
            }
            amncVar = new amnc(amnbVarArr[0].a, this.f, this.b, (ammq) mo52toBuilder.mo39build(), sparseArray, i4);
        }
        return amncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ammg ammgVar = this.a;
        ankt anktVar = this.d;
        amnc a = a();
        aqxo.y(ammgVar.d.remove(a.b) != null);
        if (anktVar.isCancelled()) {
            amku amkuVar = a.d.h;
            if (amkuVar == null) {
                amkuVar = amku.a;
            }
            long d = ammgVar.b.d() - a.c;
            aopa mo52toBuilder = a.d.mo52toBuilder();
            aopa mo52toBuilder2 = amkuVar.mo52toBuilder();
            aopa createBuilder = amks.a.createBuilder();
            int i = a.f;
            createBuilder.copyOnWrite();
            amks amksVar = (amks) createBuilder.instance;
            amksVar.b |= 2;
            amksVar.d = i;
            createBuilder.copyOnWrite();
            amks amksVar2 = (amks) createBuilder.instance;
            amksVar2.b = 1 | amksVar2.b;
            amksVar2.c = d;
            amks amksVar3 = (amks) createBuilder.mo39build();
            mo52toBuilder2.copyOnWrite();
            amku amkuVar2 = (amku) mo52toBuilder2.instance;
            amksVar3.getClass();
            amkuVar2.d = amksVar3;
            amkuVar2.b |= 2;
            amku amkuVar3 = (amku) mo52toBuilder2.mo39build();
            mo52toBuilder.copyOnWrite();
            ammq ammqVar = (ammq) mo52toBuilder.instance;
            amkuVar3.getClass();
            ammqVar.h = amkuVar3;
            ammqVar.b |= 16;
            ammq ammqVar2 = (ammq) mo52toBuilder.mo39build();
            int size = ammqVar2.e.size() - 1;
            Iterator it = amxp.t(ammqVar2.e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                amlo amloVar = (amlo) it.next();
                int i2 = amloVar.b;
                if ((i2 & 16) == 0 && (i2 & 4) != 0) {
                    size = amloVar.d;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (size >= 0) {
                amlo amloVar2 = (amlo) ammqVar2.e.get(size);
                int i4 = (int) amloVar2.f;
                String valueOf = String.valueOf(amloVar2.c);
                String str = (amloVar2.b & 16) == 0 ? " (Timed Out)" : "";
                arrayList.add(new StackTraceElement("tk_trace", str.length() != 0 ? valueOf.concat(str) : new String(valueOf), "Started After", (i4 - i3) / 1000));
                size = ((amlo) ammqVar2.e.get(size)).e;
                i3 = i4;
            }
            ((amzw) ((amzw) ((amzw) ammg.a.f()).h(new ammu(null, (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0])))).i("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceTimeout", 263, "TraceManagerImpl.java")).v("Trace %s timed out after %d ms. Complete trace: %s", a.a, Long.valueOf(d), ammqVar2);
            ammgVar.d(ammqVar2, a.e, a.a);
            return;
        }
        try {
            anlz.y(anktVar);
            long j = a.c;
            while (true) {
                long j2 = ammgVar.e.get();
                if (j <= j2) {
                    break;
                } else if (ammgVar.e.compareAndSet(j2, 300000 + j)) {
                    long j3 = j - 2100000;
                    for (final amnd amndVar : ammgVar.d.values()) {
                        if (amndVar.b < j3) {
                            ankv b = ammgVar.c.b(ajsy.e, 10L, TimeUnit.SECONDS);
                            amndVar.getClass();
                            b.qY(new Runnable() { // from class: ammf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    amnd.this.d.cancel(true);
                                }
                            }, anjk.a);
                        }
                    }
                }
            }
            ammgVar.d(a.d, a.e, a.a);
        } catch (ExecutionException e) {
            ((amzw) ((amzw) ((amzw) ammg.a.f()).h(e.getCause())).i("com/google/apps/tiktok/tracing/TraceManagerImpl", "handleTraceComplete", 207, "TraceManagerImpl.java")).s("Trace %s failed collection", a.a);
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = a().a;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 18 + String.valueOf(str).length());
        sb.append("UnfinishedTrace@");
        sb.append(hexString);
        sb.append("[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
