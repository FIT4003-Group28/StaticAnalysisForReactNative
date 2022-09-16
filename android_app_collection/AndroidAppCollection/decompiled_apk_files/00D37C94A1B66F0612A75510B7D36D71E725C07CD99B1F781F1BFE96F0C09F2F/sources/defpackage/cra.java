package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cra  reason: default package */
/* loaded from: classes3.dex */
public final class cra extends cqq implements ckr {
    public cra(cqy cqyVar) {
        super(cqyVar);
    }

    @Override // defpackage.cku
    public final int a() {
        crf crfVar = ((cqy) this.a).a.a;
        cgv cgvVar = (cgv) crfVar.a;
        return cgvVar.a.limit() + cgvVar.c.length + (cgvVar.d.length * 4) + crfVar.j;
    }

    @Override // defpackage.cku
    public final Class b() {
        return cqy.class;
    }

    @Override // defpackage.cqq, defpackage.ckr
    public final void d() {
        ((cqy) this.a).a().prepareToDraw();
    }

    @Override // defpackage.cku
    public final void e() {
        clb clbVar;
        ((cqy) this.a).stop();
        cqy cqyVar = (cqy) this.a;
        cqyVar.b = true;
        crf crfVar = cqyVar.a.a;
        crfVar.b.clear();
        crfVar.d();
        crfVar.f();
        crc crcVar = crfVar.e;
        if (crcVar != null) {
            crfVar.c.j(crcVar);
            crfVar.e = null;
        }
        crc crcVar2 = crfVar.g;
        if (crcVar2 != null) {
            crfVar.c.j(crcVar2);
            crfVar.g = null;
        }
        crc crcVar3 = crfVar.i;
        if (crcVar3 != null) {
            crfVar.c.j(crcVar3);
            crfVar.i = null;
        }
        cgv cgvVar = (cgv) crfVar.a;
        cgvVar.f = null;
        byte[] bArr = cgvVar.c;
        if (bArr != null) {
            cgvVar.j.b(bArr);
        }
        int[] iArr = cgvVar.d;
        if (iArr != null && (clbVar = cgvVar.j.b) != null) {
            clbVar.c(iArr);
        }
        Bitmap bitmap = cgvVar.g;
        if (bitmap != null) {
            cgvVar.j.a(bitmap);
        }
        cgvVar.g = null;
        cgvVar.a = null;
        cgvVar.h = null;
        byte[] bArr2 = cgvVar.b;
        if (bArr2 != null) {
            cgvVar.j.b(bArr2);
        }
        crfVar.f = true;
    }
}
