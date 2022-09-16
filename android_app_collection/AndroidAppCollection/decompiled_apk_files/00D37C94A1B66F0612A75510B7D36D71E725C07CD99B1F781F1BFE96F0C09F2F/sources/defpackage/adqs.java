package defpackage;
/* compiled from: PG */
/* renamed from: adqs  reason: default package */
/* loaded from: classes.dex */
public final class adqs extends ados {
    private static final String k = zep.a("MDX.ManualPairingRecoverer");

    public adqs(bhd bhdVar, bgo bgoVar, adgc adgcVar, yrj yrjVar, yni yniVar) {
        super(bhdVar, bgoVar, adgcVar, yrjVar, yniVar, 4, false);
    }

    @Override // defpackage.ados
    protected final void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ados
    public final void b(bhc bhcVar) {
        if (!adgl.h(bhcVar)) {
            zep.m(k, "Non CLOUD route was passed in for recovery");
        } else {
            c(bhcVar);
        }
    }
}
