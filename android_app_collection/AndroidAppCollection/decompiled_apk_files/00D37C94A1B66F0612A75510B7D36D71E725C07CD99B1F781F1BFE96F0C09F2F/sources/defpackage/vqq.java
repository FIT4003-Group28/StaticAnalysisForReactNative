package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
/* compiled from: PG */
/* renamed from: vqq  reason: default package */
/* loaded from: classes4.dex */
public final class vqq {
    public VideoMetaData a;
    public boolean b = true;
    public long c = 1000000;
    private long d;

    public final vqr a() {
        aqxo.p(this.a != null);
        return new vqr(this.a, this.c, this.d, this.b);
    }

    public final void b(long j) {
        this.d = Math.max(0L, j);
    }
}
