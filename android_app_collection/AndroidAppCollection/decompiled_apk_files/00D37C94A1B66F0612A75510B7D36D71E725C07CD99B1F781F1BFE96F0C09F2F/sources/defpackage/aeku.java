package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeku  reason: default package */
/* loaded from: classes.dex */
public final class aeku extends ovq {
    public final MediaFormat m;
    public final oye n;
    private final long o;
    private boolean p;

    public aeku(pbl pblVar, pbn pbnVar, ovm ovmVar, MediaFormat mediaFormat, oye oyeVar, long j) {
        super(pblVar, pbnVar, 1, ovmVar, 0L, 0L, -1, true, -1);
        this.m = mediaFormat;
        this.n = oyeVar;
        this.o = j;
    }

    @Override // defpackage.ovb
    public final long a() {
        return this.o;
    }

    @Override // defpackage.ovq
    public final MediaFormat e() {
        return this.m;
    }

    @Override // defpackage.ovq
    public final owx h() {
        return null;
    }

    @Override // defpackage.pbx
    public final void i() {
        this.p = true;
    }

    @Override // defpackage.pbx
    public final void k() {
    }

    @Override // defpackage.pbx
    public final boolean l() {
        return this.p;
    }
}
