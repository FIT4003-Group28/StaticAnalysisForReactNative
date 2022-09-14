package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0156a();

    /* renamed from: b  reason: collision with root package name */
    private final i f8013b;

    /* renamed from: c  reason: collision with root package name */
    private final i f8014c;

    /* renamed from: d  reason: collision with root package name */
    private final i f8015d;

    /* renamed from: e  reason: collision with root package name */
    private final c f8016e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8017f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8018g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0156a implements Parcelable.Creator<a> {
        C0156a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public a mo273createFromParcel(Parcel parcel) {
            return new a((i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (i) parcel.readParcelable(i.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public a[] mo274newArray(int i) {
            return new a[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        static final long f8019e = o.a(i.a(1900, 0).f8050h);

        /* renamed from: f  reason: collision with root package name */
        static final long f8020f = o.a(i.a(2100, 11).f8050h);

        /* renamed from: a  reason: collision with root package name */
        private long f8021a;

        /* renamed from: b  reason: collision with root package name */
        private long f8022b;

        /* renamed from: c  reason: collision with root package name */
        private Long f8023c;

        /* renamed from: d  reason: collision with root package name */
        private c f8024d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(a aVar) {
            this.f8021a = f8019e;
            this.f8022b = f8020f;
            this.f8024d = f.b(Long.MIN_VALUE);
            this.f8021a = aVar.f8013b.f8050h;
            this.f8022b = aVar.f8014c.f8050h;
            this.f8023c = Long.valueOf(aVar.f8015d.f8050h);
            this.f8024d = aVar.f8016e;
        }

        public b a(long j) {
            this.f8023c = Long.valueOf(j);
            return this;
        }

        public a a() {
            if (this.f8023c == null) {
                long u0 = MaterialDatePicker.u0();
                if (this.f8021a > u0 || u0 > this.f8022b) {
                    u0 = this.f8021a;
                }
                this.f8023c = Long.valueOf(u0);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f8024d);
            return new a(i.c(this.f8021a), i.c(this.f8022b), i.c(this.f8023c.longValue()), (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean a(long j);
    }

    private a(i iVar, i iVar2, i iVar3, c cVar) {
        this.f8013b = iVar;
        this.f8014c = iVar2;
        this.f8015d = iVar3;
        this.f8016e = cVar;
        if (iVar.compareTo(iVar3) <= 0) {
            if (iVar3.compareTo(iVar2) > 0) {
                throw new IllegalArgumentException("current Month cannot be after end Month");
            }
            this.f8018g = iVar.b(iVar2) + 1;
            this.f8017f = (iVar2.f8047e - iVar.f8047e) + 1;
            return;
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    /* synthetic */ a(i iVar, i iVar2, i iVar3, c cVar, C0156a c0156a) {
        this(iVar, iVar2, iVar3, cVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8013b.equals(aVar.f8013b) && this.f8014c.equals(aVar.f8014c) && this.f8015d.equals(aVar.f8015d) && this.f8016e.equals(aVar.f8016e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8013b, this.f8014c, this.f8015d, this.f8016e});
    }

    public c j() {
        return this.f8016e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i k() {
        return this.f8014c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f8018g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i m() {
        return this.f8015d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i n() {
        return this.f8013b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f8017f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8013b, 0);
        parcel.writeParcelable(this.f8014c, 0);
        parcel.writeParcelable(this.f8015d, 0);
        parcel.writeParcelable(this.f8016e, 0);
    }
}
