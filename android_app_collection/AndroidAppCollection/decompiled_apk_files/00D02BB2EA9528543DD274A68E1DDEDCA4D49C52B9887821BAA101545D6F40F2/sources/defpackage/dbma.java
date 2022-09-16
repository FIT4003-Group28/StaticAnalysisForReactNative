package defpackage;

import java.io.ObjectInputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dbma  reason: default package */
/* loaded from: classes5.dex */
public class dbma extends dblv {
    private static final long serialVersionUID = 4556936364828217687L;
    private final Object a;
    private Map<String, List<String>> b;
    private dblw c;

    protected dbma() {
        this(null);
    }

    public static dbma d(dblw dblwVar) {
        dblz dblzVar = new dblz();
        dblzVar.a = dblwVar;
        return new dbma(dblzVar.a);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public dblw a() {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    @Override // defpackage.dblv
    public final void b(URI uri, Executor executor, dyjl dyjlVar) {
        synchronized (this.a) {
            if (f()) {
                executor.execute(new dblu(this, dyjlVar));
                return;
            }
            Map<String, List<String>> map = this.b;
            dbsk.t(map, "cached requestMetadata");
            dyjlVar.a(map);
        }
    }

    @Override // defpackage.dblv
    public final Map<String, List<String>> c() {
        Map<String, List<String>> map;
        synchronized (this.a) {
            if (f()) {
                synchronized (this.a) {
                    this.b = null;
                    this.c = null;
                    dblw a = a();
                    dbsk.t(a, "new access token");
                    e(a);
                }
            }
            map = this.b;
            dbsk.t(map, "requestMetadata");
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbma)) {
            return false;
        }
        dbma dbmaVar = (dbma) obj;
        return Objects.equals(this.b, dbmaVar.b) && Objects.equals(this.c, dbmaVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("requestMetadata", this.b);
        b.b("temporaryAccess", this.c);
        return b.toString();
    }

    @Deprecated
    public dbma(dblw dblwVar) {
        this.a = new byte[0];
        if (dblwVar != null) {
            e(dblwVar);
        }
    }

    private final void e(dblw dblwVar) {
        this.c = dblwVar;
        String valueOf = String.valueOf(dblwVar.a);
        this.b = Collections.singletonMap("Authorization", Collections.singletonList(valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer ")));
    }

    private final boolean f() {
        dblw dblwVar = this.c;
        Long l = null;
        if (dblwVar != null) {
            Long l2 = dblwVar.b;
            Date date = l2 == null ? null : new Date(l2.longValue());
            if (date != null) {
                l = Long.valueOf(date.getTime() - System.currentTimeMillis());
            }
        }
        return this.b == null || (l != null && l.longValue() <= 300000);
    }
}
