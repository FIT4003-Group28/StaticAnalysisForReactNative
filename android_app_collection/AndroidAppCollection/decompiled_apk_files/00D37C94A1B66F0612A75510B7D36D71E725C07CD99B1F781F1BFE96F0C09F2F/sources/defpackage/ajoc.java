package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ajoc  reason: default package */
/* loaded from: classes.dex */
final class ajoc implements ctl {
    private final apfc a;
    private final azqb b;
    private final boolean c;

    public ajoc(apfc apfcVar, azqb azqbVar, boolean z) {
        this.a = apfcVar;
        this.b = azqbVar;
        this.c = z;
    }

    @Override // defpackage.ctl
    public final boolean jY(final ckq ckqVar, Object obj, ctz ctzVar, final boolean z) {
        if (this.c) {
            ((akvm) this.b.get()).b("GLIDE", "UNKNOWN", true);
        }
        if (!this.a.h || !(obj instanceof avhn)) {
            return false;
        }
        final avhn avhnVar = (avhn) obj;
        ctzVar.d(new cty() { // from class: ajob
            @Override // defpackage.cty
            public final void g(int i, int i2) {
                Uri t;
                ckq ckqVar2 = ckq.this;
                boolean z2 = z;
                avhn avhnVar2 = avhnVar;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
                    t = akel.t(avhnVar2);
                    if (t != null) {
                        t = t.buildUpon().appendQueryParameter("TargetSizeOriginal", "True").build();
                    }
                } else {
                    t = akel.r(avhnVar2, i, i2);
                }
                ajmz ajmzVar = new ajmz(ckqVar2, t != null ? t.buildUpon().appendQueryParameter("isFirstResource", String.valueOf(z2)).build() : null, "Glide");
                if (ckqVar2 != null) {
                    ckqVar2.a();
                    for (Throwable th : ckqVar2.a()) {
                    }
                }
                ajna.a(ajmzVar);
            }
        });
        return false;
    }

    @Override // defpackage.ctl
    public final /* bridge */ /* synthetic */ boolean jZ(Object obj, int i) {
        Drawable drawable = (Drawable) obj;
        if (this.c) {
            akvm akvmVar = (akvm) this.b.get();
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            akvmVar.b("GLIDE", i2 != 1 ? (i2 == 2 || i2 == 3) ? "DISK" : i2 != 4 ? "UNKNOWN" : "MEMORY" : "NOT_CACHED", false);
        }
        return false;
    }
}
