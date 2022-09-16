package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdfr  reason: default package */
/* loaded from: classes4.dex */
public final class cdfr implements btzi<dupe, dupg> {
    final /* synthetic */ cdfu a;
    final /* synthetic */ cdfs b;

    public cdfr(cdfs cdfsVar, cdfu cdfuVar) {
        this.b = cdfsVar;
        this.a = cdfuVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dupe> btzrVar, btzy btzyVar) {
        cdfu cdfuVar = this.a;
        if (cdfuVar != null) {
            cdfuVar.a(false);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dupe> btzrVar, dupg dupgVar) {
        dupg dupgVar2 = dupgVar;
        anhk anhkVar = this.b.e;
        dnwb dnwbVar = dupgVar2.a;
        if (dnwbVar == null) {
            dnwbVar = dnwb.i;
        }
        anhkVar.c(dnwbVar);
        cdfu cdfuVar = this.a;
        if (cdfuVar != null) {
            cdfuVar.a(dupgVar2 != null);
        }
    }
}
