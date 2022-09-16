package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import com.google.ar.sceneform.ArSceneView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dut  reason: default package */
/* loaded from: classes6.dex */
public final class dut extends dbda {
    private final dtx x;
    private final dvd y;

    public dut(dvd dvdVar, dbcn dbcnVar, dtx dtxVar) {
        f(dbcnVar);
        this.y = dvdVar;
        this.x = dtxVar;
        b();
    }

    @Override // defpackage.dbda, defpackage.dbcm
    public final void a(dbci dbciVar) {
        arlb arlbVar;
        super.a(dbciVar);
        dbcs dbcsVar = this.e;
        if (dbcsVar == null) {
            return;
        }
        ArSceneView arSceneView = (ArSceneView) dbcsVar.b;
        dws dwsVar = this.y.g;
        dbsk.s(dwsVar);
        dtx dtxVar = this.x;
        Session session = arSceneView.a;
        dbsk.s(session);
        Frame frame = arSceneView.b;
        dbsk.s(frame);
        dad h = dwsVar.a().h();
        synchronized (dwsVar.a) {
            dbsk.s(dwsVar.b);
            arlbVar = dwsVar.b.h;
        }
        if (!dtxVar.i(session, frame, h, arlbVar, ((float) dbciVar.b) * 1.0E-9f)) {
            return;
        }
        b();
    }

    final void b() {
        dbeb dbebVar = new dbeb(this.x.b(), this.x.c(), this.x.d());
        dbea dbeaVar = new dbea(this.x.e(), this.x.f(), this.x.g(), this.x.h());
        super.n(dbebVar);
        super.o(dbeaVar);
    }
}
