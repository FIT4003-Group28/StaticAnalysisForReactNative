package defpackage;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwoz  reason: default package */
/* loaded from: classes5.dex */
public final class cwoz {
    public final cwkn a;
    public final cwlt b;
    public final String c;
    public final cqat d;
    private final cwlw e;

    public cwoz(cwlw cwlwVar, cwlt cwltVar, cwkn cwknVar, String str, cqat cqatVar) {
        this.e = cwlwVar;
        this.a = cwknVar;
        this.b = cwltVar;
        this.c = str;
        this.d = cqatVar;
    }

    public final dehn<Bitmap> a(boolean z, String str, int i) {
        dehn<Bitmap> e;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            e = this.e.f(str, i);
        } else {
            e = this.e.e(str, i);
        }
        dbae.c(e, new cwoy(this, i, z, currentTimeMillis), dege.a);
        return e;
    }
}
