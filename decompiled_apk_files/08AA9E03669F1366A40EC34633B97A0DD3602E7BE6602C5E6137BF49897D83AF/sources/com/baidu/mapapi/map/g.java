package com.baidu.mapapi.map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f1726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f1727b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f1728c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ HeatMap f1729d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(HeatMap heatMap, int i, int i2, int i3) {
        this.f1729d = heatMap;
        this.f1726a = i;
        this.f1727b = i2;
        this.f1728c = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1729d.b(this.f1726a, this.f1727b, this.f1728c);
    }
}
