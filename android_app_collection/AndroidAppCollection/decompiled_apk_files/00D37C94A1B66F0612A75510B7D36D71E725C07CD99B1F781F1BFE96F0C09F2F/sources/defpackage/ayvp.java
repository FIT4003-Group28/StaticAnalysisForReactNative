package defpackage;
/* compiled from: PG */
/* renamed from: ayvp  reason: default package */
/* loaded from: classes2.dex */
public final class ayvp extends ayua {
    final Object c;
    final boolean d;

    public ayvp(aynx aynxVar, Object obj, boolean z) {
        super(aynxVar);
        this.c = obj;
        this.d = z;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        this.b.ac(new ayvo(bameVar, this.c, this.d));
    }
}
