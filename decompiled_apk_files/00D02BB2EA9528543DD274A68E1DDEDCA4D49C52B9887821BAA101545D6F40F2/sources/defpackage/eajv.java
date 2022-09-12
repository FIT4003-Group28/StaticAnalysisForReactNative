package defpackage;
/* compiled from: PG */
/* renamed from: eajv  reason: default package */
/* loaded from: classes6.dex */
public final class eajv {
    @dzsi
    static eaju a;
    static long b;

    private eajv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eaju a() {
        synchronized (eajv.class) {
            eaju eajuVar = a;
            if (eajuVar != null) {
                a = eajuVar.f;
                eajuVar.f = null;
                b -= 8192;
                return eajuVar;
            }
            return new eaju();
        }
    }

    public static void b(eaju eajuVar) {
        if (eajuVar.f != null || eajuVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (eajuVar.d) {
            return;
        }
        synchronized (eajv.class) {
            long j = b;
            if (j + 8192 > 65536) {
                return;
            }
            b = j + 8192;
            eajuVar.f = a;
            eajuVar.c = 0;
            eajuVar.b = 0;
            a = eajuVar;
        }
    }
}
