package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blhl  reason: default package */
/* loaded from: classes3.dex */
public final class blhl extends blho implements btzi<dwge, dwgl> {
    private final Activity a;
    private final buti b;
    private final dehq c;
    private boolean d;
    @dzsi
    private String g;

    public blhl(Activity activity, buti butiVar, dehq dehqVar, blhw blhwVar) {
        super(blhwVar);
        this.d = false;
        this.g = null;
        this.a = activity;
        this.b = butiVar;
        this.c = dehqVar;
        this.d = ((Boolean) blhwVar.f().h(blhj.a).c(false)).booleanValue();
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwge> btzrVar, btzy btzyVar) {
        this.d = false;
        f(blhy.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwge> btzrVar, dwgl dwglVar) {
        dwgl dwglVar2 = dwglVar;
        this.d = false;
        this.g = dwglVar2.d;
        dsrj<dwfl> dsrjVar = dwglVar2.b;
        blhx d = blhy.d();
        d.d(dsrjVar);
        f(d.c());
    }

    @Override // defpackage.blho
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.blho
    protected final void b() {
        int a = cknv.a(this.a.getWindowManager());
        blhw blhwVar = this.e;
        String str = this.g;
        djck e = blhwVar.f().e(blhk.a);
        dbsg j = dbsg.j((e.a & 16) != 0 ? new cknc(null, false, false, false, false, dcdc.e()).c(blhwVar.a(), e.f, 15, str, a, a) : null);
        if (!j.a()) {
            f(blhy.a);
        } else {
            this.b.b((dwge) j.b(), this, this.c);
        }
    }
}
