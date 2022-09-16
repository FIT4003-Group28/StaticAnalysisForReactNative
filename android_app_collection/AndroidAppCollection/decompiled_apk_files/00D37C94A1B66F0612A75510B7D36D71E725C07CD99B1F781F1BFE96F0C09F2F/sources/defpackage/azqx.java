package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azqx  reason: default package */
/* loaded from: classes2.dex */
public final class azqx implements Serializable, azrd {
    private final azrd a;
    private final azra b;

    public azqx(azrd azrdVar, azra azraVar) {
        azrdVar.getClass();
        this.a = azrdVar;
        this.b = azraVar;
    }

    private final int a() {
        int i = 2;
        azqx azqxVar = this;
        while (true) {
            azrd azrdVar = azqxVar.a;
            if (true != (azrdVar instanceof azqx)) {
                azrdVar = null;
            }
            azqxVar = (azqx) azrdVar;
            if (azqxVar != null) {
                i++;
            } else {
                return i;
            }
        }
    }

    private final boolean b(azra azraVar) {
        return azst.c(get(azraVar.getKey()), azraVar);
    }

    private final Object writeReplace() {
        int a = a();
        azrd[] azrdVarArr = new azrd[a];
        azsv azsvVar = new azsv();
        azsvVar.a = 0;
        fold(azqm.a, new azqw(azrdVarArr, azsvVar));
        if (azsvVar.a != a) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return new azqv(azrdVarArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof azqx) {
                azqx azqxVar = (azqx) obj;
                if (azqxVar.a() == a()) {
                    azqx azqxVar2 = this;
                    while (true) {
                        if (!azqxVar.b(azqxVar2.b)) {
                            break;
                        }
                        azrd azrdVar = azqxVar2.a;
                        if (!(azrdVar instanceof azqx)) {
                            if (azqxVar.b((azra) azrdVar)) {
                                return true;
                            }
                        } else {
                            azqxVar2 = (azqx) azrdVar;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.azrd
    public final Object fold(Object obj, azsg azsgVar) {
        return azsgVar.invoke(this.a.fold(obj, azsgVar), this.b);
    }

    @Override // defpackage.azrd
    public final azra get(azrb azrbVar) {
        azrbVar.getClass();
        azqx azqxVar = this;
        while (true) {
            azra azraVar = azqxVar.b.get(azrbVar);
            if (azraVar != null) {
                return azraVar;
            }
            azrd azrdVar = azqxVar.a;
            if (azrdVar instanceof azqx) {
                azqxVar = (azqx) azrdVar;
            } else {
                return azrdVar.get(azrbVar);
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.azrd
    public final azrd minusKey(azrb azrbVar) {
        azrbVar.getClass();
        if (this.b.get(azrbVar) != null) {
            return this.a;
        }
        azrd minusKey = this.a.minusKey(azrbVar);
        return minusKey != this.a ? minusKey == azre.a ? this.b : new azqx(minusKey, this.b) : this;
    }

    @Override // defpackage.azrd
    public final azrd plus(azrd azrdVar) {
        azrdVar.getClass();
        return aydb.b(this, azrdVar);
    }

    public final String toString() {
        return "[" + ((String) fold("", azrc.b)) + "]";
    }
}
