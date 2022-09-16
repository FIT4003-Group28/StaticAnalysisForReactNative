package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adul  reason: default package */
/* loaded from: classes.dex */
public final class adul implements abv {
    final /* synthetic */ adum a;

    public adul(adum adumVar) {
        this.a = adumVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        adum adumVar = this.a;
        if (!adumVar.a) {
            adumVar.a = true;
            adumVar.lI();
            TvSignInActivity tvSignInActivity = (TvSignInActivity) adumVar;
        }
    }
}
