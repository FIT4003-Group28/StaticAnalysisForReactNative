package defpackage;
/* compiled from: PG */
/* renamed from: aeil  reason: default package */
/* loaded from: classes2.dex */
final class aeil extends aeit {
    private final ddho a;
    private final ddho b;
    private final ddho c;

    public aeil(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
    }

    @Override // defpackage.aeit
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.aeit
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.aeit
    public final ddho c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeit) {
            aeit aeitVar = (aeit) obj;
            if (this.a.equals(aeitVar.a()) && this.b.equals(aeitVar.b()) && this.c.equals(aeitVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 84 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("LoggingConfig{carouselVisualElement=");
        sb.append(valueOf);
        sb.append(", hotelVisualElement=");
        sb.append(valueOf2);
        sb.append(", moreButtonVisualElement=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
