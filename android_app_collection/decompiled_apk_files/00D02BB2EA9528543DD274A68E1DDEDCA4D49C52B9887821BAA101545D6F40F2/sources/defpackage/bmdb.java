package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmdb  reason: default package */
/* loaded from: classes3.dex */
public class bmdb implements bmcv {
    bmcm a;
    private final Resources e;
    private final ff f;
    private final bnxn g;
    private final btvo h;
    private int i = 0;
    public bmcn c = null;
    public CharSequence d = "";
    private final List<bmcs> j = new ArrayList();
    final bmcr b = new bmda(this);

    public bmdb(bnxn bnxnVar, Resources resources, ff ffVar, btvo btvoVar) {
        this.e = resources;
        this.f = ffVar;
        this.g = bnxnVar;
        this.h = btvoVar;
        this.a = new bmcz(this, bnxnVar);
    }

    @Override // defpackage.bmcv
    public List<bmcs> a() {
        return this.j;
    }

    @Override // defpackage.bmcv
    public bmcr b() {
        return this.b;
    }

    @Override // defpackage.bmcv
    public void c(int i) {
        this.d = this.j.get(i).a();
        this.i = i;
        cqkx.p(this.b);
    }

    @Override // defpackage.bmcv
    public Integer d() {
        return Integer.valueOf(this.i);
    }

    public bmcn e() {
        return this.c;
    }

    public void f(bmcn bmcnVar) {
        this.c = bmcnVar;
        if (bmcnVar != null) {
            this.j.clear();
            dodk dodkVar = bmcnVar.a;
            boolean z = false;
            for (int i = 0; i < dodkVar.a.size(); i++) {
                dgls dglsVar = dodkVar.a.get(i);
                ArrayList arrayList = new ArrayList();
                for (dglo dgloVar : dglsVar.d) {
                    dnfd b = bmcnVar.b(dgloVar.b);
                    if (b != null) {
                        dgln ca = dglo.g.ca(dgloVar);
                        dglu dgluVar = b.c;
                        if (dgluVar == null) {
                            dgluVar = dglu.e;
                        }
                        if (ca.c) {
                            ca.bF();
                            ca.c = false;
                        }
                        dglo dgloVar2 = (dglo) ca.b;
                        dgluVar.getClass();
                        dgloVar2.d = dgluVar;
                        dgloVar2.a |= 4;
                        dgloVar = ca.bK();
                    }
                    arrayList.add(dgloVar);
                }
                this.j.add(new bmcx(arrayList, dglsVar.c, bmcnVar, this.a, this.e, this.f, this.h));
            }
            if (!this.j.isEmpty()) {
                ((bmcx) this.j.get(0)).d(false);
                c(0);
            }
            bnxn bnxnVar = this.g;
            if (this.c.a().a.size() > 0) {
                z = true;
            }
            bnxnVar.d(z);
        }
    }
}
