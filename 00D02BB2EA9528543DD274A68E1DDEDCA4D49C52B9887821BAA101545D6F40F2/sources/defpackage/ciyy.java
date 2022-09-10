package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ciyy  reason: default package */
/* loaded from: classes4.dex */
final class ciyy implements bil {
    final /* synthetic */ cizb a;

    public ciyy(cizb cizbVar) {
        this.a = cizbVar;
    }

    @Override // defpackage.bil
    @dzsi
    public final Bitmap a(bjs bjsVar) {
        Bitmap h;
        amfu amfuVar = this.a.a;
        if (amfuVar == null || !amfuVar.a() || (h = this.a.a.h()) == null) {
            return null;
        }
        return Bitmap.createScaledBitmap(h.copy(Bitmap.Config.ARGB_8888, false), bjsVar.a, bjsVar.b, true);
    }
}
