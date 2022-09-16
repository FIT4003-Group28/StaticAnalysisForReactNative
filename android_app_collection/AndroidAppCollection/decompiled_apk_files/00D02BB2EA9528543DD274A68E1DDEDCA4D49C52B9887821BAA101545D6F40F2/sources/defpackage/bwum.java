package defpackage;

import android.graphics.Bitmap;
import com.google.geo.imagery.viewer.api.IconRequestContainer;
/* compiled from: PG */
/* renamed from: bwum  reason: default package */
/* loaded from: classes4.dex */
final class bwum implements bwur {
    final /* synthetic */ IconRequestContainer a;
    final /* synthetic */ bwun b;

    public bwum(bwun bwunVar, IconRequestContainer iconRequestContainer) {
        this.b = bwunVar;
        this.a = iconRequestContainer;
    }

    @Override // defpackage.bwur
    public final void a(@dzsi Bitmap bitmap) {
        this.a.b(bitmap);
        this.b.a.a();
    }
}
