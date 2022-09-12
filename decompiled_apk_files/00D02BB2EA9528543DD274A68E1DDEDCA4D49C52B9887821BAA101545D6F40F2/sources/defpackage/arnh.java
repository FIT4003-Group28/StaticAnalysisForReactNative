package defpackage;

import android.os.IBinder;
/* compiled from: PG */
/* renamed from: arnh  reason: default package */
/* loaded from: classes2.dex */
public final class arnh extends clas {
    private final arne a;

    public arnh(arne arneVar) {
        this.a = arneVar;
    }

    @Override // defpackage.clb, android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.clat
    public final void b() {
        this.a.b(7);
    }

    @Override // defpackage.clat
    public final void c(long j) {
        if (j == -3) {
            arne arneVar = this.a;
            arneVar.b(3);
            int b = arneVar.a.b();
            arneVar.e = 3;
            arneVar.d = b;
        } else if (j == -2) {
            arne arneVar2 = this.a;
            arneVar2.b(4);
            arneVar2.e = 2;
            arneVar2.a.a();
        } else if (j == -1) {
            arne arneVar3 = this.a;
            arneVar3.b(6);
            arneVar3.e = 7;
            arneVar3.a.a();
        } else {
            arne arneVar4 = this.a;
            arneVar4.b(5);
            if (arneVar4.e == 5) {
                ((ckcp) arneVar4.b.a().a(ckhi.bf)).a(j);
            } else {
                ((ckcp) arneVar4.b.a().a(ckhi.bg)).a(j);
                if (arneVar4.c.m(bvjk.jE, Boolean.FALSE.booleanValue())) {
                    int b2 = arneVar4.a.b();
                    arneVar4.e = 4;
                    arneVar4.d = b2;
                    return;
                }
            }
            arneVar4.e = 6;
            arneVar4.a.a();
        }
    }
}
