package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acve  reason: default package */
/* loaded from: classes.dex */
public final class acve {
    public final boolean a;
    public final snc b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public acve(boolean z, snc sncVar) {
        this.a = z;
        this.b = sncVar;
    }

    public static final String e(long j, long j2) {
        return String.valueOf(Long.toString(j - j2)).concat(" ms");
    }

    public final void a(String str) {
        if (this.a) {
            String valueOf = String.valueOf(str);
            zep.g(valueOf.length() != 0 ? "[DefaultLatencyLogger] ".concat(valueOf) : new String("[DefaultLatencyLogger] "));
        }
    }

    public final void b(String str, String str2) {
        if (this.a) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
            sb.append("<");
            sb.append(str);
            sb.append("> ");
            sb.append(str2);
            a(sb.toString());
        }
    }

    public final void c(String str) {
        if (this.a) {
            String valueOf = String.valueOf(str);
            a(valueOf.length() != 0 ? "Client Action Nonce is empty when calling ".concat(valueOf) : new String("Client Action Nonce is empty when calling "));
        }
    }

    public final long d(asny asnyVar) {
        Long l = (Long) this.c.get(new jj(asnyVar, ""));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }
}
