package defpackage;

import com.google.android.gms.common.Feature;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cnrk  reason: default package */
/* loaded from: classes5.dex */
final class cnrk {
    public final cnpa<?> a;
    public final Feature b;

    public cnrk(cnpa<?> cnpaVar, Feature feature) {
        this.a = cnpaVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof cnrk)) {
            cnrk cnrkVar = (cnrk) obj;
            if (cnvv.a(this.a, cnrkVar.a) && cnvv.a(this.b, cnrkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("key", this.a);
        b.a("feature", this.b);
        return b.toString();
    }
}
