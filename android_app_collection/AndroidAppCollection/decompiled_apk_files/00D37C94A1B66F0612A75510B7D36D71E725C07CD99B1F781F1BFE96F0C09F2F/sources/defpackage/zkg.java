package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zkg  reason: default package */
/* loaded from: classes4.dex */
public final class zkg extends RelativeLayout implements View.OnClickListener {
    public final ImageView a;
    public final TextView b;
    public final ajnj c;
    public final zkf d;
    public apis e;

    public zkg(Context context, ajmr ajmrVar) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.audio_swap_category, (ViewGroup) this, true);
        inflate.setWillNotDraw(false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.audio_swap_category_cover);
        this.a = imageView;
        this.b = (TextView) inflate.findViewById(R.id.audio_swap_category_name);
        imageView.setOnClickListener(this);
        this.c = new ajnj(ajmrVar, imageView);
        this.d = new zkf(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((zke) getContext()).f(this.e);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
