package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: dld  reason: default package */
/* loaded from: classes6.dex */
public final class dld {
    public static final dbsl<dmpn> a = dky.a;
    @dzsi
    public alrh A;
    public final fd b;
    public final czh c;
    public final akox d;
    public final czt e;
    public final cqat f;
    public final ScheduledExecutorService g;
    public final dhlx h;
    public final deia i;
    public final boolean j;
    public final Object k;
    @dzsi
    public Bitmap l;
    @dzsi
    public ByteBuffer m;
    @dzsi
    public czv n;
    @dzsi
    public akqq o;
    @dzsi
    public dah p;
    @dzsi
    public dae q;
    @dzsi
    public akqq r;
    public float s;
    @dzsi
    public volatile ScheduledFuture<?> t;
    public final aa<dad> u;
    public boolean v;
    public boolean w;
    public boolean x;
    public float y;
    public float z;

    public dld(akox akoxVar, cqat cqatVar, dehq dehqVar, fd fdVar, czt cztVar, czh czhVar, dhlx dhlxVar, boolean z) {
        deia a2 = deia.a(dhlxVar.c);
        this.k = new Object();
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.A = null;
        this.r = null;
        this.s = 0.0f;
        this.t = null;
        this.u = new dkz(this);
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0.0f;
        this.z = 0.0f;
        this.b = fdVar;
        this.d = akoxVar;
        this.e = cztVar;
        this.c = czhVar;
        this.f = cqatVar;
        this.g = dehqVar;
        this.h = dhlxVar;
        this.j = z;
        this.i = a2;
    }

    public final void a() {
        synchronized (this.k) {
            if (this.t != null) {
                this.t.cancel(false);
                this.t = null;
            }
        }
    }

    public final void b(float f) {
        if (this.q == null) {
            c();
            return;
        }
        a();
        this.d.aj().ah().b(new dlb(this, f, this.d.ak(), this.d.l().p().i));
    }

    public final void c() {
        this.o = null;
        a();
    }

    protected final void finalize() {
        dbsk.l(!this.v);
    }
}
