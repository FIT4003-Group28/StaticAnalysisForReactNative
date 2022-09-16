package defpackage;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpiz  reason: default package */
/* loaded from: classes5.dex */
final class cpiz<T> extends cpjq<Status> {
    private final WeakReference<Map<T, cpjy<T>>> a;
    private final WeakReference<T> b;

    public cpiz(Map<T, cpjy<T>> map, T t, cnph<Status> cnphVar) {
        super(cnphVar);
        this.a = new WeakReference<>(map);
        this.b = new WeakReference<>(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cphh, defpackage.cpiu
    public final void f(Status status) {
        Map<T, cpjy<T>> map = this.a.get();
        T t = this.b.get();
        if (!status.d() && map != null && t != null) {
            synchronized (map) {
                cpjy<T> remove = map.remove(t);
                if (remove != null) {
                    cnsd<cpgo> cnsdVar = remove.a;
                    if (cnsdVar != null) {
                        cnsdVar.b();
                    }
                    remove.a = null;
                }
            }
        }
        C(status);
    }
}
