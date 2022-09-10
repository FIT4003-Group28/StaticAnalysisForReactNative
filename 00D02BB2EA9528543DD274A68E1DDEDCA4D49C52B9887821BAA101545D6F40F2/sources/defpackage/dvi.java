package defpackage;

import com.google.ar.core.Pose;
/* compiled from: PG */
/* renamed from: dvi  reason: default package */
/* loaded from: classes6.dex */
public abstract class dvi implements dtx {
    @dzsi
    private dtu a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bnvs m(Pose pose) {
        return new bnvs(pose.tx(), pose.ty(), pose.tz());
    }

    @Override // defpackage.dtx
    public final void a(dtu dtuVar) {
        dbsk.l(this.a == null);
        this.a = dtuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bnvs k() {
        dtu dtuVar = this.a;
        dbsk.s(dtuVar);
        dtw a = dtuVar.a();
        if (a instanceof dtu) {
            return ((dtu) a).d();
        }
        return new bnvs(0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ahrn l() {
        dtu dtuVar = this.a;
        dbsk.s(dtuVar);
        dtw a = dtuVar.a();
        if (a instanceof dtu) {
            return ((dtu) a).e();
        }
        return new ahrn();
    }
}
