package defpackage;
/* compiled from: PG */
/* renamed from: crlq  reason: default package */
/* loaded from: classes5.dex */
public final class crlq<T> extends btrh<T> {
    public crlq(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        crlp crlpVar = (crlp) this.a;
        crqw crqwVar = ((cria) obj).a;
        if (crqwVar instanceof crre) {
            crre crreVar = (crre) crqwVar;
            crlpVar.b = new crln(crreVar.a.f, crreVar.c);
        }
    }
}
