package com.google.android.libraries.messaging.lighter.model;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class Notification implements Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public final class NotificationType extends Enum<NotificationType> implements Parcelable {
        public static final Parcelable.Creator<NotificationType> CREATOR;
        public static final NotificationType a;
        private static final /* synthetic */ NotificationType[] c;
        public final int b = 1;

        static {
            NotificationType notificationType = new NotificationType();
            a = notificationType;
            c = new NotificationType[]{notificationType};
            CREATOR = new cugx();
        }

        private NotificationType() {
        }

        public static dbsg<NotificationType> a(int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= values().length) {
                return dbpy.a;
            }
            return dbsg.i(values()[i2]);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) c.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public abstract class OneOfType implements Parcelable {
        public static final Parcelable.Creator<OneOfType> CREATOR = new cugy();

        public abstract MessageReceivedNotification a();

        public abstract NotificationType b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(b(), i);
            NotificationType notificationType = NotificationType.a;
            if (b().ordinal() != 0) {
                return;
            }
            parcel.writeParcelable(a(), i);
        }
    }

    public static cugw g() {
        return new ctyo();
    }

    public abstract String a();

    public abstract Long b();

    public abstract NotificationMetadata c();

    public abstract OneOfType d();

    public final NotificationType e() {
        return d().b();
    }

    public final MessageReceivedNotification f() {
        return d().a();
    }
}
