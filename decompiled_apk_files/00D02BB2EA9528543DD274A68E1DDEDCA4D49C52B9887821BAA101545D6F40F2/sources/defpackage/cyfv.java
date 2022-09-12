package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cyfv  reason: default package */
/* loaded from: classes5.dex */
public final class cyfv implements cyfz {
    public cyfu a;

    public cyfv() {
        this.a = null;
    }

    public cyfv(cyfz cyfzVar) {
        cyfx b = cyfzVar.b();
        this.a = b == null ? null : b.g();
    }

    @Override // defpackage.cyfz
    public final cyfz a() {
        return new cyga(this);
    }

    @Override // defpackage.cyfz
    public final /* bridge */ /* synthetic */ cyfx b() {
        return this.a;
    }

    public final cyfu c() {
        if (this.a == null) {
            this.a = new cyfu();
        }
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
