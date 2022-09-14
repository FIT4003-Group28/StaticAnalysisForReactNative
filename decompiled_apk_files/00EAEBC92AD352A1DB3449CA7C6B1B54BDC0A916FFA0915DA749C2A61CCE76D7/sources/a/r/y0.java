package a.r;

import android.view.View;
import android.view.WindowId;
/* loaded from: classes.dex */
class y0 implements z0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f723a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(View view) {
        this.f723a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f723a.equals(this.f723a);
    }

    public int hashCode() {
        return this.f723a.hashCode();
    }
}
