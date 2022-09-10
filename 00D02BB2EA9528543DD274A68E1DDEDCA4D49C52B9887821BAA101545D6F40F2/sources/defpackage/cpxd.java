package defpackage;

import android.app.KeyguardManager;
/* compiled from: PG */
/* renamed from: cpxd  reason: default package */
/* loaded from: classes5.dex */
final class cpxd extends KeyguardManager.KeyguardDismissCallback {
    final /* synthetic */ cpxf a;

    public cpxd(cpxf cpxfVar) {
        this.a = cpxfVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        cpxe cpxeVar = this.a.b;
        if (cpxeVar != null) {
            cpxeVar.k(3);
        }
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        cpxe cpxeVar = this.a.b;
        if (cpxeVar != null) {
            cpxeVar.k(4);
        }
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        cpxe cpxeVar = this.a.b;
        if (cpxeVar != null) {
            cpxeVar.k(2);
        }
    }
}
