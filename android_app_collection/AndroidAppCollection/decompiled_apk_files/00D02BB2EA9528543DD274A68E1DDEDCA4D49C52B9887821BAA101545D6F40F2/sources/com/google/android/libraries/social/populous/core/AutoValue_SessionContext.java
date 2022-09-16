package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.filament.R;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_SessionContext extends C$AutoValue_SessionContext implements Parcelable {
    public static final Parcelable.Creator<AutoValue_SessionContext> CREATOR = new cydp();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_SessionContext(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.Class<com.google.android.libraries.social.populous.core.ContactMethodField> r0 = com.google.android.libraries.social.populous.core.ContactMethodField.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r0 = r10.readParcelableArray(r0)
            dcdc r0 = defpackage.dcdc.t(r0)
            r1 = 0
            com.google.android.libraries.social.populous.core.ContactMethodField[] r2 = new com.google.android.libraries.social.populous.core.ContactMethodField[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r0 = (com.google.android.libraries.social.populous.core.ContactMethodField[]) r0
            dcdc r3 = defpackage.dcdc.t(r0)
            java.lang.Class<com.google.android.libraries.social.populous.core.ContactMethodField> r0 = com.google.android.libraries.social.populous.core.ContactMethodField.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r0 = r10.readParcelableArray(r0)
            dcdc r0 = defpackage.dcdc.t(r0)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r2 = new com.google.android.libraries.social.populous.core.ContactMethodField[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r0 = (com.google.android.libraries.social.populous.core.ContactMethodField[]) r0
            dcdc r4 = defpackage.dcdc.t(r0)
            java.lang.Class<com.google.android.libraries.social.populous.core.ContactMethodField> r0 = com.google.android.libraries.social.populous.core.ContactMethodField.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r0 = r10.readParcelableArray(r0)
            dcdc r0 = defpackage.dcdc.t(r0)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r2 = new com.google.android.libraries.social.populous.core.ContactMethodField[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r0 = (com.google.android.libraries.social.populous.core.ContactMethodField[]) r0
            dcdc r5 = defpackage.dcdc.t(r0)
            java.lang.Class<com.google.android.libraries.social.populous.core.ContactMethodField> r0 = com.google.android.libraries.social.populous.core.ContactMethodField.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable[] r0 = r10.readParcelableArray(r0)
            dcdc r0 = defpackage.dcdc.t(r0)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r1 = new com.google.android.libraries.social.populous.core.ContactMethodField[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.android.libraries.social.populous.core.ContactMethodField[] r0 = (com.google.android.libraries.social.populous.core.ContactMethodField[]) r0
            dcdc r6 = defpackage.dcdc.t(r0)
            byte r0 = r10.readByte()
            r1 = 0
            r8 = 1
            if (r0 != r8) goto L7a
            int r0 = r10.readInt()
            czgq r0 = defpackage.czgq.b(r0)
            goto L7b
        L7a:
            r0 = r1
        L7b:
            dbsg r7 = defpackage.dbsg.j(r0)
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            byte r0 = r10.readByte()
            if (r0 != r8) goto L91
            long r0 = r10.readLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L91:
            defpackage.cygq.g(r1)
            r9.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_SessionContext.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 0;
        parcel.writeParcelableArray((Parcelable[]) this.a.toArray(new Parcelable[0]), 0);
        parcel.writeParcelableArray((Parcelable[]) this.b.toArray(new Parcelable[0]), 0);
        parcel.writeParcelableArray((Parcelable[]) this.c.toArray(new Parcelable[0]), 0);
        parcel.writeParcelableArray((Parcelable[]) this.d.toArray(new Parcelable[0]), 0);
        parcel.writeByte(this.e.a() ? (byte) 1 : (byte) 0);
        if (this.e.a()) {
            parcel.writeInt(this.e.b().M);
        }
        if (this.f != null) {
            b = 1;
        }
        parcel.writeByte(b);
        Long l = this.f;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
    }

    public AutoValue_SessionContext(final dcdc<ContactMethodField> dcdcVar, final dcdc<ContactMethodField> dcdcVar2, final dcdc<ContactMethodField> dcdcVar3, final dcdc<ContactMethodField> dcdcVar4, final dbsg<czgq> dbsgVar) {
        new C$$AutoValue_SessionContext(dcdcVar, dcdcVar2, dcdcVar3, dcdcVar4, dbsgVar) { // from class: com.google.android.libraries.social.populous.core.$AutoValue_SessionContext
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj != null && (obj instanceof SessionContext)) {
                    SessionContext sessionContext = (SessionContext) obj;
                    if (dbsd.a(this.a, sessionContext.a()) && dbsd.a(this.b, sessionContext.b()) && dbsd.a(this.c, sessionContext.c()) && dbsd.a(this.d, sessionContext.d()) && dbsd.a(this.e, sessionContext.e()) && dbsd.a(this.f, sessionContext.f)) {
                        return true;
                    }
                }
                return false;
            }

            public final int hashCode() {
                return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
            }

            public final String toString() {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf(this.b);
                String valueOf3 = String.valueOf(this.c);
                String valueOf4 = String.valueOf(this.d);
                String valueOf5 = String.valueOf(this.e);
                String valueOf6 = String.valueOf(this.f);
                int length = String.valueOf(valueOf).length();
                int length2 = String.valueOf(valueOf2).length();
                int length3 = String.valueOf(valueOf3).length();
                int length4 = String.valueOf(valueOf4).length();
                int length5 = String.valueOf(valueOf5).length();
                StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textColorSearchUrl + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length());
                sb.append("SessionContext{selectedFields=");
                sb.append(valueOf);
                sb.append(", boostedFields=");
                sb.append(valueOf2);
                sb.append(", sharedWithFields=");
                sb.append(valueOf3);
                sb.append(", ownerFields=");
                sb.append(valueOf4);
                sb.append(", entryPoint=");
                sb.append(valueOf5);
                sb.append(", submitSessionId=");
                sb.append(valueOf6);
                sb.append("}");
                return sb.toString();
            }
        };
    }
}
