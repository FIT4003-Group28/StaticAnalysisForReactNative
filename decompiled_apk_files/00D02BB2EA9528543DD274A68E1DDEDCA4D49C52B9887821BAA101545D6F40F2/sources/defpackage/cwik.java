package defpackage;
/* compiled from: PG */
/* renamed from: cwik  reason: default package */
/* loaded from: classes5.dex */
public final class cwik {
    public static String a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        return simpleName.endsWith("Exception") ? simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName : th instanceof cnob ? "ApiException" : "ObfuscatedException";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Throwable> T b(Throwable th, Class<? extends T> cls) {
        if (th == 0) {
            return null;
        }
        return th.getClass().equals(cls) ? th : (T) b(th.getCause(), cls);
    }
}
