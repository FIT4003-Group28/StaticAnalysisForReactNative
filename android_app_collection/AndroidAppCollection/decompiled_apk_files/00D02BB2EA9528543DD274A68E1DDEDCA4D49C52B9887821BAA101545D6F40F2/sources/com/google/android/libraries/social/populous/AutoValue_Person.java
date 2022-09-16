package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.android.libraries.social.populous.core.Photo;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Person extends C$AutoValue_Person implements Parcelable {
    public static final Parcelable.Creator<AutoValue_Person> CREATOR = new cxxw();
    private static final ClassLoader k = AutoValue_Person.class.getClassLoader();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_Person(android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.ClassLoader r0 = com.google.android.libraries.social.populous.AutoValue_Person.k
            android.os.Parcelable r1 = r14.readParcelable(r0)
            r3 = r1
            com.google.android.libraries.social.populous.PersonMetadata r3 = (com.google.android.libraries.social.populous.PersonMetadata) r3
            java.lang.Class<com.google.android.libraries.social.populous.core.Name> r1 = com.google.android.libraries.social.populous.core.Name.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable[] r1 = r14.readParcelableArray(r1)
            dcdc r1 = defpackage.dcdc.t(r1)
            r2 = 0
            com.google.android.libraries.social.populous.core.Name[] r4 = new com.google.android.libraries.social.populous.core.Name[r2]
            java.lang.Object[] r1 = r1.toArray(r4)
            com.google.android.libraries.social.populous.core.Name[] r1 = (com.google.android.libraries.social.populous.core.Name[]) r1
            dcdc r4 = defpackage.dcdc.t(r1)
            java.lang.Class<com.google.android.libraries.social.populous.core.Email> r1 = com.google.android.libraries.social.populous.core.Email.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable[] r1 = r14.readParcelableArray(r1)
            dcdc r1 = defpackage.dcdc.t(r1)
            com.google.android.libraries.social.populous.core.Email[] r5 = new com.google.android.libraries.social.populous.core.Email[r2]
            java.lang.Object[] r1 = r1.toArray(r5)
            com.google.android.libraries.social.populous.core.Email[] r1 = (com.google.android.libraries.social.populous.core.Email[]) r1
            dcdc r5 = defpackage.dcdc.t(r1)
            java.lang.Class<com.google.android.libraries.social.populous.core.Phone> r1 = com.google.android.libraries.social.populous.core.Phone.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable[] r1 = r14.readParcelableArray(r1)
            dcdc r1 = defpackage.dcdc.t(r1)
            com.google.android.libraries.social.populous.core.Phone[] r6 = new com.google.android.libraries.social.populous.core.Phone[r2]
            java.lang.Object[] r1 = r1.toArray(r6)
            com.google.android.libraries.social.populous.core.Phone[] r1 = (com.google.android.libraries.social.populous.core.Phone[]) r1
            dcdc r6 = defpackage.dcdc.t(r1)
            java.lang.Class<com.google.android.libraries.social.populous.core.Photo> r1 = com.google.android.libraries.social.populous.core.Photo.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable[] r1 = r14.readParcelableArray(r1)
            dcdc r1 = defpackage.dcdc.t(r1)
            com.google.android.libraries.social.populous.core.Photo[] r7 = new com.google.android.libraries.social.populous.core.Photo[r2]
            java.lang.Object[] r1 = r1.toArray(r7)
            com.google.android.libraries.social.populous.core.Photo[] r1 = (com.google.android.libraries.social.populous.core.Photo[]) r1
            dcdc r7 = defpackage.dcdc.t(r1)
            java.lang.Class<com.google.android.libraries.social.populous.core.InAppNotificationTarget> r1 = com.google.android.libraries.social.populous.core.InAppNotificationTarget.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable[] r1 = r14.readParcelableArray(r1)
            dcdc r1 = defpackage.dcdc.t(r1)
            com.google.android.libraries.social.populous.core.InAppNotificationTarget[] r2 = new com.google.android.libraries.social.populous.core.InAppNotificationTarget[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            com.google.android.libraries.social.populous.core.InAppNotificationTarget[] r1 = (com.google.android.libraries.social.populous.core.InAppNotificationTarget[]) r1
            dcdc r8 = defpackage.dcdc.t(r1)
            byte r1 = r14.readByte()
            r2 = 0
            r9 = 1
            if (r1 != r9) goto L99
            java.lang.String r1 = r14.readString()
            goto L9a
        L99:
            r1 = r2
        L9a:
            byte r10 = r14.readByte()
            if (r10 != r9) goto La7
            android.os.Parcelable r10 = r14.readParcelable(r0)
            com.google.android.libraries.social.populous.core.PersonExtendedData r10 = (com.google.android.libraries.social.populous.core.PersonExtendedData) r10
            goto La8
        La7:
            r10 = r2
        La8:
            java.lang.Object r0 = r14.readValue(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            byte r0 = r14.readByte()
            if (r0 != r9) goto Lcd
            dsgo r0 = defpackage.dsgo.d
            dsqa r2 = defpackage.dsqa.c()
            dssj r14 = defpackage.dsuv.a(r14, r0, r2)     // Catch: defpackage.dsrm -> Lc6
            dsgo r14 = (defpackage.dsgo) r14
            r12 = r14
            goto Lce
        Lc6:
            r14 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r14)
            throw r0
        Lcd:
            r12 = r2
        Lce:
            r2 = r13
            r9 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.AutoValue_Person.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 0;
        parcel.writeParcelable(((C$AutoValue_Person) this).a, 0);
        parcel.writeParcelableArray((Parcelable[]) ((C$AutoValue_Person) this).b.toArray(new Parcelable[0]), 0);
        parcel.writeParcelableArray((Parcelable[]) ((C$AutoValue_Person) this).c.toArray(new Parcelable[0]), 0);
        parcel.writeParcelableArray((Parcelable[]) ((C$AutoValue_Person) this).d.toArray(new Parcelable[0]), 0);
        parcel.writeParcelableArray((Parcelable[]) ((C$AutoValue_Person) this).e.toArray(new Parcelable[0]), 0);
        parcel.writeParcelableArray((Parcelable[]) ((C$AutoValue_Person) this).f.toArray(new Parcelable[0]), 0);
        parcel.writeByte(this.g == null ? (byte) 0 : (byte) 1);
        String str = this.g;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeByte(this.h == null ? (byte) 0 : (byte) 1);
        PersonExtendedData personExtendedData = this.h;
        if (personExtendedData != null) {
            parcel.writeParcelable(personExtendedData, 0);
        }
        parcel.writeValue(Boolean.valueOf(this.i));
        if (this.j != null) {
            b = 1;
        }
        parcel.writeByte(b);
        dsgo dsgoVar = this.j;
        if (dsgoVar != null) {
            dsuv.e(parcel, dsgoVar);
        }
    }

    public AutoValue_Person(PersonMetadata personMetadata, dcdc<Name> dcdcVar, dcdc<Email> dcdcVar2, dcdc<Phone> dcdcVar3, dcdc<Photo> dcdcVar4, dcdc<InAppNotificationTarget> dcdcVar5, String str, PersonExtendedData personExtendedData, boolean z, dsgo dsgoVar) {
        super(personMetadata, dcdcVar, dcdcVar2, dcdcVar3, dcdcVar4, dcdcVar5, str, personExtendedData, z, dsgoVar);
    }
}
