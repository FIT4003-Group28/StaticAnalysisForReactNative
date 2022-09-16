package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: fqo  reason: default package */
/* loaded from: classes3.dex */
public final class fqo implements frt {
    public View a;
    private final LinkedList b = new LinkedList();

    @Override // defpackage.frt
    public final View a() {
        return this.a;
    }

    @Override // defpackage.frt
    public final void b(frs frsVar) {
        if (d()) {
            frsVar.a(this.a);
        } else {
            this.b.add(frsVar);
        }
    }

    public final void c(View view) {
        this.a = view;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((frs) it.next()).a(view);
        }
        this.b.clear();
    }

    @Override // defpackage.frt
    public final boolean d() {
        return this.a != null;
    }
}
