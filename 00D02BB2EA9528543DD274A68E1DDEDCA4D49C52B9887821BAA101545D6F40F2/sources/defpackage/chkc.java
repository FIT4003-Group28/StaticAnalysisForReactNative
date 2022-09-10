package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: chkc  reason: default package */
/* loaded from: classes4.dex */
public class chkc implements chml {
    private final String a;
    private final List<chmk> b = new ArrayList();

    public chkc(dqeg dqegVar, chkb chkbVar) {
        this.a = dqegVar.a;
        for (dqee dqeeVar : dqegVar.b) {
            List<chmk> list = this.b;
            chkb.a(dqeeVar, 1);
            cqhn a = chkbVar.a.a();
            chkb.a(a, 2);
            amfi a2 = chkbVar.b.a();
            chkb.a(a2, 3);
            list.add(new chka(dqeeVar, a, a2));
        }
    }

    @Override // defpackage.chml
    public String a() {
        return this.a;
    }

    @Override // defpackage.chml
    public List<chmk> b() {
        return this.b;
    }
}
