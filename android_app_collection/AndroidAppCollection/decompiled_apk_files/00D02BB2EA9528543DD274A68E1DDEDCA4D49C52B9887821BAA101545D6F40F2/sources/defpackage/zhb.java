package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: zhb  reason: default package */
/* loaded from: classes7.dex */
public class zhb implements zds {
    private final zds a;

    public zhb(cqhn cqhnVar, zds zdsVar) {
        this.a = zdsVar;
        cqkx.j(zdsVar, new cqhm(this) { // from class: zha
            private final zhb a;

            {
                this.a = this;
            }

            @Override // defpackage.cqhm
            public final void a() {
                cqkx.p(this.a);
            }
        });
    }

    @Override // defpackage.acoe
    public bbb E() {
        throw null;
    }

    @Override // defpackage.acoe
    public Integer Os() {
        throw null;
    }

    @Override // defpackage.acoe
    public acod Ot() {
        return this.a.Ot();
    }

    @Override // defpackage.zds
    public Boolean f() {
        return this.a.f();
    }

    @Override // defpackage.zds
    public List<zdr> g() {
        return this.a.g();
    }

    @Override // defpackage.zds
    public cqix<?> h() {
        throw null;
    }
}
