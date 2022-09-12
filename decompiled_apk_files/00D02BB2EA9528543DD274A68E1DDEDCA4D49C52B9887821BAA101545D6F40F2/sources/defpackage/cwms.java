package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cwms  reason: default package */
/* loaded from: classes5.dex */
public final class cwms implements cwlw {
    private final cwoi a;
    private final cwlw b;
    private final cwmq c;
    private final cwmo d;
    private final int e;

    public cwms(cwoi cwoiVar, cwlw cwlwVar, cwkn cwknVar, String str, int i) {
        this.a = cwoiVar;
        this.b = cwlwVar;
        this.e = i;
        this.c = new cwmq(cwoiVar, cwlwVar, cwknVar, str, i);
        this.d = new cwmo(cwoiVar, cwlwVar, cwknVar, str, i);
    }

    private final cwlw g() {
        return this.e == 2 ? this.b : this.a;
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> a() {
        return this.c.a(false);
    }

    @Override // defpackage.cwlw
    public final dehn<dcdc<cwls>> b() {
        return this.c.a(true);
    }

    @Override // defpackage.cwlw
    public final void c(cwgc cwgcVar) {
        g().c(cwgcVar);
    }

    @Override // defpackage.cwlw
    public final void d(cwgc cwgcVar) {
        g().d(cwgcVar);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> e(String str, int i) {
        return this.d.a(false, str, i);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> f(String str, int i) {
        return this.d.a(true, str, i);
    }
}
