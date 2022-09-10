package defpackage;

import android.os.Bundle;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: cagi  reason: default package */
/* loaded from: classes4.dex */
public abstract class cagi<Q extends dssj, S extends dssj> implements btzi<Q, S> {
    private static final dcqe a = dcqe.c("cagi");
    public nvg b;
    @dzsi
    public duld c;
    @dzsi
    public Q d;
    @dzsi
    public Q e;
    protected btzp<Q, S> f;
    public String g = "";
    @dzsi
    private btzc h;

    /* JADX INFO: Access modifiers changed from: protected */
    public cagi() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cagi(btzp<Q, S> btzpVar, nvg nvgVar) {
        this.f = btzpVar;
        this.b = nvgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final dtid l(dulb dulbVar) {
        try {
            return ((dthy) dtid.d.bZ().by(dulbVar.bS())).bK();
        } catch (dsrm e) {
            bvoo.h("Cannot parse GMM CardProto as Odelay CardProto %s %s", dulbVar, e);
            return dtid.d;
        }
    }

    @Override // defpackage.btzi
    public final void QY(btzr<Q> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        dssj dssjVar = (dssj) obj;
        bvrj.UI_THREAD.c();
        if (!this.b.i) {
            return;
        }
        this.d = null;
        e(dssjVar);
        this.b.s();
    }

    protected abstract dssr<Q> c();

    public abstract void d(duld duldVar);

    protected abstract void e(S s);

    public void f(Bundle bundle) {
        this.b.b(bundle);
        Q q = this.d;
        byte[] bArr = null;
        bundle.putByteArray("contributions_fetcher_pending_request", q == null ? null : q.bS());
        Q q2 = this.e;
        if (q2 != null) {
            bArr = q2.bS();
        }
        bundle.putByteArray("contributions_fetcher_first_request", bArr);
        bundle.putString("arg_key_header_title", this.g);
    }

    public void g(Bundle bundle) {
        this.b.c(bundle);
        this.b.s();
        this.d = (Q) bvrs.b(bundle.getByteArray("contributions_fetcher_pending_request"), c());
        this.e = (Q) bvrs.b(bundle.getByteArray("contributions_fetcher_first_request"), c());
        this.g = bundle.getString("arg_key_header_title", "");
    }

    public final void h() {
        bvrj.UI_THREAD.c();
        Q q = this.d;
        if (q != null) {
            btzc btzcVar = this.h;
            if (btzcVar != null) {
                btzcVar.a();
            }
            this.h = this.f.a(q, this, bvrj.UI_THREAD);
        }
    }

    public final void i(Q q) {
        bvrj.UI_THREAD.c();
        this.d = q;
        this.e = q;
    }

    public final void j() {
        bvrj.UI_THREAD.c();
        this.b.e();
        this.b.s();
        Q q = this.e;
        if (q != null) {
            this.d = q;
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(Q q) {
        bvrj.UI_THREAD.c();
        if (this.d == null) {
            this.d = q;
            h();
        }
    }
}
