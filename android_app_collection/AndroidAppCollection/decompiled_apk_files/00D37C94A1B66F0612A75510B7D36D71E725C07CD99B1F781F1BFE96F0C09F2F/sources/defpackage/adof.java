package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: adof  reason: default package */
/* loaded from: classes.dex */
public final class adof implements ynl {
    public static final String a = zep.a("MDX.remote");
    public final azqb b;
    public final adhf c;
    private final snc e;
    public int d = 0;
    private long g = 0;
    private final Handler f = new adoe(this);

    public adof(azqb azqbVar, adhf adhfVar, snc sncVar) {
        this.b = azqbVar;
        this.c = adhfVar;
        this.e = sncVar;
    }

    public final void a(int i) {
        adnt e = ((adoa) this.b.get()).e();
        if (e != null) {
            e.V(i);
            this.g = this.e.d();
        }
    }

    public final void b(int i) {
        if (!e()) {
            zep.c(a, "Remote control is not connected, cannot change volume");
            return;
        }
        this.f.removeMessages(1);
        long d = this.e.d() - this.g;
        if (d >= 200) {
            a(i);
            return;
        }
        Handler handler = this.f;
        handler.sendMessageDelayed(Message.obtain(handler, 1, i, 0), 200 - d);
    }

    public final void c() {
        adnt e = ((adoa) this.b.get()).e();
        if (this.d == 0 || e == null) {
            return;
        }
        adnt e2 = ((adoa) this.b.get()).e();
        e.Y(Math.min(100, Math.max(0, (e2 == null ? 0 : e2.b()) + this.d)), this.d);
        this.g = this.e.d();
        this.d = 0;
    }

    public final void d(int i) {
        if (!e()) {
            zep.c(a, "Remote control is not connected, cannot change volume");
            return;
        }
        this.f.removeMessages(0);
        this.d += i;
        long d = this.e.d() - this.g;
        if (d >= 200) {
            c();
            return;
        }
        Handler handler = this.f;
        handler.sendMessageDelayed(Message.obtain(handler, 0), 200 - d);
    }

    public final boolean e() {
        adnt e = ((adoa) this.b.get()).e();
        return e != null && e.a() == 1;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                adoo adooVar = (adoo) obj;
                this.d = 0;
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adoo.class};
    }
}
