package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fy  reason: default package */
/* loaded from: classes3.dex */
public final class fy {
    public final ViewGroup a;
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    boolean d = false;

    public fy(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy b(ViewGroup viewGroup, eo eoVar) {
        eoVar.aj();
        return g(viewGroup);
    }

    public static void f(fx fxVar) {
        iy.E(fxVar.e, fxVar.a.O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fy g(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (!(tag instanceof fy)) {
            fy fyVar = new fy(viewGroup);
            viewGroup.setTag(R.id.special_effects_controller_view_tag, fyVar);
            return fyVar;
        }
        return (fy) tag;
    }

    public final fx a(dp dpVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fx fxVar = (fx) arrayList.get(i);
            if (fxVar.a.equals(dpVar) && !fxVar.c) {
                return fxVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        String str;
        String str2;
        boolean aj = lj.aj(this.a);
        synchronized (this.b) {
            d();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((fx) it.next()).b();
            }
            Iterator it2 = new ArrayList(this.c).iterator();
            while (it2.hasNext()) {
                fx fxVar = (fx) it2.next();
                if (eo.X(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (aj) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(fxVar);
                }
                fxVar.d();
            }
            Iterator it3 = new ArrayList(this.b).iterator();
            while (it3.hasNext()) {
                fx fxVar2 = (fx) it3.next();
                if (eo.X(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (aj) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(fxVar2);
                }
                fxVar2.d();
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fx fxVar = (fx) arrayList.get(i);
            if (fxVar.f == 2) {
                fxVar.f(iy.C(fxVar.a.K().getVisibility()), 1);
            }
        }
    }

    public final void e(int i, int i2, et etVar) {
        synchronized (this.b) {
            akl aklVar = new akl();
            fx a = a(etVar.b);
            if (a != null) {
                a.f(i, i2);
                return;
            }
            fv fvVar = new fv(i, i2, etVar, aklVar);
            this.b.add(fvVar);
            fvVar.c(new fu(this, fvVar, 1));
            fvVar.c(new fu(this, fvVar));
        }
    }
}
