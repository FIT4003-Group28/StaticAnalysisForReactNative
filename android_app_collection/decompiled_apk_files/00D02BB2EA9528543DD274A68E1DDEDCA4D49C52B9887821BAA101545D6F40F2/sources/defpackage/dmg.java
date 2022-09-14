package defpackage;

import android.graphics.Picture;
/* compiled from: PG */
/* renamed from: dmg  reason: default package */
/* loaded from: classes6.dex */
public final class dmg implements degu<Picture> {
    final /* synthetic */ dfer a;

    public dmg(dfer dferVar) {
        this.a = dferVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dzvx.c(th, "t");
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Picture picture) {
        Picture picture2 = picture;
        if (picture2 != null) {
            this.a.f(picture2);
        }
    }
}
