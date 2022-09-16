package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: cqw  reason: default package */
/* loaded from: classes3.dex */
public final class cqw {
    public final cld a;
    public final clb b;

    public cqw(cld cldVar, clb clbVar) {
        this.a = cldVar;
        this.b = clbVar;
    }

    public final void a(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    public final void b(byte[] bArr) {
        clb clbVar = this.b;
        if (clbVar == null) {
            return;
        }
        clbVar.c(bArr);
    }

    public final byte[] c(int i) {
        clb clbVar = this.b;
        if (clbVar == null) {
            return new byte[i];
        }
        return (byte[]) clbVar.a(i, byte[].class);
    }
}
