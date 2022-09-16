package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: oxp  reason: default package */
/* loaded from: classes4.dex */
public final class oxp implements oyf {
    @Override // defpackage.oyf
    public final void d(MediaFormat mediaFormat) {
    }

    @Override // defpackage.oyf
    public final void f(pct pctVar, int i) {
        pctVar.A(i);
    }

    @Override // defpackage.oyf
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
    }

    @Override // defpackage.oyf
    public final int j(oxn oxnVar, int i, boolean z) {
        int c = oxnVar.c(i);
        if (c == 0) {
            c = oxnVar.b(oxnVar.a, 0, Math.min(i, 4096), 0, true);
        }
        oxnVar.f(c);
        return c;
    }
}
