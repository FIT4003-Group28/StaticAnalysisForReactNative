package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: nct  reason: default package */
/* loaded from: classes3.dex */
public final class nct implements ajmw {
    private final /* synthetic */ int a;

    public nct() {
    }

    public nct(int i) {
        this.a = i;
    }

    @Override // defpackage.ajmw
    public final void b(ImageView imageView) {
    }

    @Override // defpackage.ajmw
    public final void c(ImageView imageView) {
    }

    @Override // defpackage.ajmw
    public final void a(ImageView imageView) {
        int i = this.a;
        if (i == 0) {
            afus.b(1, 1, "AdItemDetailsSectionPresenter failed to load image:");
        } else if (i == 1) {
            afus.b(1, 1, "AdClickableIconSectionPresenter failed to load image:");
        } else {
            imageView.setVisibility(8);
            afus.b(1, 1, "AdsCompactEngagementPanelHeader failed to load icon:");
        }
    }
}
