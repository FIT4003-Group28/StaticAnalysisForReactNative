package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cov  reason: default package */
/* loaded from: classes3.dex */
public final class cov implements cie {
    private final cie a;
    private final Resources b;

    public cov(Resources resources, cie cieVar) {
        hy.N(resources);
        this.b = resources;
        hy.N(cieVar);
        this.a = cieVar;
    }

    @Override // defpackage.cie
    public final cku a(Object obj, int i, int i2, cic cicVar) {
        return cpw.f(this.b, this.a.a(obj, i, i2, cicVar));
    }

    @Override // defpackage.cie
    public final boolean b(Object obj, cic cicVar) {
        return this.a.b(obj, cicVar);
    }
}
