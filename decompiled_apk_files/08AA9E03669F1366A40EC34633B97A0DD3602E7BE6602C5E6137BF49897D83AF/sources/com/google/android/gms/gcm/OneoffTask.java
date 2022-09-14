package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;
/* loaded from: classes.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new zzi();
    private final long zzaj;
    private final long zzak;

    /* loaded from: classes.dex */
    public static class Builder extends Task.Builder {
        private long zzaj = -1;
        private long zzak = -1;

        public Builder() {
            this.isPersisted = false;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: build */
        public OneoffTask mo148build() {
            checkConditions();
            return new OneoffTask(this, (zzi) null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.gcm.Task.Builder
        public void checkConditions() {
            super.checkConditions();
            if (this.zzaj == -1 || this.zzak == -1) {
                throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
            }
            if (this.zzaj < this.zzak) {
                return;
            }
            throw new IllegalArgumentException("Window start must be shorter than window end.");
        }

        public Builder setExecutionWindow(long j, long j2) {
            this.zzaj = j;
            this.zzak = j2;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setExtras */
        public Builder mo149setExtras(Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setPersisted */
        public Builder mo150setPersisted(boolean z) {
            this.isPersisted = z;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setRequiredNetwork */
        public Builder mo151setRequiredNetwork(int i) {
            this.requiredNetworkState = i;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setRequiresCharging */
        public Builder mo152setRequiresCharging(boolean z) {
            this.requiresCharging = z;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setService */
        public Builder mo153setService(Class<? extends GcmTaskService> cls) {
            this.gcmTaskService = cls.getName();
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setService  reason: collision with other method in class */
        public /* bridge */ /* synthetic */ Task.Builder mo153setService(Class cls) {
            return mo153setService((Class<? extends GcmTaskService>) cls);
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setTag */
        public Builder mo154setTag(String str) {
            this.tag = str;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setUpdateCurrent */
        public Builder mo155setUpdateCurrent(boolean z) {
            this.updateCurrent = z;
            return this;
        }
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.zzaj = parcel.readLong();
        this.zzak = parcel.readLong();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ OneoffTask(Parcel parcel, zzi zziVar) {
        this(parcel);
    }

    private OneoffTask(Builder builder) {
        super(builder);
        this.zzaj = builder.zzaj;
        this.zzak = builder.zzak;
    }

    /* synthetic */ OneoffTask(Builder builder, zzi zziVar) {
        this(builder);
    }

    public long getWindowEnd() {
        return this.zzak;
    }

    public long getWindowStart() {
        return this.zzaj;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("window_start", this.zzaj);
        bundle.putLong("window_end", this.zzak);
    }

    public String toString() {
        String obj = super.toString();
        long windowStart = getWindowStart();
        long windowEnd = getWindowEnd();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(windowStart);
        sb.append(" windowEnd=");
        sb.append(windowEnd);
        return sb.toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.zzaj);
        parcel.writeLong(this.zzak);
    }
}
