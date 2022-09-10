package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: qui  reason: default package */
/* loaded from: classes7.dex */
public final class qui extends dxiy {
    public cqkj ad;
    public rbt ae;

    public static void aJ(ff ffVar, qui quiVar) {
        gn g = ffVar.g();
        if (g.H("UNSUPPORTED_COMMUTE_DIALOG_FRAGMENT") != null) {
            return;
        }
        gz b = g.b();
        b.y(quiVar, "UNSUPPORTED_COMMUTE_DIALOG_FRAGMENT");
        b.f();
    }

    @Override // defpackage.ry, defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        rbt rbtVar = this.ae;
        domy b = domy.b(this.o.getInt("immersive_travel_mode"));
        domy b2 = domy.b(this.o.getInt("user_travel_mode"));
        ros a = rbtVar.a.a();
        rbt.a(a, 1);
        rbt.a(this, 2);
        rbt.a(b, 3);
        rbt.a(b2, 4);
        return new quh(J(), new rbs(a, this, b, b2), this.ad);
    }
}
