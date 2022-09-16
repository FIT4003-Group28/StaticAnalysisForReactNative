package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaaq  reason: default package */
/* loaded from: classes2.dex */
public final class aaaq {
    final dbsg<alad> a;
    final dbsg<akqs> b;
    final /* synthetic */ aaar c;

    public aaaq(aaar aaarVar) {
        this.c = aaarVar;
        this.a = dbpy.a;
        this.b = dbpy.a;
    }

    public aaaq(aaar aaarVar, dils dilsVar) {
        this.c = aaarVar;
        dprx dprxVar = dilsVar.b;
        dprxVar = dprxVar == null ? dprx.h : dprxVar;
        if ((dprxVar.a & 2) != 0) {
            this.a = dbpy.a;
            dpuq dpuqVar = dprxVar.c;
            this.b = dbsg.i(new akqs(dpuqVar == null ? dpuq.d : dpuqVar));
            return;
        }
        dhjx dhjxVar = dilsVar.c;
        this.a = dbsg.j(alad.c(dhjxVar == null ? dhjx.f : dhjxVar));
        this.b = dbpy.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final akyc a() {
        if (this.b.a()) {
            return akyt.n(this.b.b(), 50, 50, 50, 50);
        }
        return akyt.e(this.a.c(this.c.a.p()));
    }
}
