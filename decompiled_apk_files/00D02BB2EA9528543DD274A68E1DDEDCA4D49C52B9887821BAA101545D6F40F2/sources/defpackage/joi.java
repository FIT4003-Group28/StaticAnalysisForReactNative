package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: joi  reason: default package */
/* loaded from: classes7.dex */
public final class joi implements btzi<djwe, djwg> {
    final /* synthetic */ deig a;
    final /* synthetic */ jok b;

    public joi(jok jokVar, deig deigVar) {
        this.b = jokVar;
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djwe> btzrVar, btzy btzyVar) {
        this.b.a = null;
        this.a.j(joj.a(btzyVar.p));
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djwe> btzrVar, djwg djwgVar) {
        djwg djwgVar2 = djwgVar;
        this.b.a = null;
        dkdo dkdoVar = djwgVar2.a;
        if (dkdoVar == null) {
            dkdoVar = dkdo.d;
        }
        dkdoVar.a.size();
        deig deigVar = this.a;
        dkdo dkdoVar2 = djwgVar2.a;
        if (dkdoVar2 == null) {
            dkdoVar2 = dkdo.d;
        }
        deigVar.j(new joj(dkdoVar2, null));
    }
}
