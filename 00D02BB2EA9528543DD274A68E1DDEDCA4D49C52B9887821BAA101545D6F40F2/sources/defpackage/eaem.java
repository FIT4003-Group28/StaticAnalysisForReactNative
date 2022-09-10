package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: eaem  reason: default package */
/* loaded from: classes6.dex */
public final class eaem {
    public final eadz a;
    public final String b;
    public final eadx c;
    @dzsi
    public final eaen d;
    final Map<Class<?>, Object> e;
    @dzsi
    private volatile eadb f;

    public eaem(eael eaelVar) {
        this.a = eaelVar.a;
        this.b = eaelVar.b;
        this.c = eaelVar.c.b();
        this.d = eaelVar.d;
        this.e = eafa.f(eaelVar.e);
    }

    @dzsi
    public final String a(String str) {
        return this.c.a(str);
    }

    public final eael b() {
        return new eael(this);
    }

    public final eadb c() {
        eadb eadbVar = this.f;
        if (eadbVar != null) {
            return eadbVar;
        }
        eadb a = eadb.a(this.c);
        this.f = a;
        return a;
    }

    public final boolean d() {
        return this.a.c();
    }

    public final String toString() {
        return "Request{method=" + this.b + ", url=" + this.a + ", tags=" + this.e + '}';
    }
}
