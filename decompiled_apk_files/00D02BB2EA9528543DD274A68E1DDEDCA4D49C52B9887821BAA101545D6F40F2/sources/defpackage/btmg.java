package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: btmg  reason: default package */
/* loaded from: classes4.dex */
public final class btmg {
    public final Map<ddho, List<WeakReference<Bitmap>>> a = new HashMap();

    public final synchronized void a(@dzsi Bitmap bitmap, Context context) {
        ArrayList arrayList;
        ddho ddhoVar;
        bvrj.UI_THREAD.d();
        if (bitmap == null) {
            return;
        }
        ff a = btmf.a(context);
        if (a == null) {
            arrayList = new ArrayList();
        } else {
            List<fd> q = a.g().q();
            if (q == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(q);
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                ddhoVar = null;
                break;
            }
            fd fdVar = (fd) arrayList.get(size);
            if (!(fdVar instanceof cjtg)) {
                if (fdVar instanceof cjsf) {
                    ddhoVar = ((cjsf) fdVar).aP().a();
                    break;
                }
            } else {
                ddhoVar = ((cjtg) fdVar).a();
                break;
            }
        }
        if (ddhoVar == null) {
            return;
        }
        List<WeakReference<Bitmap>> list = this.a.get(ddhoVar);
        if (list == null) {
            list = new ArrayList<>();
            this.a.put(ddhoVar, list);
        }
        list.add(new WeakReference<>(bitmap));
    }

    public final synchronized dcdn<ddho, Long> b() {
        dcdg p;
        Bitmap bitmap;
        bvrj.UI_THREAD.d();
        p = dcdn.p();
        Iterator<Map.Entry<ddho, List<WeakReference<Bitmap>>>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<ddho, List<WeakReference<Bitmap>>> next = it.next();
            ArrayList arrayList = new ArrayList();
            long j = 0;
            for (WeakReference<Bitmap> weakReference : next.getValue()) {
                if (weakReference.get() != null) {
                    arrayList.add(weakReference);
                    j += bitmap.getAllocationByteCount();
                }
            }
            if (j > 0) {
                p.f(next.getKey(), Long.valueOf(j));
            }
            if (!arrayList.isEmpty()) {
                next.setValue(arrayList);
            } else {
                it.remove();
            }
        }
        return p.b();
    }
}
