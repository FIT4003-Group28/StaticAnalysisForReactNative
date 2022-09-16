package defpackage;

import java.io.InputStream;
import java.io.StreamTokenizer;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: alpm  reason: default package */
/* loaded from: classes2.dex */
public final class alpm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new Exception();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(StreamTokenizer streamTokenizer) {
        while (streamTokenizer.ttype != 10 && streamTokenizer.ttype != -1) {
            streamTokenizer.nextToken();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(StreamTokenizer streamTokenizer) {
        while (streamTokenizer.ttype != -3 && streamTokenizer.ttype != -1) {
            streamTokenizer.nextToken();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(StreamTokenizer streamTokenizer) {
        b(streamTokenizer);
        c(streamTokenizer);
    }

    public static int e(InputStream inputStream, ByteBuffer byteBuffer) {
        inputStream.read(byteBuffer.array(), 0, 4);
        byte[] array = byteBuffer.array();
        byte b = array[0];
        byte b2 = array[1];
        byte b3 = array[2];
        byte b4 = array[3];
        byteBuffer.clear();
        return b4 | (b << 24) | (b2 << 16) | (b3 << 8);
    }

    public static String f(InputStream inputStream, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int e = e(inputStream, byteBuffer);
        byte[] array = byteBuffer2.array();
        inputStream.read(array, 0, e);
        array[e] = 0;
        String str = new String(array, 0, e);
        byteBuffer2.clear();
        return str;
    }
}
