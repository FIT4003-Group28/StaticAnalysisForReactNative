package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: anoq  reason: default package */
/* loaded from: classes.dex */
public final class anoq {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (ReflectiveOperationException unused) {
            return false;
        }
    }

    public static boolean b() {
        return a.get();
    }
}
