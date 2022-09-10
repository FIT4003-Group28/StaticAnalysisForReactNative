package defpackage;
/* compiled from: PG */
/* renamed from: ceeq  reason: default package */
/* loaded from: classes4.dex */
final class ceeq extends cees {
    private final dhtc a;
    private final dpyv b;
    private final gfw c;
    private final drfs d;
    private final boolean e;
    private final boolean f;

    public ceeq(dhtc dhtcVar, @dzsi dpyv dpyvVar, @dzsi gfw gfwVar, drfs drfsVar, boolean z, boolean z2) {
        this.a = dhtcVar;
        this.b = dpyvVar;
        this.c = gfwVar;
        this.d = drfsVar;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.cees
    public final dhtc a() {
        return this.a;
    }

    @Override // defpackage.cees
    @dzsi
    public final dpyv b() {
        return this.b;
    }

    @Override // defpackage.cees
    @dzsi
    public final gfw c() {
        return this.c;
    }

    @Override // defpackage.cees
    public final drfs d() {
        return this.d;
    }

    @Override // defpackage.cees
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dpyv dpyvVar;
        gfw gfwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cees) {
            cees ceesVar = (cees) obj;
            if (this.a.equals(ceesVar.a()) && ((dpyvVar = this.b) != null ? dpyvVar.equals(ceesVar.b()) : ceesVar.b() == null) && ((gfwVar = this.c) != null ? gfwVar.equals(ceesVar.c()) : ceesVar.c() == null) && this.d.equals(ceesVar.d()) && this.e == ceesVar.e() && this.f == ceesVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cees
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        dhtc dhtcVar = this.a;
        int i = dhtcVar.bC;
        if (i == 0) {
            i = dsst.a.b(dhtcVar).c(dhtcVar);
            dhtcVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        dpyv dpyvVar = this.b;
        int i3 = 0;
        int hashCode = (i2 ^ (dpyvVar == null ? 0 : dpyvVar.hashCode())) * 1000003;
        gfw gfwVar = this.c;
        if (gfwVar != null) {
            i3 = gfwVar.hashCode();
        }
        int i4 = (hashCode ^ i3) * 1000003;
        drfs drfsVar = this.d;
        int i5 = drfsVar.bC;
        if (i5 == 0) {
            i5 = dsst.a.b(drfsVar).c(drfsVar);
            drfsVar.bC = i5;
        }
        int i6 = (i4 ^ i5) * 1000003;
        int i7 = 1237;
        int i8 = (i6 ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i7 = 1231;
        }
        return i8 ^ i7;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 182 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ProfileLeafPageOptions{creatorProfileInfo=");
        sb.append(valueOf);
        sb.append(", entryPointNotificationType=");
        sb.append(valueOf2);
        sb.append(", fragmentResultListener=");
        sb.append(valueOf3);
        sb.append(", topicFilterSpec=");
        sb.append(valueOf4);
        sb.append(", preExpandReviewsTopicCarousel=");
        sb.append(z);
        sb.append(", preloadProfileMainPage=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
