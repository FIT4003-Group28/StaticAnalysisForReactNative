package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.ParcelItem;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.EnumC0135h;
import com.google.android.gms.common.internal.ImagesContract;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class Marker extends Overlay {

    /* renamed from: a  reason: collision with root package name */
    LatLng f1641a;

    /* renamed from: b  reason: collision with root package name */
    BitmapDescriptor f1642b;

    /* renamed from: c  reason: collision with root package name */
    float f1643c;

    /* renamed from: d  reason: collision with root package name */
    float f1644d;
    boolean e;
    boolean f;
    float g;
    String h;
    int i;
    float l;
    int m;
    ArrayList<BitmapDescriptor> n;
    boolean j = false;
    boolean k = false;
    int o = 20;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Marker() {
        this.q = EnumC0135h.marker;
    }

    private void a(ArrayList<BitmapDescriptor> arrayList, Bundle bundle) {
        int i;
        ArrayList arrayList2 = new ArrayList();
        Iterator<BitmapDescriptor> it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ParcelItem parcelItem = new ParcelItem();
            Bundle bundle2 = new Bundle();
            Bitmap bitmap = it.next().f1560a;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            bundle2.putByteArray(ImagesContract.IMAGE_DATA, array);
            bundle2.putInt("image_width", bitmap.getWidth());
            bundle2.putInt("image_height", bitmap.getHeight());
            MessageDigest messageDigest = null;
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            messageDigest.update(array, 0, array.length);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder("");
            while (i < digest.length) {
                sb.append(Integer.toString((digest[i] & 255) + 256, 16).substring(1));
                i++;
            }
            bundle2.putString("image_hashcode", sb.toString());
            parcelItem.setBundle(bundle2);
            arrayList2.add(parcelItem);
        }
        if (arrayList2.size() > 0) {
            ParcelItem[] parcelItemArr = new ParcelItem[arrayList2.size()];
            while (i < arrayList2.size()) {
                parcelItemArr[i] = (ParcelItem) arrayList2.get(i);
                i++;
            }
            bundle.putParcelableArray("icons", parcelItemArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.baidu.mapapi.map.Overlay
    public Bundle a(Bundle bundle) {
        super.a(bundle);
        Bundle bundle2 = new Bundle();
        if (this.f1642b != null) {
            bundle.putBundle("image_info", this.f1642b.b());
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f1641a);
        bundle.putInt("animatetype", this.m);
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("perspective", this.e ? 1 : 0);
        bundle.putFloat("anchor_x", this.f1643c);
        bundle.putFloat("anchor_y", this.f1644d);
        bundle.putFloat("rotate", this.g);
        bundle.putInt("y_offset", this.i);
        bundle.putInt("isflat", this.j ? 1 : 0);
        bundle.putInt("istop", this.k ? 1 : 0);
        bundle.putInt("period", this.o);
        bundle.putFloat("alpha", this.l);
        if (this.n != null && this.n.size() > 0) {
            a(this.n, bundle);
        }
        bundle2.putBundle("param", bundle);
        return bundle;
    }

    public float getAlpha() {
        return this.l;
    }

    public float getAnchorX() {
        return this.f1643c;
    }

    public float getAnchorY() {
        return this.f1644d;
    }

    public BitmapDescriptor getIcon() {
        return this.f1642b;
    }

    public ArrayList<BitmapDescriptor> getIcons() {
        return this.n;
    }

    public int getPeriod() {
        return this.o;
    }

    public LatLng getPosition() {
        return this.f1641a;
    }

    public float getRotate() {
        return this.g;
    }

    public String getTitle() {
        return this.h;
    }

    public boolean isDraggable() {
        return this.f;
    }

    public boolean isFlat() {
        return this.j;
    }

    public boolean isPerspective() {
        return this.e;
    }

    public void setAlpha(float f) {
        if (f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f > 1.0d) {
            this.l = 1.0f;
            return;
        }
        this.l = f;
        this.listener.b(this);
    }

    public void setAnchor(float f, float f2) {
        if (f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f > 1.0f || f2 < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED || f2 > 1.0f) {
            return;
        }
        this.f1643c = f;
        this.f1644d = f2;
        this.listener.b(this);
    }

    public void setDraggable(boolean z) {
        this.f = z;
        this.listener.b(this);
    }

    public void setFlat(boolean z) {
        this.j = z;
        this.listener.b(this);
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("marker's icon can not be null");
        }
        this.f1642b = bitmapDescriptor;
        this.listener.b(this);
    }

    public void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("marker's icons can not be null");
        }
        if (arrayList.size() == 0) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null || arrayList.get(i).f1560a == null) {
                return;
            }
        }
        this.n = arrayList;
        this.listener.b(this);
    }

    public void setPeriod(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("marker's period must be greater than zero ");
        }
        this.o = i;
        this.listener.b(this);
    }

    public void setPerspective(boolean z) {
        this.e = z;
        this.listener.b(this);
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("marker's position can not be null");
        }
        this.f1641a = latLng;
        this.listener.b(this);
    }

    public void setRotate(float f) {
        while (f < com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) {
            f += 360.0f;
        }
        this.g = f % 360.0f;
        this.listener.b(this);
    }

    public void setTitle(String str) {
        this.h = str;
    }

    public void setToTop() {
        this.k = true;
        this.listener.b(this);
    }
}
