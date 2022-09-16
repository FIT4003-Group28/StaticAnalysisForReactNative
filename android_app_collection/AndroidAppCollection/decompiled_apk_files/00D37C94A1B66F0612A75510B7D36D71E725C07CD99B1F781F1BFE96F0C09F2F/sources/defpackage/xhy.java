package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: xhy  reason: default package */
/* loaded from: classes4.dex */
public final class xhy extends xii {
    public ImageView a;
    private boolean f;

    public xhy() {
        super(false);
    }

    private final void f(boolean z, boolean z2) {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setVisibility((!z2 || !z || this.f) ? 8 : 0);
        }
    }

    public final void a(boolean z) {
        this.f = z;
        f(((Boolean) this.b).booleanValue(), this.d);
    }

    @Override // defpackage.xhz
    public final /* bridge */ /* synthetic */ void b(Object obj, boolean z) {
        f(((Boolean) obj).booleanValue(), z);
    }
}
