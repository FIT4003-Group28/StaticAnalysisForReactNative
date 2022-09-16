package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: uir  reason: default package */
/* loaded from: classes4.dex */
public final class uir {
    public final amuk a;
    public final int b;

    public uir() {
    }

    public uir(int i, amuk amukVar) {
        this.b = i;
        this.a = amukVar;
    }

    public static uir a(List list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        aqxo.z(z, "Must provide at least one activity intent.");
        return new uir(1, amuk.o(list));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uir) {
            uir uirVar = (uir) obj;
            if (this.b == uirVar.b) {
                amuk amukVar = this.a;
                amuk amukVar2 = uirVar.a;
                if (amukVar != null ? amxp.v(amukVar, amukVar2) : amukVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        amuk amukVar = this.a;
        return i ^ (amukVar == null ? 0 : amukVar.hashCode());
    }

    public final String toString() {
        String str = this.b != 1 ? "BACKGROUND" : "APP_ACTIVITY";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 46 + String.valueOf(valueOf).length());
        sb.append("ClickBehavior{behaviorType=");
        sb.append(str);
        sb.append(", activityIntents=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
