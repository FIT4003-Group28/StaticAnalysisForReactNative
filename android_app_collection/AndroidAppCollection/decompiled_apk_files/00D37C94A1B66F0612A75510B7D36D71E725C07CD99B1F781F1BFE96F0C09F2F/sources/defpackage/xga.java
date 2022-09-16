package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: xga  reason: default package */
/* loaded from: classes4.dex */
public final class xga implements xfk {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public xga(xfk... xfkVarArr) {
    }

    public final void c(xfk xfkVar) {
        this.a.add(xfkVar);
    }

    @Override // defpackage.xfk
    public final void nR(xig xigVar) {
        for (xfk xfkVar : this.a) {
            xfkVar.nR(xigVar);
        }
    }

    @Override // defpackage.xfk
    public final void qV(xgu xguVar) {
        for (xfk xfkVar : this.a) {
            xfkVar.qV(xguVar);
        }
    }
}
