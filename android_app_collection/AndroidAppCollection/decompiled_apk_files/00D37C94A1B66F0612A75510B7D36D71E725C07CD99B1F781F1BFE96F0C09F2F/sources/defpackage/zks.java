package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zks  reason: default package */
/* loaded from: classes4.dex */
public final class zks extends zkq {
    public zks(Context context, zjy zjyVar, ajmr ajmrVar) {
        super(context, zjyVar, ajmrVar, R.layout.audio_swap_track_tile);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() + (getRootView().findViewById(R.id.audio_swap_track_track_info).getMeasuredHeight() / 2) + getContext().getResources().getDimensionPixelSize(R.dimen.audio_swap_track_tile_bottom_bar_offset), 1073741824));
    }
}
