package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aadf  reason: default package */
/* loaded from: classes2.dex */
public class aadf implements acil {
    private static final dbrz b = dbrz.e(",");
    public final List<String> a = new ArrayList();
    private final dxio<ache> c;
    private final achc d;

    public aadf(dxio<ache> dxioVar, achc achcVar) {
        this.c = dxioVar;
        this.d = achcVar;
    }

    @Override // defpackage.acil
    public cqkl a() {
        achb b2;
        ache a = this.c.a();
        achc achcVar = this.d;
        if (this.a.isEmpty()) {
            b2 = null;
        } else {
            acgz b3 = achb.b();
            b3.c("mids joined by comma", b.g(this.a));
            b2 = b3.b();
        }
        a.k(false, true, achcVar, b2);
        return cqkl.a;
    }
}
