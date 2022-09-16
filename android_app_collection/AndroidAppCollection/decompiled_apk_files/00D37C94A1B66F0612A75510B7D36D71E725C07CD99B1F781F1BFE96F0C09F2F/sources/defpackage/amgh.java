package defpackage;
/* compiled from: PG */
/* renamed from: amgh  reason: default package */
/* loaded from: classes.dex */
public final class amgh {
    public static final amgh a = new amgh(null, 0, false);
    public final amgg b;
    private final Object c;

    private amgh(Object obj, long j, boolean z) {
        this.c = obj;
        this.b = new amgg(j, obj != null, z);
    }

    public static amgh a(Object obj, long j) {
        obj.getClass();
        return new amgh(obj, j, true);
    }

    public final boolean b() {
        return this.b.b;
    }

    public final boolean c() {
        aqxo.z(b(), "Cannot call isValid() for a CacheResult that does not have content");
        return this.b.c;
    }

    public final String toString() {
        amgg amggVar = this.b;
        if (!amggVar.b) {
            return "CacheResult.cacheMiss";
        }
        if (!amggVar.c) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("CacheResult.cacheInvalid{data=");
            sb.append(valueOf);
            sb.append("}");
            return sb.toString();
        }
        String valueOf2 = String.valueOf(this.c);
        long j = this.b.a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 59);
        sb2.append("CacheResult.cacheHit{data=");
        sb2.append(valueOf2);
        sb2.append(", timestamp=");
        sb2.append(j);
        sb2.append("}");
        return sb2.toString();
    }
}
