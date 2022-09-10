package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: buif  reason: default package */
/* loaded from: classes4.dex */
public final class buif implements buae<String> {
    public deig<buab<String>> a;
    private final btto b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public buif(btto bttoVar) {
        this.b = bttoVar;
    }

    private final synchronized void c() {
        if (!this.c.getAndSet(true)) {
            this.b.a();
        }
    }

    @Override // defpackage.buae
    public final synchronized dehn<buab<String>> a() {
        buab<String> b = b();
        if (b != null) {
            return deha.a(b);
        }
        if (this.a == null) {
            this.a = deig.d();
        }
        return deha.o(this.a);
    }

    public final synchronized buab<String> b() {
        String str;
        c();
        if (this.b.b()) {
            btto bttoVar = this.b;
            synchronized (bttoVar.b) {
                str = ((dung) bttoVar.b.b).k;
            }
            return buab.c("ZwiebackCookie", str);
        }
        return null;
    }
}
