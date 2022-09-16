package defpackage;
/* compiled from: PG */
/* renamed from: agov  reason: default package */
/* loaded from: classes.dex */
public final class agov implements tct {
    public final agsd a;

    public agov(agsd agsdVar) {
        this.a = agsdVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return atqz.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        final atqz atqzVar = (atqz) obj;
        return aynr.t(new aypv() { // from class: agou
            @Override // defpackage.aypv
            public final void a() {
                agov agovVar = agov.this;
                for (atrf atrfVar : atqzVar.c) {
                    try {
                        agovVar.a.d(atrfVar);
                    } catch (agse e) {
                        zep.d("[Offline] Couldn't queue action from Elements' command.", e);
                    }
                }
            }
        });
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
