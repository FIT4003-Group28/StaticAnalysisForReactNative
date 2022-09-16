package defpackage;
/* compiled from: PG */
/* renamed from: aksa  reason: default package */
/* loaded from: classes.dex */
public final class aksa implements tct {
    public final aksc a;

    public aksa(aksc akscVar) {
        this.a = akscVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return aphx.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        final aphx aphxVar = (aphx) obj;
        return aynr.t(new aypv() { // from class: akrz
            @Override // defpackage.aypv
            public final void a() {
                aksa aksaVar = aksa.this;
                aphx aphxVar2 = aphxVar;
                aksc akscVar = aksaVar.a;
                String str = aphxVar2.d;
                arln arlnVar = aphxVar2.c;
                if (arlnVar == null) {
                    arlnVar = arln.a;
                }
                akscVar.a.c(new aksd(str, arlnVar));
            }
        });
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
