package defpackage;

import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: wwz */
/* loaded from: classes4.dex */
public final class wwz {
    public final wwk a;
    public final yrj b;
    public final yve c;
    public final azqb d;
    public final zah e;
    public final aiji f;
    public final long g;
    public ankt h;
    public final aikh i;
    private final snc j;

    public wwz(wwy wwyVar) {
        this.a = wwyVar.a;
        snc sncVar = wwyVar.b;
        this.j = sncVar;
        this.b = wwyVar.c;
        yve yveVar = wwyVar.d;
        this.c = yveVar;
        this.d = wwyVar.e;
        this.e = wwyVar.f;
        this.i = wwyVar.h;
        this.f = wwyVar.g;
        this.g = sncVar.c();
        this.h = anii.h(yveVar.a(), new ampg() { // from class: wwx
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return Long.valueOf(Math.min(wwz.this.g, ((awte) obj).c));
            }
        }, anjk.a);
    }

    public static /* synthetic */ void c(Throwable th) {
        zep.d("Error while updating ads schema", th);
    }

    public final int a() {
        long b = b();
        if (b <= 0) {
            return 0;
        }
        double c = this.j.c() - b;
        Double.isNaN(c);
        long ceil = (long) Math.ceil(c / 1000.0d);
        if (ceil <= 2147483647L && ceil > 0) {
            return (int) ceil;
        }
        return 0;
    }

    public final long b() {
        try {
            return ((Long) this.h.get()).longValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this.g;
        } catch (ExecutionException e) {
            zep.n("Failed to read last ads timestamp.", e);
            return this.g;
        }
    }
}
