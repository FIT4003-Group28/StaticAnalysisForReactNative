package com.google.android.libraries.youtube.innertube.model.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class TrackingUrlModel implements Comparable, Parcelable {
    public final String b;
    public final Set c;
    public final Set d;
    private final int e;
    public static final Set a = Collections.emptySet();
    public static final Parcelable.Creator CREATOR = new aalf(20);

    public TrackingUrlModel(osa osaVar) {
        aaoc aaocVar;
        this.b = (osaVar.b & 1) != 0 ? osaVar.c : "";
        this.c = new HashSet();
        for (Integer num : osaVar.d) {
            int intValue = num.intValue();
            Set set = this.c;
            aaoc[] values = aaoc.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    aaocVar = values[i];
                    if (aaocVar.g == intValue) {
                        break;
                    }
                    i++;
                } else {
                    aaocVar = aaoc.NO_OP;
                    break;
                }
            }
            set.add(aaocVar);
        }
        this.e = (osaVar.b & 2) != 0 ? osaVar.e : -1;
        this.d = new HashSet();
        if (osaVar.f.size() != 0) {
            for (Integer num2 : osaVar.f) {
                aswe b = aswe.b(num2.intValue());
                if (b != null) {
                    this.d.add(b);
                }
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(TrackingUrlModel trackingUrlModel) {
        int i = this.e;
        int i2 = trackingUrlModel.e;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        return this.b.compareTo(trackingUrlModel.b);
    }

    public final int b(int i) {
        int i2 = this.e;
        return i2 == -1 ? i : i2;
    }

    public final Uri c() {
        return Uri.parse(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TrackingUrlModel) {
            TrackingUrlModel trackingUrlModel = (TrackingUrlModel) obj;
            return this == trackingUrlModel || (trackingUrlModel.compareTo(this) == 0 && hashCode() == trackingUrlModel.hashCode());
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() + 31) * 31) + this.c.hashCode()) * 31) + this.e) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "@" + this.e + "baseUrl->" + this.b + "params->" + this.c + "headers->" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aopa createBuilder = osa.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        osa osaVar = (osa) createBuilder.instance;
        str.getClass();
        osaVar.b |= 1;
        osaVar.c = str;
        int i2 = this.e;
        createBuilder.copyOnWrite();
        osa osaVar2 = (osa) createBuilder.instance;
        osaVar2.b |= 2;
        osaVar2.e = i2;
        int[] iArr = new int[this.c.size()];
        int i3 = 0;
        int i4 = 0;
        for (aaoc aaocVar : this.c) {
            aaoc aaocVar2 = aaoc.MS;
            iArr[i4] = aaocVar.g;
            i4++;
        }
        List x = almu.x(iArr);
        createBuilder.copyOnWrite();
        osa osaVar3 = (osa) createBuilder.instance;
        aopq aopqVar = osaVar3.d;
        if (!aopqVar.c()) {
            osaVar3.d = aopi.mutableCopy(aopqVar);
        }
        aonk.addAll((Iterable) x, (List) osaVar3.d);
        int[] iArr2 = new int[this.d.size()];
        for (aswe asweVar : this.d) {
            iArr2[i3] = asweVar.g;
            i3++;
        }
        List x2 = almu.x(iArr2);
        createBuilder.copyOnWrite();
        osa osaVar4 = (osa) createBuilder.instance;
        aopq aopqVar2 = osaVar4.f;
        if (!aopqVar2.c()) {
            osaVar4.f = aopi.mutableCopy(aopqVar2);
        }
        aonk.addAll((Iterable) x2, (List) osaVar4.f);
        zgd.K((osa) createBuilder.mo39build(), parcel);
    }

    public TrackingUrlModel(aswi aswiVar) {
        this(aswiVar, a);
    }

    public TrackingUrlModel(aswi aswiVar, Set set) {
        this.b = aswiVar.c;
        set.getClass();
        this.c = set;
        int i = aswiVar.d;
        this.e = i == 0 ? -1 : i;
        this.d = new HashSet();
        for (aswf aswfVar : aswiVar.e) {
            Set set2 = this.d;
            aswe b = aswe.b(aswfVar.c);
            if (b == null) {
                b = aswe.UNKNOWN;
            }
            set2.add(b);
        }
    }
}
