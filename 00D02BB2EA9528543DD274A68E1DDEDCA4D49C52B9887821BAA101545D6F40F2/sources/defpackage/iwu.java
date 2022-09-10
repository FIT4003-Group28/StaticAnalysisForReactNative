package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
/* compiled from: PG */
/* renamed from: iwu  reason: default package */
/* loaded from: classes6.dex */
final class iwu extends cqtd {
    final /* synthetic */ int a;
    final /* synthetic */ cqss b;
    final /* synthetic */ cqss c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwu(Object[] objArr, int i, cqss cqssVar, cqss cqssVar2) {
        super(objArr);
        this.a = i;
        this.b = cqssVar;
        this.c = cqssVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, cqrt.h(this.a, this.b).a(context));
        stateListDrawable.addState(new int[0], cqrt.h(this.a, this.c).a(context));
        return stateListDrawable;
    }
}
