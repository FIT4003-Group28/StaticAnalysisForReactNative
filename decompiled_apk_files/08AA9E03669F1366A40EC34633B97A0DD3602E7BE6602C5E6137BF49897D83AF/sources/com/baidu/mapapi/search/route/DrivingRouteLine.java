package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DrivingRouteLine extends RouteLine<DrivingStep> implements Parcelable {
    public static final Parcelable.Creator<DrivingRouteLine> CREATOR = new d();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1872b;

    /* renamed from: c  reason: collision with root package name */
    private List<RouteNode> f1873c;

    /* renamed from: d  reason: collision with root package name */
    private int f1874d;
    private int e;

    /* loaded from: classes.dex */
    public static class DrivingStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<DrivingStep> CREATOR = new e();

        /* renamed from: c  reason: collision with root package name */
        List<LatLng> f1875c;

        /* renamed from: d  reason: collision with root package name */
        int[] f1876d;
        private int e;
        private RouteNode f;
        private RouteNode g;
        private String h;
        private String i;
        private String j;
        private String k;
        private int l;

        public DrivingStep() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public DrivingStep(Parcel parcel) {
            super(parcel);
            this.e = parcel.readInt();
            this.f = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.g = (RouteNode) parcel.readParcelable(RouteNode.class.getClassLoader());
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.j = parcel.readString();
            this.k = parcel.readString();
            this.l = parcel.readInt();
            this.f1875c = parcel.createTypedArrayList(LatLng.CREATOR);
            this.f1876d = parcel.createIntArray();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(int i) {
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(RouteNode routeNode) {
            this.f = routeNode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(String str) {
            this.i = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(List<LatLng> list) {
            this.f1875c = list;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(int[] iArr) {
            this.f1876d = iArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(int i) {
            this.l = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(RouteNode routeNode) {
            this.g = routeNode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(String str) {
            this.j = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(String str) {
            this.k = str;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getDirection() {
            return this.e;
        }

        public RouteNode getEntrance() {
            return this.f;
        }

        public String getEntranceInstructions() {
            return this.i;
        }

        public RouteNode getExit() {
            return this.g;
        }

        public String getExitInstructions() {
            return this.j;
        }

        public String getInstructions() {
            return this.k;
        }

        public int getNumTurns() {
            return this.l;
        }

        public int[] getTrafficList() {
            return this.f1876d;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = CoordUtil.decodeLocationList(this.h);
            }
            return this.f1875c;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.e);
            parcel.writeParcelable(this.f, 1);
            parcel.writeParcelable(this.g, 1);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeTypedList(this.f1875c);
            parcel.writeIntArray(this.f1876d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DrivingRouteLine() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DrivingRouteLine(Parcel parcel) {
        super(parcel);
        this.f1872b = parcel.readByte() != 0;
        this.f1873c = new ArrayList();
        parcel.readList(this.f1873c, RouteNode.class.getClassLoader());
        this.f1874d = parcel.readInt();
        this.e = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<RouteNode> list) {
        this.f1873c = list;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCongestionDistance() {
        return this.f1874d;
    }

    public int getLightNum() {
        return this.e;
    }

    public List<RouteNode> getWayPoints() {
        return this.f1873c;
    }

    @Deprecated
    public boolean isSupportTraffic() {
        return this.f1872b;
    }

    public void setCongestionDistance(int i) {
        this.f1874d = i;
    }

    public void setLightNum(int i) {
        this.e = i;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.setType(RouteLine.TYPE.DRIVESTEP);
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f1872b ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f1873c);
        parcel.writeInt(this.f1874d);
        parcel.writeInt(this.e);
    }
}
