package defpackage;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
/* compiled from: PG */
/* renamed from: cmml  reason: default package */
/* loaded from: classes5.dex */
public final class cmml implements cmls {
    private static final HashSet<File> e = new HashSet<>();
    public final File a;
    public final cmmd b;
    public cmlr c;
    public final cmmj d;
    private final HashMap<String, ArrayList<cmmj>> f;
    private final Random g;
    private long h;
    private boolean i;

    @Deprecated
    public cmml(File file, cmmj cmmjVar) {
        cmmd cmmdVar = new cmmd(file);
        if (n(file)) {
            this.a = file;
            this.d = cmmjVar;
            this.b = cmmdVar;
            this.f = new HashMap<>();
            this.g = new Random();
            ConditionVariable conditionVariable = new ConditionVariable();
            new cmmk(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        String valueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Another SimpleCache instance uses the folder: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private final void k(cmmm cmmmVar) {
        this.b.b(cmmmVar.a).c.add(cmmmVar);
        this.h += cmmmVar.c;
        ArrayList<cmmj> arrayList = this.f.get(cmmmVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.get(size).a(this, cmmmVar);
            }
        }
        this.d.a(this, cmmmVar);
    }

    private final void l(cmly cmlyVar) {
        cmma c = this.b.c(cmlyVar.a);
        if (c == null || !c.c.remove(cmlyVar)) {
            return;
        }
        File file = cmlyVar.e;
        if (file != null) {
            file.delete();
        }
        this.h -= cmlyVar.c;
        this.b.d(c.b);
        ArrayList<cmmj> arrayList = this.f.get(cmlyVar.a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                arrayList.get(size).d(cmlyVar);
            }
        }
        this.d.d(cmlyVar);
    }

    private final void m() {
        ArrayList arrayList = new ArrayList();
        for (cmma cmmaVar : Collections.unmodifiableCollection(this.b.a.values())) {
            Iterator<cmmm> it = cmmaVar.c.iterator();
            while (it.hasNext()) {
                cmmm next = it.next();
                if (next.e.length() != next.c) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            l((cmly) arrayList.get(i));
        }
    }

    private static synchronized boolean n(File file) {
        boolean add;
        synchronized (cmml.class) {
            add = e.add(file.getAbsoluteFile());
        }
        return add;
    }

    private static synchronized void o(File file) {
        synchronized (cmml.class) {
            e.remove(file.getAbsoluteFile());
        }
    }

    @Override // defpackage.cmls
    public final synchronized cmly a(String str, long j, long j2) {
        cmmm d;
        long j3;
        cmmn.c(!this.i);
        h();
        cmma c = this.b.c(str);
        if (c != null) {
            while (true) {
                cmmm cmmmVar = new cmmm(c.b, j, -1L, -9223372036854775807L, null);
                d = c.c.floor(cmmmVar);
                if (d == null || d.b + d.c <= j) {
                    cmmm ceiling = c.c.ceiling(cmmmVar);
                    if (ceiling != null) {
                        j3 = ceiling.b - j;
                        if (j2 != -1) {
                            j3 = Math.min(j3, j2);
                        }
                    } else {
                        j3 = j2;
                    }
                    d = cmmm.d(c.b, j, j3);
                }
                if (!d.d || d.e.length() == d.c) {
                    break;
                }
                m();
            }
        } else {
            d = cmmm.d(str, j, j2);
        }
        if (d.d) {
            File file = d.e;
            cmmn.f(file);
            file.getName();
            long currentTimeMillis = System.currentTimeMillis();
            cmma c2 = this.b.c(str);
            cmmn.c(c2.c.remove(d));
            File file2 = d.e;
            cmmn.f(file2);
            File parentFile = file2.getParentFile();
            cmmn.f(parentFile);
            File c3 = cmmm.c(parentFile, c2.a, d.b, currentTimeMillis);
            if (file2.renameTo(c3)) {
                file2 = c3;
            } else {
                String valueOf = String.valueOf(file2);
                String valueOf2 = String.valueOf(c3);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
                sb.append("Failed to rename ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
                sb.toString();
            }
            cmmn.c(d.d);
            cmmm cmmmVar2 = new cmmm(d.a, d.b, d.c, currentTimeMillis, file2);
            c2.c.add(cmmmVar2);
            ArrayList<cmmj> arrayList = this.f.get(d.a);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    arrayList.get(size).b(this, d, cmmmVar2);
                }
            }
            this.d.b(this, d, cmmmVar2);
            return cmmmVar2;
        }
        cmma b = this.b.b(str);
        long j4 = d.c;
        for (int i = 0; i < b.d.size(); i++) {
            cmlz cmlzVar = b.d.get(i);
            long j5 = cmlzVar.a;
            if (j5 > j) {
                if (j4 != -1 && j + j4 <= j5) {
                }
                return null;
            }
            long j6 = cmlzVar.b;
            if (j6 != -1 && j5 + j6 <= j) {
            }
            return null;
        }
        b.d.add(new cmlz(j, j4));
        return d;
    }

    @Override // defpackage.cmls
    public final synchronized File b(String str, long j, long j2) {
        cmma c;
        File file;
        cmmn.c(!this.i);
        h();
        c = this.b.c(str);
        cmmn.f(c);
        cmmn.c(c.a(j, j2));
        if (!this.a.exists()) {
            this.a.mkdirs();
            m();
        }
        cmmj cmmjVar = this.d;
        if (j2 != -1) {
            cmmjVar.c(this, j2);
        }
        file = new File(this.a, Integer.toString(this.g.nextInt(10)));
        if (!file.exists()) {
            file.mkdir();
        }
        return cmmm.c(file, c.a, j, System.currentTimeMillis());
    }

    @Override // defpackage.cmls
    public final synchronized void c(File file, long j) {
        boolean z = true;
        cmmn.c(!this.i);
        if (!file.exists()) {
            return;
        }
        if (j == 0) {
            file.delete();
            return;
        }
        cmmm e2 = cmmm.e(file, j, -9223372036854775807L, this.b);
        cmmn.f(e2);
        cmma c = this.b.c(e2.a);
        cmmn.f(c);
        cmmn.c(c.a(e2.b, e2.c));
        long a = cmme.a(c.e);
        if (a != -1) {
            if (e2.b + e2.c > a) {
                z = false;
            }
            cmmn.c(z);
        }
        k(e2);
        try {
            this.b.a();
            notifyAll();
        } catch (IOException e3) {
            throw new cmlr(e3);
        }
    }

    @Override // defpackage.cmls
    public final synchronized void d(cmly cmlyVar) {
        cmmn.c(!this.i);
        cmma c = this.b.c(cmlyVar.a);
        cmmn.f(c);
        long j = cmlyVar.b;
        for (int i = 0; i < c.d.size(); i++) {
            if (c.d.get(i).a == j) {
                c.d.remove(i);
                this.b.d(c.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.cmls
    public final synchronized void e(cmly cmlyVar) {
        cmmn.c(!this.i);
        l(cmlyVar);
    }

    @Override // defpackage.cmls
    public final synchronized void f(String str, cmmg cmmgVar) {
        cmmn.c(!this.i);
        h();
        cmmd cmmdVar = this.b;
        cmma b = cmmdVar.b(str);
        cmmh cmmhVar = b.e;
        b.e = cmmhVar.c(cmmgVar);
        if (!b.e.equals(cmmhVar)) {
            cmmdVar.c.b();
        }
        try {
            this.b.a();
        } catch (IOException e2) {
            throw new cmlr(e2);
        }
    }

    @Override // defpackage.cmls
    public final synchronized cmmf g(String str) {
        cmma c;
        cmmn.c(!this.i);
        c = this.b.c(str);
        return c != null ? c.e : cmmh.a;
    }

    public final synchronized void h() {
        cmlr cmlrVar = this.c;
        if (cmlrVar != null) {
            throw cmlrVar;
        }
    }

    public final synchronized void i() {
        if (this.i) {
            return;
        }
        this.f.clear();
        m();
        try {
            this.b.a();
            o(this.a);
            this.i = true;
        } catch (IOException e2) {
            cmna.a("Storing index file failed", e2);
            o(this.a);
            this.i = true;
        }
    }

    public final void j(File file, boolean z, File[] fileArr) {
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
                if (name.indexOf(46) == -1) {
                    j(file2, false, file2.listFiles());
                } else if (!name.startsWith("cached_content_index.exi")) {
                    if (name.endsWith(".uid")) {
                    }
                }
            }
            cmmm e2 = cmmm.e(file2, -1L, -9223372036854775807L, this.b);
            if (e2 != null) {
                k(e2);
            } else {
                file2.delete();
            }
        }
    }
}
