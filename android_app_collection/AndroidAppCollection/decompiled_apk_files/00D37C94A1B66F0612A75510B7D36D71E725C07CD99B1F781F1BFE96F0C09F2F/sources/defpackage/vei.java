package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: vei  reason: default package */
/* loaded from: classes4.dex */
public final class vei {
    private final Context a;
    private final Set b;

    public vei(Context context, Map map) {
        this.a = context;
        this.b = ((amup) map).keySet();
    }

    public final boolean a() {
        if (!veg.b()) {
            return false;
        }
        String a = veg.a(this.a);
        if (a == null) {
            return true;
        }
        int size = this.b.size();
        if (size == 0) {
            return a.equals(this.a.getPackageName());
        }
        if (size == 1) {
            return a.equals(((veh) arey.t(this.b)).a());
        }
        throw new IllegalArgumentException("More than 1 custom main process specified");
    }
}
