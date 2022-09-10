package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ambe  reason: default package */
/* loaded from: classes.dex */
public final class ambe implements amay {
    private static final dcqe l = dcqe.c("ambe");
    private static final String m = ambe.class.getSimpleName();
    public final dxio<ckcw> a;
    public final dehq b;
    public final cqat c;
    public final dwwg h;
    protected final ambd j;
    public final amcr k;
    private final dxio<amfi> n;
    private final dxio<amfg> o;
    private final btnc<String, alxs> p;
    private final btnc<String, alwz> q;
    private alwn t;
    WeakReference<alvy> d = new WeakReference<>(null);
    WeakReference<alvy> e = new WeakReference<>(null);
    boolean f = false;
    boolean g = false;
    private final Object r = new Object();
    private final Object s = new Object();
    public final Set<String> i = new HashSet();

    public ambe(cqat cqatVar, dxio<amfi> dxioVar, dxio<amfg> dxioVar2, dxio<ckcw> dxioVar3, dehq dehqVar, btnc<String, alwz> btncVar, dxio<amcf> dxioVar4, dwwg dwwgVar, boolean z) {
        this.j = new ambd(this, dxioVar4);
        this.c = cqatVar;
        this.n = dxioVar;
        this.o = dxioVar2;
        this.a = dxioVar3;
        this.b = dehqVar;
        this.p = new btnc<>(dwwgVar.c);
        this.q = btncVar;
        this.h = dwwgVar;
        this.k = new amcr(dwwgVar);
        this.t = z ? alwn.ROADMAP_DARK : alwn.ROADMAP;
    }

    @dzsi
    private final alxs n(String str) {
        try {
            amch a = this.j.a();
            if (a != null) {
                return a.a(str);
            }
        } catch (IOException | OutOfMemoryError unused) {
        }
        return null;
    }

    @dzsi
    private final alwz o(String str) {
        try {
            amch a = this.j.a();
            if (a != null) {
                return a.d(str);
            }
        } catch (IOException | OutOfMemoryError unused) {
        }
        return null;
    }

    private final boolean p(@dzsi String str, int i, @dzsi alwn alwnVar) {
        return str != null && c(str, i, alwnVar);
    }

    @Override // defpackage.amay
    @dzsi
    public final alwz a(String str, int i) {
        if (str == null) {
            bvoo.h("url for epoch %s not available. Should check isCommonStyleDataAvailable method first.", Integer.valueOf(i));
            return null;
        }
        alwz a = this.q.a(str);
        if (a != null) {
            return a;
        }
        synchronized (this.s) {
            alwz a2 = this.q.a(str);
            if (a2 != null) {
                return a2;
            }
            alwz f = this.k.f(str);
            if (f != null) {
                synchronized (this.s) {
                    this.q.Pz(str, f);
                }
            }
            if (f == null) {
                try {
                    try {
                        amch a3 = this.j.a();
                        if (a3 != null) {
                            f = a3.d(str);
                        }
                    } catch (OutOfMemoryError unused) {
                        this.q.e();
                        f = o(str);
                    }
                } catch (IOException e) {
                    bvoo.j(e);
                }
            }
            if (f == null && this.o.a() != null) {
                try {
                    byte[] a4 = this.o.a().a(str);
                    if (a4.length != 0) {
                        f = alwz.a((dmnn) ((dssr) dmnn.c.cu(7)).h(new ByteArrayInputStream(a4)));
                    }
                } catch (IOException e2) {
                    bvoo.j(e2);
                }
            }
            if (f == null) {
                return null;
            }
            this.q.Pz(str, f);
            return f;
        }
    }

    @Override // defpackage.amay
    public final Iterable<alxs> b() {
        Collection<alxs> p;
        synchronized (this.r) {
            p = this.p.p();
        }
        return p;
    }

    @Override // defpackage.amay
    public final boolean c(String str, int i, @dzsi alwn alwnVar) {
        if (str == null) {
            return false;
        }
        if (this.p.n(str) != null || this.k.c(str)) {
            return true;
        }
        amch a = this.j.a();
        if (a != null && a.b(str)) {
            return true;
        }
        return this.o.a() != null && this.o.a().b(str, Integer.valueOf(i), alwnVar);
    }

    @Override // defpackage.amay
    public final boolean d(String str) {
        if (this.q.n(str) == null && !this.k.d(str)) {
            amch a = this.j.a();
            if (a != null && a.e(str)) {
                return true;
            }
            return this.o.a() != null && this.o.a().b(str, null, null);
        }
        return true;
    }

    @Override // defpackage.amay
    public final void e(int i) {
        this.k.a(i);
    }

    @Override // defpackage.amay
    public final synchronized void f(alwn alwnVar) {
        this.t = alwnVar;
    }

    @Override // defpackage.amay
    public final void g(ambk ambkVar, int i, alvy alvyVar) {
        this.e = new WeakReference<>(alvyVar);
        String str = ambkVar.b;
        ambw ambwVar = new ambw(3, i, str, null);
        if (str == null || !d(str)) {
            HashSet hashSet = new HashSet();
            hashSet.add(new ambw(3, i, str, null));
            m(hashSet, ambkVar);
            return;
        }
        l(ambwVar);
    }

    @Override // defpackage.amay
    @dzsi
    public final alxs h(String str, alwn alwnVar, dmwb dmwbVar) {
        alxs alxsVar;
        if (str == null) {
            bvoo.h("url for Legend config %s not available. Should check isTableAvailable method first.", alwnVar.y);
            return null;
        }
        alxs a = this.p.a(str);
        if (a != null) {
            return a;
        }
        synchronized (this.r) {
            alxs a2 = this.p.a(str);
            if (a2 != null) {
                return a2;
            }
            try {
                alxsVar = this.k.e(str);
                if (alxsVar != null) {
                    synchronized (this.r) {
                        this.p.Pz(str, alxsVar);
                    }
                }
            } catch (IOException e) {
                bvoo.h("Error parsing global style table - %s : %s", str, e);
                alxsVar = null;
            }
            if (alxsVar == null) {
                try {
                    amch a3 = this.j.a();
                    if (a3 != null) {
                        alxsVar = a3.a(str);
                    }
                } catch (IOException e2) {
                    bvoo.j(e2);
                    ((ckco) this.a.a().a(ckgh.aF)).a(1);
                } catch (OutOfMemoryError unused) {
                    this.p.e();
                    alxsVar = n(str);
                }
            }
            if (alxsVar == null) {
                try {
                    byte[] a4 = this.o.a().a(str);
                    if (a4.length != 0) {
                        alxsVar = alxz.g(a4, dmwbVar, this.h);
                    }
                } catch (IOException e3) {
                    bvoo.j(e3);
                    ((ckco) this.a.a().a(ckgh.aF)).a(3);
                }
            }
            if (alxsVar == null) {
                return null;
            }
            this.p.Pz(str, alxsVar);
            return alxsVar;
        }
    }

    @Override // defpackage.amay
    public final int i(ambk ambkVar, int i, dmwb dmwbVar, alvy alvyVar) {
        ambw ambwVar;
        this.d = new WeakReference<>(alvyVar);
        alwn j = j();
        String str = ambkVar.a.get(j);
        int i2 = 2;
        boolean z = true;
        if (!p(str, i, j) || str == null) {
            ambwVar = new ambw(1, i, "invalid", dmwbVar);
            z = false;
        } else {
            ambwVar = new ambw(2, i, str, dmwbVar);
        }
        if (!z) {
            i2 = this.f ? 3 : 4;
        }
        k(ambwVar, ambkVar);
        return i2;
    }

    protected final synchronized alwn j() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(ambw ambwVar, ambk ambkVar) {
        ambw ambwVar2;
        int i = ambwVar.b;
        dmwb dmwbVar = ambwVar.c;
        String str = ambwVar.a;
        alwn j = j();
        String str2 = ambkVar.a.get(j);
        alvy alvyVar = this.d.get();
        if (ambwVar.d != 1 && !str.equals("invalid") && str2 != null && str.equals(str2) && alvyVar != null) {
            alvyVar.a(i);
            this.f = true;
        }
        HashSet hashSet = new HashSet();
        if (dmwbVar == null) {
            return;
        }
        if (p(str2, i, j) || str2 == null) {
            Iterator<Map.Entry<alwn, String>> it = ambkVar.a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ambwVar2 = null;
                    break;
                }
                Map.Entry<alwn, String> next = it.next();
                if (next.getKey().B) {
                    String value = next.getValue();
                    if (!c(value, i, next.getKey())) {
                        ambwVar2 = new ambw(2, i, value, dmwbVar);
                        break;
                    }
                }
            }
            if (ambwVar2 != null) {
                hashSet.add(ambwVar2);
            }
        } else {
            hashSet.add(new ambw(2, i, str2, dmwbVar));
        }
        m(hashSet, ambkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(ambw ambwVar) {
        int i = ambwVar.b;
        alvy alvyVar = this.e.get();
        if (alvyVar != null) {
            alvyVar.a(i);
            this.g = true;
        }
    }

    protected final void m(Set<ambw> set, ambk ambkVar) {
        if (set.isEmpty()) {
            return;
        }
        final HashSet<amfu> hashSet = new HashSet();
        synchronized (this.i) {
            for (ambw ambwVar : set) {
                if (this.i.add(ambwVar.a)) {
                    String str = ambwVar.a;
                    amfu b = this.n.a().b(str, null, new ambb(this, str, ambwVar, ambkVar), true);
                    ((ckcn) this.a.a().a(ckgh.aB)).a();
                    hashSet.add(b);
                }
            }
        }
        for (amfu amfuVar : hashSet) {
            if (!amfuVar.a()) {
                ((ckcn) this.a.a().a(ckgh.aA)).a();
                ambc ambcVar = new ambc(this, hashSet);
                for (amfu amfuVar2 : hashSet) {
                    amfuVar2.n(ambcVar);
                }
                bvqd.a(this.b.d(new Runnable(this, hashSet) { // from class: amba
                    private final ambe a;
                    private final Set b;

                    {
                        this.a = this;
                        this.b = hashSet;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ambe ambeVar = this.a;
                        for (amfu amfuVar3 : this.b) {
                            if (!amfuVar3.a()) {
                                ((ckcp) ambeVar.a.a().a(ckgh.aD)).a(60000L);
                                return;
                            }
                        }
                    }
                }, 60L, TimeUnit.SECONDS), this.b);
                return;
            }
        }
    }
}
