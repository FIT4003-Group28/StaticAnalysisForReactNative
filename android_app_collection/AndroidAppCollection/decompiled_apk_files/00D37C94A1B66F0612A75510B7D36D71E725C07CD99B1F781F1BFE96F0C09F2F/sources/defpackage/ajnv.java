package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ajnv  reason: default package */
/* loaded from: classes.dex */
final class ajnv implements ctl {
    private final akvm a;

    public ajnv(akvm akvmVar) {
        this.a = akvmVar;
    }

    @Override // defpackage.ctl
    public final boolean jY(ckq ckqVar, Object obj, ctz ctzVar, boolean z) {
        this.a.b("GLIDE", "UNKNOWN", true);
        return false;
    }

    @Override // defpackage.ctl
    public final /* bridge */ /* synthetic */ boolean jZ(Object obj, int i) {
        Bitmap bitmap = (Bitmap) obj;
        akvm akvmVar = this.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        akvmVar.b("GLIDE", i2 != 1 ? i2 != 2 ? i2 != 4 ? "UNKNOWN" : "MEMORY" : "DISK" : "NOT_CACHED", false);
        return false;
    }
}
