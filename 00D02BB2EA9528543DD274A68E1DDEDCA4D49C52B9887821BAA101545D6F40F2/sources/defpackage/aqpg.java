package defpackage;
/* compiled from: PG */
/* renamed from: aqpg  reason: default package */
/* loaded from: classes2.dex */
final class aqpg extends aqph {
    private final aqqe a;

    public aqpg(aqqe aqqeVar) {
        this.a = aqqeVar;
    }

    @Override // defpackage.aqql
    public final int b() {
        return 2;
    }

    @Override // defpackage.aqph, defpackage.aqql
    public final aqqe c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqql) {
            aqql aqqlVar = (aqql) obj;
            if (aqqlVar.b() == 2 && this.a.equals(aqqlVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("ProfileListItem{profile=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
