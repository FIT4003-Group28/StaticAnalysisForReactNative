package defpackage;
/* compiled from: PG */
/* renamed from: adjr  reason: default package */
/* loaded from: classes2.dex */
public class adjr extends aczs implements adjq {
    @dzsi
    private String a;
    private final abpn b;
    private final absg c;

    public adjr(abpo abpoVar, acwt acwtVar, absg absgVar) {
        this.c = absgVar;
        this.b = abpoVar.a(acwtVar, absgVar);
    }

    @Override // defpackage.adjq
    public abpn a() {
        return this.b;
    }

    public void b(@dzsi dviz dvizVar, @dzsi dviz dvizVar2) {
        djrs djrsVar;
        djrs djrsVar2;
        abpn abpnVar = this.b;
        String str = null;
        if (dvizVar == null || (dvizVar.a & 4) == 0) {
            djrsVar = null;
        } else {
            djrsVar = dvizVar.d;
            if (djrsVar == null) {
                djrsVar = djrs.g;
            }
        }
        if (dvizVar2 == null || (dvizVar2.a & 4) == 0) {
            djrsVar2 = null;
        } else {
            djrsVar2 = dvizVar2.d;
            if (djrsVar2 == null) {
                djrsVar2 = djrs.g;
            }
        }
        if (abpnVar.b(djrsVar, djrsVar2)) {
            if (dvizVar2 != null && (dvizVar2.a & 1) != 0) {
                str = dvizVar2.b;
            }
            this.a = str;
        }
    }

    public boolean c() {
        return !this.b.Pd().isEmpty() || (this.b.f() != null && !this.b.f().a().isEmpty());
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a);
        b.d = this.c == absg.AREA_EXPLORE ? dtxj.cQ : dtxr.aK;
        return b.a();
    }
}
