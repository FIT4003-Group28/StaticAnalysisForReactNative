package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzui  reason: default package */
/* loaded from: classes6.dex */
public final class dzui implements Serializable, dzup {
    private final dzup a;
    private final dzum b;

    public dzui(dzup dzupVar, dzum dzumVar) {
        dzvx.c(dzupVar, "left");
        dzvx.c(dzumVar, "element");
        this.a = dzupVar;
        this.b = dzumVar;
    }

    private final int a() {
        int i = 2;
        dzui dzuiVar = this;
        while (true) {
            dzup dzupVar = dzuiVar.a;
            if (true != (dzupVar instanceof dzui)) {
                dzupVar = null;
            }
            dzuiVar = (dzui) dzupVar;
            if (dzuiVar != null) {
                i++;
            } else {
                return i;
            }
        }
    }

    private final boolean b(dzum dzumVar) {
        return dzvx.d(get(dzumVar.getKey()), dzumVar);
    }

    private final Object writeReplace() {
        int a = a();
        dzup[] dzupVarArr = new dzup[a];
        dzwd dzwdVar = new dzwd();
        dzwdVar.a = 0;
        fold(dztc.a, new dzuh(dzupVarArr, dzwdVar));
        if (dzwdVar.a != a) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return new dzuf(dzupVarArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dzui) {
                dzui dzuiVar = (dzui) obj;
                if (dzuiVar.a() == a()) {
                    dzui dzuiVar2 = this;
                    while (true) {
                        if (!dzuiVar.b(dzuiVar2.b)) {
                            break;
                        }
                        dzup dzupVar = dzuiVar2.a;
                        if (dzupVar instanceof dzui) {
                            dzuiVar2 = (dzui) dzupVar;
                        } else if (dzupVar != null) {
                            if (dzuiVar.b((dzum) dzupVar)) {
                                return true;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dzup
    public final <R> R fold(R r, dzvi<? super R, ? super dzum, ? extends R> dzviVar) {
        dzvx.c(dzviVar, "operation");
        return dzviVar.a((Object) this.a.fold(r, dzviVar), this.b);
    }

    @Override // defpackage.dzup
    public final <E extends dzum> E get(dzun<E> dzunVar) {
        dzvx.c(dzunVar, "key");
        dzui dzuiVar = this;
        while (true) {
            E e = (E) dzuiVar.b.get(dzunVar);
            if (e != null) {
                return e;
            }
            dzup dzupVar = dzuiVar.a;
            if (dzupVar instanceof dzui) {
                dzuiVar = (dzui) dzupVar;
            } else {
                return (E) dzupVar.get(dzunVar);
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.dzup
    public final dzup minusKey(dzun<?> dzunVar) {
        dzvx.c(dzunVar, "key");
        if (this.b.get(dzunVar) != null) {
            return this.a;
        }
        dzup minusKey = this.a.minusKey(dzunVar);
        return minusKey != this.a ? minusKey == dzuq.a ? this.b : new dzui(minusKey, this.b) : this;
    }

    @Override // defpackage.dzup
    public final dzup plus(dzup dzupVar) {
        dzvx.c(dzupVar, "context");
        return dzul.a(this, dzupVar);
    }

    public final String toString() {
        return "[" + ((String) fold("", dzug.a)) + "]";
    }
}
