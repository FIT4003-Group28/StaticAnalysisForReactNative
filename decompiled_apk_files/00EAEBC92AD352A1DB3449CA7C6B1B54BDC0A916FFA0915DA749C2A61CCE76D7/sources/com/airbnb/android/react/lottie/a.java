package com.airbnb.android.react.lottie;

import android.graphics.Color;
import android.widget.ImageView;
import c.a.a.d;
import c.a.a.l;
import c.a.a.r;
import c.a.a.v.e;
import c.a.a.z.c;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<d> f4968a;

    /* renamed from: b  reason: collision with root package name */
    private String f4969b;

    /* renamed from: c  reason: collision with root package name */
    private Float f4970c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f4971d;

    /* renamed from: e  reason: collision with root package name */
    private Float f4972e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4973f;

    /* renamed from: g  reason: collision with root package name */
    private String f4974g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView.ScaleType f4975h;
    private String i;
    private Boolean j;
    private ReadableArray k;

    public a(d dVar) {
        this.f4968a = new WeakReference<>(dVar);
    }

    public void a() {
        d dVar = this.f4968a.get();
        if (dVar == null) {
            return;
        }
        String str = this.f4969b;
        if (str != null) {
            dVar.a(str, Integer.toString(str.hashCode()));
            this.f4969b = null;
        }
        if (this.f4973f) {
            dVar.setAnimation(this.f4974g);
            this.f4973f = false;
        }
        Float f2 = this.f4970c;
        if (f2 != null) {
            dVar.setProgress(f2.floatValue());
            this.f4970c = null;
        }
        Boolean bool = this.f4971d;
        if (bool != null) {
            dVar.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.f4971d = null;
        }
        Float f3 = this.f4972e;
        if (f3 != null) {
            dVar.setSpeed(f3.floatValue());
            this.f4972e = null;
        }
        ImageView.ScaleType scaleType = this.f4975h;
        if (scaleType != null) {
            dVar.setScaleType(scaleType);
            this.f4975h = null;
        }
        String str2 = this.i;
        if (str2 != null) {
            dVar.setImageAssetsFolder(str2);
            this.i = null;
        }
        Boolean bool2 = this.j;
        if (bool2 != null) {
            dVar.a(bool2.booleanValue());
            this.j = null;
        }
        ReadableArray readableArray = this.k;
        if (readableArray == null || readableArray.size() <= 0) {
            return;
        }
        for (int i = 0; i < this.k.size(); i++) {
            ReadableMap mo209getMap = this.k.mo209getMap(i);
            dVar.a(new e(mo209getMap.getString("keypath"), "**"), l.B, new c(new r(Color.parseColor(mo209getMap.getString("color")))));
        }
    }

    public void a(float f2) {
        this.f4972e = Float.valueOf(f2);
    }

    public void a(ImageView.ScaleType scaleType) {
        this.f4975h = scaleType;
    }

    public void a(ReadableArray readableArray) {
        this.k = readableArray;
    }

    public void a(Float f2) {
        this.f4970c = f2;
    }

    public void a(String str) {
        this.f4969b = str;
    }

    public void a(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public void b(String str) {
        this.f4974g = str;
        this.f4973f = true;
    }

    public void b(boolean z) {
        this.f4971d = Boolean.valueOf(z);
    }

    public void c(String str) {
        this.i = str;
    }
}
