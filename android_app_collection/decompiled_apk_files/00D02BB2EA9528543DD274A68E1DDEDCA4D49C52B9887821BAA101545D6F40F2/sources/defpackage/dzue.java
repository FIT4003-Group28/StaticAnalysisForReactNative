package defpackage;
/* compiled from: PG */
/* renamed from: dzue  reason: default package */
/* loaded from: classes6.dex */
public class dzue implements dzum {
    private final dzun<?> key;

    public dzue(dzun<?> dzunVar) {
        dzvx.c(dzunVar, "key");
        this.key = dzunVar;
    }

    @Override // defpackage.dzup
    public <R> R fold(R r, dzvi<? super R, ? super dzum, ? extends R> dzviVar) {
        dzvx.c(dzviVar, "operation");
        dzvx.c(dzviVar, "operation");
        return dzviVar.a(r, this);
    }

    @Override // defpackage.dzum, defpackage.dzup
    public <E extends dzum> E get(dzun<E> dzunVar) {
        dzvx.c(dzunVar, "key");
        dzvx.c(dzunVar, "key");
        if (dzvx.d(getKey(), dzunVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.dzum
    public dzun<?> getKey() {
        return this.key;
    }

    @Override // defpackage.dzup
    public dzup minusKey(dzun<?> dzunVar) {
        dzvx.c(dzunVar, "key");
        dzvx.c(dzunVar, "key");
        return dzvx.d(getKey(), dzunVar) ? dzuq.a : this;
    }

    @Override // defpackage.dzup
    public dzup plus(dzup dzupVar) {
        dzvx.c(dzupVar, "context");
        dzvx.c(dzupVar, "context");
        return dzul.a(this, dzupVar);
    }
}
