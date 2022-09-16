package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: qdi  reason: default package */
/* loaded from: classes7.dex */
public final class qdi {
    private static final dcqe b = dcqe.c("qdi");
    public final dcdc<dpce> a;

    public qdi(Iterable<dpce> iterable) {
        dcdc<dpce> q = dcdc.q(dcft.i(iterable, qdh.a));
        this.a = q;
        if (q.isEmpty()) {
            bvoo.h("Could not extract any line renderable components", new Object[0]);
        }
    }

    public static qdi a(List<dpce> list) {
        return new qdi(list);
    }

    public static qdi b(dooo doooVar) {
        return new qdi(doooVar.c);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qdi) {
            return dbsd.a(this.a, ((qdi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
