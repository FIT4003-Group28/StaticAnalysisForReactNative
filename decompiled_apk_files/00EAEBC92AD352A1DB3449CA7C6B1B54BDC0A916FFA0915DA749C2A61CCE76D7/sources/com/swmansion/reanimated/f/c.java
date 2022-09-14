package com.swmansion.reanimated.f;

import a.r.z;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final UIManagerModule f9981a;

    /* loaded from: classes.dex */
    class a implements n0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9982a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f9983b;

        a(c cVar, int i, ReadableMap readableMap) {
            this.f9982a = i;
            this.f9983b = readableMap;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            try {
                View b2 = mVar.b(this.f9982a);
                if (!(b2 instanceof ViewGroup)) {
                    return;
                }
                ReadableArray array = this.f9983b.getArray("transitions");
                int size = array.size();
                for (int i = 0; i < size; i++) {
                    z.a((ViewGroup) b2, d.a(array.mo209getMap(i)));
                }
            } catch (g unused) {
            }
        }
    }

    public c(UIManagerModule uIManagerModule) {
        this.f9981a = uIManagerModule;
    }

    public void a(int i, ReadableMap readableMap) {
        this.f9981a.prependUIBlock(new a(this, i, readableMap));
    }
}
