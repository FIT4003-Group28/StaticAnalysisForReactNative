package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adfd  reason: default package */
/* loaded from: classes.dex */
public final class adfd {
    public final adnl a;

    public adfd() {
    }

    public adfd(adnl adnlVar) {
        this.a = adnlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static adfc a() {
        return new adfc();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adfd)) {
            return false;
        }
        adnl adnlVar = this.a;
        adnl adnlVar2 = ((adfd) obj).a;
        if (adnlVar != null) {
            return adnlVar.equals(adnlVar2);
        }
        return adnlVar2 == null;
    }

    public final int hashCode() {
        adnl adnlVar = this.a;
        return (adnlVar == null ? 0 : adnlVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("SelectedRouteProperties{initialPlaybackDescriptor=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
