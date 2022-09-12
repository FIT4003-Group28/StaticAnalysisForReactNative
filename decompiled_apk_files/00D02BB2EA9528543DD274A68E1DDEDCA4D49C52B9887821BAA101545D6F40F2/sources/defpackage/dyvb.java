package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dyvb  reason: default package */
/* loaded from: classes6.dex */
public final class dyvb {
    final dyhf a;
    @dzsi
    final Object b;

    public dyvb(dyhf dyhfVar, @dzsi Object obj) {
        this.a = dyhfVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dyvb dyvbVar = (dyvb) obj;
            if (dbsd.a(this.a, dyvbVar.a) && dbsd.a(this.b, dyvbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("provider", this.a);
        b.b("config", this.b);
        return b.toString();
    }
}
