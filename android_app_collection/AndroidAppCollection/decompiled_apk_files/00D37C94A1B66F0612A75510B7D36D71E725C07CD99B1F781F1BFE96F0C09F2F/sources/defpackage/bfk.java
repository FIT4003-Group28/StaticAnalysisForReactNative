package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Set;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: bfk  reason: default package */
/* loaded from: classes2.dex */
final class bfk extends ArrayAdapter {
    final float a;
    final /* synthetic */ bfl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfk(bfl bflVar, Context context, List list) {
        super(context, 0, list);
        this.b = bflVar;
        this.a = kt.B(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            bfl bflVar = this.b;
            bfl.n((LinearLayout) view.findViewById(R.id.volume_item_container), bflVar.y);
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = bflVar.x;
            layoutParams.height = bflVar.x;
            findViewById.setLayoutParams(layoutParams);
        }
        bhc bhcVar = (bhc) getItem(i);
        if (bhcVar != null) {
            boolean z = bhcVar.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(bhcVar.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            kt.I(viewGroup.getContext(), mediaRouteVolumeSlider, this.b.o);
            mediaRouteVolumeSlider.setTag(bhcVar);
            this.b.B.put(bhcVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.a(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (this.b.y(bhcVar)) {
                    mediaRouteVolumeSlider.setMax(bhcVar.o);
                    mediaRouteVolumeSlider.setProgress(bhcVar.n);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.b.v);
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z ? PrivateKeyType.INVALID : (int) (this.a * 255.0f));
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.volume_item_container);
            if (true == this.b.t.contains(bhcVar)) {
                i2 = 4;
            }
            linearLayout.setVisibility(i2);
            Set set = this.b.r;
            if (set != null && set.contains(bhcVar)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}
