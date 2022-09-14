package defpackage;

import java.io.Closeable;
/* compiled from: PG */
/* renamed from: eaep  reason: default package */
/* loaded from: classes6.dex */
public final class eaep implements Closeable {
    public final eaem a;
    public final eaeh b;
    public final int c;
    public final String d;
    @dzsi
    public final eadv e;
    public final eadx f;
    @dzsi
    public final eaer g;
    @dzsi
    public final eaep h;
    @dzsi
    public final eaep i;
    @dzsi
    public final eaep j;
    public final long k;
    public final long l;

    public eaep(eaeo eaeoVar) {
        this.a = eaeoVar.a;
        this.b = eaeoVar.b;
        this.c = eaeoVar.c;
        this.d = eaeoVar.d;
        this.e = eaeoVar.e;
        this.f = eaeoVar.f.b();
        this.g = eaeoVar.g;
        this.h = eaeoVar.h;
        this.i = eaeoVar.i;
        this.j = eaeoVar.j;
        this.k = eaeoVar.k;
        this.l = eaeoVar.l;
    }

    @dzsi
    public final String a(String str) {
        String a = this.f.a(str);
        if (a != null) {
            return a;
        }
        return null;
    }

    public final eaeo b() {
        return new eaeo(this);
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.c + ", message=" + this.d + ", url=" + this.a.a + '}';
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eaer eaerVar = this.g;
        if (eaerVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        eaerVar.close();
    }
}
