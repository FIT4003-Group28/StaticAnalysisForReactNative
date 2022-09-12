package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dcxh  reason: default package */
/* loaded from: classes5.dex */
public final class dcxh implements Serializable, dcxa {
    final dcxa[] a;

    public dcxh(Collection<dcxa> collection) {
        this.a = (dcxa[]) collection.toArray(new dcxa[collection.size()]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dcxh)) {
            return false;
        }
        return Arrays.deepEquals(this.a, ((dcxh) obj).a);
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        for (dcxa dcxaVar : this.a) {
            if (dcxaVar.h(dcwaVar)) {
                return true;
            }
        }
        return false;
    }
}
