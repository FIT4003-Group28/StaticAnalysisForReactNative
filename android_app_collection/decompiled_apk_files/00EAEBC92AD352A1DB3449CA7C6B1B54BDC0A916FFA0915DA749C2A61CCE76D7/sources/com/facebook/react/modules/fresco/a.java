package com.facebook.react.modules.fresco;

import c.d.j.o.d;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class a extends c.d.j.o.c {
    private final ReadableMap s;

    protected a(d dVar, ReadableMap readableMap) {
        super(dVar);
        this.s = readableMap;
    }

    public static a a(d dVar, ReadableMap readableMap) {
        return new a(dVar, readableMap);
    }

    public ReadableMap u() {
        return this.s;
    }
}
