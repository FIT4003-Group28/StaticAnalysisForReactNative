package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.D;
import com.baidu.platform.comapi.map.GestureDetector$OnDoubleTapListenerC0136i;
import com.baidu.platform.comapi.map.InterfaceC0138k;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import javax.microedition.khronos.opengles.GL10;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u implements InterfaceC0138k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WearMapView f1755a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(WearMapView wearMapView) {
        this.f1755a = wearMapView;
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a() {
        GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i;
        GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i2;
        GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i3;
        float f;
        SparseArray sparseArray;
        GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i4;
        ImageView imageView;
        TextView textView;
        TextView textView2;
        gestureDetector$OnDoubleTapListenerC0136i = this.f1755a.f1709d;
        if (gestureDetector$OnDoubleTapListenerC0136i != null) {
            gestureDetector$OnDoubleTapListenerC0136i2 = this.f1755a.f1709d;
            if (gestureDetector$OnDoubleTapListenerC0136i2.a() == null) {
                return;
            }
            gestureDetector$OnDoubleTapListenerC0136i3 = this.f1755a.f1709d;
            float f2 = gestureDetector$OnDoubleTapListenerC0136i3.a().D().f2026a;
            f = this.f1755a.x;
            if (f != f2) {
                sparseArray = WearMapView.u;
                int intValue = ((Integer) sparseArray.get((int) f2)).intValue();
                gestureDetector$OnDoubleTapListenerC0136i4 = this.f1755a.f1709d;
                imageView = this.f1755a.p;
                int i = ((int) (intValue / gestureDetector$OnDoubleTapListenerC0136i4.a().D().m)) / 2;
                imageView.setPadding(i, 0, i, 0);
                String format = intValue >= 1000 ? String.format(" %d公里 ", Integer.valueOf(intValue / NetstatsParserPatterns.NEW_TS_TO_MILLIS)) : String.format(" %d米 ", Integer.valueOf(intValue));
                textView = this.f1755a.n;
                textView.setText(format);
                textView2 = this.f1755a.o;
                textView2.setText(format);
                this.f1755a.x = f2;
            }
            this.f1755a.requestLayout();
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
