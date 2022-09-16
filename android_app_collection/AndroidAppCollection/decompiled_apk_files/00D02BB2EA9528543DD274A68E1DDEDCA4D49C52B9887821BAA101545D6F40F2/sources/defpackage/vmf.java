package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vmf  reason: default package */
/* loaded from: classes7.dex */
public final class vmf implements btzi<dwaw, dwbc> {
    final /* synthetic */ vmg a;
    private final vmb b;

    public vmf(vmg vmgVar, vmb vmbVar) {
        this.a = vmgVar;
        this.b = vmbVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwaw> btzrVar, btzy btzyVar) {
        this.b.QY(btzrVar, btzyVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwaw> btzrVar, dwbc dwbcVar) {
        dwbc dwbcVar2 = dwbcVar;
        dwaa dwaaVar = dwbcVar2.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        if ((dwaaVar.a & 1) == 0) {
            this.b.QY(btzrVar, btzy.g);
            return;
        }
        this.b.QZ(btzrVar, (amsy) this.a.a.h(new dbrn() { // from class: vme
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return ((qbl) obj).b();
            }
        }).c(new amsy(dwbcVar2)));
    }
}
