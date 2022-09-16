package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aaqf  reason: default package */
/* loaded from: classes.dex */
public final class aaqf {
    private final azqb a;

    public aaqf(azqb azqbVar) {
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public final aopa a() {
        ylr.b();
        aopa createBuilder = aroy.a.createBuilder();
        Set<aaqw> set = (Set) this.a.get();
        if (set != null) {
            for (aaqw aaqwVar : set) {
                aaqwVar.a(createBuilder);
            }
        }
        return createBuilder;
    }
}
