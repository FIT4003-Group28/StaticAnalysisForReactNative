package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnxu  reason: default package */
/* loaded from: classes3.dex */
public final class bnxu<T> extends btrh<T> {
    public bnxu(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bnxr bnxrVar = (bnxr) this.a;
        bxev bxevVar = (bxev) obj;
        synchronized (bnxrVar.a.a) {
            bnxs bnxsVar = bnxrVar.a;
            if (bnxsVar.f != null && bxevVar.b.equals(bnxsVar.e)) {
                bnxrVar.a.e = null;
                cpna cpnaVar = new cpna();
                ArrayList arrayList = new ArrayList();
                bnxrVar.a.d.clear();
                dcpe<bxmh> listIterator = bxevVar.c.listIterator();
                while (listIterator.hasNext()) {
                    bxmh next = listIterator.next();
                    dwjj dwjjVar = next.b;
                    if (dwjjVar == null) {
                        dwjjVar = dwjj.k;
                    }
                    dxbp dxbpVar = dwjjVar.b;
                    if (dxbpVar == null) {
                        dxbpVar = dxbp.x;
                    }
                    cpmv cpmvVar = new cpmv();
                    cpmvVar.a("");
                    cpmvVar.b("");
                    String str = dxbpVar.c;
                    if (str != null) {
                        cpmvVar.a = str;
                        cpmvVar.a(dxbpVar.d);
                        cpmvVar.b(dxbpVar.b);
                        String str2 = " suggestionMain";
                        if (cpmvVar.a != null) {
                            str2 = "";
                        }
                        if (cpmvVar.b == null) {
                            str2 = str2.concat(" suggestionDetail");
                        }
                        if (cpmvVar.c == null) {
                            str2 = String.valueOf(str2).concat(" suggestionSelected");
                        }
                        if (!str2.isEmpty()) {
                            String valueOf = String.valueOf(str2);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                        }
                        arrayList.add(new cpmw(cpmvVar.a, cpmvVar.b, cpmvVar.c));
                        dwjj dwjjVar2 = next.b;
                        if (dwjjVar2 == null) {
                            dwjjVar2 = dwjj.k;
                        }
                        dvzj dvzjVar = dwjjVar2.g;
                        if (dvzjVar == null) {
                            dvzjVar = dvzj.y;
                        }
                        bnxrVar.a.d.put(dxbpVar.b, new bnxz(dvzjVar.b, dvzjVar.c));
                    } else {
                        throw new NullPointerException("Null suggestionMain");
                    }
                }
                cpnaVar.a = arrayList;
                deig<cpna> deigVar = bnxrVar.a.f;
                dbsk.s(deigVar);
                deigVar.j(cpnaVar);
            }
        }
    }
}
