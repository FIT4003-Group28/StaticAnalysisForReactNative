package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_InAppNotificationTarget  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_InAppNotificationTarget extends InAppNotificationTarget {
    public final cyep a;
    public final PersonFieldMetadata b;
    public final dcdc<ContactMethodField> c;
    public final String d;
    public final CharSequence e;
    public final int f;

    public C$AutoValue_InAppNotificationTarget(cyep cyepVar, PersonFieldMetadata personFieldMetadata, @dzsi int i, dcdc<ContactMethodField> dcdcVar, @dzsi String str, CharSequence charSequence) {
        if (cyepVar != null) {
            this.a = cyepVar;
            if (personFieldMetadata != null) {
                this.b = personFieldMetadata;
                this.f = i;
                if (dcdcVar != null) {
                    this.c = dcdcVar;
                    this.d = str;
                    if (charSequence != null) {
                        this.e = charSequence;
                        return;
                    }
                    throw new NullPointerException("Null value");
                }
                throw new NullPointerException("Null originatingFields");
            }
            throw new NullPointerException("Null metadata");
        }
        throw new NullPointerException("Null type");
    }

    @Override // com.google.android.libraries.social.populous.core.ContactMethodField
    public final cyep SA() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.InAppNotificationTarget, com.google.android.libraries.social.populous.core.ContactMethodField
    public final CharSequence a() {
        return this.e;
    }

    @Override // com.google.android.libraries.social.populous.core.InAppNotificationTarget, com.google.android.libraries.social.populous.core.ContactMethodField, defpackage.cyft
    public final PersonFieldMetadata b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.InAppNotificationTarget
    public final dcdc<ContactMethodField> d() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.InAppNotificationTarget
    @dzsi
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        int i;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InAppNotificationTarget) {
            InAppNotificationTarget inAppNotificationTarget = (InAppNotificationTarget) obj;
            if (this.a.equals(inAppNotificationTarget.SA()) && this.b.equals(inAppNotificationTarget.b()) && ((i = this.f) != 0 ? i == inAppNotificationTarget.g() : inAppNotificationTarget.g() == 0) && dchl.m(this.c, inAppNotificationTarget.d()) && ((str = this.d) != null ? str.equals(inAppNotificationTarget.e()) : inAppNotificationTarget.e() == null) && this.e.equals(inAppNotificationTarget.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.social.populous.core.InAppNotificationTarget
    public final cyfi f() {
        return new cyca(this);
    }

    @Override // com.google.android.libraries.social.populous.core.InAppNotificationTarget
    @dzsi
    public final int g() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.f;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.f;
        String valueOf3 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        String valueOf4 = String.valueOf(this.c);
        String str = this.d;
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 102 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(str).length() + String.valueOf(valueOf5).length());
        sb.append("InAppNotificationTarget{type=");
        sb.append(valueOf);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append(", targetType=");
        sb.append(valueOf3);
        sb.append(", originatingFields=");
        sb.append(valueOf4);
        sb.append(", fallbackProfileId=");
        sb.append(str);
        sb.append(", value=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
