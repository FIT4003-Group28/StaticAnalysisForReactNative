package a.r;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* loaded from: classes.dex */
class h0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f636a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(ViewGroup viewGroup) {
        this.f636a = viewGroup.getOverlay();
    }

    @Override // a.r.n0
    public void a(Drawable drawable) {
        this.f636a.add(drawable);
    }

    @Override // a.r.i0
    public void a(View view) {
        this.f636a.add(view);
    }

    @Override // a.r.n0
    public void b(Drawable drawable) {
        this.f636a.remove(drawable);
    }

    @Override // a.r.i0
    public void b(View view) {
        this.f636a.remove(view);
    }
}
