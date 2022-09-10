package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: acmk  reason: default package */
/* loaded from: classes2.dex */
public final class acmk extends TextView {
    private final acmj a;

    public acmk(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(acmk.class, cqmpVarArr);
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.a.k(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public acmk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMovementMethod(LinkMovementMethod.getInstance());
        acmj acmjVar = new acmj(this);
        this.a = acmjVar;
        od.c(this, acmjVar);
    }
}
