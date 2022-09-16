package defpackage;

import android.app.Dialog;
/* compiled from: PG */
/* renamed from: qus  reason: default package */
/* loaded from: classes4.dex */
public final class qus {
    final /* synthetic */ Dialog a;
    final /* synthetic */ qtw b;

    public qus() {
    }

    public qus(qtw qtwVar, Dialog dialog) {
        this.b = qtwVar;
        this.a = dialog;
    }

    public final void a() {
        this.b.a.c();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
