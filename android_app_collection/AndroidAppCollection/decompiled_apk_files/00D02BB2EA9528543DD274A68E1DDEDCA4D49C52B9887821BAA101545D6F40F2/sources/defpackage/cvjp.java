package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cvjp  reason: default package */
/* loaded from: classes5.dex */
public final class cvjp extends cvjt {
    private final Integer a;
    private final Integer b;
    private final Integer c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final String h;
    private final String i;
    private final String j;
    private final int k;
    private final boolean l;
    private final int m;

    public cvjp(Integer num, Integer num2, @dzsi Integer num3, boolean z, boolean z2, boolean z3, boolean z4, @dzsi String str, @dzsi String str2, @dzsi String str3, int i, int i2, boolean z5) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.m = i;
        this.k = i2;
        this.l = z5;
    }

    @Override // defpackage.cvjt
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.cvjt
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.cvjt
    @dzsi
    public final Integer c() {
        return this.c;
    }

    @Override // defpackage.cvjt
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.cvjt
    @dzsi
    public final Uri e() {
        return null;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvjt) {
            cvjt cvjtVar = (cvjt) obj;
            if (this.a.equals(cvjtVar.a()) && this.b.equals(cvjtVar.b()) && ((num = this.c) != null ? num.equals(cvjtVar.c()) : cvjtVar.c() == null) && this.d == cvjtVar.d() && cvjtVar.e() == null && this.e == cvjtVar.f() && this.f == cvjtVar.g() && cvjtVar.h() == null && this.g == cvjtVar.i() && ((str = this.h) != null ? str.equals(cvjtVar.j()) : cvjtVar.j() == null) && ((str2 = this.i) != null ? str2.equals(cvjtVar.k()) : cvjtVar.k() == null) && ((str3 = this.j) != null ? str3.equals(cvjtVar.l()) : cvjtVar.l() == null)) {
                int i = this.m;
                int o = cvjtVar.o();
                if (i == 0) {
                    throw null;
                }
                if (i == o && this.k == cvjtVar.m() && this.l == cvjtVar.n()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cvjt
    public final boolean f() {
        return this.e;
    }

    @Override // defpackage.cvjt
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.cvjt
    @dzsi
    public final Integer h() {
        return null;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Integer num = this.c;
        int i = 0;
        int i2 = 1237;
        int hashCode2 = (((((((((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * (-721379959)) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * (-721379959)) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        String str = this.h;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.i;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i3 = (hashCode4 ^ i) * 1000003;
        int i4 = this.m;
        if (i4 != 0) {
            int i5 = (((i3 ^ i4) * 1000003) ^ this.k) * 1000003;
            if (true == this.l) {
                i2 = 1231;
            }
            return i5 ^ i2;
        }
        throw null;
    }

    @Override // defpackage.cvjt
    public final boolean i() {
        return this.g;
    }

    @Override // defpackage.cvjt
    @dzsi
    public final String j() {
        return this.h;
    }

    @Override // defpackage.cvjt
    @dzsi
    public final String k() {
        return this.i;
    }

    @Override // defpackage.cvjt
    @dzsi
    public final String l() {
        return this.j;
    }

    @Override // defpackage.cvjt
    public final int m() {
        return this.k;
    }

    @Override // defpackage.cvjt
    public final boolean n() {
        return this.l;
    }

    @Override // defpackage.cvjt
    public final int o() {
        return this.m;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        String str = this.h;
        String str2 = this.i;
        String str3 = this.j;
        int i = this.m;
        String str4 = i != 1 ? i != 2 ? "null" : "RESHOW_FROM_LOCAL_STORAGE" : "CLEAR_SYSTEM_TRAY";
        int i2 = this.k;
        boolean z5 = this.l;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = "null".length();
        int length5 = "null".length();
        StringBuilder sb = new StringBuilder(length + 367 + length2 + length3 + length4 + length5 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str4.length());
        sb.append("SystemTrayNotificationConfig{iconResourceId=");
        sb.append(valueOf);
        sb.append(", appNameResourceId=");
        sb.append(valueOf2);
        sb.append(", colorResourceId=");
        sb.append(valueOf3);
        sb.append(", soundEnabled=");
        sb.append(z);
        sb.append(", ringtone=");
        sb.append("null");
        sb.append(", vibrationEnabled=");
        sb.append(z2);
        sb.append(", lightsEnabled=");
        sb.append(z3);
        sb.append(", ledColor=");
        sb.append("null");
        sb.append(", displayRecipientAccountName=");
        sb.append(z4);
        sb.append(", notificationClickedActivity=");
        sb.append(str);
        sb.append(", notificationRemovedReceiver=");
        sb.append(str2);
        sb.append(", defaultChannelId=");
        sb.append(str3);
        sb.append(", restartBehavior=");
        sb.append(str4);
        sb.append(", defaultGroupThreshold=");
        sb.append(i2);
        sb.append(", shouldFilterOldThreads=");
        sb.append(z5);
        sb.append("}");
        return sb.toString();
    }
}
