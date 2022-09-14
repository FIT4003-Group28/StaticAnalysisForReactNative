package com.baidu.mapapi.search.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class BusLineResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<BusLineResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f1777a;

    /* renamed from: b  reason: collision with root package name */
    private String f1778b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1779c;

    /* renamed from: d  reason: collision with root package name */
    private Date f1780d;
    private Date e;
    private String f;
    private List<BusStation> g;
    private List<BusStep> h;
    private float i;
    private float j;
    private String k;

    /* loaded from: classes.dex */
    public static class BusStation extends RouteNode {
    }

    /* loaded from: classes.dex */
    public static class BusStep extends RouteStep {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BusLineResult() {
        this.f1777a = null;
        this.f1778b = null;
        this.g = null;
        this.h = null;
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BusLineResult(Parcel parcel) {
        this.f1777a = null;
        this.f1778b = null;
        this.g = null;
        this.h = null;
        this.k = null;
        this.f1777a = parcel.readString();
        this.f1778b = parcel.readString();
        this.f1779c = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.f1780d = (Date) parcel.readValue(Date.class.getClassLoader());
        this.e = (Date) parcel.readValue(Date.class.getClassLoader());
        this.f = parcel.readString();
        this.g = parcel.readArrayList(BusStation.class.getClassLoader());
        this.h = parcel.readArrayList(RouteStep.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BusLineResult(SearchResult.ERRORNO errorno) {
        super(errorno);
        this.f1777a = null;
        this.f1778b = null;
        this.g = null;
        this.h = null;
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f1778b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Date date) {
        this.f1780d = date;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<BusStation> list) {
        this.g = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f1779c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Date date) {
        this.e = date;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(List<BusStep> list) {
        this.h = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBasePrice() {
        return this.i;
    }

    public String getBusCompany() {
        return this.f1777a;
    }

    public String getBusLineName() {
        return this.f1778b;
    }

    public Date getEndTime() {
        return this.e;
    }

    public String getLineDirection() {
        return this.k;
    }

    public float getMaxPrice() {
        return this.j;
    }

    public Date getStartTime() {
        return this.f1780d;
    }

    public List<BusStation> getStations() {
        return this.g;
    }

    public List<BusStep> getSteps() {
        return this.h;
    }

    public String getUid() {
        return this.f;
    }

    public boolean isMonthTicket() {
        return this.f1779c;
    }

    public void setBasePrice(float f) {
        this.i = f;
    }

    public void setLineDirection(String str) {
        this.k = str;
    }

    public void setMaxPrice(float f) {
        this.j = f;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1777a);
        parcel.writeString(this.f1778b);
        parcel.writeValue(Boolean.valueOf(this.f1779c));
        parcel.writeValue(this.f1780d);
        parcel.writeValue(this.e);
        parcel.writeString(this.f);
        parcel.writeList(this.g);
        parcel.writeList(this.h);
    }
}
