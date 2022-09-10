package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.spotify.protocol.types.Image;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxfq  reason: default package */
/* loaded from: classes6.dex */
public final class dxfq implements dxgk<Image> {
    final /* synthetic */ dxgl a;

    public dxfq(dxgl dxglVar) {
        this.a = dxglVar;
    }

    @Override // defpackage.dxgk
    public final /* bridge */ /* synthetic */ void a(Image image) {
        Image image2 = image;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            byte[] bArr = image2.imageData;
            this.a.f(dxhe.b(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options)));
        } catch (Exception e) {
            this.a.g(e);
        }
    }
}
