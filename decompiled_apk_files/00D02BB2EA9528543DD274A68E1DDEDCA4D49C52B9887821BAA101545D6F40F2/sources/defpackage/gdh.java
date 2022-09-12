package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
/* compiled from: PG */
/* renamed from: gdh  reason: default package */
/* loaded from: classes6.dex */
public final class gdh extends cqtd {
    final /* synthetic */ gdi a;
    final /* synthetic */ cqss b;
    final /* synthetic */ cqss c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdh(Object[] objArr, gdi gdiVar, cqss cqssVar, cqss cqssVar2) {
        super(objArr);
        this.a = gdiVar;
        this.b = cqssVar;
        this.c = cqssVar2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return b(context);
    }

    public final Drawable b(Context context) {
        Drawable mutate;
        gdi gdiVar = this.a;
        Drawable drawable = null;
        cqtd cqtdVar = gdiVar == null ? null : ((gdg) gdiVar).a;
        if (gdiVar != null && cqtdVar != null && ((gdg) gdiVar).b) {
            mutate = cqtdVar.a(context);
        } else {
            cqss cqssVar = this.b;
            if (cqssVar == null) {
                mutate = null;
            } else if (cqtdVar == null) {
                mutate = new ColorDrawable(cqssVar.b(context));
            } else {
                mutate = cqtdVar.a(context).mutate();
                mutate.setColorFilter(gdj.e(context, this.b), PorterDuff.Mode.SRC_IN);
            }
        }
        ColorStateList valueOf = ColorStateList.valueOf(gdj.e(context, this.c));
        if (cqtdVar != null) {
            drawable = cqtdVar.a(context);
        }
        return new RippleDrawable(valueOf, mutate, drawable);
    }
}
