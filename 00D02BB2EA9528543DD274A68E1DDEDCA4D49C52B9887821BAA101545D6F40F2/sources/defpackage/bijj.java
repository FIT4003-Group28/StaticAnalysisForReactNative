package defpackage;
/* compiled from: PG */
/* renamed from: bijj  reason: default package */
/* loaded from: classes3.dex */
final class bijj implements btzi<dwdk, dwdm> {
    final /* synthetic */ String a;
    final /* synthetic */ bijk b;

    public bijj(bijk bijkVar, String str) {
        this.b = bijkVar;
        this.a = str;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwdk> btzrVar, btzy btzyVar) {
        this.b.x();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwdk> btzrVar, dwdm dwdmVar) {
        dwdt dwdtVar = dwdmVar.a;
        if (dwdtVar == null) {
            dwdtVar = dwdt.b;
        }
        int a = dwds.a(dwdtVar.a);
        if (a == 0 || a != 2) {
            this.b.x();
            return;
        }
        bijk bijkVar = this.b;
        bijkVar.f = false;
        bijkVar.e = false;
        bijkVar.a.m(this.a);
        cqkx.p(this.b);
    }
}
