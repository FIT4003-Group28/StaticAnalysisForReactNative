package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
/* compiled from: PG */
/* renamed from: btnp  reason: default package */
/* loaded from: classes4.dex */
public final class btnp implements btnk {
    private static final long a = TimeUnit.DAYS.toMillis(12);
    private final dein<Lock> b = new deik();
    private final File c;
    private final cqat d;
    private final byu e;
    private final btmy f;
    private final long g;
    @dzsi
    private bsh h;

    public btnp(File file, cqat cqatVar, byu byuVar, btmy btmyVar, long j) {
        this.c = file;
        this.e = byuVar;
        this.f = btmyVar;
        this.d = cqatVar;
        this.g = j;
    }

    @dzsi
    public static btnp e(Context context, File file, cqat cqatVar) {
        if (file.exists() || file.mkdirs()) {
            dbsk.m(file.isDirectory(), "Glide disk cache directory is a file");
            return new btnp(file, cqatVar, new byu(), new btmy(context, new File(file, "expiry.journal"), cqatVar), a);
        }
        return null;
    }

    private final synchronized bsh f() {
        if (this.h == null) {
            this.h = bsh.i(this.c);
        }
        return this.h;
    }

    @Override // defpackage.bye
    @dzsi
    public final File a(btw btwVar) {
        String a2 = this.e.a(btwVar);
        Lock c = this.b.c(a2);
        try {
            c.lock();
            File file = null;
            if (!this.f.a(a2)) {
                return null;
            }
            try {
                bsg b = f().b(a2);
                if (b != null) {
                    file = b.a();
                }
            } catch (IOException unused) {
            }
            return file;
        } finally {
            c.unlock();
        }
    }

    @Override // defpackage.bye
    public final void b(btw btwVar, bvr bvrVar) {
        String a2 = this.e.a(btwVar);
        Lock c = this.b.c(a2);
        try {
            c.lock();
            this.f.b(a2, this.d.b() + this.g);
            bse g = f().g(a2);
            dbsk.s(g);
            try {
                if (bvrVar.a(g.d())) {
                    g.a();
                }
            } finally {
                g.c();
            }
        } catch (btmx | IOException unused) {
            d();
        } finally {
            c.unlock();
        }
    }

    @Override // defpackage.btnk
    public final synchronized void c() {
        for (String str : this.f.d()) {
            Lock c = this.b.c(str);
            try {
                c.lock();
                try {
                    this.f.g(str);
                    f().h(str);
                } catch (btmx unused) {
                    d();
                }
            } catch (IOException unused2) {
            } catch (Throwable th) {
                c.unlock();
                throw th;
            }
            c.unlock();
        }
    }

    public final synchronized void d() {
        int i = 0;
        for (int i2 = 0; i2 < this.b.b(); i2++) {
            try {
                this.b.a(i2).lock();
            } catch (IOException unused) {
                while (i < this.b.b()) {
                    this.b.a(i).unlock();
                    i++;
                }
            } catch (Throwable th) {
                while (i < this.b.b()) {
                    this.b.a(i).unlock();
                    i++;
                }
                throw th;
            }
        }
        f().f();
        this.f.e();
        this.h = null;
        while (i < this.b.b()) {
            this.b.a(i).unlock();
            i++;
        }
    }
}
