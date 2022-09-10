package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjr  reason: default package */
/* loaded from: classes.dex */
public final class gjr implements View.OnClickListener {
    final /* synthetic */ MainLayout a;

    public gjr(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fd K = this.a.e.K();
        if (K instanceof egs) {
            ((egs) K).Qt();
        } else {
            this.a.e.w();
        }
    }
}
