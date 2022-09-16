package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aael  reason: default package */
/* loaded from: classes.dex */
public final class aael implements aaep {
    public final Context a;
    public final azqb b;
    public final azqb c;
    public final azqb d;
    public final ankw e;
    public final String f = "embedded_filegroups_embedded_datapush_proto.dat";
    public final Map g = new ConcurrentHashMap();
    public final azpm h = azpm.e();
    public final ankt i;
    private final ankt j;

    public aael(Context context, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, ankw ankwVar) {
        this.a = context;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = ankwVar;
        ankt qp = ankwVar.qp(new Callable() { // from class: aaee
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aael aaelVar = aael.this;
                try {
                    InputStream open = aaelVar.a.getAssets().open(aaelVar.f);
                    aoos b = aoos.b();
                    HashMap hashMap = new HashMap();
                    for (tpp tppVar : ((awln) aopi.parseFrom(awln.a, open, b)).b) {
                        hashMap.put(tppVar.c, new aaeu(aaelVar.a, tppVar, aaelVar.e, aaelVar.d));
                    }
                    return amup.j(hashMap);
                } catch (Exception unused) {
                    zep.l("Failed to initialize embedded FileGroups");
                    aqkb aqkbVar = aqkb.DATA_PUSH_CLIENT_EVENT_TYPE_EMBEDDED_FILE_GROUP_INIT_FAILED;
                    arrf a = arrh.a();
                    aqkc a2 = aqkd.a();
                    a2.copyOnWrite();
                    ((aqkd) a2.instance).j(aqkbVar);
                    a.copyOnWrite();
                    ((arrh) a.instance).cl((aqkd) a2.mo39build());
                    ((aaeo) aaelVar.d.get()).a.a((arrh) a.mo39build());
                    return amyc.b;
                }
            }
        });
        this.i = qp;
        tqf a = tqg.a();
        a.b(true);
        final ankt h = anii.h(anko.q(((trc) azqbVar.get()).b(a.a())), new aaeg(this, 1), ankwVar);
        ankt i = anhq.i(anko.q(anlz.m(h, qp).a(new Callable() { // from class: aaef
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aael aaelVar = aael.this;
                Map map = (Map) h.get();
                for (aaev aaevVar : ((Map) aaelVar.i.get()).values()) {
                    if (!map.containsKey(aaevVar.c())) {
                        map.put(aaevVar.c(), aaevVar);
                    }
                }
                return amup.j(map);
            }
        }, ankwVar)), Exception.class, new anir() { // from class: aaei
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                Exception exc = (Exception) obj;
                return aael.this.i;
            }
        }, ankwVar);
        this.j = i;
        anii.h(anko.q(i), new aaeg(this), ankwVar);
        ((trc) azqbVar.get()).e();
    }

    @Override // defpackage.aaed
    public final ayoi a() {
        return this.h.t(yps.p).I(new zwb(4)).B();
    }

    @Override // defpackage.aaen
    public final ankt b(final tpw tpwVar) {
        tqf a = tqg.a();
        a.b = ampq.j(tpwVar.c);
        return anii.i(anii.i(anii.i(((trc) this.b.get()).b(a.a()), new anir() { // from class: aaeh
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tpw tpwVar2 = tpw.this;
                amuk amukVar = (amuk) obj;
                int size = amukVar.size();
                for (int i = 0; i < size; i++) {
                    tpp tppVar = (tpp) amukVar.get(i);
                    if (tppVar.c.equals(tpwVar2.c)) {
                        int j = tqj.j(tppVar.g);
                        if (j == 0) {
                            j = 1;
                        }
                        if (j == 3) {
                            return anlz.o();
                        }
                        if (tppVar.f == tpwVar2.e && j == 2) {
                            return anlz.o();
                        }
                    }
                }
                return ankq.a;
            }
        }, this.e), new aaej(this, tpwVar), this.e), new aaej(this, tpwVar, 1), this.e);
    }
}
