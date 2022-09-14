package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cvjn  reason: default package */
/* loaded from: classes5.dex */
public final class cvjn extends cvjs {
    private final String a;
    private final List<String> b;
    private final String c;
    private final cvjr d;
    private final cvjt e;
    private final String f;
    private final Long g;
    private final String h;
    private final Integer i;
    private final int j;
    private final boolean k;
    private final boolean l;

    public cvjn(String str, @dzsi List<String> list, String str2, cvjr cvjrVar, @dzsi cvjt cvjtVar, String str3, Long l, @dzsi String str4, Integer num, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = cvjrVar;
        this.e = cvjtVar;
        this.f = str3;
        this.g = l;
        this.h = str4;
        this.i = num;
        this.j = i;
        this.k = z;
        this.l = z2;
    }

    @Override // defpackage.cvjs
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cvjs
    @dzsi
    public final List<String> b() {
        return this.b;
    }

    @Override // defpackage.cvjs
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cvjs
    public final cvjr d() {
        return this.d;
    }

    @Override // defpackage.cvjs
    @dzsi
    public final cvjt e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        cvjt cvjtVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvjs) {
            cvjs cvjsVar = (cvjs) obj;
            if (this.a.equals(cvjsVar.a()) && ((list = this.b) != null ? list.equals(cvjsVar.b()) : cvjsVar.b() == null) && this.c.equals(cvjsVar.c()) && this.d.equals(cvjsVar.d()) && ((cvjtVar = this.e) != null ? cvjtVar.equals(cvjsVar.e()) : cvjsVar.e() == null) && this.f.equals(cvjsVar.f()) && this.g.equals(cvjsVar.g()) && ((str = this.h) != null ? str.equals(cvjsVar.h()) : cvjsVar.h() == null) && cvjsVar.i() == null && this.i.equals(cvjsVar.j()) && this.j == cvjsVar.k() && cvjsVar.l() == null && this.k == cvjsVar.m() && this.l == cvjsVar.n()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cvjs
    public final String f() {
        return this.f;
    }

    @Override // defpackage.cvjs
    public final Long g() {
        return this.g;
    }

    @Override // defpackage.cvjs
    @dzsi
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List<String> list = this.b;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        cvjt cvjtVar = this.e;
        int hashCode3 = (((((hashCode2 ^ (cvjtVar == null ? 0 : cvjtVar.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode4 = (((((hashCode3 ^ i) * (-721379959)) ^ this.i.hashCode()) * 1000003) ^ this.j) * (-721379959);
        int i2 = 1237;
        int i3 = (hashCode4 ^ (true != this.k ? 1237 : 1231)) * 1000003;
        if (true == this.l) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    @Override // defpackage.cvjs
    @dzsi
    public final String i() {
        return null;
    }

    @Override // defpackage.cvjs
    public final Integer j() {
        return this.i;
    }

    @Override // defpackage.cvjs
    public final int k() {
        return this.j;
    }

    @Override // defpackage.cvjs
    @dzsi
    public final dele l() {
        return null;
    }

    @Override // defpackage.cvjs
    public final boolean m() {
        return this.k;
    }

    @Override // defpackage.cvjs
    public final boolean n() {
        return this.l;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String str3 = this.f;
        String valueOf4 = String.valueOf(this.g);
        String str4 = this.h;
        String valueOf5 = String.valueOf(this.i);
        int i = this.j;
        boolean z = this.k;
        boolean z2 = this.l;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(str3).length();
        int length7 = String.valueOf(valueOf4).length();
        int length8 = String.valueOf(str4).length();
        int length9 = "null".length();
        StringBuilder sb = new StringBuilder(length + 318 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf5).length() + "null".length());
        sb.append("ChimeConfig{clientId=");
        sb.append(str);
        sb.append(", selectionTokens=");
        sb.append(valueOf);
        sb.append(", gcmSenderProjectId=");
        sb.append(str2);
        sb.append(", environment=");
        sb.append(valueOf2);
        sb.append(", systemTrayNotificationConfig=");
        sb.append(valueOf3);
        sb.append(", deviceName=");
        sb.append(str3);
        sb.append(", registrationStalenessTimeMs=");
        sb.append(valueOf4);
        sb.append(", scheduledTaskService=");
        sb.append(str4);
        sb.append(", apiKey=");
        sb.append((String) null);
        sb.append(", jobSchedulerAllowedIDsRange=");
        sb.append(valueOf5);
        sb.append(", maxChimePendingUpstreams=");
        sb.append(i);
        sb.append(", firebaseOptions=");
        sb.append("null");
        sb.append(", forceLogging=");
        sb.append(z);
        sb.append(", disableChimeEntrypoints=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
