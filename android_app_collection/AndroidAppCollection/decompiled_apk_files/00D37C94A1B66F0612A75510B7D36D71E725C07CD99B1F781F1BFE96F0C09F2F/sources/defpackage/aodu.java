package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aodu  reason: default package */
/* loaded from: classes.dex */
public abstract class aodu {
    public static aodu a;

    public static aodu d() {
        if (a == null) {
            a = new aodw();
        }
        return a;
    }

    public abstract int a(CharSequence charSequence);

    public abstract String b(ByteBuffer byteBuffer, int i, int i2);

    public abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);
}
