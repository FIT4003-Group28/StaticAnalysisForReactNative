package defpackage;
/* compiled from: PG */
/* renamed from: cuaj  reason: default package */
/* loaded from: classes5.dex */
public final class cuaj extends cuak {
    private final cuhb a;

    public cuaj(cuhb cuhbVar) {
        this.a = cuhbVar;
    }

    @Override // defpackage.cuak, defpackage.cufa
    public final cuhb a() {
        return this.a;
    }

    @Override // defpackage.cufa
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cufa) {
            cufa cufaVar = (cufa) obj;
            if (cufaVar.b() == 2 && this.a.equals(cufaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Metadata{receiptMetadata=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
