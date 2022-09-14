package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class Task implements ReflectedParcelable {
    public static final int EXTRAS_LIMIT_BYTES = 10240;
    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1;
    private final Bundle extras;
    private final String gcmTaskService;
    private final boolean isPersisted;
    private final int requiredNetworkState;
    private final boolean requiresCharging;
    private final String tag;
    private final boolean updateCurrent;
    private final Set<Uri> zzau;
    private final boolean zzav;
    private final zzl zzaw;

    /* loaded from: classes.dex */
    public static abstract class Builder {
        protected Bundle extras;
        protected String gcmTaskService;
        protected boolean isPersisted;
        protected int requiredNetworkState;
        protected boolean requiresCharging;
        protected String tag;
        protected boolean updateCurrent;
        protected Set<Uri> zzau = Collections.emptySet();
        protected zzl zzaw = zzl.zzao;

        /* renamed from: build */
        public abstract Task mo148build();

        /* JADX INFO: Access modifiers changed from: protected */
        public void checkConditions() {
            Preconditions.checkArgument(this.gcmTaskService != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            GcmNetworkManager.zzd(this.tag);
            zzl zzlVar = this.zzaw;
            if (zzlVar != null) {
                int zzh = zzlVar.zzh();
                if (zzh != 1 && zzh != 0) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Must provide a valid RetryPolicy: ");
                    sb.append(zzh);
                    throw new IllegalArgumentException(sb.toString());
                }
                int zzi = zzlVar.zzi();
                int zzj = zzlVar.zzj();
                if (zzh == 0 && zzi < 0) {
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("InitialBackoffSeconds can't be negative: ");
                    sb2.append(zzi);
                    throw new IllegalArgumentException(sb2.toString());
                } else if (zzh == 1 && zzi < 10) {
                    throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                } else {
                    if (zzj < zzi) {
                        int zzj2 = zzlVar.zzj();
                        StringBuilder sb3 = new StringBuilder(77);
                        sb3.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                        sb3.append(zzj2);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
            }
            if (this.isPersisted) {
                Task.zzg(this.extras);
            }
            if (this.zzau.isEmpty() || this.requiredNetworkState != 2) {
                for (Uri uri : this.zzau) {
                    Task.zzd(uri);
                }
                return;
            }
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }

        /* renamed from: setExtras */
        public abstract Builder mo149setExtras(Bundle bundle);

        /* renamed from: setPersisted */
        public abstract Builder mo150setPersisted(boolean z);

        /* renamed from: setRequiredNetwork */
        public abstract Builder mo151setRequiredNetwork(int i);

        /* renamed from: setRequiresCharging */
        public abstract Builder mo152setRequiresCharging(boolean z);

        /* renamed from: setService */
        public abstract Builder mo153setService(Class<? extends GcmTaskService> cls);

        /* renamed from: setTag */
        public abstract Builder mo154setTag(String str);

        /* renamed from: setUpdateCurrent */
        public abstract Builder mo155setUpdateCurrent(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.gcmTaskService = parcel.readString();
        this.tag = parcel.readString();
        boolean z = true;
        this.updateCurrent = parcel.readInt() == 1;
        this.isPersisted = parcel.readInt() != 1 ? false : z;
        this.requiredNetworkState = 2;
        this.zzau = Collections.emptySet();
        this.requiresCharging = false;
        this.zzav = false;
        this.zzaw = zzl.zzao;
        this.extras = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task(Builder builder) {
        this.gcmTaskService = builder.gcmTaskService;
        this.tag = builder.tag;
        this.updateCurrent = builder.updateCurrent;
        this.isPersisted = builder.isPersisted;
        this.requiredNetworkState = builder.requiredNetworkState;
        this.zzau = builder.zzau;
        this.requiresCharging = builder.requiresCharging;
        this.zzav = false;
        this.extras = builder.extras;
        this.zzaw = builder.zzaw != null ? builder.zzaw : zzl.zzao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Uri uri) {
        if (uri == null) {
            throw new IllegalArgumentException("Null URI");
        }
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (TextUtils.isEmpty(host) || "null".equals(host)) {
            throw new IllegalArgumentException("URI hostname is required");
        }
        try {
            int port = uri.getPort();
            if (!"tcp".equals(scheme)) {
                if (!"ping".equals(scheme)) {
                    String valueOf = String.valueOf(scheme);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(valueOf) : new String("Unsupported required URI scheme: "));
                } else if (port == -1) {
                } else {
                    throw new IllegalArgumentException("Ping does not support port numbers");
                }
            } else if (port > 0 && port <= 65535) {
            } else {
                int port2 = uri.getPort();
                StringBuilder sb = new StringBuilder(38);
                sb.append("Invalid required URI port: ");
                sb.append(port2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            throw new IllegalArgumentException(valueOf2.length() != 0 ? "Invalid port number: ".concat(valueOf2) : new String("Invalid port number: "));
        }
    }

    public static void zzg(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > 10240) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Extras exceeding maximum size(10240 bytes): ");
                sb.append(dataSize);
                throw new IllegalArgumentException(sb.toString());
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (!((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean))) {
                    if (!(obj instanceof Bundle)) {
                        throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                    zzg((Bundle) obj);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public int getRequiredNetwork() {
        return this.requiredNetworkState;
    }

    public boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    public String getServiceName() {
        return this.gcmTaskService;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean isPersisted() {
        return this.isPersisted;
    }

    public boolean isUpdateCurrent() {
        return this.updateCurrent;
    }

    public void toBundle(Bundle bundle) {
        bundle.putString("tag", this.tag);
        bundle.putBoolean("update_current", this.updateCurrent);
        bundle.putBoolean("persisted", this.isPersisted);
        bundle.putString("service", this.gcmTaskService);
        bundle.putInt("requiredNetwork", this.requiredNetworkState);
        if (!this.zzau.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (Uri uri : this.zzau) {
                arrayList.add(uri.toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.requiresCharging);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", this.zzaw.zzf(new Bundle()));
        bundle.putBundle("extras", this.extras);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.gcmTaskService);
        parcel.writeString(this.tag);
        parcel.writeInt(this.updateCurrent ? 1 : 0);
        parcel.writeInt(this.isPersisted ? 1 : 0);
    }
}
