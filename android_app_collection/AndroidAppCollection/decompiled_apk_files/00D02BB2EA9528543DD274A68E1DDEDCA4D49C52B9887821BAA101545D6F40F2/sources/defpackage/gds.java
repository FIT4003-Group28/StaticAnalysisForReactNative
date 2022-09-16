package defpackage;

import java.util.Arrays;
/* compiled from: PG */
@btsb
@Deprecated
/* renamed from: gds  reason: default package */
/* loaded from: classes.dex */
public class gds {
    public final btlu a;

    public gds(btlu btluVar) {
        this.a = btluVar;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof gds)) {
            return false;
        }
        return dbsd.a(this.a, ((gds) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("gmmAccount", this.a);
        return b.toString();
    }
}
