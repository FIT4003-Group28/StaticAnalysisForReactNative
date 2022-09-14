package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.route.DrivingRouteLine;
import com.baidu.mapapi.search.route.TransitRouteLine;
import com.baidu.mapapi.search.route.WalkingRouteLine;
import java.util.List;
/* loaded from: classes.dex */
public class RouteLine<T extends RouteStep> implements Parcelable {
    public static final Parcelable.Creator<RouteLine> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    TYPE f1788a;

    /* renamed from: b  reason: collision with root package name */
    private RouteNode f1789b;

    /* renamed from: c  reason: collision with root package name */
    private RouteNode f1790c;

    /* renamed from: d  reason: collision with root package name */
    private String f1791d;
    private List<T> e;
    private int f;
    private int g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public enum TYPE {
        DRIVESTEP(0),
        TRANSITSTEP(1),
        WALKSTEP(2);
        

        /* renamed from: a  reason: collision with root package name */
        private int f1793a;

        TYPE(int i) {
            this.f1793a = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f1793a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RouteLine() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RouteLine(Parcel parcel) {
        Object obj;
        int readInt = parcel.readInt();
        this.f1789b = (RouteNode) parcel.readValue(RouteNode.class.getClassLoader());
        this.f1790c = (RouteNode) parcel.readValue(RouteNode.class.getClassLoader());
        this.f1791d = parcel.readString();
        switch (readInt) {
            case 0:
                obj = DrivingRouteLine.DrivingStep.CREATOR;
                break;
            case 1:
                obj = TransitRouteLine.TransitStep.CREATOR;
                break;
            case 2:
                obj = WalkingRouteLine.WalkingStep.CREATOR;
                break;
            default:
                this.f = parcel.readInt();
                this.g = parcel.readInt();
        }
        this.e = parcel.createTypedArrayList(obj);
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<T> getAllStep() {
        return this.e;
    }

    public int getDistance() {
        return this.f;
    }

    public int getDuration() {
        return this.g;
    }

    public RouteNode getStarting() {
        return this.f1789b;
    }

    public RouteNode getTerminal() {
        return this.f1790c;
    }

    public String getTitle() {
        return this.f1791d;
    }

    protected TYPE getType() {
        return this.f1788a;
    }

    public void setDistance(int i) {
        this.f = i;
    }

    public void setDuration(int i) {
        this.g = i;
    }

    public void setStarting(RouteNode routeNode) {
        this.f1789b = routeNode;
    }

    public void setSteps(List<T> list) {
        this.e = list;
    }

    public void setTerminal(RouteNode routeNode) {
        this.f1790c = routeNode;
    }

    public void setTitle(String str) {
        this.f1791d = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setType(TYPE type) {
        this.f1788a = type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1788a.a());
        parcel.writeValue(this.f1789b);
        parcel.writeValue(this.f1790c);
        parcel.writeString(this.f1791d);
        parcel.writeTypedList(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
