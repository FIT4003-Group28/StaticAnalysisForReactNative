package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.Email;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_Email_EmailSecurityData  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Email_EmailSecurityData extends Email.EmailSecurityData {
    public final boolean a;

    public C$AutoValue_Email_EmailSecurityData(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.libraries.social.populous.core.Email.EmailSecurityData
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Email.EmailSecurityData) && this.a == ((Email.EmailSecurityData) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(48);
        sb.append("EmailSecurityData{usesConfusingCharacters=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
