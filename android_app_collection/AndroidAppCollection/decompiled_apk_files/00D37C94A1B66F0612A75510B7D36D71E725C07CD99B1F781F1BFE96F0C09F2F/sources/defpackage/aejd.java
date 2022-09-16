package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aejd  reason: default package */
/* loaded from: classes.dex */
public final class aejd implements asv {
    private final asv a;
    private final agpr b;

    public aejd(asv asvVar, agpr agprVar, afjz afjzVar, byte[] bArr, byte[] bArr2) {
        this.a = asvVar;
        this.b = agprVar;
        boolean z = afjzVar.n().H;
        afme afmeVar = afjzVar.j;
    }

    @Override // defpackage.asv
    public final Map a() {
        return this.a.a();
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
        this.b.j();
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
