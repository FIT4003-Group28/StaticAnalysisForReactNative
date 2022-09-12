package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class OverlayListView extends ListView {
    private final List<apy> a;

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.size() > 0) {
            Iterator<apy> it = this.a.iterator();
            if (!it.hasNext()) {
                return;
            }
            it.next();
            throw null;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
    }
}
