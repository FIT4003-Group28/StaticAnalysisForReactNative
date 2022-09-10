package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: iun  reason: default package */
/* loaded from: classes.dex */
final class iun extends cqtd {
    final /* synthetic */ int a;
    final /* synthetic */ bvlw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iun(Object[] objArr, int i, bvlw bvlwVar) {
        super(objArr);
        this.a = i;
        this.b = bvlwVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return bvlo.a().b(context.getResources(), this.a, this.b);
    }
}
