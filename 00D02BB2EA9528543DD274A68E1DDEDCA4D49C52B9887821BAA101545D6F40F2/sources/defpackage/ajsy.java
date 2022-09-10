package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajsy  reason: default package */
/* loaded from: classes2.dex */
public final class ajsy implements btzi<dist, disz> {
    final /* synthetic */ btlu a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ List c;
    final /* synthetic */ ajsz d;
    final /* synthetic */ ajtc e;

    public ajsy(ajtc ajtcVar, btlu btluVar, ArrayList arrayList, List list, ajsz ajszVar) {
        this.e = ajtcVar;
        this.a = btluVar;
        this.b = arrayList;
        this.c = list;
        this.d = ajszVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dist> btzrVar, btzy btzyVar) {
        this.e.c(this.a, this.b);
        if (!this.d.a(1, null)) {
            if (!this.e.j.isEmpty()) {
                this.e.j.getLast().a();
            } else {
                this.e.d();
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dist> btzrVar, disz diszVar) {
        int i;
        ddho ddhoVar;
        this.e.c(this.a, this.b);
        dsrj<disy> dsrjVar = diszVar.a;
        if (dsrjVar.size() != this.c.size()) {
            bvoo.h("Unexpected response from server. Expected %d shares but received %d.", Integer.valueOf(this.c.size()), Integer.valueOf(dsrjVar.size()));
            this.e.c.u(this.a);
            i = 1;
        } else {
            i = 0;
        }
        final dccx F = dcdc.F();
        Iterator<disy> it = dsrjVar.iterator();
        int i2 = 0;
        boolean z = false;
        while (true) {
            int i3 = 4;
            int i4 = 3;
            if (!it.hasNext()) {
                break;
            }
            disy next = it.next();
            disx disxVar = disx.UNKNOWN_STATUS;
            disx b = disx.b(next.b);
            if (b == null) {
                b = disx.UNKNOWN_STATUS;
            }
            int ordinal = b.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    ajtc ajtcVar = this.e;
                    btlu btluVar = this.a;
                    dqzv dqzvVar = next.c;
                    if (dqzvVar == null) {
                        dqzvVar = dqzv.h;
                    }
                    ajtcVar.b(btluVar, dqzvVar);
                    F.g(next);
                    z = true;
                } else if (ordinal == 2) {
                    i2++;
                    ajtc ajtcVar2 = this.e;
                    btlu btluVar2 = this.a;
                    dqzv dqzvVar2 = next.c;
                    if (dqzvVar2 == null) {
                        dqzvVar2 = dqzv.h;
                    }
                    ajtcVar2.b(btluVar2, dqzvVar2);
                } else if (ordinal != 3) {
                    if (ordinal == 4) {
                        if (this.c.size() != 1) {
                            i4 = 1;
                        }
                        i = i4;
                    } else if (ordinal == 5) {
                        if (this.c.size() != 1) {
                            i3 = 1;
                        }
                        i = i3;
                    }
                }
            }
            i = 1;
        }
        if (this.c.size() == i2) {
            i = 2;
        }
        if (i == 0) {
            aigj aigjVar = this.e.f;
            Iterable<PersonId> o = dcft.o(dsrjVar, ajsw.a);
            aigjVar.a(dtxu.f16do);
            boolean z2 = false;
            for (PersonId personId : o) {
                if (personId != null) {
                    if (personId.c != ahwj.TOKEN && !z2) {
                        aigjVar.d(dtxu.dF);
                        z2 = true;
                    }
                    int ordinal2 = personId.c.ordinal();
                    if (ordinal2 == 0) {
                        ddhoVar = dtxu.dq;
                    } else if (ordinal2 == 1) {
                        ddhoVar = dtxu.dG;
                    } else if (ordinal2 == 2) {
                        ddhoVar = dtxu.dp;
                    } else if (ordinal2 == 3) {
                        ddhoVar = dtxu.dr;
                    } else if (ordinal2 == 4) {
                        bvoo.h("Santa shouldn't be here", new Object[0]);
                    }
                    aigjVar.d(ddhoVar);
                }
            }
            aigjVar.d(dtxu.dH);
        }
        ajtc ajtcVar3 = this.e;
        if (!z) {
            ajtcVar3.a(i, F.f(), this.d);
            return;
        }
        final dehn<ajne> b2 = ajtcVar3.g.b(this.a, dcep.B(dqym.SHARE_CREATION));
        final ajsz ajszVar = this.d;
        final int i5 = i;
        b2.Pk(new Runnable(this, b2, i5, F, ajszVar) { // from class: ajsx
            private final ajsy a;
            private final dehn b;
            private final int c;
            private final dccx d;
            private final ajsz e;

            {
                this.a = this;
                this.b = b2;
                this.c = i5;
                this.d = F;
                this.e = ajszVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajsy ajsyVar = this.a;
                dehn dehnVar = this.b;
                int i6 = this.c;
                dccx dccxVar = this.d;
                ajsz ajszVar2 = this.e;
                deha.s(dehnVar);
                ajsyVar.e.a(i6, dccxVar.f(), ajszVar2);
            }
        }, this.e.d);
    }
}
