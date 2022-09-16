package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aya  reason: default package */
/* loaded from: classes2.dex */
public final class aya implements asv {
    private final asv a;
    private final pwx b;
    private final int c;

    public aya(asv asvVar, pwx pwxVar, int i) {
        ptx.a(asvVar);
        this.a = asvVar;
        this.b = pwxVar;
        this.c = i;
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
        this.b.b(this.c);
        return this.a.g(bArr, i, i2);
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        this.b.b(this.c);
        return this.a.h(asyVar);
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
