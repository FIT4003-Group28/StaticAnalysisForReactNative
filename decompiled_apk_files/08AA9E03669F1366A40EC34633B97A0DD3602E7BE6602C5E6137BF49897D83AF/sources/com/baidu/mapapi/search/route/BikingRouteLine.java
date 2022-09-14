package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class BikingRouteLine extends RouteLine<BikingStep> implements Parcelable {
    public static final Parcelable.Creator<WalkingRouteLine> CREATOR = new a();

    /* loaded from: classes.dex */
    public static class BikingStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<BikingStep> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        private int f1866c;

        /* renamed from: d  reason: collision with root package name */
        private RouteNode f1867d;
        private RouteNode e;
        private String f;
        private String g;
        private String h;
        private String i;

        public BikingStep() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public BikingStep(Parcel parcel) {
            super(parcel);
            this.f1866c = parcel.readInt();
            this.f1867d = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.e = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.f = parcel.readString();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readString();
        }

        private List<LatLng> e(String str) {
            if (str == null || str.length() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String[] split = str.split(";");
            if (split == null || split.length == 0) {
                return null;
            }
            for (String str2 : split) {
                String[] split2 = str2.split(",");
                if (split2 != null && split2.length >= 2) {
                    arrayList.add(new LatLng(Double.valueOf(split2[1]).doubleValue(), Double.valueOf(split2[0]).doubleValue()));
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(int i) {
            this.f1866c = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(RouteNode routeNode) {
            this.f1867d = routeNode;
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
            return this.f1866c;
        }

        public RouteNode getEntrance() {
            return this.f1867d;
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
                this.mWayPoints = e(this.f);
            }
            return this.mWayPoints;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, 1);
            parcel.writeInt(this.f1866c);
            parcel.writeParcelable(this.f1867d, 1);
            parcel.writeParcelable(this.e, 1);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BikingRouteLine() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BikingRouteLine(Parcel parcel) {
        super(parcel);
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<BikingStep> getAllStep() {
        return super.getAllStep();
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.setType(RouteLine.TYPE.WALKSTEP);
        super.writeToParcel(parcel, 1);
    }
}
