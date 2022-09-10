package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ajuf  reason: default package */
/* loaded from: classes2.dex */
final class ajuf extends cqtd {
    final /* synthetic */ ajug a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajuf(ajug ajugVar, Object[] objArr) {
        super(objArr);
        this.a = ajugVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return this.a.b.loadIcon(context.getPackageManager());
    }
}
