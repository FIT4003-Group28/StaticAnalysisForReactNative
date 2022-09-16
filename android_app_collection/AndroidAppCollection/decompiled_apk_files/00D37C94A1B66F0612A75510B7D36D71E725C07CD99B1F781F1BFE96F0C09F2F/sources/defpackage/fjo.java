package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: fjo  reason: default package */
/* loaded from: classes3.dex */
final class fjo implements ajmw {
    final /* synthetic */ int a;

    public fjo(int i) {
        this.a = i;
    }

    @Override // defpackage.ajmw
    public final void a(ImageView imageView) {
        imageView.setImageResource(this.a);
        afus.b(1, 1, "AdSingleClickTargetButtonInnerPresenter failed to load icon:");
    }

    @Override // defpackage.ajmw
    public final void b(ImageView imageView) {
    }

    @Override // defpackage.ajmw
    public final void c(ImageView imageView) {
    }
}
