package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sfn  reason: default package */
/* loaded from: classes4.dex */
public final class sfn implements sfk {
    private final sfm a;

    public sfn(Context context) {
        this.a = new sfm(context);
    }

    @Override // defpackage.sfk
    public final View a(List list) {
        this.a.b.clear();
        this.a.a = null;
        if (list.isEmpty()) {
            return this.a;
        }
        sfj sfjVar = (sfj) list.get(0);
        if (list.size() == 1) {
            this.a.a(sfjVar.c.toString(), sfjVar.d.toString(), sfjVar.e);
        } else {
            this.a.a = sfjVar.c.toString();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sfj sfjVar2 = (sfj) it.next();
                this.a.a(sfjVar2.a, sfjVar2.d.toString(), sfjVar2.e);
            }
        }
        return this.a;
    }
}
