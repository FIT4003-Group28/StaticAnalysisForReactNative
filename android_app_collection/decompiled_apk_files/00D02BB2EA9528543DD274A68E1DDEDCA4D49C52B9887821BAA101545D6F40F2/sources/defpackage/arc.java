package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: arc  reason: default package */
/* loaded from: classes2.dex */
public final class arc {
    public static final arc c = new arc(new Bundle(), null);
    public final Bundle a;
    public List<String> b;

    public arc(Bundle bundle, List<String> list) {
        this.a = bundle;
        this.b = list;
    }

    public static arc d(Bundle bundle) {
        if (bundle != null) {
            return new arc(bundle, null);
        }
        return null;
    }

    public final List<String> a() {
        b();
        return this.b;
    }

    public final void b() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                return;
            }
            this.b = Collections.emptyList();
        }
    }

    public final boolean c() {
        b();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof arc) {
            arc arcVar = (arc) obj;
            b();
            arcVar.b();
            return this.b.equals(arcVar.b);
        }
        return false;
    }

    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(a().toArray()) + " }";
    }
}
