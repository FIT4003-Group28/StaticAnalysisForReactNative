package defpackage;
/* compiled from: PG */
/* renamed from: agcs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agcs implements ampg {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ agcs(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            boolean z = this.a;
            aopa mo52toBuilder = ((awux) obj).mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            awux awuxVar = (awux) mo52toBuilder.instance;
            awuxVar.b |= 16;
            awuxVar.g = z;
            return (awux) mo52toBuilder.mo39build();
        } else if (i == 1) {
            boolean z2 = this.a;
            aopa mo52toBuilder2 = ((awux) obj).mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            awux awuxVar2 = (awux) mo52toBuilder2.instance;
            awuxVar2.b |= 64;
            awuxVar2.i = z2;
            return (awux) mo52toBuilder2.mo39build();
        } else {
            boolean z3 = this.a;
            aopa mo52toBuilder3 = ((awux) obj).mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            awux awuxVar3 = (awux) mo52toBuilder3.instance;
            awuxVar3.b |= 256;
            awuxVar3.k = z3;
            return (awux) mo52toBuilder3.mo39build();
        }
    }
}
