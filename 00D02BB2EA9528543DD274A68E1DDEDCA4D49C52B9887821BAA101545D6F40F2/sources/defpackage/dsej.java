package defpackage;
/* compiled from: PG */
/* renamed from: dsej  reason: default package */
/* loaded from: classes6.dex */
public final class dsej {
    public static void a(dseu dseuVar) {
        boolean z = true;
        if ((dseuVar.a & 1) != 0) {
            try {
                duhk duhkVar = dseuVar.b;
                if (duhkVar == null) {
                    duhkVar = duhk.e;
                }
                duhn.b(duhkVar);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("TimeOfDayRange start is invalid.", e);
            }
        }
        if ((dseuVar.a & 2) != 0) {
            try {
                duhk duhkVar2 = dseuVar.c;
                if (duhkVar2 == null) {
                    duhkVar2 = duhk.e;
                }
                duhn.b(duhkVar2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("TimeOfDayRange end is invalid.", e2);
            }
        }
        if ((dseuVar.a & 2) != 0) {
            duhk duhkVar3 = dseuVar.c;
            if (duhkVar3 == null) {
                duhkVar3 = duhk.e;
            }
            if (duhkVar3.equals(duhk.e)) {
                return;
            }
            duhk duhkVar4 = dseuVar.b;
            if (duhkVar4 == null) {
                duhkVar4 = duhk.e;
            }
            duhk duhkVar5 = dseuVar.c;
            if (duhkVar5 == null) {
                duhkVar5 = duhk.e;
            }
            if (duhn.a(duhkVar4, duhkVar5) > 0) {
                z = false;
            }
            duhk duhkVar6 = dseuVar.c;
            if (duhkVar6 == null) {
                duhkVar6 = duhk.e;
            }
            duhk duhkVar7 = dseuVar.b;
            if (duhkVar7 == null) {
                duhkVar7 = duhk.e;
            }
            dbsk.j(z, "TimeOfDayRange end (%s) must be greater than or equal to start (%s).", duhkVar6, duhkVar7);
        }
    }
}
