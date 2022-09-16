package defpackage;

import android.widget.ImageView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ekv  reason: default package */
/* loaded from: classes3.dex */
public final class ekv extends ajmg {
    final /* synthetic */ ekx a;

    public ekv(ekx ekxVar) {
        this.a = ekxVar;
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void a(ImageView imageView) {
        this.a.g();
    }

    @Override // defpackage.ajmg, defpackage.ajmw
    public final void b(ImageView imageView) {
        this.a.f.setBackground(null);
        fny f = this.a.f();
        if (f == null || f.a() == null) {
            return;
        }
        this.a.h.a(this, f.a());
    }
}
