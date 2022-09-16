package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cprd  reason: default package */
/* loaded from: classes5.dex */
public final class cprd<D> {
    public final List<D> a;
    public final float[] b;
    public final int c;

    public cprd(List<D> list, float[] fArr, int i) {
        cpwl.h(list, "domainValues");
        cpwl.h(fArr, "pixelValues");
        boolean z = true;
        cpwl.c(list.size() == i, "domain and target must be the same length");
        cpwl.c(fArr.length < i ? false : z, "Claiming to use more elements than provided");
        this.a = list;
        this.b = fArr;
        this.c = i;
    }
}
