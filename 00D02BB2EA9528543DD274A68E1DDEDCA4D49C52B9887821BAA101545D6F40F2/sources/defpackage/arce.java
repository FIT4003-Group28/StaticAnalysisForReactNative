package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: arce  reason: default package */
/* loaded from: classes2.dex */
public final class arce {
    public final arcq a;
    public final List<arcb> b;
    public final float c;
    private final arcr d;

    public arce(Resources resources, arcr arcrVar) {
        this.d = arcrVar;
        arcq e = arcrVar.a.e(R.drawable.polyline_selection_dot, "Mylocation ghost dot", 9);
        this.a = e;
        if (resources.getDisplayMetrics() != null) {
            this.c = (resources.getDisplayMetrics().density * 50.0f) / e.c();
        } else {
            this.c = 50.0f / e.c();
        }
        this.b = Collections.singletonList(e);
    }

    public final void a(boolean z) {
        for (arcb arcbVar : this.b) {
            arcbVar.a(z);
        }
    }
}
