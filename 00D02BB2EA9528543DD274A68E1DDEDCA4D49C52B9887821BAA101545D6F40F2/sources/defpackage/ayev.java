package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ayev  reason: default package */
/* loaded from: classes3.dex */
final class ayev extends cqtd {
    final /* synthetic */ ayex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayev(ayex ayexVar, Object[] objArr) {
        super(objArr);
        this.a = ayexVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return ayex.c(context, this.a.i == ayew.TRANSPARENT);
    }
}
