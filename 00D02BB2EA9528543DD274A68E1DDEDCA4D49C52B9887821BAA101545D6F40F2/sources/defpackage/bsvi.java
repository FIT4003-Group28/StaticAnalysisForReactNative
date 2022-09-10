package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsvi  reason: default package */
/* loaded from: classes4.dex */
public final class bsvi implements btzi<dwvr, dwvt> {
    final /* synthetic */ dbsg a;
    final /* synthetic */ deig b;
    final /* synthetic */ bsvj c;

    public bsvi(bsvj bsvjVar, dbsg dbsgVar, deig deigVar) {
        this.c = bsvjVar;
        this.a = dbsgVar;
        this.b = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwvr> btzrVar, btzy btzyVar) {
        if (this.a.a()) {
            this.c.c.b(this.a.b());
        }
        this.b.k(new btzz(btzyVar));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwvr> btzrVar, dwvt dwvtVar) {
        dwvt dwvtVar2 = dwvtVar;
        dorq dorqVar = dwvtVar2.b;
        if (dorqVar == null) {
            dorqVar = dorq.d;
        }
        if ((dorqVar.a & 1) != 0) {
            anhk anhkVar = this.c.d;
            dorq dorqVar2 = dwvtVar2.b;
            if (dorqVar2 == null) {
                dorqVar2 = dorq.d;
            }
            anhkVar.e(dorqVar2.b);
        }
        dorq dorqVar3 = dwvtVar2.b;
        if (dorqVar3 == null) {
            dorqVar3 = dorq.d;
        }
        if ((dorqVar3.a & 2) != 0) {
            anhk anhkVar2 = this.c.d;
            dorq dorqVar4 = dwvtVar2.b;
            if (dorqVar4 == null) {
                dorqVar4 = dorq.d;
            }
            anhkVar2.g(dorqVar4.c);
        }
        if ((dwvtVar2.a & 4) != 0) {
            anhk anhkVar3 = this.c.d;
            dnwb dnwbVar = dnwb.i;
            dnwb dnwbVar2 = dwvtVar2.c;
            if (dnwbVar2 == null) {
                dnwbVar2 = dnwb.i;
            }
            anhkVar3.b(dnwbVar, dnwbVar2);
        }
        if (this.a.a()) {
            this.c.c.b(this.a.b());
        }
        this.b.j(null);
    }
}
