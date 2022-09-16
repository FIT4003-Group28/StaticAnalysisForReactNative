package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: xdu  reason: default package */
/* loaded from: classes4.dex */
public final class xdu {
    public final String a;
    public final ampr b;
    public final int c;
    public final amuk d;
    public final amuk e;
    public final amuk f;
    public final xac g;

    public xdu(String str, ampr amprVar, int i, amuk amukVar, amuk amukVar2, amuk amukVar3, xac xacVar) {
        if (str != null) {
            this.a = str;
            this.b = amprVar;
            this.c = i;
            if (amukVar != null) {
                this.d = amukVar;
                if (amukVar2 != null) {
                    this.e = amukVar2;
                    if (amukVar3 != null) {
                        this.f = amukVar3;
                        this.g = xacVar;
                        return;
                    }
                    throw new NullPointerException("Null slotExpirationTriggers");
                }
                throw new NullPointerException("Null slotFulfillmentTriggers");
            }
            throw new NullPointerException("Null slotEntryTriggers");
        }
        throw new NullPointerException("Null slotId");
    }

    public static xdu b(String str, apcd apcdVar, int i, xac xacVar) {
        return new xdu(str, ampr.a(apcdVar, 1), i, amuk.q(), amuk.q(), amuk.q(), xacVar);
    }

    public static xdu i(String str, apcd apcdVar, int i, xac xacVar) {
        return new xdu(str, ampr.a(apcdVar, Integer.valueOf(i)), 3, amuk.q(), amuk.q(), amuk.q(), xacVar);
    }

    public static xdu j(String str, apcd apcdVar, amuk amukVar, amuk amukVar2, amuk amukVar3, xac xacVar) {
        return new xdu(str, ampr.a(apcdVar, 1), 1, amukVar, amukVar2, amukVar3, xacVar);
    }

    public final int a() {
        return ((Integer) this.b.b).intValue();
    }

    public final apcd c() {
        return (apcd) this.b.a;
    }

    public final Object d(Class cls) {
        return this.g.c(cls);
    }

    public final boolean e(Class cls) {
        return this.g.d(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xdu)) {
            return false;
        }
        xdu xduVar = (xdu) obj;
        return TextUtils.equals(xduVar.a, this.a) && akzj.f(xduVar.b, this.b) && xduVar.c == this.c && akzj.f(xduVar.d, this.d) && akzj.f(xduVar.e, this.e) && akzj.f(xduVar.f, this.f) && akzj.f(xduVar.g, this.g);
    }

    public final boolean f(Class... clsArr) {
        for (Class cls : Arrays.asList(clsArr)) {
            if (!e(cls)) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(apcd apcdVar, List list) {
        if (apcdVar != c()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.g.d((Class) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(apcd apcdVar, Class... clsArr) {
        return g(apcdVar, Arrays.asList(clsArr));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        return "Slot[slotType=" + c().name() + ", slotPhysicalPosition=" + a() + ", managerLayer=" + this.c + ", slotEntryTriggers=" + this.d + ", slotFulfillmentTriggers=" + this.e + ", slotExpirationTriggers=" + this.f + ", clientMetadata=" + this.g + "]";
    }

    public xdu() {
    }
}
