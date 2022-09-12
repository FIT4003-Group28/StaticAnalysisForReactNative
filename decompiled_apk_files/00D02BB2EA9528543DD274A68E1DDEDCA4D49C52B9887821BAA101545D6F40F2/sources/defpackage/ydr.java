package defpackage;
/* compiled from: PG */
/* renamed from: ydr  reason: default package */
/* loaded from: classes7.dex */
public final class ydr implements btzi<djxs, djxy> {
    final /* synthetic */ degu a;
    final /* synthetic */ ydu b;

    public ydr(ydu yduVar, degu deguVar) {
        this.b = yduVar;
        this.a = deguVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djxs> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.c();
        try {
            if (!btzyVar.equals(btzy.d)) {
                if (btzyVar.equals(btzy.k)) {
                    this.a.a(new ydt());
                } else {
                    bttq bttqVar = btzyVar.p;
                    this.a.a(new Throwable());
                }
            }
        } finally {
            this.b.c = null;
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djxs> btzrVar, djxy djxyVar) {
        degu deguVar;
        Throwable th;
        djxy djxyVar2 = djxyVar;
        bvrj.UI_THREAD.c();
        try {
            if (djxyVar2.a.size() == 0) {
                deguVar = this.a;
                th = new Throwable();
            } else {
                djxx djxxVar = djxyVar2.a.get(0);
                int a = djxw.a(djxxVar.b);
                if (a == 0) {
                    a = 1;
                }
                if (a == 2) {
                    if ((djxxVar.a & 2) != 0) {
                        ydu yduVar = this.b;
                        ckcv ckcvVar = yduVar.d;
                        if (ckcvVar != null) {
                            ckcvVar.a((ckcr) yduVar.b.a(ckki.b));
                        }
                        degu deguVar2 = this.a;
                        djxo djxoVar = djxxVar.c;
                        if (djxoVar == null) {
                            djxoVar = djxo.f;
                        }
                        deguVar2.b(djxoVar);
                    }
                    deguVar = this.a;
                    th = new yds();
                } else if (a == 3) {
                    deguVar = this.a;
                    th = new yds();
                } else {
                    deguVar = this.a;
                    th = new Throwable();
                }
            }
            deguVar.a(th);
        } finally {
            this.b.c = null;
        }
    }
}
