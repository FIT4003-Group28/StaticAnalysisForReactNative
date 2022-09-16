package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acs  reason: default package */
/* loaded from: classes.dex */
public abstract class acs extends act implements Iterator {
    acq a;
    acq b;

    public acs(acq acqVar, acq acqVar2) {
        this.a = acqVar2;
        this.b = acqVar;
    }

    private final acq d() {
        acq acqVar = this.b;
        acq acqVar2 = this.a;
        if (acqVar == acqVar2 || acqVar2 == null) {
            return null;
        }
        return b(acqVar);
    }

    public abstract acq a(acq acqVar);

    public abstract acq b(acq acqVar);

    @Override // java.util.Iterator
    /* renamed from: c */
    public final Map.Entry next() {
        acq acqVar = this.b;
        this.b = d();
        return acqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // defpackage.act
    public final void jD(acq acqVar) {
        if (this.a == acqVar && acqVar == this.b) {
            this.b = null;
            this.a = null;
        }
        acq acqVar2 = this.a;
        if (acqVar2 == acqVar) {
            this.a = a(acqVar2);
        }
        if (this.b == acqVar) {
            this.b = d();
        }
    }
}
