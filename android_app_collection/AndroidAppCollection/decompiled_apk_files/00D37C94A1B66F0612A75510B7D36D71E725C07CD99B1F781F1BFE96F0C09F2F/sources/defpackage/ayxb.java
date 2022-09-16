package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: ayxb  reason: default package */
/* loaded from: classes2.dex */
public final class ayxb extends ayua {
    final ayqe c;
    final int d;

    public ayxb(aynx aynxVar, ayqe ayqeVar, int i) {
        super(aynxVar);
        this.c = ayqeVar;
        this.d = i;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        try {
            this.b.ac(new aywz(bameVar, this.c, this.d, new ConcurrentHashMap()));
        } catch (Exception e) {
            bapv.j(e);
            bameVar.f(azok.a);
            bameVar.b(e);
        }
    }
}
