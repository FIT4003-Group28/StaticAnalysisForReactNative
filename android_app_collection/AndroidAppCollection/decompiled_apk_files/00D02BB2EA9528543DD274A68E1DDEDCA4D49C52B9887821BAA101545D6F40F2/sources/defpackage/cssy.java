package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cssy  reason: default package */
/* loaded from: classes5.dex */
public final class cssy extends FrameLayout implements cuug {
    private final RecyclerView a;

    public cssy(Context context) {
        this(context, null);
    }

    @Override // defpackage.cuvv
    public void setPresenter(cuuf cuufVar) {
        this.a.setAdapter(cuufVar.y());
    }

    public cssy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cssy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.attachment_previews_layout, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.previews_recycler_view);
        this.a = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new aag(0, false));
    }
}
