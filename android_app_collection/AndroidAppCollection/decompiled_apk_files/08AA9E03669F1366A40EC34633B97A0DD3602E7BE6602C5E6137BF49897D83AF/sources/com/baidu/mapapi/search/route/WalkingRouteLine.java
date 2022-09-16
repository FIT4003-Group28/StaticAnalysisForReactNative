package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.List;
/* loaded from: classes.dex */
public class WalkingRouteLine extends RouteLine<WalkingStep> implements Parcelable {
    public static final Parcelable.Creator<WalkingRouteLine> CREATOR = new m();

    /* loaded from: classes.dex */
    public static class WalkingStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<WalkingStep> CREATOR = new n();

        /* renamed from: c  reason: collision with root package name */
        private int f1913c;

        /* renamed from: d  reason: collision with root package name */
        private RouteNode f1914d;
        private RouteNode e;
        private String f;
        private String g;
        private String h;
        private String i;

        public WalkingStep() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public WalkingStep(Parcel parcel) {
            super(parcel);
            this.f1913c = parcel.readInt();
            this.f1914d = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.e = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(int i) {
            this.f1913c = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(RouteNode routeNode) {
            this.f1914d = routeNode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(String str) {
            this.f = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(RouteNode routeNode) {
            this.e = routeNode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(String str) {
            this.g = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(String str) {
            this.h = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d(String str) {
            this.i = str;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getDirection() {
            return this.f1913c;
        }

        public RouteNode getEntrance() {
            return this.f1914d;
        }

        public String getEntranceInstructions() {
            return this.g;
        }

        public RouteNode getExit() {
            return this.e;
        }

        public String getExitInstructions() {
            return this.h;
        }

        public String getInstructions() {
            return this.i;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = CoordUtil.decodeLocationList(this.f);
            }
            return this.mWayPoints;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, 1);
            parcel.writeInt(this.f1913c);
            parcel.writeParcelable(this.f1914d, 1);
            parcel.writeParcelable(this.e, 1);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalkingRouteLine() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WalkingRouteLine(Parcel parcel) {
        super(parcel);
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<WalkingStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.setType(RouteLine.TYPE.WALKSTEP);
        super.writeToParcel(parcel, 1);
    }
}
