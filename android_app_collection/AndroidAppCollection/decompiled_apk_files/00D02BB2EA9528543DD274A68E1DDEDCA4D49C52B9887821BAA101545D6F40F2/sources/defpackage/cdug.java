package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdug  reason: default package */
/* loaded from: classes4.dex */
public final class cdug extends cdui {
    private final cdwm a;

    public cdug(cdwm cdwmVar) {
        this.a = cdwmVar;
    }

    @Override // defpackage.cdwq
    public final int a() {
        return 7;
    }

    @Override // defpackage.cdui, defpackage.cdwq
    public final cdwm b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdwq) {
            cdwq cdwqVar = (cdwq) obj;
            if (cdwqVar.a() == 7 && this.a.equals(cdwqVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("MediaAction{changeCaption=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
