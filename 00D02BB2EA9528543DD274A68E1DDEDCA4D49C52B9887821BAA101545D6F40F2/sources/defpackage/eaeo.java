package defpackage;
/* compiled from: PG */
/* renamed from: eaeo  reason: default package */
/* loaded from: classes6.dex */
public final class eaeo {
    @dzsi
    public eaem a;
    @dzsi
    public eaeh b;
    public int c;
    public String d;
    @dzsi
    public eadv e;
    public eadw f;
    @dzsi
    public eaer g;
    @dzsi
    eaep h;
    @dzsi
    eaep i;
    @dzsi
    public eaep j;
    public long k;
    public long l;

    public eaeo() {
        this.c = -1;
        this.f = new eadw();
    }

    private static final void e(String str, eaep eaepVar) {
        if (eaepVar.g == null) {
            if (eaepVar.h == null) {
                if (eaepVar.i == null) {
                    if (eaepVar.j == null) {
                        return;
                    }
                    throw new IllegalArgumentException(str + ".priorResponse != null");
                }
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            throw new IllegalArgumentException(str + ".networkResponse != null");
        }
        throw new IllegalArgumentException(str + ".body != null");
    }

    public final eaep a() {
        if (this.a != null) {
            if (this.b != null) {
                if (this.c >= 0) {
                    if (this.d == null) {
                        throw new IllegalStateException("message == null");
                    }
                    return new eaep(this);
                }
                throw new IllegalStateException("code < 0: " + this.c);
            }
            throw new IllegalStateException("protocol == null");
        }
        throw new IllegalStateException("request == null");
    }

    public final void b(@dzsi eaep eaepVar) {
        if (eaepVar != null) {
            e("cacheResponse", eaepVar);
        }
        this.i = eaepVar;
    }

    public final void c(eadx eadxVar) {
        this.f = eadxVar.e();
    }

    public final void d(@dzsi eaep eaepVar) {
        if (eaepVar != null) {
            e("networkResponse", eaepVar);
        }
        this.h = eaepVar;
    }

    public eaeo(eaep eaepVar) {
        this.c = -1;
        this.a = eaepVar.a;
        this.b = eaepVar.b;
        this.c = eaepVar.c;
        this.d = eaepVar.d;
        this.e = eaepVar.e;
        this.f = eaepVar.f.e();
        this.g = eaepVar.g;
        this.h = eaepVar.h;
        this.i = eaepVar.i;
        this.j = eaepVar.j;
        this.k = eaepVar.k;
        this.l = eaepVar.l;
    }
}
