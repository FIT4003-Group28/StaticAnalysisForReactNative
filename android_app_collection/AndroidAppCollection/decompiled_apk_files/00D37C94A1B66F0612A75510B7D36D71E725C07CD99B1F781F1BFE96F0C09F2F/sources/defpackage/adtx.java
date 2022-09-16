package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
/* compiled from: PG */
/* renamed from: adtx  reason: default package */
/* loaded from: classes.dex */
public final class adtx extends aduj {
    public adtu a;
    public adux b;

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        Bundle bundle2 = this.m;
        boolean z = true;
        boolean z2 = bundle2 != null && bundle2.getBoolean("com.google.android.libraries.youtube.mdx.tvsignin.keyNotifyProgressApi", false);
        TvSignInActivity tvSignInActivity = (TvSignInActivity) mJ();
        adtu adtuVar = this.a;
        String str = tvSignInActivity.c;
        if (tvSignInActivity.e != 2) {
            z = false;
        }
        adtuVar.b(z2, str, z);
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            this.a.c(intent);
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a(layoutInflater, viewGroup);
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        if (this.a.d()) {
            this.b.a(((TvSignInActivity) mJ()).c, "canceled");
        }
    }
}
