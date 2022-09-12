package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: buio  reason: default package */
/* loaded from: classes4.dex */
final class buio {
    @dzsi
    final ByteBuffer a;
    @dzsi
    final ByteArrayOutputStream b;

    public buio() {
        this.a = null;
        this.b = new ByteArrayOutputStream(32768);
    }

    public buio(int i) {
        this.a = ByteBuffer.allocate(i);
        this.b = null;
    }
}
