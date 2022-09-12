package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: jty  reason: default package */
/* loaded from: classes7.dex */
public final class jty extends FrameLayout {
    private final ktq a;
    @dzsi
    private kdh b;

    public jty(Context context, ktq ktqVar) {
        super(context);
        this.a = ktqVar;
    }

    public final void a() {
        dbsk.l(this.b != null);
        this.b = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.a.a) {
            return false;
        }
        kdh kdhVar = this.b;
        if (kdhVar != null && kdhVar.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setKeyInterceptor(kdh kdhVar) {
        kdh kdhVar2 = this.b;
        boolean z = true;
        if (kdhVar2 != null && kdhVar2 != kdhVar) {
            z = false;
        }
        dbsk.l(z);
        dbsk.s(kdhVar);
        this.b = kdhVar;
    }
}
