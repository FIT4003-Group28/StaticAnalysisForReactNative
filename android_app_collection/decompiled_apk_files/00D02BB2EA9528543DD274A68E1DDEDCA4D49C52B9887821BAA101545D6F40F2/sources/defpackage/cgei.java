package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgei  reason: default package */
/* loaded from: classes4.dex */
public final class cgei extends geh {
    private List<jbf> e;

    public final void bn(cgsl cgslVar) {
        if (!U()) {
            return;
        }
        Ra(cgslVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        ixw ixwVar = new ixw();
        ixwVar.g = cqrt.g(2131232767, irg.k());
        ixwVar.a = "Share with location";
        ixwVar.e = new cgef(this);
        ixwVar.d = new cgee();
        ixwVar.f = cjtd.b;
        jbf a = ixwVar.a();
        ixw ixwVar2 = new ixw();
        ixwVar2.g = cqrt.g(2131232764, irg.k());
        ixwVar2.a = "Share without location";
        ixwVar2.e = new cgeh(this);
        ixwVar2.d = new cgeg();
        ixwVar2.f = cjtd.b;
        this.e = dcdc.g(a, ixwVar2.a());
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.as;
    }

    @Override // defpackage.geh
    protected final Iterable<jbf> w() {
        return this.e;
    }
}
