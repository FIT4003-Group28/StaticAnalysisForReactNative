package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cwmo  reason: default package */
/* loaded from: classes5.dex */
final class cwmo {
    public final cwkn a;
    public final String b;
    public final int c;
    private final cwoi d;
    private final cwlw e;
    private final cwmv f;

    public cwmo(cwoi cwoiVar, cwlw cwlwVar, cwkn cwknVar, String str, int i) {
        this.d = cwoiVar;
        this.e = cwlwVar;
        this.a = cwknVar;
        this.b = str;
        this.c = i;
        this.f = new cwmv(cwoiVar);
    }

    public final dehn<Bitmap> a(final boolean z, String str, int i) {
        dehn<Bitmap> e;
        dehn<Bitmap> e2;
        if (z) {
            e = this.d.f(str, i);
            e2 = this.e.f(str, i);
        } else {
            e = this.d.e(str, i);
            e2 = this.e.e(str, i);
        }
        this.f.a(e, e2, new cwmu(this, z) { // from class: cwmn
            private final cwmo a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.cwmu
            public final void a(Object obj, Object obj2) {
                cwmo cwmoVar = this.a;
                boolean z2 = this.b;
                Bitmap bitmap = (Bitmap) obj2;
                cwmoVar.a.e.a().a(cwmr.a(cwmoVar.c), Boolean.valueOf((((Bitmap) obj) != null) == (bitmap != null)), cwmoVar.b, Boolean.valueOf(z2));
            }
        });
        return this.c == 2 ? e2 : e;
    }
}
