package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.Serializable;
import java.security.InvalidParameterException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ConversationId implements Parcelable, Serializable {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class GroupId implements Parcelable, Serializable {
        private static final long serialVersionUID = 0;

        public static cufr c() {
            return new ctym();
        }

        public abstract String a();

        public abstract String b();
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum IdType implements Parcelable {
        ONE_TO_ONE(0),
        GROUP(1);
        
        public static final Parcelable.Creator<IdType> CREATOR = new cuft();
        public final int c;

        IdType(int i) {
            this.c = i;
        }

        public static IdType a(final int i) {
            IdType idType = (IdType) dcbg.c(values()).r(new dbsl(i) { // from class: cufs
                private final int a;

                {
                    this.a = i;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    int i2 = this.a;
                    ConversationId.IdType idType2 = ConversationId.IdType.ONE_TO_ONE;
                    return ((ConversationId.IdType) obj).c == i2;
                }
            }).f();
            if (idType != null) {
                return idType;
            }
            throw new InvalidParameterException("Invalid conversation IdType.");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class OneOfId implements Parcelable, Serializable {
        public static final Parcelable.Creator<OneOfId> CREATOR = new cufu();
        private static final long serialVersionUID = 0;

        public abstract GroupId a();

        public abstract IdType b();

        public abstract ContactId c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(b(), i);
            IdType idType = IdType.ONE_TO_ONE;
            int ordinal = b().ordinal();
            if (ordinal == 0) {
                parcel.writeParcelable(c(), i);
            } else if (ordinal != 1) {
            } else {
                parcel.writeParcelable(a(), i);
            }
        }
    }

    public static cufq f() {
        return new ctyl();
    }

    public abstract ContactId a();

    public abstract OneOfId b();

    public final IdType c() {
        return b().b();
    }

    public final GroupId d() {
        return b().a();
    }

    public final ContactId e() {
        return b().c();
    }
}
