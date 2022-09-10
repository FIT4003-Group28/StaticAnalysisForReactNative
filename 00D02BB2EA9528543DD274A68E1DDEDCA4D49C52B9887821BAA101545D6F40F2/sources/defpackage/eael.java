package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eael  reason: default package */
/* loaded from: classes6.dex */
public final class eael {
    @dzsi
    public eadz a;
    String b;
    eadw c;
    @dzsi
    eaen d;
    Map<Class<?>, Object> e;

    public eael() {
        this.e = Collections.emptyMap();
        this.b = "GET";
        this.c = new eadw();
    }

    public final eaem a() {
        if (this.a == null) {
            throw new IllegalStateException("url == null");
        }
        return new eaem(this);
    }

    public final void b(String str, String str2) {
        this.c.e(str, str2);
    }

    public final void c(eadx eadxVar) {
        this.c = eadxVar.e();
    }

    public final void d(String str, @dzsi eaen eaenVar) {
        if (str != null) {
            if (str.length() != 0) {
                if (eaenVar == null || eafu.a(str)) {
                    if (eaenVar == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.b = str;
                    this.d = eaenVar;
                    return;
                }
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
        throw new NullPointerException("method == null");
    }

    public final void e(String str) {
        this.c.d(str);
    }

    public eael(eaem eaemVar) {
        Map<Class<?>, Object> linkedHashMap;
        this.e = Collections.emptyMap();
        this.a = eaemVar.a;
        this.b = eaemVar.b;
        this.d = eaemVar.d;
        if (eaemVar.e.isEmpty()) {
            linkedHashMap = Collections.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>(eaemVar.e);
        }
        this.e = linkedHashMap;
        this.c = eaemVar.c.e();
    }
}
