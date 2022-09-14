package defpackage;

import java.security.SecureRandom;
import java.util.Random;
/* compiled from: PG */
/* renamed from: dbsy  reason: default package */
/* loaded from: classes5.dex */
public final class dbsy {
    public static final Random a = new dbsw();
    public static final SecureRandom b = a();
    public static final ThreadLocal<SecureRandom> c;

    static {
        new dbsx();
        c = new dbsv();
    }

    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
