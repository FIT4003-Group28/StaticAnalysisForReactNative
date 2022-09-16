package com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PagedRecyclerView extends RecyclerView {
    public final aag S;
    public Drawable T;
    public cuwv U;
    private cuwu V;

    public PagedRecyclerView(Context context) {
        this(context, null);
    }

    private final void a() {
        this.S.H(this.V == cuwu.MORE_ON_TOP);
    }

    public void setLoadingIcon(Drawable drawable) {
        this.T = drawable;
        a();
    }

    public void setPagingMode(cuwu cuwuVar) {
        this.V = cuwuVar;
        a();
    }

    public void setViewContentsChangedListener(cuwv cuwvVar) {
        this.U = cuwvVar;
    }

    public PagedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.U = null;
        cuwr cuwrVar = new cuwr(this, getContext());
        this.S = cuwrVar;
        setLayoutManager(cuwrVar);
        setAdapter(new cuws());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cuwc.b, i, 0);
        final int integer = obtainStyledAttributes.getInteger(1, cuwu.MORE_ON_BOTTOM.c);
        this.V = (cuwu) dcbg.c(cuwu.values()).r(new dbsl(integer) { // from class: cuwt
            private final int a;

            {
                this.a = integer;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                cuwu cuwuVar = cuwu.MORE_ON_BOTTOM;
                return ((cuwu) obj).c == i2;
            }
        }).c(cuwu.MORE_ON_BOTTOM);
        this.T = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (drawable = sl.b(context, resourceId)) == null) ? obtainStyledAttributes.getDrawable(0) : drawable;
        obtainStyledAttributes.recycle();
        a();
    }
}
