package defpackage;
/* compiled from: PG */
/* renamed from: axot  reason: default package */
/* loaded from: classes2.dex */
public final class axot implements azqb, axnm {
    private static final Object a = new Object();
    private volatile azqb b;
    private volatile Object c = a;

    private axot(azqb azqbVar) {
        this.b = azqbVar;
    }

    public static axnm a(azqb azqbVar) {
        if (azqbVar instanceof axnm) {
            return (axnm) azqbVar;
        }
        azqbVar.getClass();
        return new axot(azqbVar);
    }

    public static azqb b(azqb azqbVar) {
        azqbVar.getClass();
        return azqbVar instanceof axot ? azqbVar : new axot(azqbVar);
    }

    @Override // defpackage.azqb
    public final Object get() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.c;
                if (obj == obj2) {
                    obj = this.b.get();
                    Object obj3 = this.c;
                    if (obj3 != obj2 && !(obj3 instanceof axoy) && obj3 != obj) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }
}
