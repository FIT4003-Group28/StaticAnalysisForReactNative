package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class RouteStep implements Parcelable {
    public static final Parcelable.Creator<RouteStep> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    int f1797a;

    /* renamed from: b  reason: collision with root package name */
    int f1798b;
    protected List<LatLng> mWayPoints;

    /* JADX INFO: Access modifiers changed from: protected */
    public RouteStep() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RouteStep(Parcel parcel) {
        this.f1797a = parcel.readInt();
        this.f1798b = parcel.readInt();
        this.mWayPoints = new ArrayList();
        parcel.readList(this.mWayPoints, LatLng.class.getClassLoader());
        if (this.mWayPoints.size() == 0) {
            this.mWayPoints = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f1797a;
    }

    public int getDuration() {
        return this.f1798b;
    }

    public List<LatLng> getWayPoints() {
        return this.mWayPoints;
    }

    public void setDistance(int i) {
        this.f1797a = i;
    }

    public void setDuration(int i) {
        this.f1798b = i;
    }

    public void setWayPoints(List<LatLng> list) {
        this.mWayPoints = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1797a);
        parcel.writeInt(this.f1798b);
        parcel.writeList(this.mWayPoints);
    }
}
