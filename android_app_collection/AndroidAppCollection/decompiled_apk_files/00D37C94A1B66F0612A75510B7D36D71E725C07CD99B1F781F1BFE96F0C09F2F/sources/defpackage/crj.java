package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
/* compiled from: PG */
/* renamed from: crj  reason: default package */
/* loaded from: classes3.dex */
public final class crj implements crm {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    @Override // defpackage.crm
    public final cku a(cku ckuVar, cic cicVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) ckuVar.c()).compress(this.a, 100, byteArrayOutputStream);
        ckuVar.e();
        return new cqo(byteArrayOutputStream.toByteArray());
    }
}
