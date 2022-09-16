package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: f  reason: collision with root package name */
    private final int f6150f;

    /* renamed from: g  reason: collision with root package name */
    private final String f6151g;

    /* renamed from: h  reason: collision with root package name */
    private final int f6152h;
    private final int i;
    private final String j;

    public b(int i, int i2) {
        this(i, i2, null);
    }

    public b(int i, int i2, String str) {
        this(i, i2, str, 0, 0, null);
    }

    public b(int i, int i2, String str, int i3, int i4) {
        this(i, i2, str, i3, i4, null);
    }

    public b(int i, int i2, String str, int i3, int i4, String str2) {
        super(i);
        this.f6150f = i2;
        this.f6151g = str;
        this.f6152h = i3;
        this.i = i4;
        this.j = str2;
    }

    public b(int i, int i2, boolean z, String str) {
        this(i, i2, null, 0, 0, str);
    }

    public static String b(int i) {
        if (i != 1) {
            if (i == 2) {
                return "topLoad";
            }
            if (i == 3) {
                return "topLoadEnd";
            }
            if (i == 4) {
                return "topLoadStart";
            }
            if (i == 5) {
                return "topProgress";
            }
            throw new IllegalStateException("Invalid image event: " + Integer.toString(i));
        }
        return "topError";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap;
        int i;
        if (this.f6151g != null || (i = this.f6150f) == 2 || i == 1) {
            createMap = Arguments.createMap();
            String str = this.f6151g;
            if (str != null) {
                createMap.putString("uri", str);
            }
            int i2 = this.f6150f;
            if (i2 == 2) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putDouble("width", this.f6152h);
                createMap2.putDouble("height", this.i);
                String str2 = this.f6151g;
                if (str2 != null) {
                    createMap2.putString("url", str2);
                }
                createMap.putMap("source", createMap2);
            } else if (i2 == 1) {
                createMap.putString("error", this.j);
            }
        } else {
            createMap = null;
        }
        rCTEventEmitter.receiveEvent(g(), d(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return (short) this.f6150f;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return b(this.f6150f);
    }
}
