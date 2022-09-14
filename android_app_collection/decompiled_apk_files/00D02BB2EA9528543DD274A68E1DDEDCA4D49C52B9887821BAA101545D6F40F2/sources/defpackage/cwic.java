package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwic  reason: default package */
/* loaded from: classes5.dex */
public abstract class cwic {
    public static cwib g() {
        cwhy cwhyVar = new cwhy();
        cwhyVar.e(R.id.og_ai_not_set);
        cwhyVar.h(-1);
        return cwhyVar;
    }

    public abstract int a();

    public abstract Drawable b();

    public abstract String c();

    public abstract int d();

    public abstract View.OnClickListener e();

    public abstract cwib f();

    public final cwic h(View.OnClickListener onClickListener) {
        cwib f = f();
        f.g(onClickListener);
        return f.i();
    }
}
