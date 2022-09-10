package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aryb  reason: default package */
/* loaded from: classes2.dex */
public class aryb implements aryk {
    private final bvjj a;
    @dzsi
    private aryj d;
    private final cqkn<aryj> e = new arya(this);
    private final List<arxx> b = new ArrayList();
    private boolean c = false;

    public aryb(cqhn cqhnVar, bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    @Override // defpackage.aryk
    public List<aryj> a() {
        return new ArrayList(this.b);
    }

    @Override // defpackage.aryk
    public Boolean b() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.aryk
    public Boolean c() {
        boolean z = false;
        if (b().booleanValue() && !this.b.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @dzsi
    public aryj d() {
        aryj aryjVar = this.d;
        if (aryjVar == null) {
            if (!this.a.m(bvjk.je, false)) {
                return null;
            }
            String z = this.a.z(bvjk.jf, "");
            for (arxx arxxVar : this.b) {
                if (arxxVar.c().equals(z)) {
                    return arxxVar;
                }
            }
            return null;
        }
        return aryjVar;
    }

    public void e(dcdc<arxx> dcdcVar) {
        this.b.clear();
        this.b.addAll(dcdcVar);
        Collections.sort(this.b, new arxz());
    }

    public void f(aryj aryjVar) {
        this.d = aryjVar;
        cqkx.p(this);
    }

    @dzsi
    public aryj g() {
        aryj d = d();
        if (d != null) {
            return d;
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.get(0);
    }

    public void h() {
        this.c = true;
        cqkx.p(this);
    }

    public cqkn<aryj> i() {
        return this.e;
    }
}
