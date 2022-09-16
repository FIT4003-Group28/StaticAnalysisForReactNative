package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_PersonExtendedData  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_PersonExtendedData extends PersonExtendedData {
    public final boolean a;
    public final DynamiteExtendedData b;

    public C$AutoValue_PersonExtendedData(boolean z, @dzsi DynamiteExtendedData dynamiteExtendedData) {
        this.a = z;
        this.b = dynamiteExtendedData;
    }

    @Override // com.google.android.libraries.social.populous.core.PersonExtendedData
    public final boolean a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.PersonExtendedData
    @dzsi
    public final DynamiteExtendedData b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        DynamiteExtendedData dynamiteExtendedData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersonExtendedData) {
            PersonExtendedData personExtendedData = (PersonExtendedData) obj;
            if (this.a == personExtendedData.a() && ((dynamiteExtendedData = this.b) != null ? dynamiteExtendedData.equals(personExtendedData.b()) : personExtendedData.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        DynamiteExtendedData dynamiteExtendedData = this.b;
        return i ^ (dynamiteExtendedData == null ? 0 : dynamiteExtendedData.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65);
        sb.append("PersonExtendedData{tlsIsPlaceholder=");
        sb.append(z);
        sb.append(", dynamiteExtendedData=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
