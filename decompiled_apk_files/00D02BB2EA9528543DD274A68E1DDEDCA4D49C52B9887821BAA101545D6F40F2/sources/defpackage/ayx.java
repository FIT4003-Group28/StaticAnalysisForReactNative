package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ayx  reason: default package */
/* loaded from: classes3.dex */
public final class ayx {
    public View b;
    public final Map<String, Object> a = new HashMap();
    final ArrayList<ayn> c = new ArrayList<>();

    @Deprecated
    public ayx() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ayx) {
            ayx ayxVar = (ayx) obj;
            return this.b == ayxVar.b && this.a.equals(ayxVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }

    public ayx(View view) {
        this.b = view;
    }
}
