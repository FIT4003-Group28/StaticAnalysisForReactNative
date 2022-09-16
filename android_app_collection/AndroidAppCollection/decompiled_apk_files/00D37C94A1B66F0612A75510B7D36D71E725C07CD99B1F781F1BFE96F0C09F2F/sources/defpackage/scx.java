package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: scx  reason: default package */
/* loaded from: classes4.dex */
public final class scx {
    public final List a;
    public final float[] b;
    public final int c;

    public scx(List list, float[] fArr, int i) {
        sho.g(list, "domainValues");
        sho.g(fArr, "pixelValues");
        boolean z = true;
        sho.a(list.size() == i, "domain and target must be the same length");
        sho.a(fArr.length < i ? false : z, "Claiming to use more elements than provided");
        this.a = list;
        this.b = fArr;
        this.c = i;
    }
}
