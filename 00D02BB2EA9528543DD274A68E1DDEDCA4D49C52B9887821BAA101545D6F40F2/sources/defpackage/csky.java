package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: csky  reason: default package */
/* loaded from: classes5.dex */
public final class csky {
    public final CopyOnWriteArrayList<cskv> a;
    public long d;
    public boolean e;
    private boolean f;
    private final cskz h = new cskw(this);
    private final cskr g = new cskx(this);
    public final aim<cskv, Boolean> b = new aim<>(1);
    public int c = 1;

    public csky(cskv... cskvVarArr) {
        this.a = new CopyOnWriteArrayList<>(cskvVarArr);
        for (int i = 0; i <= 0; i++) {
            cskvVarArr[i].e(this.h);
            this.b.put(cskvVarArr[i], true);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.d = -1L;
        c();
    }

    public final void b() {
        if (this.f) {
            if (this.e) {
                this.e = false;
                cskt.c().b(this.g);
            }
            this.f = false;
        }
    }

    public final void c() {
        if (this.e || !this.f || this.c == 0) {
            return;
        }
        this.e = true;
        cskt.c().a(this.g);
    }
}
