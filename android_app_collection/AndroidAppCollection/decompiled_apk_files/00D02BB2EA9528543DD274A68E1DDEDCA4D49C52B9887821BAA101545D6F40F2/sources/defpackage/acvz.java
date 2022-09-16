package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: acvz  reason: default package */
/* loaded from: classes2.dex */
public class acvz implements acvw {
    private final Activity a;
    private final dxio<afha> b;
    private final dxio<axwy> d;
    private final ixw f;
    private final List<acvx> c = new ArrayList();
    private boolean e = false;

    public acvz(Activity activity, dxio<afha> dxioVar, dxio<axwy> dxioVar2) {
        this.a = activity;
        this.b = dxioVar;
        this.d = dxioVar2;
        ixw ixwVar = new ixw();
        ixwVar.a = activity.getString(R.string.TOP_LISTS_MORE_LISTS_LINK);
        ixwVar.c = true;
        ixwVar.f = cjtd.a(dtxy.no);
        ixwVar.d = this;
        this.f = ixwVar;
    }

    @Override // defpackage.acvw
    public List<acvx> b() {
        return this.c;
    }

    @Override // defpackage.acvw
    public Boolean c() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.acvw
    public jbf d() {
        return this.f.a();
    }

    public void e(dgmq dgmqVar, Runnable runnable) {
        this.c.clear();
        int i = 0;
        this.e = false;
        ArrayDeque arrayDeque = new ArrayDeque(dgmqVar.a);
        while (true) {
            if (i < 3) {
                if (arrayDeque.isEmpty()) {
                    break;
                }
                dgmo dgmoVar = (dgmo) arrayDeque.pop();
                this.c.add(new acwa(this.a, this.b, dgmoVar, this.d));
                if (!dgmoVar.e) {
                    i++;
                }
            } else {
                while (!arrayDeque.isEmpty() && !this.e) {
                    this.e = !((dgmo) arrayDeque.pop()).e;
                }
            }
        }
        this.f.e = runnable;
    }
}
