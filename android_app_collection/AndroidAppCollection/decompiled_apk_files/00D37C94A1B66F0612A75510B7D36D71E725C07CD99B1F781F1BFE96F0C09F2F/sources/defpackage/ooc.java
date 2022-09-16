package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ooc  reason: default package */
/* loaded from: classes3.dex */
public final class ooc implements ynl {
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public long g;
    private final yni h;
    private final Handler i;
    private final Runnable j = new Runnable() { // from class: oob
        @Override // java.lang.Runnable
        public final void run() {
            ooc.this.b();
        }
    };
    public final azpq a = azpq.e();

    public ooc(yni yniVar, Handler handler) {
        this.h = yniVar;
        this.i = handler;
    }

    public final void a() {
        this.h.g(this);
    }

    public final void b() {
        this.e = 0L;
        this.c = true;
        this.i.removeCallbacks(this.j);
    }

    public final void c(int i, TimeUnit timeUnit) {
        this.g = timeUnit.toMillis(i);
    }

    public final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c = true;
        this.i.removeCallbacks(this.j);
    }

    public final void e() {
        if (!this.b) {
            return;
        }
        this.b = false;
        this.i.postDelayed(this.j, this.f);
    }

    public final void g() {
        this.h.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhx ahhxVar = (ahhx) obj;
                if (!this.b) {
                    return null;
                }
                long c = ahhxVar.c();
                if (this.c) {
                    this.d = c;
                    this.c = false;
                    return null;
                }
                long j = this.e + (c - this.d);
                this.e = j;
                this.d = c;
                if (j < this.g) {
                    return null;
                }
                this.a.c(zhx.a);
                e();
                b();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhx.class};
    }
}
