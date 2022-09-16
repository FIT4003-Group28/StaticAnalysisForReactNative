package defpackage;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cutj  reason: default package */
/* loaded from: classes5.dex */
final class cutj implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ cutm a;
    final /* synthetic */ cuhz b;
    final /* synthetic */ cutl c;

    public cutj(cutl cutlVar, cutm cutmVar, cuhz cuhzVar) {
        this.c = cutlVar;
        this.a = cutmVar;
        this.b = cuhzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.a.getLineCount() == 1) {
            cutm cutmVar = this.a;
            cutl cutlVar = this.c;
            int i2 = cutlVar.i;
            int i3 = cutlVar.j;
            cutmVar.setPadding(i2, i3, i2, i3);
            this.a.setCornerRadiusResource(R.dimen.suggestion_chip_one_line_radius);
            this.a.setGravity(17);
            return;
        }
        boolean z = !TextUtils.isEmpty(this.b.e());
        cutm cutmVar2 = this.a;
        cutl cutlVar2 = this.c;
        int i4 = cutlVar2.f;
        int i5 = z ? cutlVar2.k : cutlVar2.g;
        if (z) {
            i = cutlVar2.l;
        } else {
            i = cutlVar2.h;
        }
        cutmVar2.setPadding(i4, i5, i4, i);
        this.a.setCornerRadiusResource(R.dimen.suggestion_chip_multi_line_radius);
        this.a.setGravity(16);
    }
}
