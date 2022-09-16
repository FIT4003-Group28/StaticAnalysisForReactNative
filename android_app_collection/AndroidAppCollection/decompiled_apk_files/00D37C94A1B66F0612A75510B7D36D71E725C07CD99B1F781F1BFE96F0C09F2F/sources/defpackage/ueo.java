package defpackage;
/* compiled from: PG */
/* renamed from: ueo  reason: default package */
/* loaded from: classes4.dex */
public final class ueo {
    public final ucs a;

    public ueo(ucs ucsVar) {
        this.a = ucsVar;
    }

    public final void a(String str, ubx ubxVar) {
        synchronized (this.a) {
            try {
                ucl b = this.a.b(str).b();
                b.d(ubxVar);
                this.a.e(b.a());
            } catch (ucr unused) {
            }
        }
    }
}
