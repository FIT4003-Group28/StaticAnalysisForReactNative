package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.common.LoadingView;
import com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview.PagedRecyclerView;
/* compiled from: PG */
/* renamed from: cvbp  reason: default package */
/* loaded from: classes5.dex */
public final class cvbp extends FrameLayout implements cuvv {
    public final PagedRecyclerView a;
    public final ViewStub b;
    public final ProgressBar c;
    public final LoadingView d;
    public View e;

    public cvbp(Context context) {
        super(context);
        inflate(getContext(), R.layout.conversation_list_view_layout, this);
        this.a = (PagedRecyclerView) findViewById(R.id.paged_recycler);
        this.b = (ViewStub) findViewById(R.id.empty_conversation_list_stub);
        this.c = (ProgressBar) findViewById(R.id.progress_bar);
        this.d = (LoadingView) findViewById(R.id.conversation_list_loading_view);
    }

    public final void a() {
        this.c.setVisibility(8);
    }

    public final void b() {
        this.d.b();
    }

    public void setEmptyView(int i) {
        this.b.setLayoutResource(i);
    }

    public void setOnEmptyInboxInflateListener(ViewStub.OnInflateListener onInflateListener) {
        this.b.setOnInflateListener(onInflateListener);
    }

    public void setPresenter(cvav cvavVar) {
    }

    @Override // defpackage.cuvv
    public /* bridge */ /* synthetic */ void setPresenter(Object obj) {
        cvav cvavVar = (cvav) obj;
    }

    public cvbp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.conversation_list_view_layout, this);
        this.a = (PagedRecyclerView) findViewById(R.id.paged_recycler);
        this.b = (ViewStub) findViewById(R.id.empty_conversation_list_stub);
        this.c = (ProgressBar) findViewById(R.id.progress_bar);
        this.d = (LoadingView) findViewById(R.id.conversation_list_loading_view);
    }

    public cvbp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.conversation_list_view_layout, this);
        this.a = (PagedRecyclerView) findViewById(R.id.paged_recycler);
        this.b = (ViewStub) findViewById(R.id.empty_conversation_list_stub);
        this.c = (ProgressBar) findViewById(R.id.progress_bar);
        this.d = (LoadingView) findViewById(R.id.conversation_list_loading_view);
    }
}
