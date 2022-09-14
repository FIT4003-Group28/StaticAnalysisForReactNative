package com.facebook.f.c;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ForwardingControllerListener.java */
/* loaded from: classes.dex */
public class f<INFO> implements d<INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final List<d<? super INFO>> f2401a = new ArrayList(2);

    public synchronized void a(d<? super INFO> dVar) {
        this.f2401a.add(dVar);
    }

    public synchronized void a() {
        this.f2401a.clear();
    }

    private synchronized void c(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    @Override // com.facebook.f.c.d
    public synchronized void a(String str, Object obj) {
        int size = this.f2401a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f2401a.get(i).a(str, obj);
            } catch (Exception e) {
                c("InternalListener exception in onSubmit", e);
            }
        }
    }

    @Override // com.facebook.f.c.d
    public synchronized void a(String str, INFO info, Animatable animatable) {
        int size = this.f2401a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f2401a.get(i).a(str, info, animatable);
            } catch (Exception e) {
                c("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    @Override // com.facebook.f.c.d
    public void b(String str, INFO info) {
        int size = this.f2401a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f2401a.get(i).b(str, (String) info);
            } catch (Exception e) {
                c("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // com.facebook.f.c.d
    public void a(String str, Throwable th) {
        int size = this.f2401a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f2401a.get(i).a(str, th);
            } catch (Exception e) {
                c("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    @Override // com.facebook.f.c.d
    public synchronized void b(String str, Throwable th) {
        int size = this.f2401a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f2401a.get(i).b(str, th);
            } catch (Exception e) {
                c("InternalListener exception in onFailure", e);
            }
        }
    }

    @Override // com.facebook.f.c.d
    public synchronized void a(String str) {
        int size = this.f2401a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f2401a.get(i).a(str);
            } catch (Exception e) {
                c("InternalListener exception in onRelease", e);
            }
        }
    }
}
