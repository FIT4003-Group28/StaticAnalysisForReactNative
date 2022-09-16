package defpackage;

import android.util.Pair;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: isr  reason: default package */
/* loaded from: classes3.dex */
public final class isr {
    private final snc a;
    private final aadd b;
    private final LinkedList c = new LinkedList();

    public isr(snc sncVar, aadd aaddVar) {
        this.a = sncVar;
        this.b = aaddVar;
    }

    private final void d() {
        long c = this.a.c();
        while (this.c.peekLast() != null && ((Long) ((Pair) this.c.peekLast()).first).longValue() < c) {
            this.c.removeLast();
        }
    }

    public final synchronized void a(String str) {
        d();
        aopa createBuilder = aukj.a.createBuilder();
        createBuilder.copyOnWrite();
        aukj aukjVar = (aukj) createBuilder.instance;
        str.getClass();
        aukjVar.b = 1;
        aukjVar.c = str;
        long millis = TimeUnit.SECONDS.toMillis(eog.m(this.b));
        this.c.addFirst(new Pair(Long.valueOf(this.a.c() + millis), (aukj) createBuilder.mo39build()));
    }

    public final synchronized void b(aoob aoobVar) {
        d();
        aopa createBuilder = aukj.a.createBuilder();
        aopa createBuilder2 = aukk.a.createBuilder();
        createBuilder2.copyOnWrite();
        aukk aukkVar = (aukk) createBuilder2.instance;
        aukkVar.b |= 1;
        aukkVar.c = aoobVar;
        createBuilder.copyOnWrite();
        aukj aukjVar = (aukj) createBuilder.instance;
        aukk aukkVar2 = (aukk) createBuilder2.mo39build();
        aukkVar2.getClass();
        aukjVar.c = aukkVar2;
        aukjVar.b = 2;
        this.c.addFirst(new Pair(Long.valueOf(this.a.c() + TimeUnit.SECONDS.toMillis(eog.m(this.b))), (aukj) createBuilder.mo39build()));
    }

    public final synchronized aukj[] c() {
        aukj[] aukjVarArr;
        d();
        int size = this.c.size();
        aukjVarArr = new aukj[size];
        for (int i = 0; i < size; i++) {
            aukjVarArr[i] = (aukj) ((Pair) this.c.get(i)).second;
        }
        return aukjVarArr;
    }
}
