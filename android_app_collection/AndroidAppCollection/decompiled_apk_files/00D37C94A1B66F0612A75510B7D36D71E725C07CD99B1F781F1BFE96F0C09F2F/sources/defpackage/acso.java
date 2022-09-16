package defpackage;
/* compiled from: PG */
/* renamed from: acso  reason: default package */
/* loaded from: classes.dex */
final class acso implements ynj {
    final /* synthetic */ acss a;
    private final /* synthetic */ int b;

    public acso(acss acssVar) {
        this.a = acssVar;
    }

    public acso(acss acssVar, int i) {
        this.b = i;
        this.a = acssVar;
    }

    @Override // defpackage.ynj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            afwd afwdVar = (afwd) obj;
            acss acssVar = this.a;
            if (acssVar.c) {
                if (afwdVar.a()) {
                    return;
                }
                this.a.d();
                return;
            }
            ylx.m(acssVar.a(), acsn.a);
            return;
        }
        afwb afwbVar = (afwb) obj;
        acss acssVar2 = this.a;
        if (acssVar2.c) {
            acssVar2.d();
        } else {
            ylx.m(acssVar2.a(), acsn.b);
        }
    }
}
