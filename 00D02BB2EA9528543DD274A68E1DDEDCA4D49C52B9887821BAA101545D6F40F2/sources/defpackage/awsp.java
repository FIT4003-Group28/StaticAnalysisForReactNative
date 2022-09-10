package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: awsp  reason: default package */
/* loaded from: classes3.dex */
public final class awsp extends FrameLayout implements egd {
    private int a;

    public awsp(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    @Override // defpackage.egd
    public final int a() {
        ViewGroup viewGroup = (ViewGroup) cqkx.e(this, awrr.a, ViewGroup.class);
        if (viewGroup != null) {
            this.a = viewGroup.getMeasuredHeight();
        }
        return this.a;
    }
}
