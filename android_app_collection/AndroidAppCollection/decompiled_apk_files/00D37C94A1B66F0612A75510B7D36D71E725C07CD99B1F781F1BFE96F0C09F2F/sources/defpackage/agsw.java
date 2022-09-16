package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agsw  reason: default package */
/* loaded from: classes.dex */
public final class agsw implements asv {
    private final asv a;

    public agsw(asv asvVar) {
        this.a = asvVar;
    }

    @Override // defpackage.asv
    public final /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        this.a.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        return this.a.g(bArr, i, i2);
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        Uri uri = asyVar.a;
        if (uri == null || !zgt.n(uri)) {
            return this.a.h(asyVar);
        }
        throw new afkp();
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.a.i();
    }

    @Override // defpackage.asv
    public final void j() {
        this.a.j();
    }
}
