package defpackage;

import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: pdx  reason: default package */
/* loaded from: classes4.dex */
public final class pdx implements pde {
    private static final HashSet e = new HashSet();
    public final File a;
    public final pdi b;
    public final pdn c;
    public pdc d;
    private final HashMap f;
    private final Random g;
    private final boolean h;
    private long i;
    private boolean j;

    public pdx(File file, pdi pdiVar, byte[] bArr, boolean z) {
        pdn pdnVar = new pdn(file, bArr, z);
        if (v(file)) {
            this.a = file;
            this.b = pdiVar;
            this.c = pdnVar;
            this.f = new HashMap();
            this.g = new Random();
            this.h = pdiVar.g();
            ConditionVariable conditionVariable = new ConditionVariable();
            new pdw(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private final void r(pdy pdyVar) {
        this.c.b(pdyVar.a).c.add(pdyVar);
        this.i += pdyVar.c;
        ArrayList arrayList = (ArrayList) this.f.get(pdyVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((pdd) arrayList.get(size)).a(this, pdyVar);
            }
        }
        this.b.a(this, pdyVar);
    }

    private final void s(pdj pdjVar) {
        pdk a = this.c.a(pdjVar.a);
        if (a == null || !a.c.remove(pdjVar)) {
            return;
        }
        pdjVar.e.delete();
        this.i -= pdjVar.c;
        this.c.c(a.b);
        ArrayList arrayList = (ArrayList) this.f.get(pdjVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((pdd) arrayList.get(size)).c(pdjVar);
            }
        }
        this.b.c(pdjVar);
    }

    private final void t() {
        ArrayList arrayList = new ArrayList();
        for (pdk pdkVar : this.c.a.values()) {
            Iterator it = pdkVar.c.iterator();
            while (it.hasNext()) {
                pdj pdjVar = (pdj) it.next();
                if (pdjVar.e.length() != pdjVar.c) {
                    arrayList.add(pdjVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            s((pdj) arrayList.get(i));
        }
    }

    private static synchronized void u(File file) {
        synchronized (pdx.class) {
            e.remove(file.getAbsoluteFile());
        }
    }

    private static synchronized boolean v(File file) {
        boolean add;
        synchronized (pdx.class) {
            add = e.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // defpackage.pde
    public final synchronized long a() {
        if (this.j) {
            return 0L;
        }
        return this.i;
    }

    @Override // defpackage.pde
    public final synchronized pdp d(String str) {
        if (this.j) {
            return pdr.a;
        }
        pdk a = this.c.a(str);
        return a != null ? a.d : pdr.a;
    }

    @Override // defpackage.pde
    public final synchronized File e(String str, long j, long j2) {
        if (this.j) {
            return null;
        }
        p();
        pdk a = this.c.a(str);
        ptx.a(a);
        ptx.e(a.e);
        if (!this.a.exists()) {
            this.a.mkdirs();
            t();
        }
        this.b.h(this, j2);
        File file = new File(this.a, Integer.toString(this.g.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return pdy.e(file, a.a, j, System.currentTimeMillis());
    }

    @Override // defpackage.pde
    public final synchronized NavigableSet f(String str) {
        TreeSet treeSet;
        if (this.j) {
            return new TreeSet();
        }
        pdk a = this.c.a(str);
        if (a != null && !a.b()) {
            treeSet = new TreeSet((Collection) a.c);
            return treeSet;
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    @Override // defpackage.pde
    public final synchronized Set g() {
        if (this.j) {
            return new HashSet();
        }
        return new HashSet(this.c.a.keySet());
    }

    @Override // defpackage.pde
    public final synchronized void h(String str, pdq pdqVar) {
        if (this.j) {
            return;
        }
        p();
        pdn pdnVar = this.c;
        pdk b = pdnVar.b(str);
        pdr pdrVar = b.d;
        b.d = pdrVar.a(pdqVar);
        if (!b.d.equals(pdrVar)) {
            pdnVar.c.c();
        }
        try {
            this.c.d();
        } catch (IOException e2) {
            throw new pdc(e2);
        }
    }

    @Override // defpackage.pde
    public final synchronized void i(File file, long j) {
        if (this.j) {
            return;
        }
        if (!file.exists()) {
            return;
        }
        if (j == 0) {
            file.delete();
            return;
        }
        pdy f = pdy.f(file, j, this.c);
        ptx.a(f);
        pdk a = this.c.a(f.a);
        ptx.a(a);
        ptx.e(a.e);
        long a2 = pdo.a(a.d);
        if (a2 != -1) {
            ptx.e(f.b + f.c <= a2);
        }
        r(f);
        try {
            this.c.d();
            notifyAll();
        } catch (IOException e2) {
            throw new pdc(e2);
        }
    }

    @Override // defpackage.pde
    public final synchronized void j() {
        if (this.j) {
            return;
        }
        this.f.clear();
        t();
        try {
            this.c.d();
            u(this.a);
            this.j = true;
        } catch (IOException e2) {
            pns.e("SimpleCache", "Storing index file failed", e2);
            u(this.a);
            this.j = true;
        }
    }

    @Override // defpackage.pde
    public final synchronized void k(pdj pdjVar) {
        if (this.j) {
            return;
        }
        pdk a = this.c.a(pdjVar.a);
        ptx.a(a);
        ptx.e(a.e);
        a.e = false;
        this.c.c(a.b);
        notifyAll();
    }

    @Override // defpackage.pde
    public final synchronized void l(pdj pdjVar) {
        if (this.j) {
            return;
        }
        s(pdjVar);
    }

    @Override // defpackage.pde
    public final synchronized boolean m(String str, long j, long j2) {
        long min;
        if (this.j) {
            return false;
        }
        pdk a = this.c.a(str);
        if (a != null) {
            pdy a2 = a.a(j);
            if (a2.b()) {
                min = -Math.min(a2.c() ? Long.MAX_VALUE : a2.c, j2);
            } else {
                long j3 = j + j2;
                long j4 = a2.b + a2.c;
                if (j4 < j3) {
                    for (pdy pdyVar : a.c.tailSet(a2, false)) {
                        long j5 = pdyVar.b;
                        if (j5 > j4) {
                            break;
                        }
                        j4 = Math.max(j4, j5 + pdyVar.c);
                        if (j4 >= j3) {
                            break;
                        }
                    }
                }
                min = Math.min(j4 - j, j2);
            }
            if (min >= j2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pde
    /* renamed from: n */
    public final synchronized pdy b(String str, long j) {
        if (this.j) {
            return null;
        }
        p();
        while (true) {
            pdy c = c(str, j);
            if (c != null) {
                return c;
            }
            wait();
        }
    }

    @Override // defpackage.pde
    /* renamed from: o */
    public final synchronized pdy c(String str, long j) {
        pdy d;
        File file;
        if (this.j) {
            return null;
        }
        p();
        pdk a = this.c.a(str);
        if (a != null) {
            while (true) {
                d = a.a(j);
                if (!d.d || d.e.length() == d.c) {
                    break;
                }
                t();
            }
        } else {
            d = pdy.d(str, j);
        }
        if (!d.d) {
            pdk b = this.c.b(str);
            if (b.e) {
                return null;
            }
            b.e = true;
            return d;
        }
        if (this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            pdk a2 = this.c.a(str);
            ptx.e(a2.c.remove(d));
            File file2 = d.e;
            File e2 = pdy.e(file2.getParentFile(), a2.a, d.b, currentTimeMillis);
            if (file2.renameTo(e2)) {
                file = e2;
            } else {
                String valueOf = String.valueOf(file2);
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
                sb.append("Failed to rename ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
                Log.w("CachedContent", sb.toString());
                file = file2;
            }
            ptx.e(d.d);
            pdy pdyVar = new pdy(d.a, d.b, d.c, currentTimeMillis, file);
            a2.c.add(pdyVar);
            ArrayList arrayList = (ArrayList) this.f.get(d.a);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((pdd) arrayList.get(size)).b(this, d, pdyVar);
                }
            }
            this.b.b(this, d, pdyVar);
            d = pdyVar;
        }
        return d;
    }

    public final synchronized void p() {
        pdc pdcVar = this.d;
        if (pdcVar != null) {
            throw pdcVar;
        }
    }

    public final void q(File file, boolean z, File[] fileArr) {
        if (fileArr == null || (r0 = fileArr.length) == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z) {
                if (name.indexOf(46) != -1) {
                    if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                } else {
                    q(file2, false, file2.listFiles());
                }
            }
            pdy f = pdy.f(file2, -1L, this.c);
            if (f != null) {
                r(f);
            } else {
                file2.delete();
            }
        }
    }
}
