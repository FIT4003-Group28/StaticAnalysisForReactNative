package defpackage;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: jdz  reason: default package */
/* loaded from: classes7.dex */
public final class jdz extends jdx {
    public jdz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d.setVisibility(4);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqmp<T>... cqmpVarArr) {
        return new cqmh(jdz.class, cqmpVarArr);
    }

    @Override // defpackage.jdx
    public final void e(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        this.c.setVisibility(true != z ? 0 : 4);
    }
}
