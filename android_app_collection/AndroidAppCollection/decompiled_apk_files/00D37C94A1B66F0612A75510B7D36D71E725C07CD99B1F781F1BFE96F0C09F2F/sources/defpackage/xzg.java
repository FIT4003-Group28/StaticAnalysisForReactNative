package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: xzg  reason: default package */
/* loaded from: classes4.dex */
abstract class xzg implements DialogInterface.OnDismissListener, ajru {
    final xyw a;
    boolean b;

    public xzg(xyw xywVar) {
        this.a = xywVar;
    }

    protected abstract void d();

    @Override // defpackage.ajru
    public void oK(ajrs ajrsVar, Object obj) {
        throw null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.b) {
            d();
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.a.remove(this);
    }
}
