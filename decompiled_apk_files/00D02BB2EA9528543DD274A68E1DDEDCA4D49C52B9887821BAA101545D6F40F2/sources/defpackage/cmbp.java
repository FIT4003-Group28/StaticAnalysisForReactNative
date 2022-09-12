package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmbp  reason: default package */
/* loaded from: classes5.dex */
public final class cmbp {
    public static void a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(list.get(i)));
        }
    }

    public static void b(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
