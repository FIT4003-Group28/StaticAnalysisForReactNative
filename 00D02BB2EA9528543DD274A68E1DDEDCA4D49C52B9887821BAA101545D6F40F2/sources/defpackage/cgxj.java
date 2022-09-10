package defpackage;

import android.content.Context;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cgxj  reason: default package */
/* loaded from: classes4.dex */
public class cgxj implements cgvh {
    private final cgwe a;

    public cgxj(Context context, Integer num, ddho ddhoVar, String str, chah chahVar, cjqy cjqyVar, dnmm dnmmVar) {
        this.a = new chai(context, dnmmVar.a, num, ddhoVar, str, true, cqjg.a(), false, chahVar, cjqyVar, true, 1);
    }

    @Override // defpackage.cgvb
    public void a(cqiv cqivVar) {
        cqivVar.a(new cgpt(), this.a);
    }

    @Override // defpackage.cgvh
    public Boolean d() {
        return this.a.l();
    }

    @Override // defpackage.cgvh
    public void e() {
        this.a.z();
        cqkx.p(this);
    }

    @Override // defpackage.cgvh
    @dzsi
    public Serializable f() {
        if (this.a.l().booleanValue()) {
            return this.a.m();
        }
        return null;
    }

    @Override // defpackage.cgvh
    public void g(Object obj) {
        dbsk.a(obj instanceof String);
        this.a.s().a((String) obj);
        cqkx.p(this);
    }

    @Override // defpackage.cgvh
    public void h(cgwf cgwfVar) {
        this.a.a(cgwfVar != cgwf.EDITABLE);
        cqkx.p(this);
    }
}
