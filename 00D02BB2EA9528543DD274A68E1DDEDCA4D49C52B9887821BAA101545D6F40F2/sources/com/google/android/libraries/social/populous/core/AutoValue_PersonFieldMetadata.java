package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.EnumSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_PersonFieldMetadata extends C$AutoValue_PersonFieldMetadata implements Parcelable {
    public static final Parcelable.Creator<AutoValue_PersonFieldMetadata> CREATOR = new cydi();
    private static final ClassLoader r = AutoValue_PersonFieldMetadata.class.getClassLoader();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_PersonFieldMetadata(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.ClassLoader r0 = com.google.android.libraries.social.populous.core.AutoValue_PersonFieldMetadata.r
            java.lang.Object r1 = r13.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
            java.lang.Object r1 = r13.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r4 = r1.booleanValue()
            java.lang.Object r1 = r13.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r5 = r1.booleanValue()
            int r1 = r13.readInt()
            duej r6 = defpackage.duej.b(r1)
            byte r1 = r13.readByte()
            r10 = 0
            r11 = 1
            if (r1 != r11) goto L36
            java.lang.String r1 = r13.readString()
            r7 = r1
            goto L37
        L36:
            r7 = r10
        L37:
            byte r1 = r13.readByte()
            if (r1 != r11) goto L43
            java.lang.String r1 = r13.readString()
            r8 = r1
            goto L44
        L43:
            r8 = r10
        L44:
            byte r1 = r13.readByte()
            if (r1 != r11) goto L54
            long r1 = r13.readLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r9 = r1
            goto L55
        L54:
            r9 = r10
        L55:
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            byte r1 = r13.readByte()
            if (r1 != r11) goto L66
            android.os.Parcelable r1 = r13.readParcelable(r0)
            com.google.android.libraries.social.populous.core.PeopleApiAffinity r1 = (com.google.android.libraries.social.populous.core.PeopleApiAffinity) r1
            goto L67
        L66:
            r1 = r10
        L67:
            r12.h = r1
            double r1 = r13.readDouble()
            r12.i = r1
            int r1 = r13.readInt()
            r12.j = r1
            int r1 = r13.readInt()
            r12.k = r1
            byte r1 = r13.readByte()
            if (r1 != r11) goto L8e
            android.os.Parcelable$Creator<com.google.android.libraries.social.populous.core.AutoValue_MatchInfo> r1 = com.google.android.libraries.social.populous.core.AutoValue_MatchInfo.CREATOR
            java.lang.Object[] r1 = r13.createTypedArray(r1)
            com.google.android.libraries.social.populous.core.MatchInfo[] r1 = (com.google.android.libraries.social.populous.core.MatchInfo[]) r1
            dcdc r1 = defpackage.dcdc.t(r1)
            goto L8f
        L8e:
            r1 = r10
        L8f:
            r12.n = r1
            byte r1 = r13.readByte()
            if (r1 != r11) goto La4
            android.os.Parcelable$Creator<com.google.android.libraries.social.populous.core.AutoValue_EdgeKeyInfo> r1 = com.google.android.libraries.social.populous.core.AutoValue_EdgeKeyInfo.CREATOR
            java.lang.Object[] r1 = r13.createTypedArray(r1)
            com.google.android.libraries.social.populous.core.EdgeKeyInfo[] r1 = (com.google.android.libraries.social.populous.core.EdgeKeyInfo[]) r1
            dcdc r1 = defpackage.dcdc.t(r1)
            goto La5
        La4:
            r1 = r10
        La5:
            r12.n(r1)
            java.lang.Object r1 = r13.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r12.l = r1
            java.lang.Object r0 = r13.readValue(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r12.m = r0
            byte r0 = r13.readByte()
            if (r0 != r11) goto Lcd
            java.io.Serializable r0 = r13.readSerializable()
            java.util.EnumSet r0 = (java.util.EnumSet) r0
            goto Lce
        Lcd:
            r0 = r10
        Lce:
            r12.p = r0
            byte r0 = r13.readByte()
            if (r0 != r11) goto Le2
            android.os.Parcelable$Creator<com.google.android.libraries.social.populous.core.AutoValue_ContainerInfo> r0 = com.google.android.libraries.social.populous.core.AutoValue_ContainerInfo.CREATOR
            java.lang.Object[] r13 = r13.createTypedArray(r0)
            com.google.android.libraries.social.populous.core.ContainerInfo[] r13 = (com.google.android.libraries.social.populous.core.ContainerInfo[]) r13
            dcdc r10 = defpackage.dcdc.t(r13)
        Le2:
            r12.q = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_PersonFieldMetadata.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.a));
        parcel.writeValue(Boolean.valueOf(this.b));
        parcel.writeValue(Boolean.valueOf(this.c));
        parcel.writeInt(this.d.p);
        byte b = 1;
        parcel.writeByte(this.e == null ? (byte) 0 : (byte) 1);
        String str = this.e;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeByte(this.f == null ? (byte) 0 : (byte) 1);
        String str2 = this.f;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeByte(this.g == null ? (byte) 0 : (byte) 1);
        Long l = this.g;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeByte(this.h == null ? (byte) 0 : (byte) 1);
        PeopleApiAffinity peopleApiAffinity = this.h;
        if (peopleApiAffinity != null) {
            parcel.writeParcelable(peopleApiAffinity, 0);
        }
        parcel.writeDouble(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeByte(this.n == null ? (byte) 0 : (byte) 1);
        dcdc<MatchInfo> dcdcVar = this.n;
        if (dcdcVar != null) {
            parcel.writeTypedArray((AutoValue_MatchInfo[]) dcdcVar.toArray(new AutoValue_MatchInfo[0]), 0);
        }
        parcel.writeByte(this.o == null ? (byte) 0 : (byte) 1);
        dcdc<EdgeKeyInfo> dcdcVar2 = this.o;
        if (dcdcVar2 != null) {
            parcel.writeTypedArray((AutoValue_EdgeKeyInfo[]) dcdcVar2.toArray(new AutoValue_EdgeKeyInfo[0]), 0);
        }
        parcel.writeValue(Boolean.valueOf(this.l));
        parcel.writeValue(Boolean.valueOf(this.m));
        parcel.writeByte(this.p == null ? (byte) 0 : (byte) 1);
        EnumSet<cygl> enumSet = this.p;
        if (enumSet != null) {
            parcel.writeSerializable(enumSet);
        }
        if (this.q == null) {
            b = 0;
        }
        parcel.writeByte(b);
        dcdc<ContainerInfo> dcdcVar3 = this.q;
        if (dcdcVar3 != null) {
            parcel.writeTypedArray((AutoValue_ContainerInfo[]) dcdcVar3.toArray(new AutoValue_ContainerInfo[0]), 0);
        }
    }

    public AutoValue_PersonFieldMetadata(final boolean z, final boolean z2, final boolean z3, final duej duejVar, final String str, final String str2, final Long l) {
        new C$$AutoValue_PersonFieldMetadata(z, z2, z3, duejVar, str, str2, l) { // from class: com.google.android.libraries.social.populous.core.$AutoValue_PersonFieldMetadata
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj != null && (obj instanceof PersonFieldMetadata)) {
                    PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
                    if (dbsd.a(Boolean.valueOf(this.a), Boolean.valueOf(personFieldMetadata.a())) && dbsd.a(Boolean.valueOf(this.b), Boolean.valueOf(personFieldMetadata.b())) && dbsd.a(Boolean.valueOf(this.c), Boolean.valueOf(personFieldMetadata.c())) && dbsd.a(this.d, personFieldMetadata.d()) && dbsd.a(this.e, personFieldMetadata.e()) && dbsd.a(this.f, personFieldMetadata.f()) && dbsd.a(this.g, personFieldMetadata.g()) && dbsd.a(this.h, personFieldMetadata.h) && dbsd.a(Double.valueOf(this.i), Double.valueOf(personFieldMetadata.i)) && dbsd.a(Integer.valueOf(this.j), Integer.valueOf(personFieldMetadata.j)) && dbsd.a(Integer.valueOf(this.k), Integer.valueOf(personFieldMetadata.k)) && dbsd.a(this.n, personFieldMetadata.n) && dbsd.a(this.o, personFieldMetadata.o) && dbsd.a(Boolean.valueOf(this.l), Boolean.valueOf(personFieldMetadata.l)) && dbsd.a(Boolean.valueOf(this.m), Boolean.valueOf(personFieldMetadata.m)) && dbsd.a(this.p, personFieldMetadata.p) && dbsd.a(this.q, personFieldMetadata.q)) {
                        return true;
                    }
                }
                return false;
            }

            public final int hashCode() {
                return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Double.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), this.n, this.o, Boolean.valueOf(this.l), Boolean.valueOf(this.m), this.p, this.q});
            }

            public final String toString() {
                boolean z4 = this.a;
                boolean z5 = this.b;
                boolean z6 = this.c;
                String valueOf = String.valueOf(this.d);
                String str3 = this.e;
                String str4 = this.f;
                String valueOf2 = String.valueOf(this.g);
                String valueOf3 = String.valueOf(this.h);
                double d = this.i;
                int i = this.j;
                int i2 = this.k;
                String valueOf4 = String.valueOf(this.n);
                String valueOf5 = String.valueOf(this.o);
                boolean z7 = this.l;
                boolean z8 = this.m;
                String valueOf6 = String.valueOf(this.p);
                String valueOf7 = String.valueOf(this.q);
                int length = String.valueOf(valueOf).length();
                int length2 = String.valueOf(str3).length();
                int length3 = String.valueOf(str4).length();
                int length4 = String.valueOf(valueOf2).length();
                int length5 = String.valueOf(valueOf3).length();
                int length6 = String.valueOf(valueOf4).length();
                int length7 = String.valueOf(valueOf5).length();
                StringBuilder sb = new StringBuilder(length + 348 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
                sb.append("PersonFieldMetadata{isPrimary=");
                sb.append(z4);
                sb.append(", isVerified=");
                sb.append(z5);
                sb.append(", isAzList=");
                sb.append(z6);
                sb.append(", containerType=");
                sb.append(valueOf);
                sb.append(", encodedContainerId=");
                sb.append(str3);
                sb.append(", query=");
                sb.append(str4);
                sb.append(", querySessionId=");
                sb.append(valueOf2);
                sb.append(", peopleApiAffinity=");
                sb.append(valueOf3);
                sb.append(", mergedAffinity=");
                sb.append(d);
                sb.append(", personLevelPosition=");
                sb.append(i);
                sb.append(", fieldLevelPosition=");
                sb.append(i2);
                sb.append(", matchInfos=");
                sb.append(valueOf4);
                sb.append(", edgeKeyInfos=");
                sb.append(valueOf5);
                sb.append(", hasAvatar=");
                sb.append(z7);
                sb.append(", boosted=");
                sb.append(z8);
                sb.append(", provenance=");
                sb.append(valueOf6);
                sb.append(", containerInfos=");
                sb.append(valueOf7);
                sb.append("}");
                return sb.toString();
            }
        };
    }
}
