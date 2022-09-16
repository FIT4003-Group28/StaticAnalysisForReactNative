package defpackage;

import java.io.Serializable;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: cydy  reason: default package */
/* loaded from: classes5.dex */
public final class cydy implements Serializable {
    public final BitSet a = new BitSet();
    public final BitSet b = new BitSet();

    public static cydy b(cydy cydyVar) {
        cydy cydyVar2 = new cydy();
        cydyVar2.a(cydyVar);
        return cydyVar2;
    }

    public final void a(cydy cydyVar) {
        this.a.andNot(cydyVar.b);
        this.a.or(cydyVar.a);
        this.b.or(cydyVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cydy) {
            return this.a.equals(((cydy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
