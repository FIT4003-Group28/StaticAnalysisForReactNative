package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: addi  reason: default package */
/* loaded from: classes.dex */
public final class addi implements abv {
    final /* synthetic */ addj a;

    public addi(addj addjVar) {
        this.a = addjVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        addj addjVar = this.a;
        if (!addjVar.a) {
            addjVar.a = true;
            addjVar.lI();
            PairWithTvActivity pairWithTvActivity = (PairWithTvActivity) addjVar;
        }
    }
}
