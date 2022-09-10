package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aunz  reason: default package */
/* loaded from: classes2.dex */
final class aunz extends auoc {
    private final Intent a;
    private final auhw b;
    private final int c;
    private final ddho d;
    private final boolean e;
    private final boolean f;
    private final ddcu g;

    public aunz(Intent intent, auhw auhwVar, int i, ddho ddhoVar, boolean z, boolean z2, @dzsi ddcu ddcuVar) {
        if (intent != null) {
            this.a = intent;
            if (auhwVar != null) {
                this.b = auhwVar;
                this.c = i;
                this.d = ddhoVar;
                this.e = z;
                this.f = z2;
                this.g = ddcuVar;
                return;
            }
            throw new NullPointerException("Null intentType");
        }
        throw new NullPointerException("Null intent");
    }

    @Override // defpackage.auoc
    public final Intent a() {
        return this.a;
    }

    @Override // defpackage.auoc
    public final auhw b() {
        return this.b;
    }

    @Override // defpackage.auoc
    public final int c() {
        return this.c;
    }

    @Override // defpackage.auoc
    public final ddho d() {
        return this.d;
    }

    @Override // defpackage.auoc
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ddcu ddcuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof auoc) {
            auoc auocVar = (auoc) obj;
            if (this.a.equals(auocVar.a()) && this.b.equals(auocVar.b()) && this.c == auocVar.c() && this.d.equals(auocVar.d()) && this.e == auocVar.e() && this.f == auocVar.f() && auocVar.g() == null && ((ddcuVar = this.g) != null ? ddcuVar.equals(auocVar.h()) : auocVar.h() == null) && auocVar.i() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auoc
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.auoc
    @dzsi
    public final cjtd g() {
        return null;
    }

    @Override // defpackage.auoc
    @dzsi
    public final ddcu h() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        int i2 = (hashCode ^ i) * (-721379959);
        ddcu ddcuVar = this.g;
        return (i2 ^ (ddcuVar == null ? 0 : ddcuVar.hashCode())) * 1000003;
    }

    @Override // defpackage.auoc
    @dzsi
    public final String i() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        String valueOf4 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = "null".length();
        StringBuilder sb = new StringBuilder(length + 193 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + "null".length());
        sb.append("CustomContentButton{intent=");
        sb.append(valueOf);
        sb.append(", intentType=");
        sb.append(valueOf2);
        sb.append(", viewId=");
        sb.append(i);
        sb.append(", visualElementType=");
        sb.append(valueOf3);
        sb.append(", shouldDismissNotification=");
        sb.append(z);
        sb.append(", replaceNotificationOnClick=");
        sb.append(z2);
        sb.append(", extraLoggingParams=");
        sb.append("null");
        sb.append(", dataElementType=");
        sb.append(valueOf4);
        sb.append(", ved=");
        sb.append((String) null);
        sb.append("}");
        return sb.toString();
    }
}
