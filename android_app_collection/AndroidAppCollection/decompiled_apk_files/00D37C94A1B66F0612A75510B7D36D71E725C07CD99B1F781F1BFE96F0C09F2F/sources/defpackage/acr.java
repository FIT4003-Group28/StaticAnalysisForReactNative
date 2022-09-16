package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acr  reason: default package */
/* loaded from: classes.dex */
public final class acr extends act implements Iterator {
    final /* synthetic */ acu a;
    private acq b;
    private boolean c = true;

    public acr(acu acuVar) {
        this.a = acuVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final Map.Entry next() {
        acq acqVar;
        if (this.c) {
            this.c = false;
            acqVar = this.a.b;
        } else {
            acq acqVar2 = this.b;
            acqVar = acqVar2 != null ? acqVar2.c : null;
        }
        this.b = acqVar;
        return this.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        acq acqVar = this.b;
        return (acqVar == null || acqVar.c == null) ? false : true;
    }

    @Override // defpackage.act
    public final void jD(acq acqVar) {
        acq acqVar2 = this.b;
        if (acqVar == acqVar2) {
            acq acqVar3 = acqVar2.d;
            this.b = acqVar3;
            this.c = acqVar3 == null;
        }
    }
}
