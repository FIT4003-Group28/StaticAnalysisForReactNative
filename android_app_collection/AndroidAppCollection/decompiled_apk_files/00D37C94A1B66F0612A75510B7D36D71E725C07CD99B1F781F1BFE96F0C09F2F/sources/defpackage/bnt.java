package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bnt  reason: default package */
/* loaded from: classes2.dex */
public final class bnt {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    @Deprecated
    public bnt() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnt) {
            bnt bntVar = (bnt) obj;
            return this.b == bntVar.b && this.a.equals(bntVar.a);
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

    public bnt(View view) {
        this.b = view;
    }
}
