package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: chqz  reason: default package */
/* loaded from: classes4.dex */
public final class chqz {
    public final ArrayList<chxr> a = new ArrayList<>();
    public final HashSet<chxr> b = new HashSet<>();
    public String c = null;

    public final dcdc<chxr> a() {
        return dcdc.r(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(Collection<chxr> collection, String str, String str2) {
        bvrj.UI_THREAD.c();
        if (d() || !str.equals(dbsj.e(this.c))) {
            return false;
        }
        this.c = str2;
        for (chxr chxrVar : collection) {
            if (this.b.add(chxrVar)) {
                this.a.add(chxrVar);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(chxr chxrVar) {
        if (this.b.add(chxrVar)) {
            this.a.add(0, chxrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return "".equals(this.c);
    }
}
