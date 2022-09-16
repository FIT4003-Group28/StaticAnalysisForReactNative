package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aopd  reason: default package */
/* loaded from: classes.dex */
public abstract class aopd extends aopi implements aope {
    public aoov l = aoov.a;

    private void a(aopg aopgVar) {
        if (aopgVar.a == mo50getDefaultInstanceForType()) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public aoov d() {
        aoov aoovVar = this.l;
        if (aoovVar.c) {
            this.l = aoovVar.clone();
        }
        return this.l;
    }

    @Override // defpackage.aope
    public final Object qm(aooq aooqVar) {
        aopg checkIsLite;
        checkIsLite = aopi.checkIsLite(aooqVar);
        a(checkIsLite);
        Object l = this.l.l(checkIsLite.d);
        if (l == null) {
            return checkIsLite.b;
        }
        aopf aopfVar = checkIsLite.d;
        if (aopfVar.d) {
            if (aopfVar.a() != aosk.ENUM) {
                return l;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (List) l) {
                arrayList.add(checkIsLite.c(obj));
            }
            return arrayList;
        }
        return checkIsLite.c(l);
    }

    @Override // defpackage.aope
    public final boolean qn(aooq aooqVar) {
        aopg checkIsLite;
        checkIsLite = aopi.checkIsLite(aooqVar);
        a(checkIsLite);
        aoov aoovVar = this.l;
        aopf aopfVar = checkIsLite.d;
        if (!aopfVar.d) {
            return aoovVar.b.get(aopfVar) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }
}
