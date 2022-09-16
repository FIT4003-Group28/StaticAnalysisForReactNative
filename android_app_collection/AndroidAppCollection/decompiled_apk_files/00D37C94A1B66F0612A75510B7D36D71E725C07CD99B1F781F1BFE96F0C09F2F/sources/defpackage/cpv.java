package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cpv  reason: default package */
/* loaded from: classes3.dex */
public final class cpv implements cie {
    private final cos a = new cos(null);
    private final /* synthetic */ int b;

    public cpv(int i) {
        this.b = i;
    }

    public cpv() {
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cic cicVar) {
        if (this.b == 0) {
            InputStream inputStream = (InputStream) obj;
            return true;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }

    @Override // defpackage.cie
    public final /* bridge */ /* synthetic */ cku a(Object obj, int i, int i2, cic cicVar) {
        if (this.b == 0) {
            return this.a.a(ImageDecoder.createSource(cus.c((InputStream) obj)), i, i2, cicVar);
        }
        return this.a.a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, cicVar);
    }
}
