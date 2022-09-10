package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
/* compiled from: PG */
/* renamed from: cfr  reason: default package */
/* loaded from: classes.dex */
public final class cfr implements cfv<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    @Override // defpackage.cfv
    public final bxd<byte[]> a(bxd<Bitmap> bxdVar, bua buaVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bxdVar.b().compress(this.a, 100, byteArrayOutputStream);
        bxdVar.d();
        return new ces(byteArrayOutputStream.toByteArray());
    }
}
