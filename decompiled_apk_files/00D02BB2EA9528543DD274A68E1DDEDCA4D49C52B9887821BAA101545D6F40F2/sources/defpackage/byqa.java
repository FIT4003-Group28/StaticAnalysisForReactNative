package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: byqa  reason: default package */
/* loaded from: classes4.dex */
public abstract class byqa {
    public static byqa c(Bitmap bitmap, int i) {
        bypt byptVar = new bypt();
        byptVar.a = bitmap;
        byptVar.b = i;
        return new bypu(byptVar.a, i);
    }

    @dzsi
    public abstract Bitmap a();

    public abstract int b();
}
