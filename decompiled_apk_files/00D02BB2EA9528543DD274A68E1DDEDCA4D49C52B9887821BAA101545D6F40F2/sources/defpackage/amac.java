package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amac  reason: default package */
/* loaded from: classes.dex */
public final class amac {
    public final ArrayList<WeakReference<amcn>> a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<amcn> a() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList(this.a.size());
            int i = 0;
            while (i < this.a.size()) {
                amcn amcnVar = this.a.get(i).get();
                if (amcnVar != null) {
                    arrayList.add(amcnVar);
                } else {
                    this.a.remove(i);
                    i--;
                }
                i++;
            }
        }
        return arrayList;
    }
}
