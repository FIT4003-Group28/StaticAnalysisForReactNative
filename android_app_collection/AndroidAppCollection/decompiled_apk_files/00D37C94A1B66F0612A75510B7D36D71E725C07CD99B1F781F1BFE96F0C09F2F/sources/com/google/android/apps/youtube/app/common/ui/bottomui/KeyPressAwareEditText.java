package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class KeyPressAwareEditText extends ue {
    public fvs a;

    public KeyPressAwareEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        fvs fvsVar = this.a;
        if (fvsVar != null) {
            fwf fwfVar = fvsVar.a;
            if (i == 4) {
                if (keyEvent.getAction() == 1) {
                    fwfVar.g.c(fwe.b(false));
                }
                i = 4;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
