package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: oyw  reason: default package */
/* loaded from: classes7.dex */
final class oyw implements cqfc {
    final /* synthetic */ cqfc a;
    final /* synthetic */ oyy b;

    public oyw(oyy oyyVar, cqfc cqfcVar) {
        this.b = oyyVar;
        this.a = cqfcVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (!this.b.a) {
            this.a.a(view, z);
            this.b.a = true;
        }
    }
}
