package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;
/* loaded from: classes.dex */
public class PeriodicTask extends Task {
    public static final Parcelable.Creator<PeriodicTask> CREATOR = new zzk();
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    /* loaded from: classes.dex */
    public static class Builder extends Task.Builder {
        private long zzam = -1;
        private long zzan = -1;

        public Builder() {
            this.isPersisted = true;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: build */
        public PeriodicTask mo148build() {
            checkConditions();
            return new PeriodicTask(this, (zzk) null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.gcm.Task.Builder
        public void checkConditions() {
            super.checkConditions();
            if (this.zzam == -1) {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if (this.zzam <= 0) {
                long j = this.zzam;
                StringBuilder sb = new StringBuilder(66);
                sb.append("Period set cannot be less than or equal to 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.zzan == -1) {
                this.zzan = ((float) this.zzam) * 0.1f;
            } else if (this.zzan <= this.zzam) {
            } else {
                this.zzan = this.zzam;
            }
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        /* renamed from: setExtras */
        public Builder mo149setExtras(Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        public Builder setFlex(long j) {
            this.zzan = j;
            return this;
        }

        public Builder setPeriod(long j) {
            this.zzam = j;
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
    private PeriodicTask(Parcel parcel) {
        super(parcel);
        this.mIntervalInSeconds = -1L;
        this.mFlexInSeconds = -1L;
        this.mIntervalInSeconds = parcel.readLong();
        this.mFlexInSeconds = Math.min(parcel.readLong(), this.mIntervalInSeconds);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ PeriodicTask(Parcel parcel, zzk zzkVar) {
        this(parcel);
    }

    private PeriodicTask(Builder builder) {
        super(builder);
        this.mIntervalInSeconds = -1L;
        this.mFlexInSeconds = -1L;
        this.mIntervalInSeconds = builder.zzam;
        this.mFlexInSeconds = Math.min(builder.zzan, this.mIntervalInSeconds);
    }

    /* synthetic */ PeriodicTask(Builder builder, zzk zzkVar) {
        this(builder);
    }

    public long getFlex() {
        return this.mFlexInSeconds;
    }

    public long getPeriod() {
        return this.mIntervalInSeconds;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("period", this.mIntervalInSeconds);
        bundle.putLong("period_flex", this.mFlexInSeconds);
    }

    public String toString() {
        String obj = super.toString();
        long period = getPeriod();
        long flex = getFlex();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 54);
        sb.append(obj);
        sb.append(" period=");
        sb.append(period);
        sb.append(" flex=");
        sb.append(flex);
        return sb.toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.mIntervalInSeconds);
        parcel.writeLong(this.mFlexInSeconds);
    }
}
