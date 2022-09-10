package defpackage;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfav  reason: default package */
/* loaded from: classes3.dex */
public final class bfav extends bfbm {
    private final bwrs<ilo> a;
    private final Bitmap b;

    public bfav(bwrs<ilo> bwrsVar, Bitmap bitmap) {
        this.a = bwrsVar;
        this.b = bitmap;
    }

    @Override // defpackage.bfbm
    public final bwrs<ilo> a() {
        return this.a;
    }

    @Override // defpackage.bfbm
    public final Bitmap b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfbm) {
            bfbm bfbmVar = (bfbm) obj;
            if (this.a.equals(bfbmVar.a()) && this.b.equals(bfbmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("WelcomeOfferSaveState{placemarkRef=");
        sb.append(valueOf);
        sb.append(", bitmap=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
