package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: asvr  reason: default package */
/* loaded from: classes2.dex */
public class asvr {
    public final cren a;
    public final cren[] b;
    public final asvp c;

    public asvr() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asvr)) {
            return false;
        }
        asvr asvrVar = (asvr) obj;
        return this.a == asvrVar.a && this.c.equals(asvrVar.c) && Arrays.equals(this.b, asvrVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    public asvr(cren crenVar, cren[] crenVarArr, asvp asvpVar) {
        dbsk.s(crenVar);
        this.a = crenVar;
        this.b = (cren[]) dbsk.s(crenVarArr);
        this.c = asvpVar;
    }
}
