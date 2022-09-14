package com.a.a.a;

import com.baidu.mapapi.model.LatLng;
/* compiled from: LatLngInterpolator.java */
/* loaded from: classes.dex */
public interface a {
    LatLng a(float f, LatLng latLng, LatLng latLng2);

    com.google.android.gms.maps.model.LatLng a(float f, com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2);

    /* compiled from: LatLngInterpolator.java */
    /* renamed from: com.a.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0030a implements a {
        @Override // com.a.a.a.a
        public com.google.android.gms.maps.model.LatLng a(float f, com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
            double d2 = f;
            double d3 = ((latLng2.latitude - latLng.latitude) * d2) + latLng.latitude;
            double d4 = latLng2.longitude - latLng.longitude;
            if (Math.abs(d4) > 180.0d) {
                d4 -= Math.signum(d4) * 360.0d;
            }
            return new com.google.android.gms.maps.model.LatLng(d3, (d4 * d2) + latLng.longitude);
        }

        @Override // com.a.a.a.a
        public LatLng a(float f, LatLng latLng, LatLng latLng2) {
            double d2 = f;
            double d3 = ((latLng2.latitude - latLng.latitude) * d2) + latLng.latitude;
            double d4 = latLng2.longitude - latLng.longitude;
            if (Math.abs(d4) > 180.0d) {
                d4 -= Math.signum(d4) * 360.0d;
            }
            return new LatLng(d3, (d4 * d2) + latLng.longitude);
        }
    }
}
