package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cer  reason: default package */
/* loaded from: classes.dex */
public final class cer implements bul<ByteBuffer> {
    private final ByteBuffer a;

    public cer(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.bul
    public final /* bridge */ /* synthetic */ ByteBuffer a() {
        this.a.position(0);
        return this.a;
    }

    @Override // defpackage.bul
    public final void b() {
    }
}
