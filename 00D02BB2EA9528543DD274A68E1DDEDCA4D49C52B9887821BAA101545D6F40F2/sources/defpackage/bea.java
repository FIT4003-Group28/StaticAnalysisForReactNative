package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bea  reason: default package */
/* loaded from: classes3.dex */
public final class bea implements bel, bct, bhp {
    public final Context a;
    public final int b;
    public final String c;
    public final bef d;
    public final bem e;
    public PowerManager.WakeLock f;
    public boolean g = false;
    private int i = 0;
    private final Object h = new Object();

    static {
        bbz.f("DelayMetCommandHandler");
    }

    public bea(Context context, int i, String str, bef befVar) {
        this.a = context;
        this.b = i;
        this.d = befVar;
        this.c = str;
        this.e = new bem(context, befVar.i, this);
    }

    private final void d() {
        synchronized (this.h) {
            this.e.b();
            this.d.b.a(this.c);
            PowerManager.WakeLock wakeLock = this.f;
            if (wakeLock != null && wakeLock.isHeld()) {
                bbz.e().a(new Throwable[0]);
                this.f.release();
            }
        }
    }

    @Override // defpackage.bel
    public final void Ni(List<String> list) {
        if (!list.contains(this.c)) {
            return;
        }
        synchronized (this.h) {
            if (this.i != 0) {
                bbz.e().a(new Throwable[0]);
            } else {
                this.i = 1;
                bbz.e().a(new Throwable[0]);
                if (this.d.c.b(this.c, null)) {
                    bhr bhrVar = this.d.b;
                    String str = this.c;
                    synchronized (bhrVar.d) {
                        bbz.e().a(new Throwable[0]);
                        bhrVar.a(str);
                        bhq bhqVar = new bhq(bhrVar, str);
                        bhrVar.b.put(str, bhqVar);
                        bhrVar.c.put(str, this);
                        bhrVar.a.schedule(bhqVar, 600000L, TimeUnit.MILLISECONDS);
                    }
                } else {
                    d();
                }
            }
        }
    }

    @Override // defpackage.bel
    public final void Nj(List<String> list) {
        b();
    }

    @Override // defpackage.bct
    public final void a(String str, boolean z) {
        bbz.e().a(new Throwable[0]);
        d();
        if (z) {
            Intent b = bdw.b(this.a, this.c);
            bef befVar = this.d;
            befVar.c(new bec(befVar, b, this.b));
        }
        if (this.g) {
            Intent e = bdw.e(this.a);
            bef befVar2 = this.d;
            befVar2.c(new bec(befVar2, e, this.b));
        }
    }

    public final void b() {
        synchronized (this.h) {
            if (this.i >= 2) {
                bbz.e().a(new Throwable[0]);
            } else {
                this.i = 2;
                bbz.e().a(new Throwable[0]);
                Intent d = bdw.d(this.a, this.c);
                bef befVar = this.d;
                befVar.c(new bec(befVar, d, this.b));
                if (this.d.c.c(this.c)) {
                    bbz.e().a(new Throwable[0]);
                    Intent b = bdw.b(this.a, this.c);
                    bef befVar2 = this.d;
                    befVar2.c(new bec(befVar2, b, this.b));
                } else {
                    bbz.e().a(new Throwable[0]);
                }
            }
        }
    }

    @Override // defpackage.bhp
    public final void c() {
        bbz.e().a(new Throwable[0]);
        b();
    }
}
