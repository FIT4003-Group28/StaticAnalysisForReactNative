package defpackage;

import com.google.ar.core.Frame;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dvk  reason: default package */
/* loaded from: classes6.dex */
public final class dvk implements dtx {
    @dzsi
    private dtu a;
    private final bnvs b = new bnvs();
    private final ahrn c = new ahrn();
    private final float d;
    private final float e;
    private final int f;

    public dvk(int i, float f, float f2) {
        this.f = i;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.dtx
    public final void a(dtu dtuVar) {
        this.a = dtuVar;
    }

    @Override // defpackage.dtx
    public final float b() {
        return this.b.e();
    }

    @Override // defpackage.dtx
    public final float c() {
        return this.b.f();
    }

    @Override // defpackage.dtx
    public final float d() {
        return this.b.g();
    }

    @Override // defpackage.dtx
    public final float e() {
        return this.c.a;
    }

    @Override // defpackage.dtx
    public final float f() {
        return this.c.b;
    }

    @Override // defpackage.dtx
    public final float g() {
        return this.c.c;
    }

    @Override // defpackage.dtx
    public final float h() {
        return this.c.d;
    }

    @Override // defpackage.dtx
    public final boolean i(Session session, Frame frame, @dzsi dad dadVar, @dzsi arlb arlbVar, double d) {
        dtu dtuVar = this.a;
        boolean z = false;
        if (dtuVar == null) {
            return false;
        }
        if (this.f == 3) {
            dbeb dbebVar = new dbeb(((duu) dtuVar).a.j);
            bnvs bnvsVar = new bnvs(dbebVar.a, dbebVar.b, dbebVar.c);
            bnvsVar.a(this.e, bnvsVar.f(), bnvsVar.g());
            dtuVar.i(bnvsVar);
        }
        int i = this.f;
        if (i == 1 || i == 2) {
            z = true;
        }
        if (z) {
            bnvs bnvsVar2 = this.b;
            duu duuVar = (duu) dtuVar;
            dbeb dbebVar2 = new dbeb(duuVar.a.h);
            bnvsVar2.b(new bnvs(dbebVar2.a, dbebVar2.b, dbebVar2.c));
            ahrn ahrnVar = this.c;
            dbea dbeaVar = new dbea(duuVar.a.i);
            ahrnVar.m(new ahrn(dbeaVar.a, dbeaVar.b, dbeaVar.c, dbeaVar.d));
            if (this.f == 1) {
                bnvs bnvsVar3 = this.b;
                bnvsVar3.a(-this.d, bnvsVar3.f(), this.b.g());
            } else {
                bnvs bnvsVar4 = this.b;
                bnvsVar4.a(this.d, bnvsVar4.f(), this.b.g());
            }
        }
        return z;
    }
}
