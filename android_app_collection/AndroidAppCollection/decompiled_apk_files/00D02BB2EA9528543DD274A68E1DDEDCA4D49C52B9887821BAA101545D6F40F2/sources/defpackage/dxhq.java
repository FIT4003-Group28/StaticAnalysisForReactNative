package defpackage;
/* compiled from: PG */
/* renamed from: dxhq  reason: default package */
/* loaded from: classes6.dex */
public final class dxhq {
    public final dgsx a;
    public final dgtc b;

    public dxhq(dgsx dgsxVar, dgtc dgtcVar) {
        this.a = dgsxVar;
        this.b = dgtcVar;
    }

    public final <T> T a(Class<T> cls) {
        try {
            dgsx dgsxVar = this.a;
            dgtc dgtcVar = this.b;
            return (T) dgux.a(cls).cast(dgtcVar == null ? null : dgsxVar.i(new dgvi(dgtcVar), cls));
        } catch (RuntimeException e) {
            throw new dxho(e);
        }
    }
}
