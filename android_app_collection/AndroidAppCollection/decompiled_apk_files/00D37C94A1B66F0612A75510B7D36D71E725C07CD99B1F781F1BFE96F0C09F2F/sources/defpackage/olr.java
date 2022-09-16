package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate;
/* compiled from: PG */
/* renamed from: olr  reason: default package */
/* loaded from: classes3.dex */
public final class olr {
    public final gbq a;
    public final olc b;
    public amvn c = amyg.a;

    public olr(final gbq gbqVar, olc olcVar) {
        this.a = gbqVar;
        this.b = olcVar;
        gbqVar.j(new gbl() { // from class: old
            @Override // defpackage.gbl
            public final void pr(int i, int i2) {
                olr olrVar = olr.this;
                gbq gbqVar2 = gbqVar;
                if (!olrVar.c(i).isPresent()) {
                    gbqVar2.p(i);
                }
            }
        });
    }

    public static ayoi a() {
        azgk azgkVar = new azgk(nti.h);
        azqc.i();
        return azgkVar;
    }

    public final Optional b(Predicate predicate) {
        return Collection.EL.stream(this.c).filter(predicate).findFirst();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional c(int i) {
        return b(new olk(i, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional d(String str) {
        if (str.isEmpty()) {
            return Optional.empty();
        }
        return b(new oll(str));
    }
}
