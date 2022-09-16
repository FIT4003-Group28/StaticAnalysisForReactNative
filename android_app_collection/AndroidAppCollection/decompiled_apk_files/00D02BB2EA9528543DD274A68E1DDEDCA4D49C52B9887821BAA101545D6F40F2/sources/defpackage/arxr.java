package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: arxr  reason: default package */
/* loaded from: classes2.dex */
public class arxr implements aryh {
    private final arxt b;
    private final aryc c;
    @dzsi
    private arxa d;
    private final cqkn<aryd> f = new arxq(this);
    private final List<arxa> a = new ArrayList();
    private boolean e = false;

    public arxr(cqhn cqhnVar, arxt arxtVar, aryc arycVar) {
        this.b = arxtVar;
        this.c = arycVar;
    }

    public void a() {
        this.e = true;
        this.b.g();
    }

    public void b() {
        if (this.e) {
            this.b.h();
        }
        e(null);
        this.e = false;
        this.a.clear();
    }

    public void c(@dzsi arxa arxaVar, List<arxa> list) {
        this.a.addAll(list);
        e(arxaVar);
    }

    public void d() {
        arxa arxaVar;
        if (!this.e || (arxaVar = this.d) == null) {
            return;
        }
        arxaVar.ai();
        this.d.ah();
    }

    public void e(@dzsi arxa arxaVar) {
        arxa arxaVar2 = this.d;
        if (arxaVar2 == arxaVar) {
            return;
        }
        if (arxaVar2 != null) {
            arxaVar2.J(false);
            if (this.e) {
                this.d.ai();
            }
        }
        if (arxaVar != null) {
            this.c.b(arxaVar.w(), null);
            arxaVar.J(true);
            if (this.e) {
                arxaVar.ah();
            }
        }
        this.d = arxaVar;
        this.b.i(arxaVar);
        cqkx.p(this);
    }

    @Override // defpackage.aryh
    @dzsi
    public aryd f() {
        return this.d;
    }

    @Override // defpackage.aryh
    @dzsi
    public aryf g() {
        return this.d;
    }

    @Override // defpackage.aryh
    public List<aryd> h() {
        return new ArrayList(this.a);
    }

    @Override // defpackage.aryh
    /* renamed from: i */
    public arxt l() {
        return this.b;
    }

    @Override // defpackage.aryh
    public Boolean j() {
        boolean z = true;
        if (this.a.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public cqkn<aryd> k() {
        return this.f;
    }
}
