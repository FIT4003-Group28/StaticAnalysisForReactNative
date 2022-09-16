package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amde  reason: default package */
/* loaded from: classes.dex */
public final class amde implements amcf {
    static final String[] a = {"map_cache.db", "map_cache.db-shm", "map_cache.db-wal"};
    private static final long g = TimeUnit.DAYS.toMillis(10);
    public final Context b;
    public final amym c;
    public final dxio<ckcw> d;
    private final akrz h;
    private final cqat i;
    private final dehq j;
    private final File k;
    @dzsi
    private amda l;
    private final aluj p;
    private final aluh q;
    boolean e = false;
    private long m = 0;
    private long n = -1;
    private long o = -1;
    protected File f = null;

    public amde(Context context, aluj alujVar, akrz akrzVar, cqat cqatVar, amym amymVar, dxio dxioVar, dehq dehqVar, aluh aluhVar) {
        this.b = context;
        this.p = alujVar;
        this.h = akrzVar;
        this.i = cqatVar;
        this.c = amymVar;
        this.d = dxioVar;
        this.j = dehqVar;
        this.q = aluhVar;
        this.k = bvog.n(context, true, "testdata", true);
    }

    public static void k(File file, boolean z) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    file2.delete();
                }
            }
            if (!z) {
                return;
            }
            file.delete();
        }
    }

    private final synchronized void l(amda amdaVar) {
        try {
            int a2 = amdaVar.d.a();
            int a3 = this.p.a();
            if (a3 != 0) {
                if (a2 == 0) {
                    try {
                        amdaVar.a(a3);
                    } catch (IOException unused) {
                    }
                } else if (a3 != a2) {
                    ((ckco) this.d.a().a(ckev.p)).a(ckeu.a(3));
                    try {
                        amdaVar.d.o();
                        amdaVar.a(a3);
                    } catch (amcx e) {
                        amdaVar.o(e);
                        throw e;
                    }
                }
            }
        } catch (amcx e2) {
            try {
                amdaVar.o(e2);
                throw e2;
            } catch (amcx e3) {
                ((ckcn) this.d.a().a(ckev.j)).a();
                throw e3;
            }
        }
    }

    private final synchronized long m() {
        long j = this.o;
        long j2 = 0;
        if (j >= 0) {
            return j;
        }
        File h = h();
        while (h != null && !h.exists()) {
            h = h.getParentFile();
        }
        if (h != null) {
            j2 = h.getUsableSpace();
            this.o = j2;
        } else {
            this.o = 0L;
        }
        if (j2 < 524288) {
            ((ckco) this.d.a().a(ckev.C)).a(cker.a(1));
        }
        return this.o;
    }

    private final synchronized long n() {
        long j;
        long j2 = this.n;
        if (j2 >= 0) {
            return j2;
        }
        long m = m();
        File file = new File(h(), a[0]);
        if (file.exists()) {
            j = file.length() + m;
            this.n = j;
        } else {
            this.n = m;
            j = m;
        }
        if (m >= 524288) {
            if (j < this.p.b()) {
                ((ckco) this.d.a().a(ckev.C)).a(cker.a(2));
            } else {
                ((ckco) this.d.a().a(ckev.C)).a(cker.a(3));
            }
        }
        return this.n;
    }

    @Override // defpackage.amcf
    @dzsi
    public final synchronized amcg a(cqat cqatVar) {
        amda e = e();
        if (e != null) {
            return new amdf(e, cqatVar);
        }
        return null;
    }

    @Override // defpackage.amcf
    @dzsi
    public final synchronized amch b(cqat cqatVar, dwwg dwwgVar) {
        amda e = e();
        if (e != null) {
            return new amdg(e, cqatVar, dwwgVar);
        }
        return null;
    }

    @Override // defpackage.amcf
    @dzsi
    public final synchronized amci c(akrw akrwVar, alyl alylVar, amcj amcjVar) {
        if (n() < this.p.b()) {
            return null;
        }
        amda e = e();
        if (e == null) {
            return null;
        }
        return new amdh(this.h, e, akrwVar, alylVar, amcjVar, this.q, this.i, this.d.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(final amda amdaVar) {
        try {
            long e = this.i.e();
            ckcq a2 = ((ckcr) amdaVar.e.a(ckev.n)).a();
            try {
                int s = amdaVar.d.s();
                amdaVar.d.p();
                a2.b();
                long e2 = this.i.e() - e;
                synchronized (this) {
                    this.m += e2;
                }
                if (s > 0) {
                    this.j.execute(new Runnable(this, amdaVar) { // from class: amdb
                        private final amde a;
                        private final amda b;

                        {
                            this.a = this;
                            this.b = amdaVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.d(this.b);
                        }
                    });
                    return;
                }
                synchronized (this) {
                    ((ckcp) this.d.a().a(ckev.o)).a(this.m);
                    this.m = 0L;
                }
                amdaVar.b();
            } catch (amcx e3) {
                amdaVar.o(e3);
                throw e3;
            }
        } catch (IOException unused) {
            amdaVar.b();
        }
    }

    @dzsi
    final synchronized amda e() {
        boolean z;
        ckco ckcoVar = (ckco) this.d.a().a(ckev.D);
        if (m() < 524288) {
            ckcoVar.a(cket.a(2));
            return null;
        }
        if (!this.e) {
            this.e = true;
            File file = new File(this.b.getCacheDir(), "map_cache.canary");
            if (!file.exists()) {
                if (f()) {
                    ((ckco) this.d.a().a(ckev.p)).a(ckeu.a(2));
                }
                g();
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
            file.setLastModified(System.currentTimeMillis());
            boolean z2 = false;
            try {
                this.l = amda.p(h(), this.k, this.d.a(), this.j, this.i, this.p);
            } catch (amcx e) {
                int i = e.a;
                if (i != 5 && i != 6) {
                    if (f()) {
                        ((ckco) this.d.a().a(ckev.p)).a(ckeu.a(1));
                    }
                    z = true;
                }
                ckcoVar.a(cket.a(3));
            }
            z = false;
            amda amdaVar = this.l;
            if (amdaVar != null && !z) {
                try {
                    l(amdaVar);
                } catch (IOException unused2) {
                    ((ckco) this.d.a().a(ckev.p)).a(ckeu.a(4));
                    z2 = true;
                    z = true;
                }
                ckcoVar.a(cket.a(1));
            }
            if (z) {
                g();
                try {
                    amda p = amda.p(h(), this.k, this.d.a(), this.j, this.i, this.p);
                    this.l = p;
                    p.a(this.p.a());
                    if (!z2) {
                        ckcoVar.a(cket.a(4));
                    } else {
                        ckcoVar.a(cket.a(6));
                    }
                } catch (IOException unused3) {
                    ((ckcn) this.d.a().a(ckev.q)).a();
                    if (z2) {
                        ckcoVar.a(cket.a(7));
                    } else {
                        ckcoVar.a(cket.a(5));
                    }
                }
            }
            final amda amdaVar2 = this.l;
            if (amdaVar2 != null) {
                this.c.a(new Runnable(this, amdaVar2) { // from class: amdc
                    private final amde a;
                    private final amda b;

                    {
                        this.a = this;
                        this.b = amdaVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        File[] i2;
                        amde amdeVar = this.a;
                        amda amdaVar3 = this.b;
                        ((ckcp) amdeVar.d.a().a(ckev.r)).a(amdaVar3.l());
                        amdeVar.d(amdaVar3);
                        for (File file2 : amdeVar.i()) {
                            if (!file2.equals(amdeVar.h()) && file2.exists()) {
                                String[] strArr = amde.a;
                                int length = strArr.length;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    bvog.m(new File(file2, strArr[i3]));
                                }
                            }
                        }
                    }
                });
            }
        }
        return this.l;
    }

    final boolean f() {
        String[] strArr = a;
        int length = strArr.length;
        for (int i = 0; i < 3; i++) {
            if (new File(h(), strArr[i]).exists()) {
                return true;
            }
        }
        return new File(this.k, "map_cache.key").exists();
    }

    final void g() {
        String[] strArr = a;
        int length = strArr.length;
        for (int i = 0; i < 3; i++) {
            bvog.m(new File(h(), strArr[i]));
        }
        bvog.m(new File(this.k, "map_cache.key"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized File h() {
        File file = this.f;
        if (file != null) {
            return file;
        }
        File[] i = i();
        for (File file2 : i) {
            try {
                File file3 = new File(file2, "map_cache.db");
                if (file3.exists() && file3.length() > this.p.b() && System.currentTimeMillis() - file3.lastModified() < g) {
                    this.f = file2;
                    break;
                }
            } catch (SecurityException unused) {
            }
        }
        if (this.f == null) {
            for (File file4 : i) {
                File file5 = file4;
                while (file5 != null) {
                    try {
                        if (file5.exists()) {
                            break;
                        }
                        file5 = file5.getParentFile();
                    } catch (SecurityException unused2) {
                        continue;
                    }
                }
                if ((file5 == null || !file5.exists() || file5.getUsableSpace() >= this.p.b()) && (file4.exists() || file4.mkdirs())) {
                    this.f = file4;
                    break;
                }
            }
        }
        File file6 = this.f;
        if (file6 == null) {
            ((ckco) this.d.a().a(ckev.B)).a(ckes.a(1));
        } else if (file6.equals(i[i.length - 1])) {
            ((ckco) this.d.a().a(ckev.B)).a(ckes.a(2));
        } else {
            try {
                if (Environment.isExternalStorageEmulated(this.f)) {
                    ((ckco) this.d.a().a(ckev.B)).a(ckes.a(3));
                }
            } catch (IllegalArgumentException unused3) {
            }
            try {
                if (Environment.isExternalStorageRemovable(this.f)) {
                    ((ckco) this.d.a().a(ckev.B)).a(ckes.a(4));
                }
            } catch (IllegalArgumentException unused4) {
            }
            ((ckco) this.d.a().a(ckev.B)).a(ckes.a(5));
        }
        File file7 = this.f;
        if (file7 != null) {
            return file7;
        }
        File file8 = i[i.length - 1];
        this.f = file8;
        return file8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final File[] i() {
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList(3);
        try {
            for (File file : this.b.getExternalFilesDirs(null)) {
                if (file != null) {
                    arrayList.add(new File(new File(bvog.c(file), "cache"), "diskcache"));
                }
            }
        } catch (RuntimeException unused) {
        }
        arrayList.add(new File(this.b.getCacheDir(), "diskcache"));
        return (File[]) arrayList.toArray(new File[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File j(boolean z) {
        return bvog.n(this.b, z, "cache", true);
    }
}
