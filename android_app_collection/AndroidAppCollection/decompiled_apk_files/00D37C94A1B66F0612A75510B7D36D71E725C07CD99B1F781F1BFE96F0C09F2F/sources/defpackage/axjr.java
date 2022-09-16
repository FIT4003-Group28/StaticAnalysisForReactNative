package defpackage;

import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: axjr  reason: default package */
/* loaded from: classes2.dex */
final class axjr implements axjg {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ axjt c;

    public axjr(axjt axjtVar, long j, long j2) {
        this.c = axjtVar;
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.axjg
    public final long a() {
        return this.b;
    }

    @Override // defpackage.axjg
    public final void b(WritableByteChannel writableByteChannel) {
        this.c.m.d(this.a, this.b, writableByteChannel);
    }
}
