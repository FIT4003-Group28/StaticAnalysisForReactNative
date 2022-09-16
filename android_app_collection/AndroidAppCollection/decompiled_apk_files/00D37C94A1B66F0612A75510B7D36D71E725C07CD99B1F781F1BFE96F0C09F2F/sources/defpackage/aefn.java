package defpackage;

import android.content.Context;
import android.content.Intent;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aefn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aefn {
    public static int a(byte b) {
        if ((b & 128) == 0) {
            return 1;
        }
        if ((b & 64) == 0) {
            return 2;
        }
        if ((b & 32) == 0) {
            return 3;
        }
        return (b & 16) == 0 ? 4 : 5;
    }

    public static Integer b(ByteBuffer byteBuffer) {
        int a;
        if (byteBuffer.remaining() != 0 && byteBuffer.remaining() >= (a = a(byteBuffer.get(byteBuffer.position())))) {
            int i = byteBuffer.get() & 255;
            if (a == 1) {
                return Integer.valueOf(i);
            }
            if (a == 2) {
                return Integer.valueOf(((byteBuffer.get() & 255) << 6) | (i & 63));
            }
            if (a == 3) {
                return Integer.valueOf(((((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255)) << 5) | (i & 31));
            }
            if (a == 4) {
                return Integer.valueOf(((((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8))) << 4) | (i & 15));
            }
            return Integer.valueOf(((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16));
        }
        return null;
    }

    public static Intent c(Context context) {
        return new Intent().setClassName(context, "com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity");
    }
}
