package defpackage;

import android.support.rastermill.FrameSequence;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: tij  reason: default package */
/* loaded from: classes4.dex */
public final class tij implements cie {
    private final cld a;

    public tij(cld cldVar) {
        this.a = cldVar;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        return c((InputStream) obj);
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        int i = til.c;
        byte[] bArr = new byte[21];
        if (((InputStream) obj).read(bArr) < 21) {
            return false;
        }
        return til.a(bArr);
    }

    public final cku c(InputStream inputStream) {
        return new tik(FrameSequence.decodeStream(inputStream), this.a);
    }
}
