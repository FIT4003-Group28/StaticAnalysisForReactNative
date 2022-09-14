package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cdv  reason: default package */
/* loaded from: classes4.dex */
public final class cdv implements buc<InputStream, Bitmap> {
    private final ccp a = new ccp();

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, bua buaVar) {
        return true;
    }

    @Override // defpackage.buc
    public final /* bridge */ /* synthetic */ bxd<Bitmap> b(InputStream inputStream, int i, int i2, bua buaVar) {
        return this.a.b(ImageDecoder.createSource(cjb.d(inputStream)), i, i2, buaVar);
    }
}
