package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.Serializable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ContactId implements Parcelable, Serializable {
    private ContactId a;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum ContactType implements Parcelable {
        UNKNOWN(0),
        PHONE_NUMBER(1),
        EMAIL(2),
        HANDLER(3),
        DEVICE_ID(5);
        
        public static final Parcelable.Creator<ContactType> CREATOR = new cufm();
        public final int f;

        ContactType(int i) {
            this.f = i;
        }

        public static ContactType a(final int i) {
            return (ContactType) dcbg.c(values()).r(new dbsl(i) { // from class: cufl
                private final int a;

                {
                    this.a = i;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    int i2 = this.a;
                    ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
                    return ((ContactId.ContactType) obj).f == i2;
                }
            }).c(UNKNOWN);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f);
        }
    }

    public static cufk f() {
        return new ctyk();
    }

    private static ContactId g(ContactId contactId) {
        if (contactId.c() == ContactType.EMAIL) {
            cufk e = contactId.e();
            e.c(cstg.a(contactId.a()));
            return e.a();
        }
        return contactId;
    }

    public abstract String a();

    public abstract String b();

    public abstract ContactType c();

    public abstract dbsg<String> d();

    public abstract cufk e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof ContactId)) {
            return false;
        }
        ContactId contactId = (ContactId) obj;
        if (this.a == null) {
            this.a = g(this);
        }
        if (contactId.a == null) {
            contactId.a = g(contactId);
        }
        return this.a.a().equals(contactId.a.a()) && this.a.b().equals(contactId.a.b()) && this.a.c().equals(contactId.a.c()) && this.a.d().equals(contactId.a.d());
    }

    public final int hashCode() {
        if (this.a == null) {
            this.a = g(this);
        }
        return ((((((this.a.a().hashCode() + 527) * 31) + this.a.b().hashCode()) * 31) + this.a.c().hashCode()) * 31) + this.a.d().hashCode();
    }
}
