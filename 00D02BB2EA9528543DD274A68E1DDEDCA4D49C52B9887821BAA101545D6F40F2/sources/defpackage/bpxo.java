package defpackage;
/* compiled from: PG */
/* renamed from: bpxo  reason: default package */
/* loaded from: classes4.dex */
public final class bpxo extends bvxb<dgoi, dgok> {
    public final boxa a;
    public final bvvw b;
    private final bpxy c;

    public bpxo(bvvw bvvwVar, boxa boxaVar, bpxy bpxyVar) {
        this.b = bvvwVar;
        this.a = boxaVar;
        this.c = bpxyVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.lrw";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    @dzsi
    public final /* bridge */ /* synthetic */ dgok e(dgoi dgoiVar) {
        final dgoi dgoiVar2 = dgoiVar;
        this.c.a(akqi.b(dgoiVar2.a), new bpxx(this, dgoiVar2) { // from class: bpxn
            private final bpxo a;
            private final dgoi b;

            {
                this.a = this;
                this.b = dgoiVar2;
            }

            @Override // defpackage.bpxx
            public final void a(ilo iloVar) {
                bpxo bpxoVar = this.a;
                dgoi dgoiVar3 = this.b;
                boxa boxaVar = bpxoVar.a;
                bwrs<ilo> a = bwrs.a(iloVar);
                dnqe dnqeVar = dgoiVar3.c;
                if (dnqeVar == null) {
                    dnqeVar = dnqe.i;
                }
                int a2 = dobj.a(dgoiVar3.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                bvxh V = boxaVar.V(a, dnqeVar, a2);
                if (V != null) {
                    bpxoVar.b.q(V, dtxo.l);
                }
            }
        });
        return dgok.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgoi j(byte[] bArr) {
        return ((dgoh) dgoi.d.bZ().bx(bArr, dsqa.c())).bK();
    }
}
