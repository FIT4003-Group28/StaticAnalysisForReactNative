package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/* compiled from: PG */
/* renamed from: tgq  reason: default package */
/* loaded from: classes4.dex */
public final class tgq extends aodu {
    private final teb d;
    private static final aodu c = new aodw();
    private static final Charset b = StandardCharsets.UTF_8;

    public tgq(teb tebVar) {
        this.d = tebVar;
    }

    @Override // defpackage.aodu
    public final int a(CharSequence charSequence) {
        try {
            return aodw.e(charSequence);
        } catch (IllegalArgumentException e) {
            this.d.d(22, "Failed to encode UTF-8 string length", e);
            return 0;
        }
    }

    @Override // defpackage.aodu
    public final String b(ByteBuffer byteBuffer, int i, int i2) {
        try {
            if (byteBuffer.hasArray()) {
                return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2, b);
            }
            return c.b(byteBuffer, i, i2);
        } catch (IllegalArgumentException e) {
            this.d.d(22, "Failed to decode UTF-8 string", e);
            return "";
        }
    }

    @Override // defpackage.aodu
    public final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        try {
            c.c(charSequence, byteBuffer);
        } catch (IllegalArgumentException e) {
            this.d.d(22, "Failed to encode UTF-8 string", e);
        }
    }
}
