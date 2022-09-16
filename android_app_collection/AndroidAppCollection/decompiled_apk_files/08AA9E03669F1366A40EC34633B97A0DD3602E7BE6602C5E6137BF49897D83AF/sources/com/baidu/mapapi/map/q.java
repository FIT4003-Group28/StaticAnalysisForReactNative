package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.D;
import com.baidu.platform.comapi.map.E;
import com.baidu.platform.comapi.map.InterfaceC0138k;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import javax.microedition.khronos.opengles.GL10;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q implements InterfaceC0138k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextureMapView f1748a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(TextureMapView textureMapView) {
        this.f1748a = textureMapView;
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a() {
        E e;
        E e2;
        E e3;
        float f;
        SparseArray sparseArray;
        E e4;
        ImageView imageView;
        TextView textView;
        TextView textView2;
        e = this.f1748a.f1691b;
        if (e != null) {
            e2 = this.f1748a.f1691b;
            if (e2.b() == null) {
                return;
            }
            e3 = this.f1748a.f1691b;
            float f2 = e3.b().D().f2026a;
            f = this.f1748a.o;
            if (f != f2) {
                sparseArray = TextureMapView.n;
                int intValue = ((Integer) sparseArray.get((int) f2)).intValue();
                e4 = this.f1748a.f1691b;
                imageView = this.f1748a.m;
                int i = ((int) (intValue / e4.b().D().m)) / 2;
                imageView.setPadding(i, 0, i, 0);
                String format = intValue >= 1000 ? String.format(" %d公里 ", Integer.valueOf(intValue / NetstatsParserPatterns.NEW_TS_TO_MILLIS)) : String.format(" %d米 ", Integer.valueOf(intValue));
                textView = this.f1748a.k;
                textView.setText(format);
                textView2 = this.f1748a.l;
                textView2.setText(format);
                this.f1748a.o = f2;
            }
            this.f1748a.b();
            this.f1748a.requestLayout();
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(Bitmap bitmap) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(MotionEvent motionEvent) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(GeoPoint geoPoint) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(D d2) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(String str) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(GL10 gl10, D d2) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(boolean z) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void b() {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void b(GeoPoint geoPoint) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void b(D d2) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public boolean b(String str) {
        return false;
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void c() {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void c(GeoPoint geoPoint) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void c(D d2) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void d() {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void d(GeoPoint geoPoint) {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void e() {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void e(GeoPoint geoPoint) {
    }
}
