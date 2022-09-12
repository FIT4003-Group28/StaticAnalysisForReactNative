package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bnfj  reason: default package */
/* loaded from: classes3.dex */
final class bnfj implements iao {
    private final cjtd a;
    private final Activity b;
    private final bnfl c;

    @Override // defpackage.iao
    public CharSequence a() {
        String string = this.b.getResources().getString(this.c.c);
        dzvx.b(string, "activity.resources.getString(subTabType.titleId)");
        return string;
    }

    @Override // defpackage.iao
    public cjtd b() {
        cjtd cjtdVar = this.a;
        dzvx.b(cjtdVar, "ue3Params");
        return cjtdVar;
    }

    @Override // defpackage.iao
    public CharSequence c() {
        return ian.a(this);
    }

    @Override // defpackage.iao
    public Boolean d() {
        return ian.c();
    }

    @Override // defpackage.iao
    public hxy e() {
        return null;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    public bnfj(Activity activity, bnfl bnflVar) {
        cjtd cjtdVar;
        dzvx.c(bnflVar, "subTabType");
        this.b = activity;
        this.c = bnflVar;
        ddho ddhoVar = bnflVar.d;
        if (ddhoVar == null) {
            cjtdVar = cjtd.b;
        } else {
            cjtdVar = cjtd.a(ddhoVar);
        }
        this.a = cjtdVar;
    }
}
