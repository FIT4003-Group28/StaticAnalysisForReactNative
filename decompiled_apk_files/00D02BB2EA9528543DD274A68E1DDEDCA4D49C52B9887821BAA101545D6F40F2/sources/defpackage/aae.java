package defpackage;

import android.view.View;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aae  reason: default package */
/* loaded from: classes.dex */
public final class aae {
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int k;
    boolean m;
    boolean a = true;
    int h = 0;
    int i = 0;
    boolean j = false;
    List<acl> l = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(aci aciVar) {
        int i = this.d;
        return i >= 0 && i < aciVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View b(aca acaVar) {
        List<acl> list = this.l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).a;
                abt abtVar = (abt) view.getLayoutParams();
                if (!abtVar.RU() && this.d == abtVar.RW()) {
                    d(view);
                    return view;
                }
            }
            return null;
        }
        View d = acaVar.d(this.d);
        this.d += this.e;
        return d;
    }

    public final void c() {
        d(null);
    }

    public final void d(View view) {
        int RW;
        int size = this.l.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            View view3 = this.l.get(i2).a;
            abt abtVar = (abt) view3.getLayoutParams();
            if (view3 != view && !abtVar.RU() && (RW = (abtVar.RW() - this.d) * this.e) >= 0 && RW < i) {
                if (RW == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i = RW;
                }
            }
            i2++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((abt) view2.getLayoutParams()).RW();
        }
    }
}
