package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cwox  reason: default package */
/* loaded from: classes5.dex */
public final class cwox implements cwlw {
    private final cwlw a;
    private final cwoz b;
    private final cwpb c;

    public cwox(cwlw cwlwVar, cwlt cwltVar, cwkn cwknVar, String str, cqat cqatVar) {
        this.a = cwlwVar;
        this.c = new cwpb(cwlwVar, cwltVar, cwknVar, str, cqatVar);
        this.b = new cwoz(cwlwVar, cwltVar, cwknVar, str, cqatVar);
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
        this.a.c(cwgcVar);
    }

    @Override // defpackage.cwlw
    public final void d(cwgc cwgcVar) {
        this.a.d(cwgcVar);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> e(String str, int i) {
        return this.b.a(false, str, i);
    }

    @Override // defpackage.cwlw
    public final dehn<Bitmap> f(String str, int i) {
        return this.b.a(true, str, i);
    }
}
