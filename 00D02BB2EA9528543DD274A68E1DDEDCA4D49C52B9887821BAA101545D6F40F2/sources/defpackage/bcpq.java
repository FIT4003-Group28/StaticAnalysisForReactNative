package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: bcpq  reason: default package */
/* loaded from: classes3.dex */
public final class bcpq extends bcqw {
    public btvo a;

    public static bcpq q(btvo btvoVar, bwqv bwqvVar, @dzsi bwrs<ilo> bwrsVar, bbuq bbuqVar, bbty bbtyVar, int i, @dzsi Bitmap bitmap) {
        ges aS = bcrg.aS(btvoVar, bwqvVar, bwrsVar, bbuqVar, bbtyVar, i, bitmap, null);
        bcpq bcpqVar = new bcpq();
        bcpqVar.B(aS.o);
        return bcpqVar;
    }

    @Override // defpackage.bcqw
    protected final fd g() {
        if (bcrg.bn(this.a)) {
            return new bcrg();
        }
        return new bcpz();
    }
}
