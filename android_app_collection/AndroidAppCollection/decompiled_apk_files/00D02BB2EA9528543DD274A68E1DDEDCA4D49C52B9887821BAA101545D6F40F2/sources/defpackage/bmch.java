package defpackage;

import android.graphics.Rect;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmch  reason: default package */
/* loaded from: classes3.dex */
final class bmch implements qa {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final List<View> c = new ArrayList();

    @Override // defpackage.qa
    public final void a(NestedScrollView nestedScrollView, int i) {
        if (this.c.isEmpty()) {
            cqkx.f(nestedScrollView, bmbx.a, this.c);
            if (this.c.isEmpty()) {
                return;
            }
        }
        nestedScrollView.getDrawingRect(this.a);
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            View view = this.c.get(i2);
            if (view != null) {
                view.getHitRect(this.b);
                bmcv bmcvVar = (bmcv) cqkx.i(nestedScrollView);
                if (bmcvVar == null) {
                    return;
                }
                int intValue = bmcvVar.d().intValue();
                this.b.offset(0, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                if (Rect.intersects(this.a, this.b)) {
                    if (i2 == intValue) {
                        return;
                    }
                    bmcvVar.c(i2);
                    return;
                }
            }
        }
    }
}
