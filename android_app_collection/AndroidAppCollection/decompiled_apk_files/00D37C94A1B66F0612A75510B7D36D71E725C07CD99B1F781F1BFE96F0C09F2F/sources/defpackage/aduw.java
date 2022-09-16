package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
/* compiled from: PG */
/* renamed from: aduw  reason: default package */
/* loaded from: classes.dex */
public final class aduw extends aduk {
    public aduq a;

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        String str;
        super.R(bundle);
        TvSignInActivity tvSignInActivity = (TvSignInActivity) mJ();
        Bundle bundle2 = this.m;
        if (bundle2 != null && bundle2.getString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail") != null) {
            str = this.m.getString("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail");
        } else {
            str = tvSignInActivity.d;
            if (str == null) {
                str = null;
            }
        }
        this.a.b(str, tvSignInActivity.b, tvSignInActivity.c);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.a(layoutInflater, viewGroup);
    }
}
