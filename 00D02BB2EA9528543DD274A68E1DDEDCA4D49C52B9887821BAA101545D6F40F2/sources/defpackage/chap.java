package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chap  reason: default package */
/* loaded from: classes4.dex */
public final class chap implements btzi<dupi, dupk> {
    final /* synthetic */ chas a;

    public chap(chas chasVar) {
        this.a = chasVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dupi> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dupi> btzrVar, dupk dupkVar) {
        dupk dupkVar2 = dupkVar;
        if ((dupkVar2.a & 1) != 0) {
            cgen cgenVar = this.a.i;
            dwpe dwpeVar = dupkVar2.b;
            if (dwpeVar == null) {
                dwpeVar = dwpe.a;
            }
            cgenVar.n(dwpeVar);
        }
    }
}
