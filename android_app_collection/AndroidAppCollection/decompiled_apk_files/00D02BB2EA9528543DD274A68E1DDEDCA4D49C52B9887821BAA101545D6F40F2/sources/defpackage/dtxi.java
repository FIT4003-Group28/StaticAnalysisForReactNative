package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dtxi  reason: default package */
/* loaded from: classes.dex */
public final class dtxi implements Serializable, ddho {
    public final int a;
    private final String b = "UNUSED";

    public dtxi(int i) {
        this.a = i;
    }

    @Override // defpackage.ddhp
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ddho) && this.a == ((ddho) obj).b();
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        return this.b;
    }
}
