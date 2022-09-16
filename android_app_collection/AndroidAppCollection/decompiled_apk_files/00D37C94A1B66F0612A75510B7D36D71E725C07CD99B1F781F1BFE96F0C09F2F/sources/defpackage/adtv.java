package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
/* compiled from: PG */
/* renamed from: adtv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adtv implements View.OnClickListener {
    public final /* synthetic */ adtw a;
    private final /* synthetic */ int b;

    public /* synthetic */ adtv(adtw adtwVar, int i) {
        this.b = i;
        this.a = adtwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            adtw adtwVar = this.a;
            adtwVar.b.H(3, new acte(acuo.b(36381)), null);
            waj wajVar = adtwVar.c;
            wajVar.getClass();
            adtwVar.f(wajVar.b);
        } else if (i == 1) {
            adtw adtwVar2 = this.a;
            adtwVar2.b.H(3, new acte(acuo.b(36380)), null);
            ((TvSignInActivity) adtwVar2.a.mJ()).finish();
        } else if (i == 2) {
            adtw adtwVar3 = this.a;
            adtwVar3.b.H(3, new acte(acuo.b(36384)), null);
            adtwVar3.e();
        } else {
            adtw adtwVar4 = this.a;
            adtwVar4.b.H(3, new acte(acuo.b(36383)), null);
            adtwVar4.e();
        }
    }
}
