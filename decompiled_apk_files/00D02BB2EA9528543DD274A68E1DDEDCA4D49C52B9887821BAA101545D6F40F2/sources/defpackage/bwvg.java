package defpackage;

import android.graphics.Bitmap;
import com.google.geo.imagery.viewer.api.Image;
import com.google.geo.imagery.viewer.api.TileRequestContainer;
/* compiled from: PG */
/* renamed from: bwvg  reason: default package */
/* loaded from: classes4.dex */
final class bwvg implements bwur {
    final /* synthetic */ TileRequestContainer a;
    final /* synthetic */ bwvh b;

    public bwvg(bwvh bwvhVar, TileRequestContainer tileRequestContainer) {
        this.b = bwvhVar;
        this.a = tileRequestContainer;
    }

    @Override // defpackage.bwur
    public final void a(@dzsi Bitmap bitmap) {
        TileRequestContainer tileRequestContainer = this.a;
        if (bitmap == null) {
            tileRequestContainer.b(null);
        } else {
            tileRequestContainer.b(Image.c(bitmap));
        }
        this.b.a.a();
    }
}
