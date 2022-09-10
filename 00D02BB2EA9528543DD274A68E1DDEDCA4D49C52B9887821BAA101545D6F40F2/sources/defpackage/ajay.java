package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ajay  reason: default package */
/* loaded from: classes2.dex */
final class ajay extends cqtd {
    final /* synthetic */ ajaz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajay(ajaz ajazVar, Object[] objArr) {
        super(objArr);
        this.a = ajazVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return this.a.b.loadIcon(context.getPackageManager());
    }
}
