package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ArCoreApk {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class Availability extends Enum<Availability> {
        final int nativeCode;
        public static final Availability UNKNOWN_ERROR = new dbag();
        public static final Availability UNKNOWN_CHECKING = new dbah();
        public static final Availability UNKNOWN_TIMED_OUT = new dbai();
        public static final Availability UNSUPPORTED_DEVICE_NOT_CAPABLE = new dbaj();
        public static final Availability SUPPORTED_NOT_INSTALLED = new dbak();
        public static final Availability SUPPORTED_APK_TOO_OLD = new dbal();
        public static final Availability SUPPORTED_INSTALLED = new dbam();
        private static final /* synthetic */ Availability[] $VALUES = $values();

        private static /* synthetic */ Availability[] $values() {
            return new Availability[]{UNKNOWN_ERROR, UNKNOWN_CHECKING, UNKNOWN_TIMED_OUT, UNSUPPORTED_DEVICE_NOT_CAPABLE, SUPPORTED_NOT_INSTALLED, SUPPORTED_APK_TOO_OLD, SUPPORTED_INSTALLED};
        }

        private Availability(String str, int i, int i2) {
            this.nativeCode = i2;
        }

        static Availability forNumber(int i) {
            Availability[] values;
            for (Availability availability : values()) {
                if (availability.nativeCode == i) {
                    return availability;
                }
            }
            StringBuilder sb = new StringBuilder(59);
            sb.append("Unexpected value for native Availability, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static Availability valueOf(String str) {
            return (Availability) Enum.valueOf(Availability.class, str);
        }

        public static Availability[] values() {
            return (Availability[]) $VALUES.clone();
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public interface ICheckAvailabilityCallback {
        void onResult(Availability availability);
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);
        
        final int nativeCode;

        InstallBehavior(int i) {
            this.nativeCode = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static InstallBehavior forNumber(int i) {
            InstallBehavior[] values;
            for (InstallBehavior installBehavior : values()) {
                if (installBehavior.nativeCode == i) {
                    return installBehavior;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native InstallBehavior, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);
        
        final int nativeCode;

        InstallStatus(int i) {
            this.nativeCode = i;
        }

        static InstallStatus forNumber(int i) {
            InstallStatus[] values;
            for (InstallStatus installStatus : values()) {
                if (installStatus.nativeCode == i) {
                    return installStatus;
                }
            }
            StringBuilder sb = new StringBuilder(60);
            sb.append("Unexpected value for native InstallStatus, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);
        
        final int nativeCode;

        UserMessageType(int i) {
            this.nativeCode = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static UserMessageType forNumber(int i) {
            UserMessageType[] values;
            for (UserMessageType userMessageType : values()) {
                if (userMessageType.nativeCode == i) {
                    return userMessageType;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native UserMessageType, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    public static ArCoreApk getInstance() {
        return dbao.a;
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z) {
        throw new UnsupportedOperationException("Stub");
    }

    public void checkAvailability(Context context, ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z, InstallBehavior installBehavior, UserMessageType userMessageType) {
        throw new UnsupportedOperationException("Stub");
    }
}
