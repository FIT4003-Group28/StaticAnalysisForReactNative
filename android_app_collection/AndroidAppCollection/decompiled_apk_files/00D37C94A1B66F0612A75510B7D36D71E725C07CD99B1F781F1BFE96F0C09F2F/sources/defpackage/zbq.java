package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: zbq  reason: default package */
/* loaded from: classes4.dex */
public final class zbq implements View.OnTouchListener {
    private final List a = new ArrayList();
    private View b;
    private zbr c;

    public final void a(zbr zbrVar) {
        this.a.add(zbrVar);
    }

    public final void b(zbr zbrVar) {
        this.a.add(0, zbrVar);
    }

    public final void c(View view) {
        View view2 = this.b;
        if (view2 != null) {
            view2.setOnTouchListener(null);
        }
        for (zbr zbrVar : this.a) {
            zbrVar.c();
        }
        this.b = view;
        if (view != null) {
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        zbr zbrVar = this.c;
        zbr zbrVar2 = null;
        if (zbrVar != null) {
            z = zbrVar.nu() && this.c.d(view, motionEvent);
            if (!z) {
                zbr zbrVar3 = this.c;
                this.c = null;
                zbrVar2 = zbrVar3;
            }
        } else {
            z = false;
        }
        Iterator it = this.a.iterator();
        while (!z) {
            if (!it.hasNext()) {
                return this.a.size() > 0 && motionEvent.getActionMasked() == 0;
            }
            zbr zbrVar4 = (zbr) it.next();
            if (zbrVar4 != zbrVar2) {
                z = zbrVar4.nu() && zbrVar4.d(view, motionEvent);
                if (z) {
                    this.c = zbrVar4;
                    for (zbr zbrVar5 : this.a) {
                        if (zbrVar5 != zbrVar4) {
                            zbrVar5.c();
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }
}
