package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: pzd  reason: default package */
/* loaded from: classes7.dex */
public final class pzd extends pze {
    public final Intent a;
    public final dpgh b;

    public pzd(Intent intent, dpgh dpghVar) {
        this.a = intent;
        if (dpghVar != null) {
            this.b = dpghVar;
            return;
        }
        throw new NullPointerException("Null agency");
    }

    @Override // defpackage.pze
    public final Intent a() {
        return this.a;
    }

    @Override // defpackage.pze
    public final dpgh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pze) {
            pze pzeVar = (pze) obj;
            if (this.a.equals(pzeVar.a()) && this.b.equals(pzeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dpgh dpghVar = this.b;
        int i = dpghVar.bC;
        if (i == 0) {
            i = dsst.a.b(dpghVar).c(dpghVar);
            dpghVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("BuyTicketsIntentWrapper{intent=");
        sb.append(valueOf);
        sb.append(", agency=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
