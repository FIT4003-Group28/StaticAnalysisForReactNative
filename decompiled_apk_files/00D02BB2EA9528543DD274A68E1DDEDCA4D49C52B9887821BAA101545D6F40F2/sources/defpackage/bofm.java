package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bofm  reason: default package */
/* loaded from: classes3.dex */
final class bofm implements cqfc {
    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setAlpha(0.0f);
        view.animate().setDuration(160L).alpha(1.0f).start();
    }
}
