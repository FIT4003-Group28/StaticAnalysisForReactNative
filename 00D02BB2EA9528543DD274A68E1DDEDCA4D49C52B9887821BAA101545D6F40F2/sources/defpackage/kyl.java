package defpackage;

import android.view.KeyEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kyl  reason: default package */
/* loaded from: classes7.dex */
public final class kyl implements kdh {
    final /* synthetic */ kyn a;

    public kyl(kyn kynVar) {
        this.a = kynVar;
    }

    @Override // defpackage.kdh
    public final boolean a(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 23) {
            if (keyEvent.getRepeatCount() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case 19:
                    i = 1;
                    break;
                case 20:
                    i = 2;
                    break;
                case 21:
                    i = 3;
                    break;
                case 22:
                    i = 4;
                    break;
                default:
                    return false;
            }
            kyq kyqVar = this.a.d;
            int action = keyEvent.getAction();
            synchronized (kyqVar.b) {
                if (action == 0) {
                    int i2 = i - 1;
                    if (i2 == 0 || i2 == 1) {
                        if (kyqVar.g != i) {
                            long a = kyqVar.a.a();
                            kyqVar.e = a;
                            kyqVar.c = a;
                            kyqVar.g = i;
                        }
                    } else if (kyqVar.h != i) {
                        long a2 = kyqVar.a.a();
                        kyqVar.f = a2;
                        kyqVar.d = a2;
                        kyqVar.h = i;
                    }
                } else {
                    int i3 = i - 1;
                    if (i3 == 0 || i3 == 1) {
                        kyqVar.b();
                    } else {
                        kyqVar.c();
                    }
                }
            }
            kyn kynVar = this.a;
            kynVar.a.r(kynVar.d);
            this.a.e = false;
            return true;
        }
        this.a.b.b();
        return true;
    }
}
