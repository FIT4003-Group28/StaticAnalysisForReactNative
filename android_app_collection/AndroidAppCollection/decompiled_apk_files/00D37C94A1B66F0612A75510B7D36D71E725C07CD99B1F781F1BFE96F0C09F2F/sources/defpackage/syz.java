package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: syz  reason: default package */
/* loaded from: classes4.dex */
final class syz implements tei {
    private static final amvn a = amvn.w(224886694, 287553821, Integer.valueOf(awqj.b.a()), Integer.valueOf(awoe.b.a()), 316055719, 268941992, 258411896, 338763089);
    private final SparseArray b = new SparseArray();
    private final SparseArray c = new SparseArray();
    private final Map d;
    private final amvn e;
    private final teb f;
    private final ampq g;

    public syz(Collection collection, Collection collection2, List list, teb tebVar, ampq ampqVar) {
        this.f = tebVar;
        this.g = ampqVar;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            tek tekVar = (tek) it.next();
            this.b.put(tekVar.a(), tekVar);
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            tek tekVar2 = (tek) it2.next();
            this.c.put(tekVar2.a(), tekVar2);
        }
        HashSet hashSet = new HashSet();
        amvl i = amvn.i();
        amuk amukVar = (amuk) list;
        amzt listIterator = amukVar.listIterator();
        while (listIterator.hasNext()) {
            int a2 = ((tej) listIterator.next()).a().a();
            Integer valueOf = Integer.valueOf(a2);
            if (!hashSet.add(valueOf)) {
                i.c(valueOf);
                StringBuilder sb = new StringBuilder(80);
                sb.append("Multiple property converters found and will be removed for extension ");
                sb.append(a2);
                tebVar.b(27, sb.toString());
            }
        }
        amvn g = i.g();
        this.e = g;
        amum amumVar = new amum();
        amzt listIterator2 = amukVar.listIterator();
        while (listIterator2.hasNext()) {
            tej tejVar = (tej) listIterator2.next();
            Integer valueOf2 = Integer.valueOf(tejVar.a().a());
            if (!g.contains(valueOf2)) {
                amumVar.f(valueOf2, tejVar);
            }
        }
        this.d = amumVar.b();
    }

    private static Collection c(cyv cyvVar, tda tdaVar, String str, aodt aodtVar, tdq tdqVar, SparseArray sparseArray, aodt aodtVar2, tcr tcrVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aodtVar.W(); i++) {
            aodtVar.aA(aodtVar2, i);
            if (aodtVar2.U() == 1) {
                tek tekVar = (tek) sparseArray.get(aodtVar2.T());
                if (tekVar != null) {
                    tekVar.c(cyvVar, tdaVar, str, tekVar.b(aodtVar2.V()), tdqVar, tcrVar);
                }
            } else if (aodtVar2.U() != 2) {
                hashSet.add(Integer.valueOf(aodtVar2.T()));
            }
        }
        return hashSet;
    }

    @Override // defpackage.tei
    public final void a(cyv cyvVar, tda tdaVar, String str, aodt aodtVar, tdq tdqVar, tcr tcrVar) {
        aoos b;
        if (aodtVar == null) {
            return;
        }
        aodt aodtVar2 = (aodt) tga.a.a();
        HashSet hashSet = new HashSet();
        hashSet.addAll(c(cyvVar, tdaVar, str, aodtVar, tdqVar, this.b, aodtVar2, tcrVar));
        hashSet.addAll(c(cyvVar, tdaVar, str, aodtVar, tdqVar, this.c, aodtVar2, tcrVar));
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < aodtVar.W(); i++) {
            aodtVar.aA(aodtVar2, i);
            int T = aodtVar2.T();
            if (aodtVar2.U() != 1) {
                if (aodtVar2.U() == 0) {
                    hashSet2.add(Integer.valueOf(T));
                } else {
                    Map map = this.d;
                    Integer valueOf = Integer.valueOf(T);
                    tej tejVar = (tej) map.get(valueOf);
                    if (tejVar == null) {
                        if (!a.contains(valueOf) && !((ampt) ((ampv) this.g).a).a(valueOf)) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("No proto converter found for extension ");
                            sb.append(T);
                            String sb2 = sb.toString();
                            if (this.e.contains(valueOf)) {
                                sb2 = String.valueOf(sb2).concat(" due to having duplicate converter bindings.");
                            }
                            this.f.c(27, sb2, tdaVar);
                        }
                    } else {
                        try {
                            ByteBuffer V = aodtVar2.V();
                            aorb parserForType = ((aopg) tejVar.a()).c.getParserForType();
                            if (T == 168774585) {
                                b = aoos.a();
                            } else {
                                b = aoos.b();
                            }
                            tejVar.c(cyvVar, tdaVar, str, tgo.h(V, parserForType, b), tdqVar, tcrVar);
                        } catch (aopx e) {
                            teb tebVar = this.f;
                            StringBuilder sb3 = new StringBuilder(89);
                            sb3.append("Failed to set PB Property Extension in PropertiesConverterFlat. Extension id: ");
                            sb3.append(T);
                            tebVar.a(26, sb3.toString(), tdaVar, e);
                        }
                    }
                }
            }
        }
        hashSet.addAll(hashSet2);
        if (hashSet.isEmpty()) {
            tga.a.b(aodtVar2);
        } else {
            String valueOf2 = String.valueOf(hashSet.toString());
            throw new ted(valueOf2.length() != 0 ? "Extensions with unknown format: ".concat(valueOf2) : new String("Extensions with unknown format: "));
        }
    }

    @Override // defpackage.tei
    public final void b(tdq tdqVar) {
        for (int i = 0; i < this.b.size(); i++) {
            ((tek) this.b.get(this.b.keyAt(i))).e(tdqVar);
        }
    }
}
