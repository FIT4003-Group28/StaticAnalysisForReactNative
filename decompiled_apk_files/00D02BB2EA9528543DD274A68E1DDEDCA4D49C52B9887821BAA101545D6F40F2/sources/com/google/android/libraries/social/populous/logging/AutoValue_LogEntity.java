package com.google.android.libraries.social.populous.logging;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.EnumSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_LogEntity extends C$AutoValue_LogEntity implements Parcelable {
    public static final Parcelable.Creator<AutoValue_LogEntity> CREATOR = new cyom();
    private static final ClassLoader t = AutoValue_LogEntity.class.getClassLoader();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_LogEntity(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            java.io.Serializable r1 = r23.readSerializable()
            r3 = r1
            java.util.EnumSet r3 = (java.util.EnumSet) r3
            java.io.Serializable r1 = r23.readSerializable()
            r4 = r1
            java.util.EnumSet r4 = (java.util.EnumSet) r4
            byte r1 = r23.readByte()
            r5 = 1
            if (r1 != r5) goto L1c
            java.lang.String r1 = r23.readString()
            goto L1d
        L1c:
            r1 = 0
        L1d:
            java.lang.String r6 = r23.readString()
            int r7 = r23.readInt()
            int r8 = r23.readInt()
            byte r9 = r23.readByte()
            if (r9 != r5) goto L34
            java.lang.String r9 = r23.readString()
            goto L35
        L34:
            r9 = 0
        L35:
            byte r10 = r23.readByte()
            if (r10 != r5) goto L40
            java.lang.String r10 = r23.readString()
            goto L41
        L40:
            r10 = 0
        L41:
            byte r11 = r23.readByte()
            if (r11 != r5) goto L4c
            java.lang.String r11 = r23.readString()
            goto L4d
        L4c:
            r11 = 0
        L4d:
            byte r12 = r23.readByte()
            if (r12 != r5) goto L58
            java.lang.String r12 = r23.readString()
            goto L59
        L58:
            r12 = 0
        L59:
            byte r13 = r23.readByte()
            if (r13 != r5) goto L68
            long r13 = r23.readLong()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L69
        L68:
            r13 = 0
        L69:
            int[] r14 = defpackage.cypa.b()
            int r15 = r23.readInt()
            r14 = r14[r15]
            int[] r15 = defpackage.cypa.b()
            int r16 = r23.readInt()
            r15 = r15[r16]
            java.lang.ClassLoader r2 = com.google.android.libraries.social.populous.logging.AutoValue_LogEntity.t
            java.lang.Object r17 = r0.readValue(r2)
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            boolean r17 = r17.booleanValue()
            java.lang.Object r18 = r0.readValue(r2)
            java.lang.Boolean r18 = (java.lang.Boolean) r18
            boolean r18 = r18.booleanValue()
            java.lang.Object r19 = r0.readValue(r2)
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            boolean r19 = r19.booleanValue()
            java.lang.Object r20 = r0.readValue(r2)
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            boolean r20 = r20.booleanValue()
            java.lang.Object r2 = r0.readValue(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r21 = r2.booleanValue()
            byte r2 = r23.readByte()
            if (r2 != r5) goto Lc0
            int r0 = r23.readInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lc1
        Lc0:
            r0 = 0
        Lc1:
            r2 = r22
            r5 = r1
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.logging.AutoValue_LogEntity.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeSerializable(this.b);
        byte b = 0;
        parcel.writeByte(this.c == null ? (byte) 0 : (byte) 1);
        String str = this.c;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeByte(this.g == null ? (byte) 0 : (byte) 1);
        String str2 = this.g;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeByte(this.h == null ? (byte) 0 : (byte) 1);
        String str3 = this.h;
        if (str3 != null) {
            parcel.writeString(str3);
        }
        parcel.writeByte(this.i == null ? (byte) 0 : (byte) 1);
        String str4 = this.i;
        if (str4 != null) {
            parcel.writeString(str4);
        }
        parcel.writeByte(this.j == null ? (byte) 0 : (byte) 1);
        String str5 = this.j;
        if (str5 != null) {
            parcel.writeString(str5);
        }
        parcel.writeByte(this.k == null ? (byte) 0 : (byte) 1);
        Long l = this.k;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.r - 1);
        parcel.writeInt(this.s - 1);
        parcel.writeValue(Boolean.valueOf(this.l));
        parcel.writeValue(Boolean.valueOf(this.m));
        parcel.writeValue(Boolean.valueOf(this.n));
        parcel.writeValue(Boolean.valueOf(this.o));
        parcel.writeValue(Boolean.valueOf(this.p));
        if (this.q != null) {
            b = 1;
        }
        parcel.writeByte(b);
        Integer num = this.q;
        if (num != null) {
            parcel.writeInt(num.intValue());
        }
    }

    public AutoValue_LogEntity(EnumSet<cygl> enumSet, EnumSet<cygl> enumSet2, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, Long l, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Integer num) {
        super(enumSet, enumSet2, str, str2, i, i2, str3, str4, str5, str6, l, i3, i4, z, z2, z3, z4, z5, num);
    }
}
