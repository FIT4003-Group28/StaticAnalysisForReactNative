package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SimpleActionView extends LinearLayout implements upw {
    public ampq a;

    public SimpleActionView(Context context) {
        this(context, null);
    }

    @Override // defpackage.upw
    public final void a(upq upqVar) {
        if (this.a.h()) {
            upqVar.b(this, ((Integer) this.a.c()).intValue());
        }
    }

    @Override // defpackage.upw
    public final void b(upq upqVar) {
        if (this.a.h()) {
            upqVar.c(this);
        }
    }

    public SimpleActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = amon.a;
    }
}
