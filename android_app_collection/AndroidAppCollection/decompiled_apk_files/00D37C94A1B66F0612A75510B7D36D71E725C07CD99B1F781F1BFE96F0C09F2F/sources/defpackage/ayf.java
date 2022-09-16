package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ayf  reason: default package */
/* loaded from: classes2.dex */
public final class ayf implements asv {
    public long a;
    private final asv b;

    public ayf(asv asvVar) {
        ptx.a(asvVar);
        this.b = asvVar;
        Collections.emptyMap();
    }

    @Override // defpackage.asv
    public final Map a() {
        return this.b.a();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        ptx.a(atkVar);
        this.b.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        int g = this.b.g(bArr, i, i2);
        if (g != -1) {
            this.a += g;
        }
        return g;
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        Uri uri = asyVar.a;
        Collections.emptyMap();
        long h = this.b.h(asyVar);
        ptx.a(i());
        a();
        return h;
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.b.i();
    }

    @Override // defpackage.asv
    public final void j() {
        this.b.j();
    }
}
