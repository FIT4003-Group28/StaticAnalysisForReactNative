package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: abz  reason: default package */
/* loaded from: classes.dex */
public class abz {
    final SparseArray<aby> a = new SparseArray<>();
    public int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long g(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public void a() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.valueAt(i).a.clear();
        }
    }

    public acl b(int i) {
        aby abyVar = this.a.get(i);
        if (abyVar == null || abyVar.a.isEmpty()) {
            return null;
        }
        ArrayList<acl> arrayList = abyVar.a;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (arrayList.get(size).s());
        return arrayList.remove(size);
    }

    public void c(acl aclVar) {
        int i = aclVar.f;
        ArrayList<acl> arrayList = f(i).a;
        if (this.a.get(i).b <= arrayList.size()) {
            return;
        }
        aclVar.y();
        arrayList.add(aclVar);
    }

    public final void d() {
        this.b++;
    }

    public final void e() {
        this.b--;
    }

    public final aby f(int i) {
        aby abyVar = this.a.get(i);
        if (abyVar == null) {
            aby abyVar2 = new aby();
            this.a.put(i, abyVar2);
            return abyVar2;
        }
        return abyVar;
    }
}
