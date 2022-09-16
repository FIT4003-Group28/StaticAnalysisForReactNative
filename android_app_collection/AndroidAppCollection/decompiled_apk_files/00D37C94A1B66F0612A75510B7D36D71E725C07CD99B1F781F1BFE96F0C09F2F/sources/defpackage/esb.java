package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: esb  reason: default package */
/* loaded from: classes3.dex */
public final class esb implements aafl {
    public final yzj a;
    public final aafo b;
    public final acti c;
    private final abdq d;
    private final Executor e;
    private final dt f;
    private final aagi g;
    private final afvn h;

    public esb(abdq abdqVar, yzj yzjVar, aafo aafoVar, Executor executor, dt dtVar, aagi aagiVar, afvn afvnVar, acti actiVar) {
        abdqVar.getClass();
        this.d = abdqVar;
        yzjVar.getClass();
        this.a = yzjVar;
        aafoVar.getClass();
        this.b = aafoVar;
        executor.getClass();
        this.e = executor;
        dtVar.getClass();
        this.f = dtVar;
        aagiVar.getClass();
        this.g = aagiVar;
        afvnVar.getClass();
        this.h = afvnVar;
        this.c = actiVar;
    }

    public final void b(String str, avkb avkbVar) {
        if (str.isEmpty()) {
            return;
        }
        aagh a = this.g.a(this.h.c());
        str.getClass();
        aqxo.z(!str.isEmpty(), "key cannot be empty");
        aopa createBuilder = avkj.a.createBuilder();
        createBuilder.copyOnWrite();
        avkj avkjVar = (avkj) createBuilder.instance;
        avkjVar.b |= 1;
        avkjVar.c = str;
        avkg avkgVar = new avkg(createBuilder);
        aopa aopaVar = avkgVar.a;
        aopaVar.copyOnWrite();
        avkj avkjVar2 = (avkj) aopaVar.instance;
        avkjVar2.d = avkbVar.f;
        avkjVar2.b |= 2;
        avki b = avkgVar.b();
        aajs c = a.c();
        c.d(b);
        c.b().T();
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        avke avkeVar = (avke) apzgVar.qm(avkf.a);
        final ased asedVar = avkeVar.b;
        if (asedVar == null) {
            asedVar = ased.a;
        }
        abdq abdqVar = this.d;
        abdp abdpVar = new abdp(abdqVar.e, abdqVar.a.c(), asedVar);
        abdpVar.j(apzgVar.c);
        avkc avkcVar = avkeVar.c;
        if (avkcVar == null) {
            avkcVar = avkc.a;
        }
        final String str = avkcVar.e;
        b(str, avkb.TRANSCRIPT_SEARCH_STATE_VALUE_SEARCHING);
        dt dtVar = this.f;
        abdq abdqVar2 = this.d;
        ylx.n(dtVar, abdqVar2.b.b(abdpVar, this.e), new zdt() { // from class: esa
            @Override // defpackage.zdt
            public final void a(Object obj) {
                esb esbVar = esb.this;
                esbVar.b(str, avkb.TRANSCRIPT_SEARCH_STATE_VALUE_FAILED);
                esbVar.a.e((Throwable) obj);
            }
        }, new zdt() { // from class: erz
            @Override // defpackage.zdt
            public final void a(Object obj) {
                esb esbVar = esb.this;
                ased asedVar2 = asedVar;
                String str2 = str;
                asee aseeVar = (asee) obj;
                if (aseeVar != null && !aseeVar.c.isEmpty()) {
                    esbVar.b.b(aseeVar.c);
                }
                if (asedVar2.e.isEmpty()) {
                    esbVar.b(str2, avkb.TRANSCRIPT_SEARCH_STATE_VALUE_NOT_SEARCHING);
                } else {
                    esbVar.b(str2, avkb.TRANSCRIPT_SEARCH_STATE_VALUE_COMPLETE);
                }
                if (aseeVar != null) {
                    ((acsx) esbVar.c).D(new acte(aseeVar.d));
                }
            }
        });
    }
}
