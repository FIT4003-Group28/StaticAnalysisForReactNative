package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: vht  reason: default package */
/* loaded from: classes4.dex */
public final class vht {
    private static final Bundle k = new Bundle();
    public final List a = new ArrayList();
    protected final List b = new ArrayList();
    public vhs c;
    public vhs d;
    public vhs e;
    public vhs f;
    public vhs g;
    public vhs h;
    public vhs i;
    public vhs j;

    public vht() {
        new HashSet();
        Thread.currentThread().getId();
    }

    public static final String c(vif vifVar) {
        if (vifVar instanceof vvo) {
            if (vifVar instanceof vig) {
                return ((vig) vifVar).a();
            }
            return vifVar.getClass().getName();
        }
        return null;
    }

    public static final Bundle d(vif vifVar, Bundle bundle) {
        if (bundle != null) {
            String c = c(vifVar);
            return c != null ? bundle.getBundle(c) : k;
        }
        return null;
    }

    public final void a(vhs vhsVar) {
        this.b.remove(vhsVar);
    }

    public final void b(vhs vhsVar) {
        uwp.f();
        for (int i = 0; i < this.a.size(); i++) {
            vhsVar.a((vif) this.a.get(i));
        }
        this.b.add(vhsVar);
    }
}
