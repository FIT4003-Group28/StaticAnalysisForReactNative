package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: ajhy  reason: default package */
/* loaded from: classes.dex */
final class ajhy extends RecyclerView {
    public ajhy(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final int getBottomPaddingOffset() {
        return getPaddingBottom();
    }

    @Override // android.view.View
    protected final int getTopPaddingOffset() {
        return -getPaddingTop();
    }

    @Override // android.view.View
    protected final boolean isPaddingOffsetRequired() {
        return true;
    }
}
