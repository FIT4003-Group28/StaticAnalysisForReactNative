package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: ckne  reason: default package */
/* loaded from: classes4.dex */
public final class ckne extends bbuq {
    private final ckng d = new ckng();
    private final List<bvrt<dwfl>> c = new ArrayList();

    public ckne(dcdc<dwfl> dcdcVar) {
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.c.add(bvrt.b(dcdcVar.get(i)));
        }
    }

    @Override // defpackage.bbuq
    public final void a(int i, int i2) {
        this.d.b(i, i2);
    }

    @Override // defpackage.bbuq
    public final int b() {
        return this.c.size();
    }

    @Override // defpackage.bbuq
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bbuq
    public final int d() {
        return this.c.size();
    }

    @Override // defpackage.bbuq
    @dzsi
    public final dwfl e(int i) {
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return this.d.a(this.c.get(i).e((dssr) dwfl.w.cu(7), dwfl.w));
    }

    @Override // defpackage.bbuq
    public final int f(dwfl dwflVar) {
        return this.c.indexOf(bvrt.b(dwflVar));
    }

    @Override // defpackage.bbuq
    public final void i(int i) {
        if (i < 0 || i >= this.c.size()) {
            this.c.size();
            return;
        }
        this.c.remove(i);
        u();
    }

    @Override // defpackage.bbuq
    public final void j(Collection<dwfl> collection) {
    }

    @Override // defpackage.bbuq
    public final void k(String str, String str2) {
    }

    @Override // defpackage.bbuq
    public final void l(String str, List list) {
    }

    @Override // defpackage.bbuq
    public final void m(String str, String str2) {
    }
}
