package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.content.Context;
import android.util.AttributeSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ListenerEditText extends xj {
    private cxpo a;

    public ListenerEditText(Context context) {
        super(context);
    }

    @Override // defpackage.xj, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        cxpo cxpoVar;
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 && (cxpoVar = this.a) != null) {
            cxpoVar.a();
        }
        return onTextContextMenuItem;
    }

    public void setEditTextListener(cxpo cxpoVar) {
        this.a = cxpoVar;
    }

    public ListenerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListenerEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
