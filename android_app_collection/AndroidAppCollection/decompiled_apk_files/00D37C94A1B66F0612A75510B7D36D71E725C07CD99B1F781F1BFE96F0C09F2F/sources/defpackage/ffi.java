package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ffi  reason: default package */
/* loaded from: classes3.dex */
public final class ffi {
    final Paint a;
    final Paint b;
    final Paint c;
    final Paint d;
    final Paint e;
    final int f;
    final Paint g;
    final int h;
    final int i;
    final int j;
    final int k;
    final Paint l;
    final int m;
    final int n;
    final int o;
    final int p;
    final int q;
    final int r;
    final boolean s;
    final gqb t;
    final int u;
    final int v;
    final int w;
    public final int x;
    public final boolean y;

    public ffi(Context context, aacz aaczVar) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.o = resources.getDimensionPixelSize(R.dimen.inline_time_bar_chapters_scrubbing_height);
        this.p = resources.getDimensionPixelSize(R.dimen.inline_time_bar_for_timestamp_markers_height);
        this.q = resources.getDimensionPixelSize(R.dimen.inline_time_bar_for_expanded_timestamp_markers_height);
        apyy b = aaczVar.b();
        asxj asxjVar = b.e;
        boolean z = false;
        if ((asxjVar == null ? asxj.a : asxjVar).aF) {
            asxj asxjVar2 = b.e;
            if (!(asxjVar2 == null ? asxj.a : asxjVar2).bl) {
                z = true;
            }
        }
        this.s = z;
        this.f = zew.i(displayMetrics, 4);
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(resources.getColor(R.color.inline_time_bar_ad_break_marker_color));
        this.h = resources.getDimensionPixelSize(R.dimen.timestamp_marker_width);
        this.k = resources.getDimensionPixelSize(R.dimen.timestamp_cluster_spacing);
        this.i = resources.getDimensionPixelSize(R.dimen.timestamp_marker_active_width);
        this.j = resources.getDimensionPixelSize(R.dimen.timestamp_cluster_gap_width);
        int color = resources.getColor(R.color.active_timestamp_marker_color);
        this.m = color;
        this.n = resources.getColor(R.color.non_active_timestamp_marker_color);
        Paint paint2 = new Paint(1);
        this.l = paint2;
        paint2.setColor(color);
        this.u = zew.i(displayMetrics, 3);
        this.v = resources.getDimensionPixelSize(R.dimen.inline_time_bar_chapter_gap_width);
        this.w = resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubbing_chapter_gap_width);
        this.t = new gqb(resources);
        asxj asxjVar3 = b.e;
        this.y = (asxjVar3 == null ? asxj.a : asxjVar3).ct;
        asxj asxjVar4 = b.e;
        this.x = zew.i(displayMetrics, (asxjVar4 == null ? asxj.a : asxjVar4).cs);
        asxj asxjVar5 = b.e;
        if ((asxjVar5 == null ? asxj.a : asxjVar5).aF) {
            asxj asxjVar6 = b.e;
            this.r = zew.i(displayMetrics, (asxjVar6 == null ? asxj.a : asxjVar6).aG);
            return;
        }
        this.r = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
