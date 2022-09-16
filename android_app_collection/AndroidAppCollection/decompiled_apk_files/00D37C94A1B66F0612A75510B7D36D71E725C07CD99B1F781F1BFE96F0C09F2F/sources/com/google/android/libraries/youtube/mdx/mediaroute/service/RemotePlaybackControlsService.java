package com.google.android.libraries.youtube.mdx.mediaroute.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemotePlaybackControlsService extends adhk implements ynl {
    public yni a;
    public airw c;
    public ainw d;
    public ainw e;
    public ainz f;
    public adhl g;
    public ainq h;
    public azqb i;
    public azqb j;
    public aczr k;
    public ainx l;
    public boolean m;
    public adhl n;
    final adhq b = new adhq(this);
    private final aypf o = new aypf();
    private final adnz p = new adhm(this);
    private final adhn q = new adhn(this);
    private final adho r = new adho(this);

    static {
        zep.a("MDX.RemoteService");
    }

    public final void b() {
        this.l.c();
        if (!this.m || !this.k.f) {
            this.e.b(false);
            this.d.h();
            return;
        }
        this.d.b(false);
        this.e.h();
    }

    public final void c() {
        boolean m = ((adoa) this.j.get()).m();
        adgn adgnVar = ((adgc) this.i.get()).e;
        if (m) {
            this.m = false;
            b();
        } else if (adgnVar == null) {
        } else {
            this.d.a = getString(R.string.now_playing_on_screen, new Object[]{alj.a().b(adgnVar.a)});
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = true;
        if (i != -1) {
            if (i == 0) {
                wxr wxrVar = (wxr) obj;
                if (((adoa) this.j.get()).e() == null) {
                    this.m = false;
                    return null;
                }
                if (!wxrVar.a().a() || Build.VERSION.SDK_INT <= 23) {
                    z = false;
                }
                this.m = z;
                b();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{wxr.class};
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c();
        return new Binder();
    }

    @Override // defpackage.adhk, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ainw ainwVar = this.d;
        ainwVar.d = this.r;
        ainwVar.g(this.f, this.g);
        this.d.c = this.q;
        this.e.g(this.f, this.n);
        this.h.f(this);
        this.o.g(this.b.g(this.c));
        this.a.g(this);
        ((adoa) this.j.get()).h(this.p);
        ((adgc) this.i.get()).N();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.m = false;
        this.d.c = null;
        ((adgc) this.i.get()).O();
        this.d.b(true);
        this.e.b(true);
        this.h.f(null);
        this.o.c();
        this.a.m(this);
        ((adoa) this.j.get()).j(this.p);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
