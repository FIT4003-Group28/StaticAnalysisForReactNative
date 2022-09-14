package a.r;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* loaded from: classes.dex */
class m0 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f667a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(View view) {
        this.f667a = view.getOverlay();
    }

    @Override // a.r.n0
    public void a(Drawable drawable) {
        this.f667a.add(drawable);
    }

    @Override // a.r.n0
    public void b(Drawable drawable) {
        this.f667a.remove(drawable);
    }
}
