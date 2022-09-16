package defpackage;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iix  reason: default package */
/* loaded from: classes3.dex */
public final class iix {
    public final aadd a;
    public final akzf b;
    public Toolbar c;
    private final ypf d;

    public iix(aadd aaddVar, akzf akzfVar, ypf ypfVar) {
        this.a = aaddVar;
        this.b = akzfVar;
        this.d = ypfVar;
    }

    public final void a(Activity activity) {
        this.c = (Toolbar) activity.findViewById(R.id.toolbar);
        this.d.f(new iiw(this, activity, 1));
        this.d.f(new iiw(this, activity));
    }
}
