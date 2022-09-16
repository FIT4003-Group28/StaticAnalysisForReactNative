package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afsp  reason: default package */
/* loaded from: classes.dex */
public final class afsp implements afta {
    static final int a = (int) TimeUnit.DAYS.toMinutes(1);
    private final aqlf b;

    public afsp(aqlf aqlfVar) {
        this.b = aqlfVar;
    }

    @Override // defpackage.afta
    public final int a() {
        int i;
        aqlf aqlfVar = this.b;
        if (aqlfVar == null || (i = aqlfVar.d) <= 0) {
            return 100;
        }
        return i;
    }

    @Override // defpackage.afta
    public final int b() {
        aqlf aqlfVar = this.b;
        if (aqlfVar == null) {
            return 720;
        }
        return aqlfVar.c;
    }

    @Override // defpackage.afta
    public final int c() {
        aqlf aqlfVar = this.b;
        if (aqlfVar == null || (aqlfVar.b & 4) == 0) {
            return 0;
        }
        aqlg aqlgVar = aqlfVar.e;
        if (aqlgVar == null) {
            aqlgVar = aqlg.a;
        }
        if (aqlgVar.b < 0) {
            return 0;
        }
        aqlg aqlgVar2 = this.b.e;
        if (aqlgVar2 == null) {
            aqlgVar2 = aqlg.a;
        }
        return aqlgVar2.b;
    }

    @Override // defpackage.afta
    public final int d() {
        aqlf aqlfVar = this.b;
        if (aqlfVar != null && (aqlfVar.b & 4) != 0) {
            aqlg aqlgVar = aqlfVar.e;
            if (aqlgVar == null) {
                aqlgVar = aqlg.a;
            }
            if (aqlgVar.c > 0) {
                aqlg aqlgVar2 = this.b.e;
                if (aqlgVar2 == null) {
                    aqlgVar2 = aqlg.a;
                }
                return aqlgVar2.c;
            }
        }
        return a;
    }
}
