package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amss  reason: default package */
/* loaded from: classes2.dex */
public final class amss extends amsv {
    public final amsv[] a;

    public amss(amsv[] amsvVarArr) {
        this.a = amsvVarArr;
    }

    @Override // defpackage.amsv
    public final boolean a() {
        for (amsv amsvVar : this.a) {
            if (!amsvVar.a()) {
                return false;
            }
        }
        return this.a.length > 0;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof amss) {
            return Arrays.equals(((amss) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (amsv amsvVar : this.a) {
            sb.append(amsvVar);
        }
        return sb.toString();
    }
}
