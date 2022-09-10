package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: ckoa  reason: default package */
/* loaded from: classes4.dex */
public final class ckoa extends bbuq {
    private static final dcqe c = dcqe.c("ckoa");
    private final dcdc<bvrt<dwfl>> d;

    public ckoa(dcdc<dwfl> dcdcVar) {
        this.d = (dcdc) bvrt.c(dcdcVar, new dccx());
    }

    @Override // defpackage.bbuq
    public final void a(int i, int i2) {
    }

    @Override // defpackage.bbuq
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.bbuq
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bbuq
    public final int d() {
        return this.d.size();
    }

    @Override // defpackage.bbuq
    @dzsi
    public final dwfl e(int i) {
        if (i < 0 || i >= this.d.size()) {
            return null;
        }
        return this.d.get(i).e((dssr) dwfl.w.cu(7), dwfl.w);
    }

    @Override // defpackage.bbuq
    public final int f(dwfl dwflVar) {
        return this.d.indexOf(bvrt.b(dwflVar));
    }

    @Override // defpackage.bbuq
    public final void i(int i) {
        bvoo.h("Photos can't be deleted from placemark's photo page.", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void j(Collection<dwfl> collection) {
        bvoo.h("removePhotos is not currently supported", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void k(String str, String str2) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void l(String str, List<dwfa> list) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }

    @Override // defpackage.bbuq
    public final void m(String str, String str2) {
        bvoo.h("Photos can't be edited from placemark's photo page.", new Object[0]);
    }
}
