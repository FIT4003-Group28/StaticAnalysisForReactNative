package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
/* compiled from: PG */
/* renamed from: nsn  reason: default package */
/* loaded from: classes7.dex */
public final class nsn extends jnk {
    public nsn(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 23) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return false;
    }

    public nsn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public nsn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
