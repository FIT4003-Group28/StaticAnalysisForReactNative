package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akrt  reason: default package */
/* loaded from: classes.dex */
public final class akrt extends CardView {
    public final LinearLayout g;
    public final LayoutInflater h;
    public final List i;

    public akrt(Context context, List list) {
        super(context);
        LayoutInflater from = LayoutInflater.from(context);
        this.h = from;
        from.inflate(R.layout.chart_touch_tooltip, this);
        this.g = (LinearLayout) findViewById(R.id.chart_touch_tooltip_values);
        this.i = list;
        setBackgroundColor(0);
        b(0);
        d();
    }
}
