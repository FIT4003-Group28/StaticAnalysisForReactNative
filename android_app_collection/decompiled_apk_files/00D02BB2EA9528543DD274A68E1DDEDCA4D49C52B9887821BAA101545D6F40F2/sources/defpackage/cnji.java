package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cnji  reason: default package */
/* loaded from: classes.dex */
public final class cnji<T> {
    public static final void a(T t, String str, StringBuilder sb, cmzz cmzzVar) {
        dcdc f;
        View view = (View) t;
        sb.append(cmzz.a(view));
        if (!(view instanceof ViewGroup)) {
            f = dcdc.e();
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            dccx dccxVar = new dccx();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                dccxVar.g(viewGroup.getChildAt(i));
            }
            f = dccxVar.f();
        }
        Iterator<E> it = f.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            sb.append('\n');
            sb.append(str);
            if (it.hasNext()) {
                sb.append("├── ");
                a(next, String.valueOf(str).concat("│   "), sb, cmzzVar);
            } else {
                sb.append("└── ");
                a(next, String.valueOf(str).concat("    "), sb, cmzzVar);
            }
        }
    }
}
