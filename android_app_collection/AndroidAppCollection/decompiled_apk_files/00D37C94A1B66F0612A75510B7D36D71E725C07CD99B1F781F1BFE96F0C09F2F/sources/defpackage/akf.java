package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: akf  reason: default package */
/* loaded from: classes.dex */
public final class akf {
    public static Drawable a(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File b(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static int c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static float d(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f <= 1.0f) {
            return f;
        }
        return 1.0f;
    }

    public static final int e(int i, ByteBuffer byteBuffer) {
        if (g(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static final short f(int i, ByteBuffer byteBuffer) {
        if (g(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    private static final boolean g(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }
}
