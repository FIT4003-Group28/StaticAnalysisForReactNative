package com.facebook.react;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends d {

    /* loaded from: classes.dex */
    class a implements Provider<NativeModule> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f5408a;

        a(b bVar, ReactApplicationContext reactApplicationContext) {
            this.f5408a = reactApplicationContext;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // javax.inject.Provider
        /* renamed from: get */
        public NativeModule mo254get() {
            return new JSCHeapCapture(this.f5408a);
        }
    }

    @Override // com.facebook.react.d
    public com.facebook.react.module.model.a a() {
        return d.a(this);
    }

    @Override // com.facebook.react.d
    public List<ModuleSpec> b(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCHeapCapture.class, new a(this, reactApplicationContext)));
        return arrayList;
    }
}
