package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azre  reason: default package */
/* loaded from: classes2.dex */
public final class azre implements Serializable, azrd {
    public static final azre a = new azre();
    private static final long serialVersionUID = 0;

    private azre() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.azrd
    public final Object fold(Object obj, azsg azsgVar) {
        return obj;
    }

    @Override // defpackage.azrd
    public final azra get(azrb azrbVar) {
        azrbVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.azrd
    public final azrd minusKey(azrb azrbVar) {
        azrbVar.getClass();
        return this;
    }

    @Override // defpackage.azrd
    public final azrd plus(azrd azrdVar) {
        azrdVar.getClass();
        return azrdVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
