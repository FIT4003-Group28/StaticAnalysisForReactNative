package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dytd  reason: default package */
/* loaded from: classes6.dex */
public final class dytd extends dyhe {
    public final dygx b;
    private dyhc c;

    public dytd(dygx dygxVar) {
        this.b = dygxVar;
    }

    @Override // defpackage.dyhe
    public final void a(dyhb dyhbVar) {
        List<dyfw> list = dyhbVar.a;
        dyhc dyhcVar = this.c;
        if (dyhcVar == null) {
            dygx dygxVar = this.b;
            dygu dyguVar = new dygu();
            dbsk.b(!list.isEmpty(), "addrs is empty");
            dyguVar.a = Collections.unmodifiableList(new ArrayList(list));
            dygv dygvVar = new dygv(dyguVar.a, dyguVar.b, dyguVar.c);
            dyrd dyrdVar = (dyrd) dygxVar;
            dyrdVar.b.m.c();
            dbsk.m(!dyrdVar.b.D, "Channel is terminated");
            dyrx dyrxVar = new dyrx(dyrdVar.b, dygvVar);
            dyrxVar.e(new dysz(this, dyrxVar));
            this.c = dyrxVar;
            this.b.a(dyfk.CONNECTING, new dyta(dygy.a(dyrxVar)));
            dyrxVar.b();
            return;
        }
        dyhcVar.c(list);
    }

    @Override // defpackage.dyhe
    public final void b(dyjb dyjbVar) {
        dyhc dyhcVar = this.c;
        if (dyhcVar != null) {
            dyhcVar.a();
            this.c = null;
        }
        this.b.a(dyfk.TRANSIENT_FAILURE, new dyta(dygy.b(dyjbVar)));
    }

    @Override // defpackage.dyhe
    public final void c() {
        dyhc dyhcVar = this.c;
        if (dyhcVar != null) {
            dyhcVar.a();
        }
    }

    @Override // defpackage.dyhe
    public final void d() {
        dyhc dyhcVar = this.c;
        if (dyhcVar != null) {
            dyhcVar.b();
        }
    }
}
