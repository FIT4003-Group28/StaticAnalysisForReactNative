package defpackage;

import android.content.Intent;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvlk  reason: default package */
/* loaded from: classes5.dex */
final class cvlk extends cvlm {
    private final int a;
    private final String b;
    private final cvkc c;
    private final List<cvkj> d;
    private final dsef e;
    private final Intent f;
    private final cvte g;
    private final dsbi h;
    private final int i;
    private final int j;

    public cvlk(int i, int i2, @dzsi String str, @dzsi cvkc cvkcVar, List<cvkj> list, dsef dsefVar, int i3, @dzsi Intent intent, cvte cvteVar, @dzsi dsbi dsbiVar) {
        this.i = i;
        this.a = i2;
        this.b = str;
        this.c = cvkcVar;
        this.d = list;
        this.e = dsefVar;
        this.j = i3;
        this.f = intent;
        this.g = cvteVar;
        this.h = dsbiVar;
    }

    @Override // defpackage.cvlm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cvlm
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cvlm
    @dzsi
    public final cvkc c() {
        return this.c;
    }

    @Override // defpackage.cvlm
    public final List<cvkj> d() {
        return this.d;
    }

    @Override // defpackage.cvlm
    public final dsef e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        cvkc cvkcVar;
        Intent intent;
        dsbi dsbiVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cvlm)) {
            return false;
        }
        cvlm cvlmVar = (cvlm) obj;
        int i = this.i;
        int i2 = cvlmVar.i();
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.a == cvlmVar.a() && ((str = this.b) != null ? str.equals(cvlmVar.b()) : cvlmVar.b() == null) && ((cvkcVar = this.c) != null ? cvkcVar.equals(cvlmVar.c()) : cvlmVar.c() == null) && this.d.equals(cvlmVar.d()) && this.e.equals(cvlmVar.e())) {
            int i3 = this.j;
            int j = cvlmVar.j();
            if (i3 == 0) {
                throw null;
            }
            if (i3 == j && ((intent = this.f) != null ? intent.equals(cvlmVar.f()) : cvlmVar.f() == null) && this.g.equals(cvlmVar.g()) && ((dsbiVar = this.h) != null ? dsbiVar.equals(cvlmVar.h()) : cvlmVar.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cvlm
    @dzsi
    public final Intent f() {
        return this.f;
    }

    @Override // defpackage.cvlm
    public final cvte g() {
        return this.g;
    }

    @Override // defpackage.cvlm
    @dzsi
    public final dsbi h() {
        return this.h;
    }

    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            int i2 = (((i ^ 1000003) * 1000003) ^ this.a) * 1000003;
            String str = this.b;
            int i3 = 0;
            int hashCode = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
            cvkc cvkcVar = this.c;
            int hashCode2 = (((hashCode ^ (cvkcVar == null ? 0 : cvkcVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
            dsef dsefVar = this.e;
            int i4 = dsefVar.bC;
            if (i4 == 0) {
                i4 = dsst.a.b(dsefVar).c(dsefVar);
                dsefVar.bC = i4;
            }
            int i5 = (hashCode2 ^ i4) * 1000003;
            int i6 = this.j;
            if (i6 == 0) {
                throw null;
            }
            int i7 = (i5 ^ i6) * 1000003;
            Intent intent = this.f;
            int hashCode3 = (i7 ^ (intent == null ? 0 : intent.hashCode())) * 1000003;
            cvte cvteVar = this.g;
            int i8 = cvteVar.bC;
            if (i8 == 0) {
                i8 = dsst.a.b(cvteVar).c(cvteVar);
                cvteVar.bC = i8;
            }
            int i9 = (hashCode3 ^ i8) * 1000003;
            dsbi dsbiVar = this.h;
            if (dsbiVar != null && (i3 = dsbiVar.bC) == 0) {
                i3 = dsst.a.b(dsbiVar).c(dsbiVar);
                dsbiVar.bC = i3;
            }
            return i9 ^ i3;
        }
        throw null;
    }

    @Override // defpackage.cvlm
    public final int i() {
        return this.i;
    }

    @Override // defpackage.cvlm
    public final int j() {
        return this.j;
    }

    public final String toString() {
        int i = this.i;
        String str = "null";
        String str2 = i != 1 ? i != 2 ? i != 3 ? str : "API" : "INBOX" : "SYSTEM_TRAY";
        int i2 = this.a;
        String str3 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int i3 = this.j;
        if (i3 != 0) {
            str = Integer.toString(i3 - 1);
        }
        String valueOf4 = String.valueOf(str);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        int length = str2.length();
        int length2 = String.valueOf(str3).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 147 + length2 + length3 + length4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("NotificationEvent{source=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(i2);
        sb.append(", actionId=");
        sb.append(str3);
        sb.append(", account=");
        sb.append(valueOf);
        sb.append(", threads=");
        sb.append(valueOf2);
        sb.append(", threadStateUpdate=");
        sb.append(valueOf3);
        sb.append(", removeReason=");
        sb.append(valueOf4);
        sb.append(", intent=");
        sb.append(valueOf5);
        sb.append(", localThreadState=");
        sb.append(valueOf6);
        sb.append(", action=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
