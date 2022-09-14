package com.google.android.libraries.social.populous.core;

import com.google.android.libraries.social.populous.core.DynamiteExtendedData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_DynamiteExtendedData  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_DynamiteExtendedData extends DynamiteExtendedData {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final DynamiteExtendedData.OrganizationInfo e;
    public final int f;
    public final int g;
    public final int h;

    public C$AutoValue_DynamiteExtendedData(int i, int i2, int i3, @dzsi Long l, @dzsi String str, @dzsi String str2, @dzsi String str3, @dzsi DynamiteExtendedData.OrganizationInfo organizationInfo) {
        if (i != 0) {
            this.f = i;
            if (i2 != 0) {
                this.g = i2;
                if (i3 != 0) {
                    this.h = i3;
                    this.a = l;
                    this.b = str;
                    this.c = str2;
                    this.d = str3;
                    this.e = organizationInfo;
                    return;
                }
                throw new NullPointerException("Null presence");
            }
            throw new NullPointerException("Null entityType");
        }
        throw new NullPointerException("Null dndState");
    }

    @Override // com.google.android.libraries.social.populous.core.DynamiteExtendedData
    @dzsi
    public final Long a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.DynamiteExtendedData
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.DynamiteExtendedData
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.DynamiteExtendedData
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.core.DynamiteExtendedData
    @dzsi
    public final DynamiteExtendedData.OrganizationInfo e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Long l;
        String str;
        String str2;
        String str3;
        DynamiteExtendedData.OrganizationInfo organizationInfo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof DynamiteExtendedData) {
            DynamiteExtendedData dynamiteExtendedData = (DynamiteExtendedData) obj;
            if (this.f == dynamiteExtendedData.f() && this.g == dynamiteExtendedData.g() && this.h == dynamiteExtendedData.h() && ((l = this.a) != null ? l.equals(dynamiteExtendedData.a()) : dynamiteExtendedData.a() == null) && ((str = this.b) != null ? str.equals(dynamiteExtendedData.b()) : dynamiteExtendedData.b() == null) && ((str2 = this.c) != null ? str2.equals(dynamiteExtendedData.c()) : dynamiteExtendedData.c() == null) && ((str3 = this.d) != null ? str3.equals(dynamiteExtendedData.d()) : dynamiteExtendedData.d() == null) && ((organizationInfo = this.e) != null ? organizationInfo.equals(dynamiteExtendedData.e()) : dynamiteExtendedData.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.social.populous.core.DynamiteExtendedData
    public final int f() {
        return this.f;
    }

    @Override // com.google.android.libraries.social.populous.core.DynamiteExtendedData
    public final int g() {
        return this.g;
    }

    @Override // com.google.android.libraries.social.populous.core.DynamiteExtendedData
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int i = (((((this.f ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003;
        Long l = this.a;
        int i2 = 0;
        int hashCode = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        DynamiteExtendedData.OrganizationInfo organizationInfo = this.e;
        if (organizationInfo != null) {
            i2 = organizationInfo.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toString(this.f - 1));
        String valueOf2 = String.valueOf(Integer.toString(this.g - 1));
        String valueOf3 = String.valueOf(Integer.toString(this.h - 1));
        String valueOf4 = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(str).length();
        int length6 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + length3 + length4 + length5 + length6 + String.valueOf(str3).length() + String.valueOf(valueOf5).length());
        sb.append("DynamiteExtendedData{dndState=");
        sb.append(valueOf);
        sb.append(", entityType=");
        sb.append(valueOf2);
        sb.append(", presence=");
        sb.append(valueOf3);
        sb.append(", memberCount=");
        sb.append(valueOf4);
        sb.append(", avatarUrl=");
        sb.append(str);
        sb.append(", developerName=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", organizationInfo=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
