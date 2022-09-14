package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.core.VehicleInfo;
import java.util.List;
/* loaded from: classes.dex */
public final class TransitRouteLine extends RouteLine<TransitStep> implements Parcelable {
    public static final Parcelable.Creator<TransitRouteLine> CREATOR = new j();

    /* renamed from: b  reason: collision with root package name */
    private TaxiInfo f1901b;

    /* loaded from: classes.dex */
    public static class TransitStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<TransitStep> CREATOR = new k();

        /* renamed from: c  reason: collision with root package name */
        private VehicleInfo f1902c;

        /* renamed from: d  reason: collision with root package name */
        private RouteNode f1903d;
        private RouteNode e;
        private TransitRouteStepType f;
        private String g;
        private String h;

        /* loaded from: classes.dex */
        public enum TransitRouteStepType {
            BUSLINE,
            SUBWAY,
            WAKLING
        }

        public TransitStep() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public TransitStep(Parcel parcel) {
            super(parcel);
            this.f1902c = (VehicleInfo) parcel.readParcelable(VehicleInfo.class.getClassLoader());
            this.f1903d = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.e = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            int readInt = parcel.readInt();
            this.f = readInt == -1 ? null : TransitRouteStepType.values()[readInt];
            this.g = parcel.readString();
            this.h = parcel.readString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(RouteNode routeNode) {
            this.f1903d = routeNode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(VehicleInfo vehicleInfo) {
            this.f1902c = vehicleInfo;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(TransitRouteStepType transitRouteStepType) {
            this.f = transitRouteStepType;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(String str) {
            this.g = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(RouteNode routeNode) {
            this.e = routeNode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(String str) {
            this.h = str;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RouteNode getEntrance() {
            return this.f1903d;
        }

        public RouteNode getExit() {
            return this.e;
        }

        public String getInstructions() {
            return this.g;
        }

        public TransitRouteStepType getStepType() {
            return this.f;
        }

        public VehicleInfo getVehicleInfo() {
            return this.f1902c;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = CoordUtil.decodeLocationList(this.h);
            }
            return this.mWayPoints;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f1902c, 1);
            parcel.writeParcelable(this.f1903d, 1);
            parcel.writeParcelable(this.e, 1);
            parcel.writeInt(this.f == null ? -1 : this.f.ordinal());
            parcel.writeString(this.g);
            parcel.writeString(this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransitRouteLine() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TransitRouteLine(Parcel parcel) {
        super(parcel);
        this.f1901b = (TaxiInfo) parcel.readParcelable(TaxiInfo.class.getClassLoader());
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public TaxiInfo getTaxitInfo() {
        return this.f1901b;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.setType(RouteLine.TYPE.TRANSITSTEP);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f1901b, 1);
    }
}
