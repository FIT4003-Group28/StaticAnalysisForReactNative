package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: arb  reason: default package */
/* loaded from: classes2.dex */
public final class arb {
    private ArrayList<String> a;

    public arb() {
    }

    public final arc a() {
        if (this.a == null) {
            return arc.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new arc(bundle, this.a);
    }

    public final void c(String str) {
        if (str != null) {
            if (this.a == null) {
                this.a = new ArrayList<>();
            }
            if (this.a.contains(str)) {
                return;
            }
            this.a.add(str);
            return;
        }
        throw new IllegalArgumentException("category must not be null");
    }

    public arb(arc arcVar) {
        if (arcVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        arcVar.b();
        if (arcVar.b.isEmpty()) {
            return;
        }
        this.a = new ArrayList<>(arcVar.b);
    }

    public final void b(Collection<String> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("categories must not be null");
        }
        if (collection.isEmpty()) {
            return;
        }
        for (String str : collection) {
            c(str);
        }
    }

    public final void d(arc arcVar) {
        if (arcVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b(arcVar.a());
    }
}
