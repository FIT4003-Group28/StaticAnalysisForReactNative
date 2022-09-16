package defpackage;

import android.database.Cursor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aaiq  reason: default package */
/* loaded from: classes.dex */
final class aaiq extends aahw {
    private final aajb a;
    private final String b;
    private final aorw c;

    public aaiq(aajb aajbVar, String str, aorw aorwVar) {
        this.a = aajbVar;
        this.b = str;
        this.c = aorwVar;
    }

    @Override // defpackage.aahw
    public final void b(aaip aaipVar, vox voxVar, amuf amufVar) {
        amup b;
        if (!aajz.d(this.a.c(voxVar, this.b).d, this.c)) {
            return;
        }
        try {
            String str = this.b;
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(str);
            amvl amvlVar = new amvl();
            while (!arrayDeque.isEmpty()) {
                String str2 = (String) arrayDeque.remove();
                vou vouVar = new vou();
                vouVar.b("SELECT child_entity_key FROM entity_associations WHERE child_entity_key IN (SELECT DISTINCT child_entity_key FROM entity_associations WHERE parent_entity_key=?) GROUP BY child_entity_key HAVING COUNT(1) = 1");
                vouVar.c(str2);
                amvl amvlVar2 = new amvl();
                Cursor a = voxVar.a(vouVar.a());
                while (a.moveToNext()) {
                    amvlVar2.c(a.getString(0));
                }
                if (a != null) {
                    a.close();
                }
                arrayDeque.addAll(amvlVar2.g());
                voxVar.e("DELETE FROM entity_associations WHERE parent_entity_key=?", str2);
                amvlVar.c(str2);
            }
            amvn g = amvlVar.g();
            if (amufVar != null) {
                aajb aajbVar = this.a;
                if (g.isEmpty()) {
                    b = amyc.b;
                } else {
                    amum amumVar = new amum();
                    try {
                        Iterator<E> it = g.iterator();
                        vou a2 = aajb.a();
                        a2.b(" IN (?");
                        a2.c((String) it.next());
                        while (it.hasNext()) {
                            a2.b(",?");
                            a2.c((String) it.next());
                        }
                        a2.b(")");
                        Cursor a3 = voxVar.a(a2.a());
                        while (a3.moveToNext()) {
                            aakd d = aajbVar.d(a3);
                            aajj aajjVar = d.b;
                            aajjVar.getClass();
                            amumVar.f(aajjVar.d(), d);
                        }
                        b = amumVar.b();
                        if (a3 != null) {
                            a3.close();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw aahd.a(e, 3);
                    }
                }
                for (aakd aakdVar : b.values()) {
                    aajj aajjVar2 = aakdVar.b;
                    if (aajjVar2 != null) {
                        aajn a4 = aajp.a();
                        a4.c(aajjVar2.d());
                        a4.a = aajjVar2;
                        a4.d(aakdVar.c);
                        a4.b(aajk.a);
                        amufVar.h(a4.a());
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = g.iterator();
            sb.append("key IN(?");
            arrayList.add((String) it2.next());
            while (it2.hasNext()) {
                sb.append(", ?");
                arrayList.add((String) it2.next());
            }
            sb.append(")");
            String sb2 = sb.toString();
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            vox.c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 31);
            sb3.append("DELETE FROM ");
            sb3.append("entity_table");
            sb3.append(" WHERE ");
            sb3.append(sb2);
            amlp l = amna.l(sb3.toString());
            voxVar.b.delete("entity_table", sb2, strArr);
            l.close();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw aahd.c(e2, -1);
        }
    }
}
