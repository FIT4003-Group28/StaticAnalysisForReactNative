package defpackage;

import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: gkg  reason: default package */
/* loaded from: classes.dex */
public final class gkg<T> extends btrh<T> {
    public gkg(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        gjz gjzVar = (gjz) this.a;
        gjzVar.a.aL = null;
        Iterator<MapViewContainer> it = ((jgs) obj).a.iterator();
        while (true) {
            if (it.hasNext()) {
                MapViewContainer next = it.next();
                if (next != gjzVar.a.ae() && next.getVisibility() == 0 && gjzVar.a.getContext() == next.getContext()) {
                    gjzVar.a.aL = next;
                    break;
                }
            } else {
                break;
            }
        }
        gjzVar.a.R();
    }
}
