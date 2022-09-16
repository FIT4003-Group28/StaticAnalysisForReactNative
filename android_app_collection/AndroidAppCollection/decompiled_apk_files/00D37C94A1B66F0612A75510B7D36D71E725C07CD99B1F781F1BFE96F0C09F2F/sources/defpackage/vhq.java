package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: vhq  reason: default package */
/* loaded from: classes4.dex */
public final class vhq implements vhs {
    final /* synthetic */ Bundle a;
    private final /* synthetic */ int b;

    public vhq(Bundle bundle) {
        this.a = bundle;
    }

    public vhq(Bundle bundle, int i) {
        this.b = i;
        this.a = bundle;
    }

    @Override // defpackage.vhs
    public final void a(vif vifVar) {
        int i = this.b;
        if (i == 0) {
            if (!(vifVar instanceof vhl)) {
                return;
            }
            vht.d(vifVar, this.a).getClass();
            ((vhl) vifVar).a();
        } else if (i == 1) {
            if (!(vifVar instanceof vhh)) {
                return;
            }
            vht.d(vifVar, this.a);
            ((vhh) vifVar).a();
        } else if (i == 2) {
            if (!(vifVar instanceof vvo)) {
                return;
            }
            ((vvo) vifVar).a(vht.d(vifVar, this.a));
        } else if (!(vifVar instanceof vvo)) {
        } else {
            Bundle bundle = new Bundle();
            ((vvo) vifVar).e(bundle);
            String c = vht.c(vifVar);
            c.getClass();
            this.a.putBundle(c, bundle);
        }
    }
}
