package com.google.android.libraries.curvular.value;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ForegroundColorViewPropertyValueSpan extends ForegroundColorSpan {
    private final Context a;
    private final cqss b;

    public ForegroundColorViewPropertyValueSpan(Context context, cqss cqssVar) {
        super(cqssVar.b(context));
        this.a = context;
        this.b = cqssVar;
    }

    @Override // android.text.style.ForegroundColorSpan
    public final int getForegroundColor() {
        return this.b.b(this.a);
    }
}
