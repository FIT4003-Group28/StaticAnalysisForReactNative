package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgo  reason: default package */
/* loaded from: classes2.dex */
public final class bgo {
    public static final bgo a = new bgo(new Bundle(), null);
    public final Bundle b;
    List c;

    public bgo(Bundle bundle, List list) {
        this.b = bundle;
        this.c = list;
    }

    public static bgo a(Bundle bundle) {
        if (bundle != null) {
            return new bgo(bundle, null);
        }
        return null;
    }

    public final List b() {
        c();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.c == null) {
            ArrayList<String> stringArrayList = this.b.getStringArrayList("controlCategories");
            this.c = stringArrayList;
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                return;
            }
            this.c = Collections.emptyList();
        }
    }

    public final boolean d() {
        c();
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgo) {
            bgo bgoVar = (bgo) obj;
            c();
            bgoVar.c();
            return this.c.equals(bgoVar.c);
        }
        return false;
    }

    public final int hashCode() {
        c();
        return this.c.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
