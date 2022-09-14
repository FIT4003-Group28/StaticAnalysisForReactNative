package com.facebook.react.views.scroll;

import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: OnScrollDispatchHelper.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f4018a = PKIFailureInfo.systemUnavail;

    /* renamed from: b  reason: collision with root package name */
    private int f4019b = PKIFailureInfo.systemUnavail;

    /* renamed from: c  reason: collision with root package name */
    private float f4020c = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: d  reason: collision with root package name */
    private float f4021d = BitmapDescriptorFactory.HUE_RED;
    private long e = -11;

    public boolean a(int i, int i2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = (uptimeMillis - this.e <= 10 && this.f4018a == i && this.f4019b == i2) ? false : true;
        if (uptimeMillis - this.e != 0) {
            this.f4020c = (i - this.f4018a) / ((float) (uptimeMillis - this.e));
            this.f4021d = (i2 - this.f4019b) / ((float) (uptimeMillis - this.e));
        }
        this.e = uptimeMillis;
        this.f4018a = i;
        this.f4019b = i2;
        return z;
    }

    public float a() {
        return this.f4020c;
    }

    public float b() {
        return this.f4021d;
    }
}
