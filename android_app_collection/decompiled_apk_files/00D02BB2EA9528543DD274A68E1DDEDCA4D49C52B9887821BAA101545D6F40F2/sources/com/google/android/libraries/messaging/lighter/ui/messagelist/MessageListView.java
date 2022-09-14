package com.google.android.libraries.messaging.lighter.ui.messagelist;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview.PagedRecyclerView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MessageListView extends PagedRecyclerView implements cuvv {
    public dbsg<cvct> V;

    public MessageListView(Context context) {
        this(context, null);
    }

    public void setBubbleCellStyleProvider(cvct cvctVar) {
        this.V = dbsg.i(cvctVar);
    }

    @Override // defpackage.cuvv
    public void setPresenter(cveg cvegVar) {
    }

    public MessageListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V = dbpy.a;
    }
}
