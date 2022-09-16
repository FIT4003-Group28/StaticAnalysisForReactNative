package defpackage;

import j$.util.Optional;
import java.util.Map;
/* compiled from: PG */
/* renamed from: whr  reason: default package */
/* loaded from: classes4.dex */
public final class whr implements aafl, wjb {
    public final eo a;
    public final int b;
    private final wia c;
    private final aafo d;
    private apzg e;
    private apzg f;
    private apzg g;

    public whr(wia wiaVar, eo eoVar, int i, aafo aafoVar) {
        this.c = wiaVar;
        this.a = eoVar;
        this.b = i;
        this.d = aafoVar;
    }

    @Override // defpackage.wjb
    public final void h() {
        apzg apzgVar = this.g;
        if (apzgVar != null) {
            this.d.a(apzgVar);
        }
    }

    @Override // defpackage.wjb
    public final void i() {
        apzg apzgVar = this.f;
        if (apzgVar != null) {
            this.d.a(apzgVar);
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        int i;
        atwl atwlVar = (atwl) apzgVar.qm(atwl.b);
        apzg apzgVar2 = atwlVar.f;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        this.f = apzgVar2;
        apzg apzgVar3 = atwlVar.e;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        this.e = apzgVar3;
        apzg apzgVar4 = atwlVar.g;
        if (apzgVar4 == null) {
            apzgVar4 = apzg.a;
        }
        this.g = apzgVar4;
        wia wiaVar = this.c;
        whq whqVar = new whq(this);
        if ((atwlVar.c & 4) != 0) {
            i = akpq.A(atwlVar.d);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 3;
        }
        wiaVar.a.e(wiaVar.a(Optional.empty(), i), whqVar);
    }

    @Override // defpackage.wjb
    public final void u() {
        apzg apzgVar = this.e;
        if (apzgVar != null) {
            this.d.a(apzgVar);
        }
    }
}
