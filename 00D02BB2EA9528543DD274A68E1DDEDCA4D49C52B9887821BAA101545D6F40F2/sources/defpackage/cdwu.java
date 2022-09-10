package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdwu  reason: default package */
/* loaded from: classes4.dex */
public final class cdwu extends abg<cdxl> implements cdwo {
    private final cebd g;
    private cdwt h = null;
    public dcdc<cdxe> a = dcdc.e();
    public dcdc<cdxd> e = dcdc.e();
    public cdwo f = null;

    public cdwu(cebd cebdVar) {
        this.g = cebdVar;
        j(true);
    }

    @Override // defpackage.cdwo
    public final void a(cdwq cdwqVar) {
        cdwo cdwoVar = this.f;
        if (cdwoVar != null) {
            ((cdwv) cdwoVar).a.d.g(cdwqVar);
        }
    }

    @Override // defpackage.abg
    public final int c() {
        return this.e.size();
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ cdxl d(ViewGroup viewGroup, int i) {
        cdxc cdxcVar = cdxc.c[i];
        dbsk.s(cdxcVar);
        return cdxcVar.d.a(viewGroup, this.g);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(cdxl cdxlVar, int i) {
        cdxlVar.C(this.e.get(i), this, this.a.size(), null);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void f(cdxl cdxlVar, int i, List list) {
        cdxlVar.C(this.e.get(i), this, this.a.size(), list.isEmpty() ? null : dcft.s(list));
    }

    @Override // defpackage.abg
    public final int i(int i) {
        return this.e.get(i).b().ordinal();
    }

    @Override // defpackage.abg
    public final long k(int i) {
        return this.e.get(i).d();
    }

    @Override // defpackage.abg
    public final void q(RecyclerView recyclerView) {
        cdwt cdwtVar = new cdwt(recyclerView);
        this.h = cdwtVar;
        recyclerView.addOnLayoutChangeListener(cdwtVar);
    }

    @Override // defpackage.abg
    public final void r(RecyclerView recyclerView) {
        cdwt cdwtVar = this.h;
        dbsk.s(cdwtVar);
        recyclerView.removeOnLayoutChangeListener(cdwtVar);
    }
}
