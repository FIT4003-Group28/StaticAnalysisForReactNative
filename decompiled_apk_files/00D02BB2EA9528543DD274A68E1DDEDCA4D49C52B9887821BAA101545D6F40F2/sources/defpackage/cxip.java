package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxip  reason: default package */
/* loaded from: classes5.dex */
public final class cxip extends cxjt {
    public final Context a;
    public final dbty<dbsg<cxja>> b;

    public cxip(Context context, @dzsi dbty<dbsg<cxja>> dbtyVar) {
        if (context != null) {
            this.a = context;
            this.b = dbtyVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    @Override // defpackage.cxjt
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.cxjt
    @dzsi
    public final dbty<dbsg<cxja>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        dbty<dbsg<cxja>> dbtyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxjt) {
            cxjt cxjtVar = (cxjt) obj;
            if (this.a.equals(cxjtVar.a()) && ((dbtyVar = this.b) != null ? dbtyVar.equals(cxjtVar.b()) : cxjtVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dbty<dbsg<cxja>> dbtyVar = this.b;
        return hashCode ^ (dbtyVar == null ? 0 : dbtyVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
