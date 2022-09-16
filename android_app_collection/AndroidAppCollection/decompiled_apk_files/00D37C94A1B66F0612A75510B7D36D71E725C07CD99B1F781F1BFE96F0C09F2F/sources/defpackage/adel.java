package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adel  reason: default package */
/* loaded from: classes.dex */
public final class adel {
    private static final String d = zep.a("MDX.DiscoveryController");
    private final axnm e;
    private final axnm f;
    private final axnm g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final kt k = new kt();
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Object c = new Object();
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());

    public adel(axnm axnmVar, axnm axnmVar2, axnm axnmVar3) {
        this.e = axnmVar;
        this.f = axnmVar2;
        this.g = axnmVar3;
    }

    private final void c(boolean z) {
        bhd bhdVar = (bhd) this.e.get();
        bgo bgoVar = (bgo) this.f.get();
        kt ktVar = this.k;
        int i = 1;
        if (true != z) {
            i = 4;
        }
        bhdVar.q(bgoVar, ktVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object obj) {
        ylr.c();
        synchronized (this.c) {
            boolean remove = this.a.remove(obj);
            this.b.remove(obj);
            if (!remove) {
                String str = d;
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                sb.append("cancelDiscoveryRequest ignored requester ");
                sb.append(valueOf);
                zep.m(str, sb.toString());
            } else if (!this.i) {
            } else {
                if (this.a.isEmpty()) {
                    ((bhd) this.e.get()).r(this.k);
                    this.i = false;
                    this.j = false;
                } else if (this.j && this.b.isEmpty()) {
                    c(false);
                    this.j = false;
                }
            }
        }
    }

    public final void b(Object obj, boolean z) {
        ylr.c();
        if (!this.h) {
            bhd bhdVar = (bhd) this.e.get();
            bgk bgkVar = (bgk) this.g.get();
            if (bgkVar == null) {
                throw new IllegalArgumentException("providerInstance must not be null");
            }
            bhd.c();
            bhd.a().g(bgkVar);
            this.h = true;
        }
        synchronized (this.c) {
            if (this.a.add(obj)) {
                if (z) {
                    this.b.add(obj);
                }
                if (!this.i || (z && !this.j)) {
                    c(z);
                    this.i = true;
                    this.j = z;
                }
            }
        }
    }
}
