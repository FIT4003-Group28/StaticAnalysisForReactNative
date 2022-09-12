package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: dafs  reason: default package */
/* loaded from: classes5.dex */
public final class dafs extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public dafs(Context context) {
        this(context, null);
    }

    public dafs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        aeq a = aeq.a(context, attributeSet, dafq.a);
        this.a = a.f(2);
        this.b = a.d(0);
        this.c = a.o(1, 0);
        a.q();
    }
}
