package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
/* compiled from: PG */
/* renamed from: nqs  reason: default package */
/* loaded from: classes7.dex */
final class nqs extends cqtd {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ cqtd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqs(Object[] objArr, boolean z, int i, cqtd cqtdVar) {
        super(objArr);
        this.a = z;
        this.b = i;
        this.c = cqtdVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable drawable = null;
        ColorDrawable colorDrawable = !this.a ? null : new ColorDrawable(-1);
        ColorStateList valueOf = ColorStateList.valueOf(this.b);
        cqtd cqtdVar = this.c;
        if (cqtdVar != null) {
            drawable = cqtdVar.a(context);
        }
        return new RippleDrawable(valueOf, drawable, colorDrawable);
    }
}
