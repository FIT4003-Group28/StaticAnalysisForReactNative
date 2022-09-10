package defpackage;

import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dedi  reason: default package */
/* loaded from: classes.dex */
public final class dedi extends dcbs<dedj> implements Serializable {
    private static final long serialVersionUID = 0;
    public final /* synthetic */ dedj a;
    private transient dcep<dedj> b;

    public dedi(dedj dedjVar) {
        this.a = dedjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcbs, defpackage.dcbh
    /* renamed from: a */
    public final Set<dedj> b() {
        dcep<dedj> dcepVar = this.b;
        if (dcepVar == null) {
            dcep<dedj> B = dcbg.b(dedg.a.d(dcdc.f(this.a))).o(dedh.IGNORE_TYPE_VARIABLE_OR_WILDCARD).B();
            this.b = B;
            return B;
        }
        return dcepVar;
    }
}
