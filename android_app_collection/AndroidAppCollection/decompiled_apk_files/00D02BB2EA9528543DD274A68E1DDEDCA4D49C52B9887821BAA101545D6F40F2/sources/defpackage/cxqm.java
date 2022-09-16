package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: cxqm  reason: default package */
/* loaded from: classes5.dex */
public final class cxqm implements cxob {
    public final Context a;
    public cnjz b;

    public cxqm(Context context, cnjz cnjzVar) {
        this.a = context;
        this.b = cnjzVar;
    }

    private final void c(eayx eayxVar) {
        try {
            this.b.d(eayxVar.bS()).a();
        } catch (SQLiteException unused) {
        }
    }

    @Override // defpackage.cxob
    public final void a(cxnv cxnvVar) {
        Integer num;
        if (cxnvVar instanceof cxqr) {
            cxqr cxqrVar = (cxqr) cxnvVar;
            cxnx cxnxVar = cxqrVar.a;
            ddbr bZ = ddbs.f.bZ();
            for (cxoc cxocVar : cxnxVar.b.a) {
                if ((((ddbs) bZ.b).a & 1) == 0) {
                    int i = cxocVar.a.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddbs ddbsVar = (ddbs) bZ.b;
                    ddbsVar.a |= 1;
                    ddbsVar.b = i;
                } else {
                    int i2 = cxocVar.a.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddbs ddbsVar2 = (ddbs) bZ.b;
                    dsrf dsrfVar = ddbsVar2.d;
                    if (!dsrfVar.a()) {
                        ddbsVar2.d = dsqw.cg(dsrfVar);
                    }
                    ddbsVar2.d.h(i2);
                }
                if ((((ddbs) bZ.b).a & 2) == 0 && (cxocVar instanceof czhc) && (num = ((czhc) cxocVar).b) != null) {
                    int intValue = num.intValue();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddbs ddbsVar3 = (ddbs) bZ.b;
                    ddbsVar3.a |= 2;
                    ddbsVar3.c = intValue;
                }
            }
            int i3 = cxnxVar.a;
            if (i3 != -1) {
                deaf b = deaf.b(i3);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddbs ddbsVar4 = (ddbs) bZ.b;
                ddbsVar4.e = b.Q;
                ddbsVar4.a |= 4;
            }
            eazn bZ2 = eazo.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazo eazoVar = (eazo) bZ2.b;
            ddbs bK = bZ.bK();
            bK.getClass();
            eazoVar.b = bK;
            eazoVar.a |= 1;
            cxoc cxocVar2 = cxqrVar.a.b.a.get(0);
            if (cxocVar2 instanceof czhc) {
                czhc czhcVar = (czhc) cxocVar2;
                if (!TextUtils.isEmpty(null)) {
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    eazo eazoVar2 = (eazo) bZ2.b;
                    throw null;
                }
            }
            boolean z = cxqrVar.c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazo eazoVar3 = (eazo) bZ2.b;
            eazoVar3.a |= 4;
            eazoVar3.c = z;
            eayw bZ3 = eayx.e.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eayx eayxVar = (eayx) bZ3.b;
            eazo bK2 = bZ2.bK();
            bK2.getClass();
            eayxVar.b = bK2;
            eayxVar.a |= 1;
            eayu eayuVar = cxqrVar.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eayx eayxVar2 = (eayx) bZ3.b;
            eayuVar.getClass();
            eayxVar2.d = eayuVar;
            eayxVar2.a |= 4;
            c(bZ3.bK());
        } else if (cxnvVar instanceof cxqq) {
            cxqq cxqqVar = (cxqq) cxnvVar;
            eayw bZ4 = eayx.e.bZ();
            eaze eazeVar = cxqqVar.a;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            eayx eayxVar3 = (eayx) bZ4.b;
            eazeVar.getClass();
            eayxVar3.c = eazeVar;
            int i4 = eayxVar3.a | 2;
            eayxVar3.a = i4;
            eayu eayuVar2 = cxqqVar.b;
            eayuVar2.getClass();
            eayxVar3.d = eayuVar2;
            eayxVar3.a = i4 | 4;
            c(bZ4.bK());
        }
    }

    @Override // defpackage.cxob
    public final void b() {
    }
}
