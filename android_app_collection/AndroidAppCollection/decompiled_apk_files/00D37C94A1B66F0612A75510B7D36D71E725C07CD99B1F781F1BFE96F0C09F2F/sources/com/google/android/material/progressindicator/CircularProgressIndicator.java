package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CircularProgressIndicator extends allq {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.allq
    public final /* bridge */ /* synthetic */ allr a(Context context, AttributeSet attributeSet) {
        return new allr(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132084395);
        Context context2 = getContext();
        allr allrVar = this.a;
        setIndeterminateDrawable(new almf(context2, allrVar, new almd(allrVar), new allw(allrVar)));
        Context context3 = getContext();
        allr allrVar2 = this.a;
        setProgressDrawable(new ally(context3, allrVar2, new almd(allrVar2)));
    }
}
