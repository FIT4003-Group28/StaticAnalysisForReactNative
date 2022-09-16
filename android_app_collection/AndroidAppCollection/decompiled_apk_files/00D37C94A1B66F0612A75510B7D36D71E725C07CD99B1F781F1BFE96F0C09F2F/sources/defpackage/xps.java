package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xps  reason: default package */
/* loaded from: classes4.dex */
public final class xps {
    public final Context a;
    public int b;
    public ViewGroup c;
    public xpa[] d;
    public final xpp e;

    public xps(Context context, xpp xppVar) {
        this.a = context;
        this.e = xppVar;
    }

    public final void a() {
        int i = 0;
        while (i < this.c.getChildCount()) {
            zgd.t(this.c.getChildAt(i).findViewById(R.id.filter_text), zgd.h(i == this.b ? -1 : -2), ViewGroup.LayoutParams.class);
            i++;
        }
    }
}
