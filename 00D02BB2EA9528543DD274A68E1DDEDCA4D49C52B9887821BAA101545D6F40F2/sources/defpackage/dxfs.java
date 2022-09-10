package defpackage;

import android.graphics.Bitmap;
import com.spotify.protocol.types.Image;
import com.spotify.protocol.types.ImageIdentifier;
import com.spotify.protocol.types.ImageUri;
/* compiled from: PG */
/* renamed from: dxfs  reason: default package */
/* loaded from: classes6.dex */
public final class dxfs {
    private final dxgx a;

    public dxfs(dxgx dxgxVar) {
        this.a = dxgxVar;
    }

    public final dxgl<Bitmap> a(ImageUri imageUri) {
        dxgl b = this.a.b("com.spotify.get_image", new ImageIdentifier(imageUri.raw, Image.Dimension.LARGE), Image.class);
        dxgl<Bitmap> dxglVar = new dxgl<>();
        b.c(new dxfq(dxglVar));
        b.h(new dxfr(dxglVar));
        return dxglVar;
    }
}
