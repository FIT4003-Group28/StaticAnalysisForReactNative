package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
/* compiled from: PG */
/* renamed from: blym  reason: default package */
/* loaded from: classes3.dex */
final class blym extends cqtd {
    final /* synthetic */ cqtd a;
    final /* synthetic */ cqtd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blym(Object[] objArr, cqtd cqtdVar, cqtd cqtdVar2) {
        super(objArr);
        this.a = cqtdVar;
        this.b = cqtdVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, this.a.a(context));
        Drawable a = this.b.a(context);
        a.setAlpha(138);
        stateListDrawable.addState(StateSet.WILD_CARD, a);
        return stateListDrawable;
    }
}
