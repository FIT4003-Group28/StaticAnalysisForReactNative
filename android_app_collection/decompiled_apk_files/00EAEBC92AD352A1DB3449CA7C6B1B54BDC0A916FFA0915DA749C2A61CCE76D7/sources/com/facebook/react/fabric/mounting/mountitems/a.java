package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
/* loaded from: classes.dex */
public class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f5490a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5491b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5492c;

    /* renamed from: d  reason: collision with root package name */
    private final k0 f5493d;

    /* renamed from: e  reason: collision with root package name */
    private final ReadableMap f5494e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f5495f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5496g;

    public a(k0 k0Var, int i, int i2, String str, ReadableMap readableMap, j0 j0Var, boolean z) {
        this.f5493d = k0Var;
        this.f5490a = str;
        this.f5491b = i;
        this.f5492c = i2;
        this.f5494e = readableMap;
        this.f5495f = j0Var;
        this.f5496g = z;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.f
    public void a(com.facebook.react.fabric.e.b bVar) {
        bVar.a(this.f5493d, this.f5490a, this.f5492c, this.f5494e, this.f5495f, this.f5496g);
    }

    public String toString() {
        return "CreateMountItem [" + this.f5492c + "] - component: " + this.f5490a + " - rootTag: " + this.f5491b + " - isLayoutable: " + this.f5496g;
    }
}
