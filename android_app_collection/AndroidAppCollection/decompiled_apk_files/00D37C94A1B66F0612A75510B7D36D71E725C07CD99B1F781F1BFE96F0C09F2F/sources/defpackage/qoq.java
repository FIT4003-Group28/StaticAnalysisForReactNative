package defpackage;

import android.content.Intent;
import android.view.KeyEvent;
/* compiled from: PG */
/* renamed from: qoq  reason: default package */
/* loaded from: classes4.dex */
public final class qoq extends is {
    final /* synthetic */ qor e;

    public qoq(qor qorVar) {
        this.e = qorVar;
    }

    @Override // defpackage.is
    public final void c() {
        this.e.e.k();
    }

    @Override // defpackage.is
    public final void d() {
        this.e.e.k();
    }

    @Override // defpackage.is
    public final void h(long j) {
        qkd qkdVar = new qkd();
        qkdVar.a = j;
        this.e.e.t(qkdVar.a());
    }

    @Override // defpackage.is
    public final boolean m(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
                return true;
            }
            this.e.e.k();
            return true;
        }
        return true;
    }
}
