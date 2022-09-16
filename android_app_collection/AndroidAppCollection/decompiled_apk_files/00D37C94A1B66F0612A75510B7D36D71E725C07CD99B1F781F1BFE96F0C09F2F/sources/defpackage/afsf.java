package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: afsf  reason: default package */
/* loaded from: classes.dex */
public final class afsf implements axou {
    private final azqb a;

    public afsf(azqb azqbVar) {
        this.a = azqbVar;
    }

    public static SparseArray b(afsn afsnVar) {
        SparseArray b = afsnVar.b();
        axzl.o(b);
        return b;
    }

    public static afsf c(azqb azqbVar) {
        return new afsf(azqbVar);
    }

    @Override // defpackage.azqb
    /* renamed from: a */
    public final SparseArray get() {
        return b(((afsg) this.a).get());
    }
}
