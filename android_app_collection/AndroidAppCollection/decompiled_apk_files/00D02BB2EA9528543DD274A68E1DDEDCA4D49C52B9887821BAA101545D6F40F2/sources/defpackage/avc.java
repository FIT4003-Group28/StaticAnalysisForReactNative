package defpackage;

import android.os.Bundle;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avc  reason: default package */
/* loaded from: classes2.dex */
public final class avc extends ne {
    final /* synthetic */ avd b;

    public avc(avd avdVar) {
        this.b = avdVar;
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        this.b.e.f(view, pcVar);
        int Z = this.b.d.Z(view);
        abg abgVar = this.b.d.k;
        if (!(abgVar instanceof auw)) {
            return;
        }
        ((auw) abgVar).z(Z);
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        return this.b.e.i(view, i, bundle);
    }
}
