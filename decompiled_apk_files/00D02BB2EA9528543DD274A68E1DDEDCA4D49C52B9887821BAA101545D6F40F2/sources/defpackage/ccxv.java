package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ccxv  reason: default package */
/* loaded from: classes4.dex */
final class ccxv implements cqfc {
    final /* synthetic */ cqfc a;
    private boolean b = false;

    public ccxv(cqfc cqfcVar) {
        this.a = cqfcVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a(view, z);
    }
}
