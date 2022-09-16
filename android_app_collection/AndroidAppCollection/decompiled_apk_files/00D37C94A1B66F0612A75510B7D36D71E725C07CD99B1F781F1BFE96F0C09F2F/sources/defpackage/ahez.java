package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: ahez  reason: default package */
/* loaded from: classes.dex */
public final class ahez {
    public final Context a;
    public final azqb b;
    public final aijf c;
    public final aipq d;
    public final aiix e;
    public zgz f;
    public final azqb g;
    public final aadd h;
    public final ahey i;
    public final ahex j;
    public final axnm k;
    public boolean l;
    public boolean m;
    public int n;
    public airm o;
    private final azqb p;
    private final aisx q;
    private final ainx r;
    private final ServiceConnection s = new ahew(this);

    public ahez(Context context, azqb azqbVar, aijf aijfVar, azqb azqbVar2, azqb azqbVar3, aipq aipqVar, ainx ainxVar, aisx aisxVar, aadd aaddVar, axnm axnmVar, aiix aiixVar) {
        context.getClass();
        this.a = context;
        azqbVar.getClass();
        this.b = azqbVar;
        aijfVar.getClass();
        this.c = aijfVar;
        this.p = azqbVar2;
        this.g = azqbVar3;
        aipqVar.getClass();
        this.d = aipqVar;
        this.q = aisxVar;
        this.h = aaddVar;
        this.r = ainxVar;
        this.k = axnmVar;
        this.e = aiixVar;
        this.i = new ahey(this);
        this.j = new ahex(this);
        this.n = 1;
        this.l = false;
    }

    private final PlayerResponseModel j() {
        ajah ajahVar = this.q.a;
        zgz zgzVar = this.f;
        if (zgzVar == null || zgzVar.a() == null || ajahVar == null) {
            return null;
        }
        return ajahVar.p();
    }

    private final void k() {
        if (this.d.c()) {
            ((ainw) this.k.get()).b(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aiqb, java.lang.Object] */
    private final void l() {
        this.n = 2;
        this.c.m(true);
        this.c.k();
        ?? a = this.f.a();
        if (a != 0) {
            a.c(true);
        }
    }

    private final boolean m() {
        return h() && this.c.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r0.ah() == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:36:0x00a9, B:37:0x00af, B:42:0x00ba, B:45:0x00c1, B:48:0x00ce, B:8:0x0016, B:10:0x001e, B:18:0x005c, B:20:0x0064, B:22:0x006c, B:24:0x007a, B:25:0x0080, B:34:0x009d, B:30:0x008e, B:33:0x0095, B:35:0x00a3, B:13:0x003a, B:16:0x0056, B:52:0x00dc, B:53:0x00e2), top: B:59:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.ahfh a() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahez.a():ahfh");
    }

    public final void b() {
        this.n = 1;
        k();
        airm airmVar = this.o;
        if (airmVar != null) {
            if (airmVar.b) {
                airmVar.c.t(airmVar.a);
            }
            airmVar.c.k = null;
        }
    }

    public final void c() {
        if (m()) {
            e();
            ((ainw) this.k.get()).h();
        }
    }

    public final synchronized void d(PlayerResponseModel playerResponseModel) {
        if (this.c.m) {
            return;
        }
        boolean c = aiqa.c(playerResponseModel);
        if (this.n == 3) {
            if (!c) {
                b();
            } else {
                l();
                return;
            }
        } else if (c) {
            return;
        }
        k();
    }

    public final void e() {
        if (this.l) {
            if (Build.VERSION.SDK_INT < 26 || !m() || !this.m || !this.c.j) {
                return;
            }
            this.a.startForegroundService((Intent) this.b.get());
            ((ainw) this.k.get()).i(true);
            return;
        }
        this.a.bindService((Intent) this.b.get(), this.s, 1);
        this.l = true;
    }

    public final void f() {
        if (this.n == 3) {
            zep.l("About to stop background service while in a pending state.");
        }
        this.n = 1;
        k();
        g();
        this.c.l();
        this.m = false;
    }

    public final void g() {
        if (!this.l) {
            return;
        }
        this.a.stopService((Intent) this.b.get());
        this.a.unbindService(this.s);
        this.l = false;
    }

    public final boolean h() {
        return this.d.c() && aiqa.c(j());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aiqb, java.lang.Object] */
    public final synchronized void i(afmu afmuVar, aijc aijcVar) {
        this.c.n(aijcVar);
        aijf aijfVar = this.c;
        aijfVar.j = false;
        this.n = 1;
        aijfVar.m(false);
        aijfVar.f = afmuVar;
        if (!aijfVar.l) {
            aijfVar.b.b.c(new aiij(afmuVar));
        }
        ?? a = this.f.a();
        if (a != 0) {
            a.c(false);
        }
        k();
    }
}
