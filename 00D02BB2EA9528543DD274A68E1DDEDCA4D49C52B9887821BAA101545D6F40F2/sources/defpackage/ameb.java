package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: ameb  reason: default package */
/* loaded from: classes2.dex */
public final class ameb extends bxw {
    private final ckcw c;
    private final boolean d;
    private long e;
    private long f;

    public ameb(long j, ckcw ckcwVar, boolean z) {
        super(j);
        this.c = ckcwVar;
        this.d = z;
    }

    @Override // defpackage.bxw, defpackage.bxn
    public final synchronized void a(Bitmap bitmap) {
        super.a(bitmap);
        if (this.d) {
            long j = this.a;
            long j2 = j - this.e;
            this.e = j;
            if (j2 > 0) {
                ((ckcn) this.c.a(ckja.am)).b(j2);
            }
            long j3 = this.b;
            long j4 = j3 - this.f;
            this.f = j3;
            if (j4 <= 0) {
                return;
            }
            ((ckcn) this.c.a(ckja.an)).b(j4);
        }
    }
}
