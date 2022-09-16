package defpackage;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aagu  reason: default package */
/* loaded from: classes.dex */
public final class aagu extends Observer implements aagh, aaka {
    public final aake a;
    public final amup b;
    public final aagg c;
    List g;
    private final aaki h;
    private final Executor i;
    public boolean d = false;
    private boolean j = false;
    public final Map e = new ConcurrentHashMap();
    private final ConcurrentHashMap k = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    private volatile boolean l = false;

    public aagu(azqb azqbVar, aaki aakiVar, Map map, Executor executor) {
        aake aakeVar = new aake(azqbVar, this);
        this.a = aakeVar;
        this.h = aakiVar;
        this.b = amup.j(map);
        this.i = executor;
        this.c = new aagg(this, new aagt(this), aakiVar, aakeVar);
    }

    public static aajy j(final Map map, final Object obj) {
        aajy aajyVar = (aajy) map.get(obj);
        if (aajyVar == null) {
            synchronized (map) {
                aajyVar = (aajy) map.get(obj);
                if (aajyVar == null) {
                    aajyVar = aajy.e(new Runnable() { // from class: aags
                        @Override // java.lang.Runnable
                        public final void run() {
                            aagu.n(map, obj);
                        }
                    });
                    map.put(obj, aajyVar);
                }
            }
        }
        return aajyVar;
    }

    public static void n(Map map, Object obj) {
        map.remove(obj);
    }

    public static boolean o(awsz awszVar, aorw aorwVar) {
        if (!aorwVar.equals(aajz.a)) {
            aorw aorwVar2 = awszVar.d;
            if (aorwVar2 == null) {
                aorwVar2 = aorw.a;
            }
            return aosw.a(aorwVar, aorwVar2) > 0;
        }
        return true;
    }

    private final synchronized void p() {
        List list = this.g;
        if (list != null) {
            final amuk o = amuk.o(list);
            this.i.execute(new Runnable() { // from class: aagr
                @Override // java.lang.Runnable
                public final void run() {
                    amuk amukVar = amuk.this;
                    int size = amukVar.size();
                    for (int i = 0; i < size; i++) {
                        ((Runnable) amukVar.get(i)).run();
                    }
                }
            });
        }
        this.g = null;
    }

    @Override // defpackage.aagh
    public final ayoi a(Class cls) {
        if (this.l) {
            return ayoi.H(aagj.e());
        }
        return j(this.f, cls).R();
    }

    @Override // defpackage.aajl
    public final aajj b(String str) {
        return (aajj) f(str).W();
    }

    @Override // defpackage.aaka
    public final aajs d(aorw aorwVar) {
        aahb c = c();
        c.d = aorwVar;
        return c;
    }

    @Override // defpackage.aajl
    /* renamed from: e */
    public final aahb c() {
        return new aahb(this);
    }

    @Override // defpackage.aajl
    public final ayoc f(String str) {
        if (this.l) {
            return ayoc.q(aagj.e());
        }
        return ayoc.u(new aagm(this, str, 2));
    }

    @Override // defpackage.aajl
    public final ayoi g(Class cls) {
        if (this.l) {
            return ayoi.H(aagj.e());
        }
        return j(this.k, cls).R();
    }

    @Override // defpackage.aajl
    public final ayoi h(String str, boolean z) {
        if (this.l) {
            return ayoi.H(aagj.e());
        }
        if (z) {
            return ayoi.z(new aagm(this, str, 1));
        }
        return j(this.e, str).R();
    }

    @Override // defpackage.aajl
    public final ayoi i(String str) {
        if (this.l) {
            return ayoi.H(aagj.e());
        }
        return ayoi.z(new aagm(this, str));
    }

    public final aynr k(final List list, final boolean z) {
        if (list.isEmpty()) {
            return aynr.f();
        }
        aynr u = aynr.u(new Callable() { // from class: aagn
            /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003c -> B:22:0x003d). Please submit an issue!!! */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r6 = this;
                    aagu r0 = defpackage.aagu.this
                    java.util.List r1 = r2
                    boolean r2 = r3
                    aagg r3 = r0.c
                    com.google.android.libraries.elements.interfaces.ByteStore r3 = r3.a
                    com.google.android.libraries.elements.interfaces.Transaction r3 = r3.createTransaction()
                    if (r3 == 0) goto L7a
                    r4 = 0
                    java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3f defpackage.aakb -> L41
                L15:
                    boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L3f defpackage.aakb -> L41
                    if (r5 == 0) goto L25
                    java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L3f defpackage.aakb -> L41
                    aaha r5 = (defpackage.aaha) r5     // Catch: java.lang.Throwable -> L3f defpackage.aakb -> L41
                    r5.a()     // Catch: java.lang.Throwable -> L3f defpackage.aakb -> L41
                    goto L15
                L25:
                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L3f defpackage.aakb -> L41
                    r1 = 1
                    r2 = r2 ^ r1
                    r0.d = r2     // Catch: java.lang.Throwable -> L3c
                    r3.commit()     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    r0.d = r2     // Catch: java.lang.Throwable -> L39
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: defpackage.aakb -> L36 java.lang.Throwable -> L6d
                    return r0
                L36:
                    r1 = move-exception
                    r3 = r4
                    goto L42
                L39:
                    r1 = move-exception
                    r3 = r4
                    goto L3d
                L3c:
                    r1 = move-exception
                L3d:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r1     // Catch: java.lang.Throwable -> L3f defpackage.aakb -> L41
                L3f:
                    r1 = move-exception
                    goto L6f
                L41:
                    r1 = move-exception
                L42:
                    r3.abort()     // Catch: java.lang.Throwable -> L3f
                    java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L6d
                    java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L6d
                    int r2 = r2.length()     // Catch: java.lang.Throwable -> L6d
                    int r2 = r2 + 38
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
                    r3.<init>(r2)     // Catch: java.lang.Throwable -> L6d
                    java.lang.String r2 = "Transaction aborted due to failed edit"
                    r3.append(r2)     // Catch: java.lang.Throwable -> L6d
                    r3.append(r1)     // Catch: java.lang.Throwable -> L6d
                    java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L6d
                    r0.l(r1)     // Catch: java.lang.Throwable -> L6d
                    aakb r2 = new aakb     // Catch: java.lang.Throwable -> L6d
                    r2.<init>(r1)     // Catch: java.lang.Throwable -> L6d
                    throw r2     // Catch: java.lang.Throwable -> L6d
                L6d:
                    r1 = move-exception
                    r3 = r4
                L6f:
                    if (r3 == 0) goto L79
                    r3.abort()
                    java.lang.String r2 = "Transaction aborted due to unhandled exception"
                    r0.l(r2)
                L79:
                    throw r1
                L7a:
                    java.lang.String r1 = "Failed to create transaction"
                    r0.l(r1)
                    aakb r0 = new aakb
                    r0.<init>(r1)
                    goto L86
                L85:
                    throw r0
                L86:
                    goto L85
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aagn.call():java.lang.Object");
            }
        });
        azpo W = azpo.W();
        u.I(W);
        return W;
    }

    public final void l(String str) {
        this.h.a("EntityStore", str);
    }

    public final synchronized void m() {
        if (this.l) {
            return;
        }
        this.l = true;
        l("clearing the store.");
        this.j = true;
        this.c.a.clear();
        p();
        for (aajy aajyVar : this.e.values()) {
            aajyVar.sm();
        }
        this.e.clear();
        for (aajy aajyVar2 : this.k.values()) {
            aajyVar2.sm();
        }
        this.k.clear();
        for (aajy aajyVar3 : this.f.values()) {
            aajyVar3.sm();
        }
        this.f.clear();
        this.j = false;
    }

    @Override // com.google.android.libraries.elements.interfaces.Observer
    public final synchronized void storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord) {
        if (this.d) {
            return;
        }
        final boolean z = this.j;
        HashSet<Class> hashSet = new HashSet();
        this.g = new ArrayList();
        ArrayList<aajp> arrayList = new ArrayList();
        Snapshot beginState = transactionRecord.beginState();
        Snapshot endState = transactionRecord.endState();
        ArrayList keysOrdered = transactionRecord.keysOrdered();
        ArrayDeque<String> arrayDeque = new ArrayDeque(keysOrdered.size());
        HashSet hashSet2 = new HashSet();
        int size = keysOrdered.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            String str = (String) keysOrdered.get(size);
            if (!hashSet2.contains(str)) {
                hashSet2.add(str);
                arrayDeque.addFirst(str);
            }
        }
        for (String str2 : arrayDeque) {
            aagf c = this.c.c(str2, beginState);
            aagf c2 = this.c.c(str2, endState);
            if (c.a != null || c2.a != null) {
                aajk f = aagg.f(c.b);
                aajk f2 = aagg.f(c2.b);
                if (!akzj.f(f, f2) || !akzj.f(c.a, c2.a)) {
                    aajn a = aajp.a();
                    a.c(str2);
                    a.a = c.a;
                    a.b = c2.a;
                    a.d(f);
                    a.b(f2);
                    a.e(z ? aajo.CLEAR_ON_SIGN_OUT : aajo.UNKNOWN);
                    arrayList.add(a.a());
                }
            } else {
                String valueOf = String.valueOf(str2);
                l(valueOf.length() != 0 ? "Store update with no parseable values for ".concat(valueOf) : new String("Store update with no parseable values for "));
            }
        }
        for (final aajp aajpVar : arrayList) {
            String str3 = aajpVar.a;
            final aajy aajyVar = (aajy) this.e.get(str3);
            final aajy aajyVar2 = (aajy) this.k.get(aajpVar.b());
            if (aajyVar != null || aajyVar2 != null) {
                if (z) {
                    if (aajyVar != null) {
                        n(this.e, str3);
                    }
                    if (aajyVar2 != null) {
                        hashSet.add(aajpVar.b());
                    }
                }
                this.g.add(new Runnable() { // from class: aagq
                    @Override // java.lang.Runnable
                    public final void run() {
                        aajy aajyVar3 = aajy.this;
                        aajp aajpVar2 = aajpVar;
                        boolean z2 = z;
                        aajy aajyVar4 = aajyVar2;
                        if (aajyVar3 != null) {
                            aajyVar3.c(aajpVar2);
                            if (z2) {
                                aajyVar3.sm();
                            }
                        }
                        if (aajyVar4 != null) {
                            aajyVar4.c(aajpVar2);
                        }
                    }
                });
            }
        }
        for (Class cls : hashSet) {
            final aajy aajyVar3 = (aajy) this.k.remove(cls);
            List list = this.g;
            aajyVar3.getClass();
            list.add(new Runnable() { // from class: aagp
                @Override // java.lang.Runnable
                public final void run() {
                    aajy.this.sm();
                }
            });
        }
        p();
    }
}
