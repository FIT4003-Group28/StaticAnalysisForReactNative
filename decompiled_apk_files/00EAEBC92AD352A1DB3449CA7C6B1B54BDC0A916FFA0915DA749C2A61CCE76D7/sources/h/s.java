package h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    static r f10197a;

    /* renamed from: b  reason: collision with root package name */
    static long f10198b;

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r a() {
        synchronized (s.class) {
            if (f10197a != null) {
                r rVar = f10197a;
                f10197a = rVar.f10195f;
                rVar.f10195f = null;
                f10198b -= 8192;
                return rVar;
            }
            return new r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(r rVar) {
        if (rVar.f10195f == null && rVar.f10196g == null) {
            if (rVar.f10193d) {
                return;
            }
            synchronized (s.class) {
                if (f10198b + 8192 > 65536) {
                    return;
                }
                f10198b += 8192;
                rVar.f10195f = f10197a;
                rVar.f10192c = 0;
                rVar.f10191b = 0;
                f10197a = rVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
