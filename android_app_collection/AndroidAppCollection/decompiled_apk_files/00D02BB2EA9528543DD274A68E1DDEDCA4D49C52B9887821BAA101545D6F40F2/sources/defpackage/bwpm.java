package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwpm  reason: default package */
/* loaded from: classes4.dex */
public class bwpm implements oxg {
    final /* synthetic */ bwpn a;
    @dzsi
    private cqkp b;

    public bwpm(bwpn bwpnVar) {
        this.a = bwpnVar;
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        oxf oxfVar;
        if (cqkpVar != this.b || (oxfVar = this.a.e) == null) {
            return;
        }
        oxfVar.aS();
    }

    @Override // defpackage.oxg
    @dzsi
    public cjyo a() {
        return this.a.c;
    }

    @Override // defpackage.oxg
    public Boolean b() {
        cjyo cjyoVar = this.a.c;
        boolean z = true;
        if (cjyoVar != null && !cjyoVar.b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxg
    public Boolean c() {
        cjyo cjyoVar = this.a.c;
        boolean z = false;
        if (cjyoVar == null) {
            return false;
        }
        List<cjyw> a = cjyoVar.a();
        if (a.size() == 1 && a.get(0).c() == dtic.VERTICAL_LIST_NO_MARGIN) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxg
    public Boolean d() {
        bwpn bwpnVar = this.a;
        boolean z = false;
        if (bwpnVar.d && bwpnVar.c() == null && this.a.d() == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxg
    public cqkp e() {
        bwpl bwplVar = new bwpl();
        this.b = bwplVar;
        return bwplVar;
    }
}
