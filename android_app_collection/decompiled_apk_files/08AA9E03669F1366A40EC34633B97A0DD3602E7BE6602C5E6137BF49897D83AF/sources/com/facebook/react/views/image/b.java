package com.facebook.react.views.image;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: ImageLoadEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.b<b> {

    /* renamed from: a  reason: collision with root package name */
    private final int f3965a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3966b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3967c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3968d;

    public b(int i, int i2) {
        this(i, i2, null);
    }

    public b(int i, int i2, String str) {
        this(i, i2, str, 0, 0);
    }

    public b(int i, int i2, String str, int i3, int i4) {
        super(i);
        this.f3965a = i2;
        this.f3966b = str;
        this.f3967c = i3;
        this.f3968d = i4;
    }

    public static String b(int i) {
        switch (i) {
            case 1:
                return "topError";
            case 2:
                return "topLoad";
            case 3:
                return "topLoadEnd";
            case 4:
                return "topLoadStart";
            case 5:
                return "topProgress";
            default:
                throw new IllegalStateException("Invalid image event: " + Integer.toString(i));
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return b(this.f3965a);
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) this.f3965a;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        ar b2;
        if (this.f3966b != null || this.f3965a == 2) {
            b2 = com.facebook.react.bridge.b.b();
            if (this.f3966b != null) {
                b2.putString("uri", this.f3966b);
            }
            if (this.f3965a == 2) {
                ar b3 = com.facebook.react.bridge.b.b();
                b3.putDouble("width", this.f3967c);
                b3.putDouble("height", this.f3968d);
                if (this.f3966b != null) {
                    b3.putString(ImagesContract.URL, this.f3966b);
                }
                b2.a("source", b3);
            }
        } else {
            b2 = null;
        }
        rCTEventEmitter.receiveEvent(d(), a(), b2);
    }
}
