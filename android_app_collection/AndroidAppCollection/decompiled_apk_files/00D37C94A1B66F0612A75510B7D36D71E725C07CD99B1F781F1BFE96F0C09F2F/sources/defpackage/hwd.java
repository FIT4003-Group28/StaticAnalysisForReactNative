package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.extensions.reel.videoeffects.stickers.text.ColorChip;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hwd  reason: default package */
/* loaded from: classes3.dex */
public final class hwd extends xo {
    private static final anhi g = new anhi(new int[]{R.layout.reel_add_text_basic_colors_page, R.layout.reel_add_text_advanced_colors_page, R.layout.reel_add_text_grey_colors});
    public Integer d;
    public int e;
    public View.OnClickListener f;
    private final int h;
    private RecyclerView i;

    public hwd(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.h = point.x;
    }

    @Override // defpackage.xo
    public final int b() {
        return g.a;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        this.i = (RecyclerView) viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 16);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        return new hwc(frameLayout);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        hwc hwcVar = (hwc) yoVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(hwcVar.t.getContext()).inflate(g.a(i), (ViewGroup) null, false);
        hwcVar.t.addView(viewGroup);
        double d = this.h;
        double childCount = viewGroup.getChildCount();
        Double.isNaN(childCount);
        Double.isNaN(d);
        int i2 = (int) (d / (childCount + 0.5d));
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            View.OnClickListener onClickListener = this.f;
            onClickListener.getClass();
            childAt.setOnClickListener(onClickListener);
            childAt.getLayoutParams().width = i2;
            Integer num = this.d;
            if (num != null && num.equals(Integer.valueOf(((ColorChip) childAt).a))) {
                this.d = null;
                this.e = 0;
                this.i.n.Z(i);
                this.f.onClick(childAt);
            }
        }
        if (this.d != null) {
            int i4 = this.e + 1;
            this.e = i4;
            if (i4 >= b()) {
                return;
            }
            this.i.n.Z((i + 1) % b());
        }
    }
}
