package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ader  reason: default package */
/* loaded from: classes2.dex */
public class ader extends aczs implements adep {
    public final dxio<aaap> a;
    private boolean c = false;
    private String d = "";
    private String e = "";
    public String b = "";
    private String f = "";

    public ader(dxio<aaap> dxioVar, cqhn cqhnVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.adep
    public Boolean a() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.adep
    public String b() {
        return this.d;
    }

    @Override // defpackage.adep
    @dzsi
    public jic c() {
        if (!dbsj.d(this.f)) {
            return new jic(this.f, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
        }
        return null;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxl.in;
        b.g(this.e);
        return b.a();
    }

    @Override // defpackage.adep
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: adeq
            private final ader a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ader aderVar = this.a;
                if (dbsj.d(aderVar.b)) {
                    return;
                }
                aaan g = aaao.g();
                aaaj aaajVar = (aaaj) g;
                aaajVar.a = aderVar.b;
                aaajVar.b = dpuk.MAJOR_EVENT;
                g.c(true);
                aderVar.a.a().i(g.a());
            }
        };
    }

    public void g(dbsg<dqrz> dbsgVar) {
        if (!dbsgVar.a()) {
            this.c = false;
            cqkx.p(this);
            return;
        }
        dqrz b = dbsgVar.b();
        if ((b.a & 4) != 0) {
            dqsl dqslVar = b.c;
            if (dqslVar == null) {
                dqslVar = dqsl.c;
            }
            if ((dqslVar.a & 1) != 0) {
                this.d = b.d;
                this.e = b.b;
                dqsl dqslVar2 = b.c;
                if (dqslVar2 == null) {
                    dqslVar2 = dqsl.c;
                }
                this.b = dqslVar2.b;
                this.f = b.e;
                this.c = true;
                cqkx.p(this);
                return;
            }
        }
        this.c = false;
        cqkx.p(this);
    }
}
