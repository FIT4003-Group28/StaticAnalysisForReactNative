package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnhb  reason: default package */
/* loaded from: classes3.dex */
public class bnhb implements bnev {
    public final Activity a;
    public final bnai b;
    public final bngs c;
    public final bnjj d;
    public final bwrs<ilo> e;
    public final List<bneq> f;
    public boolean g;
    private final bnet h = new bngz(this);
    private final bner i;
    private boolean j;
    private final bnha k;

    public bnhb(Activity activity, bnaj bnajVar, bngv bngvVar, bngs bngsVar, bnjj bnjjVar, cqhn cqhnVar, bwrs<ilo> bwrsVar, bneu bneuVar) {
        bnha bnhaVar = new bnha(this);
        this.k = bnhaVar;
        this.f = new ArrayList();
        this.a = activity;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        akqi ai = c.ai();
        buuy a = bnajVar.a.a();
        bnaj.a(a, 1);
        Executor a2 = bnajVar.b.a();
        bnaj.a(a2, 2);
        bnaj.a(ai, 3);
        bnaj.a(bnhaVar, 4);
        this.b = new bnai(a, a2, ai, bnhaVar);
        ddho a3 = bneuVar.a();
        cdjj a4 = bngvVar.a.a();
        bngv.a(a4, 1);
        bnfp a5 = bngvVar.b.a();
        bngv.a(a5, 2);
        bngv.a(bwrsVar, 3);
        bngv.a(a3, 4);
        this.i = new bngu(a4, a5, bwrsVar, a3);
        this.c = bngsVar;
        this.d = bnjjVar;
        this.e = bwrsVar;
    }

    @Override // defpackage.bnev
    public Boolean a() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.bnev
    public Boolean b() {
        boolean z = false;
        if (this.j && this.f.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnev
    public bner c() {
        return this.i;
    }

    @Override // defpackage.bnev
    public List<bneq> d() {
        return this.f;
    }

    @Override // defpackage.bnev
    public bnet e() {
        return this.h;
    }
}
