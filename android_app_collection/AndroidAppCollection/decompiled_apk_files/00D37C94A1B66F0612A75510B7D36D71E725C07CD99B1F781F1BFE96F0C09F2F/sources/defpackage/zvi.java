package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zvi  reason: default package */
/* loaded from: classes4.dex */
public class zvi extends nd {
    protected int a;

    public zvi(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        int i;
        wi wiVar = (wi) view.getLayoutParams();
        yo yoVar = wiVar.c;
        int i2 = yoVar.g;
        if (i2 == -1) {
            i2 = yoVar.c;
        }
        if (i2 != -1) {
            int i3 = ((GridLayoutManager) recyclerView.n).b;
            int i4 = wiVar.a;
            int i5 = i3 - 1;
            int i6 = this.a;
            int i7 = (i5 * i6) / i3;
            if (i3 < 2) {
                i = 0;
            } else if (i4 != 0) {
                if (i4 == i5) {
                    i = 0;
                } else {
                    i7 /= 2;
                    i = i7;
                }
                rect.set(i7, 0, i, i6);
                return;
            } else {
                i = i7;
            }
            i7 = 0;
            rect.set(i7, 0, i, i6);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
