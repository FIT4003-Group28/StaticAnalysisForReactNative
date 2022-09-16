package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ayk  reason: default package */
/* loaded from: classes2.dex */
public final class ayk implements asv {
    private final asv a;
    private final byte[] b;
    private ayl c;

    public ayk(byte[] bArr, asv asvVar) {
        this.a = asvVar;
        this.b = bArr;
    }

    @Override // defpackage.asv
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        ptx.a(atkVar);
        this.a.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int g = this.a.g(bArr, i, i2);
        if (g == -1) {
            return -1;
        }
        ayl aylVar = this.c;
        int i3 = pxi.a;
        aylVar.a(bArr, i, g, bArr, i);
        return g;
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        long h = this.a.h(asyVar);
        long b = ase.b(asyVar.i);
        this.c = new ayl(2, this.b, b, asyVar.g + asyVar.b);
        return h;
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.a.i();
    }

    @Override // defpackage.asv
    public final void j() {
        this.c = null;
        this.a.j();
    }
}
