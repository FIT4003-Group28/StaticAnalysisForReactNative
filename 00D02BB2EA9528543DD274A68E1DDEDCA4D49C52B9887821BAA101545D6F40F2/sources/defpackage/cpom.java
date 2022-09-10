package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
/* compiled from: PG */
/* renamed from: cpom  reason: default package */
/* loaded from: classes5.dex */
final class cpom extends cppq {
    final /* synthetic */ cpor a;

    public cpom(cpor cporVar) {
        this.a = cporVar;
    }

    @Override // defpackage.cppq
    public final void b() {
        Boolean bool = (Boolean) this.a.b.k(cpqc.a);
        if (bool == null || !bool.booleanValue()) {
            cpor cporVar = this.a;
            cpoj<T, D> cpojVar = cporVar.b;
            HashSet a = cpwm.a();
            if (cpojVar.n) {
                a.add(cpojVar.o);
                a.add(cpojVar.p);
            }
            for (int i = 0; i < cpojVar.getChildCount(); i++) {
                View childAt = cpojVar.getChildAt(i);
                if (childAt instanceof cpox) {
                    a.add((cpox) childAt);
                } else if (childAt.getContentDescription() != null && !childAt.getContentDescription().equals("")) {
                    a.add(new cppa(childAt));
                }
            }
            for (cppu cppuVar : cpojVar.q.values()) {
                if (cppuVar instanceof cpox) {
                    a.add((cpox) cppuVar);
                }
            }
            cporVar.c = cpwi.c(a);
            Collections.sort(this.a.c, cpow.a);
            cpor cporVar2 = this.a;
            cpoj<T, D> cpojVar2 = cporVar2.b;
            LinkedHashSet d = cpwm.d();
            for (int childCount = cpojVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt2 = cpojVar2.getChildAt(childCount);
                if (childAt2 instanceof cpoy) {
                    d.add((cpoy) childAt2);
                }
            }
            for (cppu cppuVar2 : cpojVar2.q.values()) {
                if (cppuVar2 instanceof cpoy) {
                    d.add((cpoy) cppuVar2);
                }
            }
            cporVar2.d = cpwi.c(d);
            cpor cporVar3 = this.a;
            cporVar3.j.clear();
            if (!cporVar3.c.isEmpty()) {
                cporVar3.j.add(cpoq.DESCRIBE);
            }
            int i2 = 0;
            for (cpoy cpoyVar : cporVar3.d) {
                i2 += cpoyVar.a().size();
            }
            if (i2 > 0) {
                cporVar3.j.add(cpoq.EXPLORE);
            }
            if (cporVar3.j.isEmpty()) {
                cporVar3.j.add(cpoq.NONE);
            }
            if (!cporVar3.j.contains(cporVar3.i)) {
                cpoq next = cporVar3.j.iterator().next();
                if (cporVar3.i == cpoq.EXPLORE) {
                    cporVar3.l = -1;
                } else if (next == cpoq.EXPLORE) {
                    cporVar3.l = -2;
                }
                cporVar3.i = next;
            }
            cpor cporVar4 = this.a;
            if (cporVar4.b.getContentDescription() != null) {
                cporVar4.k = cporVar4.b.getContentDescription().toString();
            } else if (cporVar4.j.contains(cpoq.DESCRIBE)) {
                cporVar4.k = cpou.b(cporVar4.c);
                if (cporVar4.j.contains(cpoq.EXPLORE)) {
                    String str = cporVar4.k;
                    String string = cporVar4.b.getContext().getString(R.string.aplosExploreModeAvailableAnnouncement);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
                    sb.append(str);
                    sb.append(" ");
                    sb.append(string);
                    cporVar4.k = sb.toString();
                }
            } else {
                cporVar4.k = "";
            }
            cpva a2 = cpvb.a(cporVar4.b);
            long currentTimeMillis = System.currentTimeMillis();
            long j = a2.b;
            a2.b = currentTimeMillis;
            if (j + 3000 <= currentTimeMillis) {
                cpvb.a.a();
            }
            cpor cporVar5 = this.a;
            cporVar5.m.set(0, 0, cporVar5.b.getWidth(), cporVar5.b.getHeight());
            int[] iArr = new int[2];
            cporVar5.b.getLocationInWindow(iArr);
            cporVar5.n.set(cporVar5.m);
            cporVar5.n.offset(iArr[0], iArr[1]);
            cpou.a(this.a.b);
        }
    }
}
