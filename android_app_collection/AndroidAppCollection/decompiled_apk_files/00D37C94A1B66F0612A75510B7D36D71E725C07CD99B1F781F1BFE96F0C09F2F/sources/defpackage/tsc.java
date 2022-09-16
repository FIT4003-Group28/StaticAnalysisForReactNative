package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: tsc  reason: default package */
/* loaded from: classes4.dex */
public final class tsc {
    private Boolean a;
    private amvn b;

    public final tse a() {
        if (this.b == null) {
            this.b = amyg.a;
        }
        Boolean bool = this.a;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
        }
        return new tse(bool.booleanValue(), this.b);
    }

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void c(Set set) {
        this.b = amvn.p(set);
    }
}
