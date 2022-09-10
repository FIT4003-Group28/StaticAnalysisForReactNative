package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: atxk  reason: default package */
/* loaded from: classes2.dex */
final class atxk extends cqtd {
    final /* synthetic */ atxl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atxk(atxl atxlVar, Object[] objArr) {
        super(objArr);
        this.a = atxlVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return this.a.b.loadIcon(context.getPackageManager());
    }
}
