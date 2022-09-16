package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: ovq  reason: default package */
/* loaded from: classes4.dex */
public abstract class ovq extends ovb {
    public final long g;
    public final long h;
    public final int i;
    public final boolean j;
    public oxo k;
    public int l;

    public ovq(pbl pblVar, pbn pbnVar, int i, ovm ovmVar, long j, long j2, int i2, boolean z, int i3) {
        super(pblVar, pbnVar, 1, i, ovmVar, i3);
        pce.a(ovmVar);
        this.g = j;
        this.h = j2;
        this.i = i2;
        this.j = z;
    }

    public abstract MediaFormat e();

    public abstract owx h();

    public int m() {
        return this.i + 1;
    }
}
