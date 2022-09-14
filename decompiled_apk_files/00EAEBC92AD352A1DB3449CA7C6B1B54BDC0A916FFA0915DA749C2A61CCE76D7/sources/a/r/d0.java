package a.r;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b  reason: collision with root package name */
    public View f584b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f583a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<x> f585c = new ArrayList<>();

    @Deprecated
    public d0() {
    }

    public d0(View view) {
        this.f584b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return this.f584b == d0Var.f584b && this.f583a.equals(d0Var.f583a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f584b.hashCode() * 31) + this.f583a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f584b + "\n") + "    values:";
        for (String str2 : this.f583a.keySet()) {
            str = str + "    " + str2 + ": " + this.f583a.get(str2) + "\n";
        }
        return str;
    }
}
