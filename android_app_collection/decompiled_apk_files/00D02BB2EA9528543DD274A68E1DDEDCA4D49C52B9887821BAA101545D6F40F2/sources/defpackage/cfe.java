package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cfe  reason: default package */
/* loaded from: classes.dex */
public final class cfe {
    public final bxn a;
    public final bxl b;

    public cfe(bxn bxnVar, bxl bxlVar) {
        this.a = bxnVar;
        this.b = bxlVar;
    }

    public final void a(Bitmap bitmap) {
        this.a.a(bitmap);
    }

    public final byte[] b(int i) {
        bxl bxlVar = this.b;
        if (bxlVar == null) {
            return new byte[i];
        }
        return (byte[]) bxlVar.b(i, byte[].class);
    }

    public final void c(byte[] bArr) {
        bxl bxlVar = this.b;
        if (bxlVar == null) {
            return;
        }
        bxlVar.a(bArr);
    }
}
