package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azqv  reason: default package */
/* loaded from: classes2.dex */
final class azqv implements Serializable {
    private static final long serialVersionUID = 0;
    private final azrd[] a;

    public azqv(azrd[] azrdVarArr) {
        azrdVarArr.getClass();
        this.a = azrdVarArr;
    }

    private final Object readResolve() {
        azrd[] azrdVarArr = this.a;
        azrd azrdVar = azre.a;
        for (azrd azrdVar2 : azrdVarArr) {
            azrdVar = azrdVar.plus(azrdVar2);
        }
        return azrdVar;
    }
}
