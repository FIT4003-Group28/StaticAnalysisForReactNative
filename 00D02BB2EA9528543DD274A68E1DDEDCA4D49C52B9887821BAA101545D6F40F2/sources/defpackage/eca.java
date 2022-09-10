package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: eca  reason: default package */
/* loaded from: classes6.dex */
public final class eca extends gen {
    public cqkj a;
    public ece b;

    @Override // defpackage.ges
    protected final void Nv() {
        ((ecb) btsx.b(ecb.class, this)).d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        dkfv dkfvVar = (dkfv) bvrs.b(this.o.getByteArray("arg_key_badge"), (dssr) dkfv.f.cu(7));
        dbsk.s(dkfvVar);
        cqkf e = this.a.e(new eah());
        ece eceVar = this.b;
        Runnable runnable = new Runnable(this) { // from class: ebz
            private final eca a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aT();
            }
        };
        ff ffVar = (ff) ((dxjd) eceVar.a).a;
        ece.a(ffVar, 1);
        ece.a(dkfvVar, 2);
        ece.a(runnable, 3);
        e.e(new ecd(ffVar, dkfvVar, runnable));
        return new AlertDialog.Builder(H()).setView(e.c()).create();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxk.d;
    }
}
