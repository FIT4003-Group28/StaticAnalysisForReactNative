package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvjx  reason: default package */
/* loaded from: classes5.dex */
public final class cvjx extends cvkg {
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final dsef e;
    private final dsok f;
    private final String g;
    private final drxx h;
    private final dspt i;
    private final int j;

    public cvjx(String str, int i, int i2, String str2, String str3, dsef dsefVar, @dzsi dsok dsokVar, String str4, drxx drxxVar, dspt dsptVar) {
        this.a = str;
        this.j = i;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = dsefVar;
        this.f = dsokVar;
        this.g = str4;
        this.h = drxxVar;
        this.i = dsptVar;
    }

    @Override // defpackage.cvkg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cvkg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cvkg
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cvkg
    public final String d() {
        return this.d;
    }

    @Override // defpackage.cvkg
    public final dsef e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dsok dsokVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvkg) {
            cvkg cvkgVar = (cvkg) obj;
            if (this.a.equals(cvkgVar.a())) {
                int i = this.j;
                int j = cvkgVar.j();
                if (i == 0) {
                    throw null;
                }
                if (i == j && this.b == cvkgVar.b() && this.c.equals(cvkgVar.c()) && this.d.equals(cvkgVar.d()) && this.e.equals(cvkgVar.e()) && ((dsokVar = this.f) != null ? dsokVar.equals(cvkgVar.f()) : cvkgVar.f() == null) && this.g.equals(cvkgVar.g()) && this.h.equals(cvkgVar.h()) && this.i.equals(cvkgVar.i())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cvkg
    @dzsi
    public final dsok f() {
        return this.f;
    }

    @Override // defpackage.cvkg
    public final String g() {
        return this.g;
    }

    @Override // defpackage.cvkg
    public final drxx h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i2 = this.j;
        if (i2 != 0) {
            int hashCode2 = (((((((hashCode ^ i2) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
            dsef dsefVar = this.e;
            int i3 = dsefVar.bC;
            if (i3 == 0) {
                i3 = dsst.a.b(dsefVar).c(dsefVar);
                dsefVar.bC = i3;
            }
            int i4 = (hashCode2 ^ i3) * 1000003;
            dsok dsokVar = this.f;
            if (dsokVar == null) {
                i = 0;
            } else {
                int i5 = dsokVar.bC;
                if (i5 == 0) {
                    i5 = dsst.a.b(dsokVar).c(dsokVar);
                    dsokVar.bC = i5;
                }
                i = i5;
            }
            int hashCode3 = (((i4 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
            drxx drxxVar = this.h;
            int i6 = drxxVar.bC;
            if (i6 == 0) {
                i6 = dsst.a.b(drxxVar).c(drxxVar);
                drxxVar.bC = i6;
            }
            int i7 = (hashCode3 ^ i6) * 1000003;
            dspt dsptVar = this.i;
            int i8 = dsptVar.bC;
            if (i8 == 0) {
                i8 = dsst.a.b(dsptVar).c(dsptVar);
                dsptVar.bC = i8;
            }
            return i7 ^ i8;
        }
        throw null;
    }

    @Override // defpackage.cvkg
    public final dspt i() {
        return this.i;
    }

    @Override // defpackage.cvkg
    public final int j() {
        return this.j;
    }

    public final String toString() {
        String str = this.a;
        int i = this.j;
        String valueOf = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        int i2 = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String str4 = this.g;
        String valueOf4 = String.valueOf(this.h);
        String valueOf5 = String.valueOf(this.i);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 174 + length2 + length3 + length4 + length5 + length6 + String.valueOf(str4).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ChimeNotificationAction{actionId=");
        sb.append(str);
        sb.append(", builtInActionType=");
        sb.append(valueOf);
        sb.append(", iconResourceId=");
        sb.append(i2);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", url=");
        sb.append(str3);
        sb.append(", threadStateUpdate=");
        sb.append(valueOf2);
        sb.append(", payload=");
        sb.append(valueOf3);
        sb.append(", replyHintText=");
        sb.append(str4);
        sb.append(", preferenceKey=");
        sb.append(valueOf4);
        sb.append(", snoozeDuration=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
