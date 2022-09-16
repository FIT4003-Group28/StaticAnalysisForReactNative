package defpackage;
/* compiled from: PG */
/* renamed from: uok  reason: default package */
/* loaded from: classes4.dex */
public final class uok {
    public final ampq a;
    public final ampq b;
    public final ampq c;
    public final ampq d;
    public final ampq e;
    public final ampq f;
    public final boolean g;

    public uok() {
    }

    public uok(ampq ampqVar, ampq ampqVar2, ampq ampqVar3, ampq ampqVar4, ampq ampqVar5, ampq ampqVar6, boolean z) {
        this.a = ampqVar;
        this.b = ampqVar2;
        this.c = ampqVar3;
        this.d = ampqVar4;
        this.e = ampqVar5;
        this.f = ampqVar6;
        this.g = z;
    }

    public static uoj a() {
        uoj uojVar = new uoj((byte[]) null);
        uojVar.b = ampq.j(new uol(new vgh(), null, null));
        uojVar.c = true;
        return uojVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uok) {
            uok uokVar = (uok) obj;
            if (this.a.equals(uokVar.a) && this.b.equals(uokVar.b) && this.c.equals(uokVar.c) && this.d.equals(uokVar.d) && this.e.equals(uokVar.e) && this.f.equals(uokVar.f) && this.g == uokVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ (-2127709203)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        boolean z = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 195 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ExpressSignInFeatures{signInWithoutAccountFeature=");
        sb.append(valueOf);
        sb.append(", disclaimerFeature=");
        sb.append(valueOf2);
        sb.append(", scrimAlwaysShownFeature=");
        sb.append(valueOf3);
        sb.append(", customHeaderContentFeature=");
        sb.append(valueOf4);
        sb.append(", logoViewFeature=");
        sb.append(valueOf5);
        sb.append(", cancelableFeature=");
        sb.append(valueOf6);
        sb.append(", supportAccountSwitching=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
