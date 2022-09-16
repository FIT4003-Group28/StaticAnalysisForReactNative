package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: asvg  reason: default package */
/* loaded from: classes2.dex */
public final class asvg {
    public final cren a;
    public final cqsn b;
    public final cqsn c;
    public final cqsn d;

    public asvg(cren crenVar, cqsn cqsnVar, cqsn cqsnVar2, cqsn cqsnVar3) {
        dbsk.s(crenVar);
        this.a = crenVar;
        this.b = cqsnVar;
        this.c = cqsnVar2;
        this.d = cqsnVar3;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asvg)) {
            return false;
        }
        asvg asvgVar = (asvg) obj;
        return this.a == asvgVar.a && this.b.equals(asvgVar.b) && this.c.equals(asvgVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}
