package android.support.v4.j;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f556a;

    public void a() {
        View view = this.f556a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
}
