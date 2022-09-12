package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class DynamiteExtendedData implements Parcelable {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public final class OrganizationInfo implements Parcelable {
        public static final Parcelable.Creator<OrganizationInfo> CREATOR = new cyeu();
        @dzsi
        private final CustomerInfo a;
        @dzsi
        private final ConsumerInfo b;

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        public final class ConsumerInfo implements Parcelable {
            public static final Parcelable.Creator<ConsumerInfo> CREATOR = new cyev();

            private ConsumerInfo() {
            }

            public static ConsumerInfo a() {
                return new ConsumerInfo();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return obj == this || (obj instanceof ConsumerInfo);
            }

            public final int hashCode() {
                return 1000003;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
            }
        }

        /* compiled from: PG */
        /* loaded from: classes5.dex */
        public final class CustomerInfo implements Parcelable {
            public static final Parcelable.Creator<CustomerInfo> CREATOR = new cyew();
            @dzsi
            private final CustomerId a;

            /* compiled from: PG */
            /* loaded from: classes5.dex */
            public final class CustomerId implements Parcelable {
                public static final Parcelable.Creator<CustomerId> CREATOR = new cyex();
                @dzsi
                private final String a;

                private CustomerId(@dzsi String str) {
                    this.a = str;
                }

                public static CustomerId a(@dzsi String str) {
                    return new CustomerId(str);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof CustomerId)) {
                        return false;
                    }
                    return dbsd.a(this.a, ((CustomerId) obj).a);
                }

                public final int hashCode() {
                    return Arrays.hashCode(new Object[]{this.a});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(this.a);
                }
            }

            private CustomerInfo(@dzsi CustomerId customerId) {
                this.a = customerId;
            }

            public static CustomerInfo a(@dzsi CustomerId customerId) {
                return new CustomerInfo(customerId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CustomerInfo)) {
                    return false;
                }
                return dbsd.a(this.a, ((CustomerInfo) obj).a);
            }

            public final int hashCode() {
                return Arrays.hashCode(new Object[]{this.a});
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.a, i);
            }
        }

        public OrganizationInfo(@dzsi CustomerInfo customerInfo, @dzsi ConsumerInfo consumerInfo) {
            this.a = customerInfo;
            this.b = consumerInfo;
        }

        public static OrganizationInfo a(@dzsi CustomerInfo customerInfo) {
            return new OrganizationInfo(customerInfo, null);
        }

        public static OrganizationInfo b(@dzsi ConsumerInfo consumerInfo) {
            return new OrganizationInfo(null, consumerInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof OrganizationInfo) {
                OrganizationInfo organizationInfo = (OrganizationInfo) obj;
                if (dbsd.a(this.b, organizationInfo.b) && dbsd.a(this.a, organizationInfo.a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.b, this.a});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
        }
    }

    public static DynamiteExtendedData i(int i, int i2, int i3, @dzsi Long l, @dzsi String str, @dzsi String str2, @dzsi String str3, @dzsi OrganizationInfo organizationInfo) {
        return new AutoValue_DynamiteExtendedData(i, i2, i3, l, str, str2, str3, organizationInfo);
    }

    @dzsi
    public abstract Long a();

    @dzsi
    public abstract String b();

    @dzsi
    public abstract String c();

    @dzsi
    public abstract String d();

    @dzsi
    public abstract OrganizationInfo e();

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
