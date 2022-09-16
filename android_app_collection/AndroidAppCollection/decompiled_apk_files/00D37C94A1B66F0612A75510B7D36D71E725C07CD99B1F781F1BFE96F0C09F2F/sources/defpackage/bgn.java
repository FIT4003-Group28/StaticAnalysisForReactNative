package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bgn  reason: default package */
/* loaded from: classes2.dex */
public final class bgn {
    private ArrayList a;

    public bgn() {
    }

    public final bgo a() {
        if (this.a == null) {
            return bgo.a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new bgo(bundle, this.a);
    }

    public final void c(String str) {
        if (str != null) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            if (this.a.contains(str)) {
                return;
            }
            this.a.add(str);
            return;
        }
        throw new IllegalArgumentException("category must not be null");
    }

    public bgn(bgo bgoVar) {
        if (bgoVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        bgoVar.c();
        if (bgoVar.c.isEmpty()) {
            return;
        }
        this.a = new ArrayList(bgoVar.c);
    }

    public final void b(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("categories must not be null");
        }
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((String) it.next());
        }
    }

    public final void d(bgo bgoVar) {
        if (bgoVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b(bgoVar.b());
    }
}
