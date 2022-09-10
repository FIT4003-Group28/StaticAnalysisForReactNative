package defpackage;

import android.view.KeyEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nfe  reason: default package */
/* loaded from: classes7.dex */
public final class nfe implements kdh {
    final /* synthetic */ nff a;

    public nfe(nff nffVar) {
        this.a = nffVar;
    }

    @Override // defpackage.kdh
    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 21) {
            this.a.b.run();
            return true;
        }
        return false;
    }
}
