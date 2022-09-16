package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzuf  reason: default package */
/* loaded from: classes6.dex */
final class dzuf implements Serializable {
    private static final long serialVersionUID = 0;
    private final dzup[] a;

    public dzuf(dzup[] dzupVarArr) {
        this.a = dzupVarArr;
    }

    private final Object readResolve() {
        dzup[] dzupVarArr = this.a;
        dzup dzupVar = dzuq.a;
        for (dzup dzupVar2 : dzupVarArr) {
            dzupVar = dzupVar.plus(dzupVar2);
        }
        return dzupVar;
    }
}
