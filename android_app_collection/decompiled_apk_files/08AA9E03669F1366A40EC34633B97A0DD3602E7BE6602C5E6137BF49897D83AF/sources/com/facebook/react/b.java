package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.z;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugCorePackage.java */
/* loaded from: classes.dex */
public class b extends c {
    @Override // com.facebook.react.c
    public List<z> a(final ah ahVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(z.a(JSCHeapCapture.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.b.1
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new JSCHeapCapture(ahVar);
            }
        }));
        arrayList.add(z.a(JSCSamplingProfiler.class, new javax.a.a<NativeModule>() { // from class: com.facebook.react.b.2
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new JSCSamplingProfiler(ahVar);
            }
        }));
        return arrayList;
    }

    @Override // com.facebook.react.c
    public com.facebook.react.d.a.b a() {
        return c.a(this);
    }
}
