package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqss  reason: default package */
/* loaded from: classes.dex */
public abstract class cqss extends cqtd {
    public cqss(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.cqtd
    public Drawable a(Context context) {
        return new ColorDrawable(b(context));
    }

    public abstract int b(Context context);

    public abstract ColorStateList c(Context context);
}
