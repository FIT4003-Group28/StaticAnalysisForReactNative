package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aaip  reason: default package */
/* loaded from: classes.dex */
public final class aaip {
    public final amvn a;
    public final amvb b;
    public final vno c;
    boolean d = false;
    private aake e;

    public aaip(vno vnoVar, Set set, aake aakeVar) {
        this.c = vnoVar;
        this.a = amvn.p(set);
        this.e = aakeVar;
        amsq e = amsq.e();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            aahn aahnVar = (aahn) it.next();
            arey.C(aahnVar.b, aahnVar, e);
        }
        this.b = arey.B(e);
    }

    public static vot a(aahn aahnVar, aajj aajjVar, aajk aajkVar) {
        vou vouVar = new vou();
        vouVar.b("REPLACE INTO ");
        aahnVar.b(vouVar);
        vouVar.b(" VALUES(?");
        for (int i = 0; i < ((amxx) aahnVar.c).c; i++) {
            vouVar.b(", ?");
        }
        vouVar.b(")");
        vouVar.c(aajjVar.d());
        amuk amukVar = aahnVar.c;
        int i2 = ((amxx) amukVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            aaho aahoVar = (aaho) amukVar.get(i3);
            aahoVar.c(vouVar, aahoVar.b(aajjVar, aajkVar));
        }
        return vouVar.a();
    }

    public final synchronized void b(vox voxVar) {
        aajk aajkVar;
        amvn amvnVar;
        amvn g;
        if (this.d) {
            return;
        }
        amvn amvnVar2 = this.a;
        amum h = amup.h();
        amzs it = amvnVar2.iterator();
        while (it.hasNext()) {
            aahn aahnVar = (aahn) it.next();
            h.f(aahnVar.a, aahnVar);
        }
        amup b = h.b();
        amvn amvnVar3 = this.a;
        amum h2 = amup.h();
        amzs it2 = amvnVar3.iterator();
        while (it2.hasNext()) {
            amuk amukVar = ((aahn) it2.next()).d;
            if (((amxx) amukVar).c > 0) {
                aahp aahpVar = (aahp) amukVar.get(0);
                throw null;
            }
        }
        amup b2 = h2.b();
        amvn amvnVar4 = this.a;
        amum amumVar = new amum();
        amzs it3 = amvnVar4.iterator();
        while (it3.hasNext()) {
            aahn aahnVar2 = (aahn) it3.next();
            String str = aahnVar2.a;
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(aahnVar2.a);
            sb.append(" (entity_key TEXT PRIMARY KEY REFERENCES entity_table(key) ON DELETE CASCADE");
            amuk amukVar2 = aahnVar2.c;
            int i = ((amxx) amukVar2).c;
            for (int i2 = 0; i2 < i; i2++) {
                aaho aahoVar = (aaho) amukVar2.get(i2);
                sb.append(", ");
                sb.append(aahoVar.a);
                sb.append(" ");
                int i3 = aahoVar.b;
                sb.append((Object) (i3 != 1 ? i3 != 2 ? "TEXT" : "REAL" : "INT"));
            }
            sb.append(")");
            String sb2 = sb.toString();
            if (aahnVar2.d.isEmpty()) {
                g = amyg.a;
            } else {
                amvl amvlVar = new amvl();
                amuk amukVar3 = aahnVar2.d;
                if (((amxx) amukVar3).c <= 0) {
                    g = amvlVar.g();
                } else {
                    aahp aahpVar2 = (aahp) amukVar3.get(0);
                    throw null;
                }
            }
            amumVar.f(str, aaio.a(str, sb2, g));
        }
        amup b3 = amumVar.b();
        HashMap hashMap = new HashMap();
        amuf amufVar = new amuf();
        int i4 = 0;
        Cursor b4 = voxVar.b("SELECT name, type, sql, tbl_name FROM sqlite_master WHERE sql NOT NULL", new String[0]);
        while (b4.moveToNext()) {
            amufVar.h(new aain(b4.getString(i4), b4.getString(1), b4.getString(2), b4.getString(3)));
            i4 = 0;
        }
        if (b4 != null) {
            b4.close();
        }
        amuk g2 = amufVar.g();
        amry u = amry.u();
        int i5 = ((amxx) g2).c;
        for (int i6 = 0; i6 < i5; i6++) {
            aain aainVar = (aain) g2.get(i6);
            if (aainVar.b.equals("index") && aainVar.a.startsWith("IDXQT_")) {
                u.p(aainVar.d, new aaim(aainVar.a, aainVar.c));
            }
        }
        int i7 = ((amxx) g2).c;
        for (int i8 = 0; i8 < i7; i8++) {
            aain aainVar2 = (aain) g2.get(i8);
            if (aainVar2.b.equals("table") && aainVar2.a.startsWith("QT_")) {
                Collection collection = (Collection) u.r().get(aainVar2.a);
                String str2 = aainVar2.a;
                String str3 = aainVar2.c;
                if (collection == null) {
                    amvnVar = amyg.a;
                } else {
                    amvnVar = amvn.p(collection);
                }
                if (hashMap.put(str2, aaio.a(str2, str3, amvnVar)) != null) {
                    String str4 = aainVar2.c;
                    throw new IllegalStateException(str4.length() != 0 ? "duplicate query table in db? ".concat(str4) : new String("duplicate query table in db? "));
                }
            }
        }
        amvl i9 = amvn.i();
        i9.j(b3.keySet());
        i9.j(hashMap.keySet());
        amvn g3 = i9.g();
        HashSet<String> hashSet = new HashSet();
        ArrayList<aahn> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        amzs it4 = g3.iterator();
        while (it4.hasNext()) {
            String str5 = (String) it4.next();
            aaio aaioVar = (aaio) b3.get(str5);
            aaio aaioVar2 = (aaio) hashMap.get(str5);
            if (aaioVar == null) {
                hashSet.add(str5);
            } else if (aaioVar2 == null) {
                aahn aahnVar3 = (aahn) b.get(str5);
                aahnVar3.getClass();
                arrayList.add(aahnVar3);
            } else if (aaioVar2.a.equals(aaioVar.a)) {
                amvn amvnVar5 = aaioVar2.b;
                amvn amvnVar6 = aaioVar.b;
                amuf amufVar2 = new amuf();
                amzs it5 = amyv.c(amvnVar5, amvnVar6).iterator();
                while (it5.hasNext()) {
                    amufVar2.h(((aaim) it5.next()).a);
                }
                arrayList2.addAll(amufVar2.g());
                amvn amvnVar7 = aaioVar2.b;
                amvn amvnVar8 = aaioVar.b;
                amvl amvlVar2 = new amvl();
                amzs it6 = amyv.c(amvnVar8, amvnVar7).iterator();
                while (it6.hasNext()) {
                    aahp aahpVar3 = (aahp) b2.get(((aaim) it6.next()).a);
                    aahpVar3.getClass();
                    amvlVar2.c(aahpVar3);
                }
                arrayList3.addAll(amvlVar2.g());
            } else {
                hashSet.add(str5);
                aahn aahnVar4 = (aahn) b.get(str5);
                aahnVar4.getClass();
                arrayList.add(aahnVar4);
            }
        }
        for (String str6 : hashSet) {
            vou vouVar = new vou();
            vouVar.b("DROP TABLE ");
            aais.a(vouVar, str6);
            voxVar.d(vouVar.a());
        }
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            vou vouVar2 = new vou();
            vouVar2.b("DROP INDEX ");
            aais.a(vouVar2, (String) arrayList2.get(i10));
            voxVar.d(vouVar2.a());
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            aahn aahnVar5 = (aahn) arrayList.get(i11);
            vou vouVar3 = new vou();
            vouVar3.b("CREATE TABLE ");
            aahnVar5.b(vouVar3);
            vouVar3.b(" (entity_key TEXT PRIMARY KEY REFERENCES entity_table(key) ON DELETE CASCADE");
            amuk amukVar4 = aahnVar5.c;
            int i12 = ((amxx) amukVar4).c;
            for (int i13 = 0; i13 < i12; i13++) {
                aaho aahoVar2 = (aaho) amukVar4.get(i13);
                vouVar3.b(", ");
                aahoVar2.a(vouVar3);
                vouVar3.b(" ");
                int i14 = aahoVar2.b - 1;
                if (i14 == 0) {
                    vouVar3.b("INT");
                } else if (i14 != 1) {
                    vouVar3.b("TEXT");
                } else {
                    vouVar3.b("REAL");
                }
            }
            vouVar3.b(")");
            voxVar.d(vouVar3.a());
            arrayList3.addAll(aahnVar5.d);
        }
        amsq e = amsq.e();
        for (aahn aahnVar6 : arrayList) {
            arey.C(aahnVar6.b, aahnVar6, e);
        }
        amzs it7 = ((amvb) arey.B(e)).b.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry = (Map.Entry) it7.next();
            long longValue = ((Long) ((aakk) this.e.a.get()).b.getOrDefault((Class) entry.getKey(), -2147483648L)).longValue();
            Collection<aahn> collection2 = (Collection) entry.getValue();
            int i15 = 0;
            Cursor b5 = voxVar.b("SELECT key, entity, metadata FROM entity_table WHERE data_type=?", Long.toString(longValue));
            while (b5.moveToNext()) {
                aajj a = this.e.a(b5.getString(i15), b5.getBlob(1));
                byte[] blob = b5.getBlob(2);
                String d = a.d();
                try {
                    aajkVar = aajk.a(blob);
                } catch (aopx unused) {
                    String valueOf = String.valueOf(d);
                    zep.b(valueOf.length() != 0 ? "QueryTableManager metadata read failure for ".concat(valueOf) : new String("QueryTableManager metadata read failure for "));
                    aajkVar = aajk.a;
                }
                for (aahn aahnVar7 : collection2) {
                    voxVar.d(a(aahnVar7, a, aajkVar));
                }
                i15 = 0;
            }
            if (b5 != null) {
                b5.close();
            }
        }
        if (arrayList3.size() > 0) {
            aahp aahpVar4 = (aahp) arrayList3.get(0);
            new vou().b("CREATE INDEX ");
            throw null;
        }
        this.d = true;
    }
}
