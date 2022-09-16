package defpackage;
/* compiled from: PG */
/* renamed from: axpb  reason: default package */
/* loaded from: classes2.dex */
public final class axpb implements azqb {
    private static final Object a = new Object();
    private volatile azqb b;
    private volatile Object c = a;

    private axpb(azqb azqbVar) {
        this.b = azqbVar;
    }

    public static azqb a(azqb azqbVar) {
        if ((azqbVar instanceof axpb) || (azqbVar instanceof axot)) {
            return azqbVar;
        }
        azqbVar.getClass();
        return new axpb(azqbVar);
    }

    @Override // defpackage.azqb
    public final Object get() {
        Object obj = this.c;
        if (obj == a) {
            azqb azqbVar = this.b;
            if (azqbVar == null) {
                return this.c;
            }
            Object obj2 = azqbVar.get();
            this.c = obj2;
            this.b = null;
            return obj2;
        }
        return obj;
    }
}
