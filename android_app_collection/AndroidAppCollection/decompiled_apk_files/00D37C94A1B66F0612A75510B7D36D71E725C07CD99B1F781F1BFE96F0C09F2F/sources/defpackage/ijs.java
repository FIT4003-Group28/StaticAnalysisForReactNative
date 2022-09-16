package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ijs  reason: default package */
/* loaded from: classes3.dex */
public final class ijs implements aafl {
    private final ike a;

    public ijs(ike ikeVar) {
        this.a = ikeVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arxl arxlVar;
        atfv atfvVar = (atfv) apzgVar.qm(atfv.b);
        if (atfvVar.c == 1) {
            arxlVar = (arxl) atfvVar.d;
        } else {
            arxlVar = arxl.a;
        }
        this.a.u(arxlVar.mo52toBuilder());
    }
}
