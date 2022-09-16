package defpackage;
/* compiled from: PG */
/* renamed from: iun  reason: default package */
/* loaded from: classes3.dex */
final class iun {
    public assn a;
    private ezx b;
    private Boolean c;

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(ezx ezxVar) {
        if (ezxVar != null) {
            this.b = ezxVar;
            return;
        }
        throw new NullPointerException("Null playerViewMode");
    }

    public final iuo a() {
        Boolean bool;
        ezx ezxVar = this.b;
        if (ezxVar == null || (bool = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" playerViewMode");
            }
            if (this.c == null) {
                sb.append(" isEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new iuo(ezxVar, bool.booleanValue(), this.a);
    }
}
