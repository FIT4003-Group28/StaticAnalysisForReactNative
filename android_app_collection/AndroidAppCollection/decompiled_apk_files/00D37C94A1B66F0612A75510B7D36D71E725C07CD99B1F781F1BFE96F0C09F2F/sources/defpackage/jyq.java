package defpackage;

import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemController;
/* compiled from: PG */
/* renamed from: jyq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jyq implements ayqb {
    public final /* synthetic */ SingleLoopMenuItemController a;
    private final /* synthetic */ int b;

    public /* synthetic */ jyq(SingleLoopMenuItemController singleLoopMenuItemController, int i) {
        this.b = i;
        this.a = singleLoopMenuItemController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b != 0) {
            SingleLoopMenuItemController singleLoopMenuItemController = this.a;
            ahhm ahhmVar = (ahhm) obj;
            boolean z = false;
            if (ahhmVar.a() == null) {
                singleLoopMenuItemController.g = false;
            } else {
                if (ahhmVar.a().h != null && ahhmVar.a().h.b()) {
                    z = true;
                }
                singleLoopMenuItemController.g = z;
            }
            jxt jxtVar = singleLoopMenuItemController.e;
            if (jxtVar == null) {
                return;
            }
            jxtVar.g(z);
            if (!singleLoopMenuItemController.e.g) {
                return;
            }
            singleLoopMenuItemController.c.D(new acte(actj.SINGLE_LOOP_PLAYER_MENU_ITEM));
            if (!singleLoopMenuItemController.h) {
                return;
            }
            singleLoopMenuItemController.c.u(new acte(actj.SINGLE_LOOP_PLAYER_MENU_ITEM), null);
            return;
        }
        this.a.i = ((ahhw) obj).c();
    }
}
