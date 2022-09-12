package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cct  reason: default package */
/* loaded from: classes4.dex */
public final class cct implements buc<ByteBuffer, Bitmap> {
    private final ccp a = new ccp();

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, bua buaVar) {
        return true;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ bxd<Bitmap> b(ByteBuffer byteBuffer, int i, int i2, bua buaVar) {
        return this.a.b(ImageDecoder.createSource(byteBuffer), i, i2, buaVar);
    }
}
