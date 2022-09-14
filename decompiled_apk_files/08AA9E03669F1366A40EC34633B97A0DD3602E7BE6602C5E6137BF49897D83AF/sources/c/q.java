package c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentPool.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    static p f1323a;

    /* renamed from: b  reason: collision with root package name */
    static long f1324b;

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p a() {
        synchronized (q.class) {
            if (f1323a != null) {
                p pVar = f1323a;
                f1323a = pVar.f;
                pVar.f = null;
                f1324b -= 8192;
                return pVar;
            }
            return new p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(p pVar) {
        if (pVar.f != null || pVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (pVar.f1322d) {
            return;
        }
        synchronized (q.class) {
            if (f1324b + 8192 > 65536) {
                return;
            }
            f1324b += 8192;
            pVar.f = f1323a;
            pVar.f1321c = 0;
            pVar.f1320b = 0;
            f1323a = pVar;
        }
    }
}
