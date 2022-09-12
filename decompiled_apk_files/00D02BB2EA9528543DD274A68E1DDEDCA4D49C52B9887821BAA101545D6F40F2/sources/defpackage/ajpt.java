package defpackage;
/* compiled from: PG */
/* renamed from: ajpt  reason: default package */
/* loaded from: classes2.dex */
final class ajpt extends ajpu {
    private final Throwable a;

    public ajpt(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.ajqa
    public final int a() {
        return 2;
    }

    @Override // defpackage.ajpu, defpackage.ajqa
    public final Throwable b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajqa) {
            ajqa ajqaVar = (ajqa) obj;
            if (ajqaVar.a() == 2 && this.a.equals(ajqaVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Completion{error=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
