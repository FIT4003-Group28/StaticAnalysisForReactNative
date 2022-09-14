package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class e implements ComponentCallbacks2 {

    /* renamed from: b  reason: collision with root package name */
    private final Set<MemoryPressureListener> f5469b = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private void a(int i) {
        Set<MemoryPressureListener> set = this.f5469b;
        for (MemoryPressureListener memoryPressureListener : (MemoryPressureListener[]) set.toArray(new MemoryPressureListener[set.size()])) {
            memoryPressureListener.handleMemoryPressure(i);
        }
    }

    public void a(MemoryPressureListener memoryPressureListener) {
        this.f5469b.add(memoryPressureListener);
    }

    public void b(MemoryPressureListener memoryPressureListener) {
        this.f5469b.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        a(i);
    }
}
