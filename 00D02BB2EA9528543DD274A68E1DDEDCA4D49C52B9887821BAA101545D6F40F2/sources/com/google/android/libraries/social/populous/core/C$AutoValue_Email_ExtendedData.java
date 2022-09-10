package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email_ExtendedData  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Email_ExtendedData extends Email.ExtendedData {
    public final boolean a;
    public final Email.EmailSecurityData b;
    public final dsiu c;

    public C$AutoValue_Email_ExtendedData(boolean z, @dzsi Email.EmailSecurityData emailSecurityData, dsiu dsiuVar) {
        this.a = z;
        this.b = emailSecurityData;
        if (dsiuVar != null) {
            this.c = dsiuVar;
            return;
        }
        throw new NullPointerException("Null internalExternalState");
    }

    @Override // com.google.android.libraries.social.populous.core.Email.ExtendedData
    public final boolean a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.Email.ExtendedData
    @dzsi
    public final Email.EmailSecurityData b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.Email.ExtendedData
    public final dsiu c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Email.EmailSecurityData emailSecurityData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Email.ExtendedData) {
            Email.ExtendedData extendedData = (Email.ExtendedData) obj;
            if (this.a == extendedData.a() && ((emailSecurityData = this.b) != null ? emailSecurityData.equals(extendedData.b()) : extendedData.b() == null) && this.c.equals(extendedData.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        Email.EmailSecurityData emailSecurityData = this.b;
        return ((i ^ (emailSecurityData == null ? 0 : emailSecurityData.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 88 + String.valueOf(valueOf2).length());
        sb.append("ExtendedData{doesSmtpServerSupportTls=");
        sb.append(z);
        sb.append(", emailSecurityData=");
        sb.append(valueOf);
        sb.append(", internalExternalState=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
