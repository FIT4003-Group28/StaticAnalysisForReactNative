package defpackage;

import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: hag  reason: default package */
/* loaded from: classes3.dex */
final class hag implements pxt {
    final /* synthetic */ vqr a;
    final /* synthetic */ haj b;

    public hag(vqr vqrVar, haj hajVar) {
        this.a = vqrVar;
        this.b = hajVar;
    }

    @Override // defpackage.pxt
    public final void a(long j, long j2, Format format, MediaFormat mediaFormat) {
        vqr vqrVar = this.a;
        if (vqrVar != null) {
            j -= vqrVar.n();
        }
        this.b.a.e(j2, Long.valueOf(j));
    }
}
