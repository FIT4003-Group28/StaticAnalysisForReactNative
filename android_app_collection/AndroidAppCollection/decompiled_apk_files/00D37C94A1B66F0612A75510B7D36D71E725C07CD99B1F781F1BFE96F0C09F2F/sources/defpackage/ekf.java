package defpackage;

import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ekf  reason: default package */
/* loaded from: classes3.dex */
public final class ekf extends ajmg {
    final /* synthetic */ eki a;
    private final int b;

    public ekf(eki ekiVar, int i) {
        this.a = ekiVar;
        this.b = i;
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void a(ImageView imageView) {
        this.a.p(this.b);
        eki.aG(imageView, this.b);
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void b(ImageView imageView) {
        this.a.p(this.b);
        imageView.setBackground(null);
    }
}
