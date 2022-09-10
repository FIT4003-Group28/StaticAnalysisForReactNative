package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acnd  reason: default package */
/* loaded from: classes2.dex */
public final class acnd {
    public static <T extends cqkp> cqnf<T> a(cqlc<T, acmy> cqlcVar) {
        return cqjv.f(acnc.a, cqlcVar);
    }

    public static void b(View view, @dzsi View.OnAttachStateChangeListener onAttachStateChangeListener, @dzsi View.OnLayoutChangeListener onLayoutChangeListener) {
        View.OnAttachStateChangeListener onAttachStateChangeListener2 = (View.OnAttachStateChangeListener) view.getTag(R.id.on_attach_state_change_listener);
        if (onAttachStateChangeListener2 != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener2);
        }
        View.OnLayoutChangeListener onLayoutChangeListener2 = (View.OnLayoutChangeListener) view.getTag(R.id.on_layout_change_listener);
        if (onLayoutChangeListener2 != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener2);
        }
        view.setTag(R.id.on_attach_state_change_listener, onAttachStateChangeListener);
        view.setTag(R.id.on_layout_change_listener, onLayoutChangeListener);
        if (onAttachStateChangeListener != null) {
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (onLayoutChangeListener != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    public static void c(acmy acmyVar, cpny cpnyVar) {
        Integer num = acmyVar.n;
        if (num != null) {
            cpqe cpqeVar = new cpqe(num.intValue());
            cpnyVar.A.h = cppp.w(cpqeVar);
            cpqe cpqeVar2 = new cpqe(acmyVar.n.intValue());
            cpnyVar.A.g = cppp.w(cpqeVar2);
            cpqe cpqeVar3 = new cpqe(acmyVar.n.intValue());
            cpnyVar.A.d = cppp.w(cpqeVar3);
            cpqe cpqeVar4 = new cpqe(acmyVar.n.intValue());
            cpnyVar.A.c = cppp.w(cpqeVar4);
        }
        Integer num2 = acmyVar.o;
        if (num2 != null) {
            cpqe cpqeVar5 = new cpqe(num2.intValue());
            cpnyVar.A.a = cppp.w(cpqeVar5);
            cpqe cpqeVar6 = new cpqe(acmyVar.o.intValue());
            cpnyVar.A.b = cppp.w(cpqeVar6);
        }
        cprf d = cpnyVar.d("DEFAULT");
        d.b = true;
        cpsm cpsmVar = acmyVar.k;
        if (cpsmVar != null) {
            d.g.b(cpsmVar);
        }
        cprx<D> cprxVar = acmyVar.d;
        if (cprxVar != 0) {
            d.e = cprxVar;
        }
        cpru<D> cpruVar = acmyVar.e;
        if (cpruVar != 0) {
            d.f = cpruVar;
        }
        Object obj = acmyVar.f;
        if (obj != null) {
            d.i(obj);
        }
        Integer num3 = acmyVar.g;
        for (Map.Entry entry : acmyVar.c.entrySet()) {
            cpnyVar.o((cppu) entry.getValue(), (String) entry.getKey());
        }
        cprl c = cpnyVar.c();
        boolean z = acmyVar.h;
        c.setVisibility(8);
        cprj cprjVar = acmyVar.p;
        if (cprjVar != null) {
            c.i = cprjVar;
        }
        Integer num4 = acmyVar.i;
        Object obj2 = acmyVar.l;
        if (obj2 != null) {
            cpnyVar.setSelectionModel(obj2, acmyVar.m);
        }
        int i = acmyVar.j;
        d.c = i;
        d.d = i;
        for (Map.Entry entry2 : acmyVar.a.entrySet()) {
            cpnyVar.setRenderer((String) entry2.getKey(), (cpqf) entry2.getValue());
        }
        List<cpvi<T, D>> list = acmyVar.b;
        ((cpoj) cpnyVar).d = false;
        ArrayList b = cpwi.b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.add(((cpvi) it.next()).b());
        }
        for (cppq cppqVar : cpnyVar.r) {
            cppqVar.e();
        }
        cpvb.b(cpnyVar);
        cpnyVar.g(b);
    }

    public static void d(cpny<?, ?, ?> cpnyVar, acmy<?, ?> acmyVar) {
        for (String str : acmyVar.a.keySet()) {
            cpnyVar.setRenderer(str, null);
        }
        for (String str2 : acmyVar.c.keySet()) {
            cpnyVar.r(str2);
        }
    }
}
