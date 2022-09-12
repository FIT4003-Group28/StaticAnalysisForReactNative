package defpackage;

import android.content.Context;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: amfs  reason: default package */
/* loaded from: classes2.dex */
final class amfs extends cqtd {
    final /* synthetic */ Picture a;
    final /* synthetic */ bvlw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amfs(Object[] objArr, Picture picture, bvlw bvlwVar) {
        super(objArr);
        this.a = picture;
        this.b = bvlwVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return bvlo.a().c(this.a, this.b);
    }
}
