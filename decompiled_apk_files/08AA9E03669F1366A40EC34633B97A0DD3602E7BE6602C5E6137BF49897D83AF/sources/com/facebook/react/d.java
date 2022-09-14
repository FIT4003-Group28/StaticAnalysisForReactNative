package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.y;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: MemoryPressureRouter.java */
/* loaded from: classes.dex */
public class d implements ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private final Set<y> f3305a = Collections.synchronizedSet(new LinkedHashSet());

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    public void a(y yVar) {
        this.f3305a.add(yVar);
    }

    public void b(y yVar) {
        this.f3305a.remove(yVar);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        a(i);
    }

    private void a(int i) {
        for (y yVar : (y[]) this.f3305a.toArray(new y[this.f3305a.size()])) {
            yVar.handleMemoryPressure(i);
        }
    }
}
