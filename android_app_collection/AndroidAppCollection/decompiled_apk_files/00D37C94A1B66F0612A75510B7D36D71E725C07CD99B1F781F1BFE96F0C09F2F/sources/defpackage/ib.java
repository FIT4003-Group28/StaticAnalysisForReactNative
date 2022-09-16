package defpackage;

import android.media.Rating;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: ib  reason: default package */
/* loaded from: classes3.dex */
public class ib {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static float b(Rating rating) {
        return rating.getStarRating();
    }

    public static int c(Rating rating) {
        return rating.getRatingStyle();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static jw g(jr jrVar) {
        return jrVar.a();
    }

    public static long i(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void j(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + i);
    }

    public void h() {
    }
}
