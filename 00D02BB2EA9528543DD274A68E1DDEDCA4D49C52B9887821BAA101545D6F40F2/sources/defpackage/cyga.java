package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cyga  reason: default package */
/* loaded from: classes5.dex */
public final class cyga implements cyfz {
    private final cyfy a;

    public cyga(cyfz cyfzVar) {
        cyfu cyfuVar = ((cyfv) cyfzVar).a;
        this.a = cyfuVar == null ? null : new cyfy(cyfuVar);
    }

    @Override // defpackage.cyfz
    public final cyfz a() {
        return this;
    }

    @Override // defpackage.cyfz
    public final cyfx b() {
        return this.a;
    }

    @Override // defpackage.cyfz
    public final cyfv d() {
        return new cyfv(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyfz)) {
            return false;
        }
        return dbsd.a(this.a, ((cyfz) obj).b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
