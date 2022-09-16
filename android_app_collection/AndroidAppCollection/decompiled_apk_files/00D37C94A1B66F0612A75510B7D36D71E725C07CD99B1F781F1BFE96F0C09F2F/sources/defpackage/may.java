package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: may  reason: default package */
/* loaded from: classes3.dex */
public final class may extends ne {
    private final acti c;
    private final aafo d;
    private boolean f;
    public final Map a = new HashMap();
    public final Set b = new HashSet();
    private final Rect e = new Rect();

    public may(acti actiVar, aafo aafoVar) {
        this.c = actiVar;
        this.d = aafoVar;
    }

    public final void a(Object obj, View view, byte[] bArr, apzg apzgVar) {
        if (obj == null || view == null) {
            return;
        }
        if ((bArr == null && apzgVar == null) || this.b.contains(obj)) {
            return;
        }
        this.a.put(obj, new max(view, bArr, apzgVar));
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.f = true;
        } else if (i != 0) {
        } else {
            this.f = false;
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        boolean z = false;
        if (this.f || (i == 0 && i2 == 0)) {
            z = true;
        }
        if (this.a.isEmpty() || !z) {
            return;
        }
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            max maxVar = (max) entry.getValue();
            if (maxVar.a.isAttachedToWindow() && maxVar.a.getGlobalVisibleRect(this.e)) {
                it.remove();
                this.b.add(entry.getKey());
                byte[] bArr = maxVar.b;
                if (bArr != null) {
                    this.c.u(new acte(bArr), null);
                }
                apzg apzgVar = maxVar.c;
                if (apzgVar != null) {
                    this.d.c(apzgVar, null);
                }
            }
        }
    }
}
