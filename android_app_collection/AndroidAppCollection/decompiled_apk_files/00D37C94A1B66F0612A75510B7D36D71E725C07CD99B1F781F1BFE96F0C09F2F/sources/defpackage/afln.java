package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afln  reason: default package */
/* loaded from: classes.dex */
public final class afln implements pca {
    public final asv a;

    public afln(asv asvVar) {
        this.a = asvVar;
    }

    @Override // defpackage.pbl
    public final int a(byte[] bArr, int i, int i2) {
        return this.a.g(bArr, i, i2);
    }

    @Override // defpackage.pbl
    public final long b(pbn pbnVar) {
        asv asvVar = this.a;
        Uri uri = pbnVar.a;
        byte[] bArr = pbnVar.b;
        return asvVar.h(new asy(uri, pbnVar.c, pbnVar.d, pbnVar.e, pbnVar.f, pbnVar.g, null));
    }

    @Override // defpackage.pbl
    public final void c() {
        this.a.j();
    }
}
