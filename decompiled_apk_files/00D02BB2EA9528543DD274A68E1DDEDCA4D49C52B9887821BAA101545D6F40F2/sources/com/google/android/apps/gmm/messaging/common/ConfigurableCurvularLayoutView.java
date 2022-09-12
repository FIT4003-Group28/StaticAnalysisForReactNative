package com.google.android.apps.gmm.messaging.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ConfigurableCurvularLayoutView extends RelativeLayout {
    public cqkj a;

    public ConfigurableCurvularLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((apzz) bttc.a(apzz.class, this)).xa(this);
    }

    public final <V extends cqkp> cqkf<V> a(cqiw<V> cqiwVar, V v) {
        cqkj cqkjVar = this.a;
        if (cqkjVar != null) {
            cqkf<V> a = cqkjVar.a(cqiwVar, this);
            a.e(v);
            return a;
        }
        return null;
    }
}
