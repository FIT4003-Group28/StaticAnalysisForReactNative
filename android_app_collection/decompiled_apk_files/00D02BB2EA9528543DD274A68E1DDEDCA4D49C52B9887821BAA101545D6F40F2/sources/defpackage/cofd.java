package defpackage;

import android.util.Base64;
import java.util.Random;
/* compiled from: PG */
/* renamed from: cofd  reason: default package */
/* loaded from: classes5.dex */
public final class cofd {
    private static final Random a = new Random();

    public static String a() {
        byte[] bArr = new byte[16];
        a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
