package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: yie  reason: default package */
/* loaded from: classes7.dex */
public abstract class yie<ViewModelT extends cqkp> extends gen {
    public cqkj a;
    @dzsi
    public ViewModelT b;
    @dzsi
    private cqkf<ViewModelT> c;

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        this.c = null;
        super.Qe();
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    protected abstract ViewModelT g(@dzsi Bundle bundle);

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        if (bundle == null) {
            bundle = this.o;
        }
        this.b = g(bundle);
        this.c = this.a.e(q());
        czwe czweVar = new czwe(J());
        cqkf<ViewModelT> cqkfVar = this.c;
        dbsk.s(cqkfVar);
        czweVar.setContentView(cqkfVar.c());
        czweVar.a().y(3);
        czweVar.a().m = true;
        return czweVar;
    }

    protected abstract cqiw<ViewModelT> q();

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<ViewModelT> cqkfVar = this.c;
        if (cqkfVar != null) {
            ViewModelT viewmodelt = this.b;
            dbsk.s(viewmodelt);
            cqkfVar.e(viewmodelt);
        }
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<ViewModelT> cqkfVar = this.c;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.u();
    }
}
