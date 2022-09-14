package c.d.h.c;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class f<INFO> implements d<INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final List<d<? super INFO>> f3005a = new ArrayList(2);

    private synchronized void c(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    public synchronized void a() {
        this.f3005a.clear();
    }

    public synchronized void a(d<? super INFO> dVar) {
        this.f3005a.add(dVar);
    }

    @Override // c.d.h.c.d
    public synchronized void a(String str) {
        int size = this.f3005a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.f3005a.get(i);
                if (dVar != null) {
                    dVar.a(str);
                }
            } catch (Exception e2) {
                c("InternalListener exception in onRelease", e2);
            }
        }
    }

    @Override // c.d.h.c.d
    public void a(String str, INFO info) {
        int size = this.f3005a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.f3005a.get(i);
                if (dVar != null) {
                    dVar.a(str, (String) info);
                }
            } catch (Exception e2) {
                c("InternalListener exception in onIntermediateImageSet", e2);
            }
        }
    }

    @Override // c.d.h.c.d
    public synchronized void a(String str, INFO info, Animatable animatable) {
        int size = this.f3005a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.f3005a.get(i);
                if (dVar != null) {
                    dVar.a(str, info, animatable);
                }
            } catch (Exception e2) {
                c("InternalListener exception in onFinalImageSet", e2);
            }
        }
    }

    @Override // c.d.h.c.d
    public void a(String str, Throwable th) {
        int size = this.f3005a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.f3005a.get(i);
                if (dVar != null) {
                    dVar.a(str, th);
                }
            } catch (Exception e2) {
                c("InternalListener exception in onIntermediateImageFailed", e2);
            }
        }
    }

    public synchronized void b(d<? super INFO> dVar) {
        int indexOf = this.f3005a.indexOf(dVar);
        if (indexOf != -1) {
            this.f3005a.set(indexOf, null);
        }
    }

    @Override // c.d.h.c.d
    public synchronized void b(String str, Object obj) {
        int size = this.f3005a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.f3005a.get(i);
                if (dVar != null) {
                    dVar.b(str, obj);
                }
            } catch (Exception e2) {
                c("InternalListener exception in onSubmit", e2);
            }
        }
    }

    @Override // c.d.h.c.d
    public synchronized void b(String str, Throwable th) {
        int size = this.f3005a.size();
        for (int i = 0; i < size; i++) {
            try {
                d<? super INFO> dVar = this.f3005a.get(i);
                if (dVar != null) {
                    dVar.b(str, th);
                }
            } catch (Exception e2) {
                c("InternalListener exception in onFailure", e2);
            }
        }
    }
}
