package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.auto.sdk.ui.MaxWidthLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: nso  reason: default package */
/* loaded from: classes7.dex */
public class nso extends cov {
    public nso(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nso(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public nso(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        super(context, attributeSet, i, null);
        super.c();
        ((MaxWidthLayout) super.findViewById(R.id.max_width_layout)).setMaxChildrenWidth(0);
    }
}
