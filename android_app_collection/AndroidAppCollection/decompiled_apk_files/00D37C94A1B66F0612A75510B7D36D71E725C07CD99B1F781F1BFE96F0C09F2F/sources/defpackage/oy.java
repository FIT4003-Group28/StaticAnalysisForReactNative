package defpackage;

import android.view.Menu;
/* compiled from: PG */
/* renamed from: oy  reason: default package */
/* loaded from: classes4.dex */
final class oy implements Runnable {
    final /* synthetic */ pd a;

    public oy(pd pdVar) {
        this.a = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.a;
        Menu D = pdVar.D();
        Menu menu = true != (D instanceof sf) ? null : D;
        if (menu != null) {
            ((sf) menu).s();
        }
        try {
            D.clear();
            if (!pdVar.c.onCreatePanelMenu(0, D) || !pdVar.c.onPreparePanel(0, null, D)) {
                D.clear();
            }
            if (menu == null) {
                return;
            }
            ((sf) menu).r();
        } catch (Throwable th) {
            if (menu != null) {
                ((sf) menu).r();
            }
            throw th;
        }
    }
}
