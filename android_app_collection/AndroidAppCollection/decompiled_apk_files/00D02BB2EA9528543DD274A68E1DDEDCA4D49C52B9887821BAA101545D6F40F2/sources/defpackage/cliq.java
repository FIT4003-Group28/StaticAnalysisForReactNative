package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cliq  reason: default package */
/* loaded from: classes5.dex */
public final class cliq extends cljp {
    public dcen<cljq> a;
    public dcep<cljq> b;
    private Boolean c;

    @Override // defpackage.cljp
    public final cljr a() {
        dcen<cljq> dcenVar = this.a;
        if (dcenVar != null) {
            this.b = dcenVar.f();
        } else if (this.b == null) {
            this.b = dcmr.a;
        }
        String str = this.c == null ? " requireUnmeteredNetwork" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new clir(this.c.booleanValue(), this.b);
    }

    @Override // defpackage.cljp
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.cljp
    public final void c(Set<cljq> set) {
        if (this.a != null) {
            throw new IllegalStateException("Cannot set requiredNetworkTypes after calling requiredNetworkTypesBuilder()");
        }
        this.b = dcep.K(set);
    }
}
