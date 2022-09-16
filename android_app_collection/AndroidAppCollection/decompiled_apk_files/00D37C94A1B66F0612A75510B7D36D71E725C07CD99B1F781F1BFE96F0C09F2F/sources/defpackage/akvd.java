package defpackage;

import j$.util.function.Consumer;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akvd  reason: default package */
/* loaded from: classes.dex */
public final class akvd {
    public final Runnable a;
    public final Runnable b;
    public final Consumer c;
    private final ankx d;
    private final int f;
    private final int g;
    private final int h;
    private int i = 0;
    private ankt j = ankq.a;
    private final ankb e = new akvb(this);

    public akvd(akvc akvcVar) {
        this.d = akvcVar.g;
        this.a = akvcVar.a;
        this.b = akvcVar.b;
        this.c = akvcVar.c;
        this.h = akvcVar.d;
        this.f = akvcVar.e;
        this.g = akvcVar.f;
    }

    public static final akvc a(ankx ankxVar, int i) {
        return new akvc(ankxVar, i);
    }

    public final synchronized boolean b(boolean z) {
        boolean z2;
        z2 = true;
        int i = this.i + 1;
        if (i > this.h) {
            z2 = false;
        }
        if (z) {
            this.i = i;
        }
        return z2;
    }

    public final synchronized boolean c() {
        return !this.j.isDone();
    }

    public final synchronized void d() {
        if (c()) {
            return;
        }
        if (!b(false)) {
            return;
        }
        ankv e = this.d.e(new Runnable() { // from class: akva
            @Override // java.lang.Runnable
            public final void run() {
                akvd akvdVar = akvd.this;
                if (!akvdVar.b(true)) {
                    akvdVar.e();
                } else {
                    akvdVar.a.run();
                }
            }
        }, this.f, this.g, TimeUnit.MILLISECONDS);
        this.j = e;
        anlz.A(e, this.e, this.d);
    }

    public final synchronized void e() {
        if (!c()) {
            return;
        }
        this.j.cancel(false);
    }
}
