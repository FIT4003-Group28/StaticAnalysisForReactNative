package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: devs  reason: default package */
/* loaded from: classes6.dex */
public class devs {
    public int a;
    public ByteBuffer b;

    public final void d(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
        } else {
            this.a = 0;
        }
    }
}
