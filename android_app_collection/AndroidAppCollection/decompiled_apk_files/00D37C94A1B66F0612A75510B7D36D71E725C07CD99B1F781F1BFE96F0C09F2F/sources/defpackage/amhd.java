package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amhd  reason: default package */
/* loaded from: classes.dex */
public final class amhd extends a {
    final /* synthetic */ dyc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amhd(bll bllVar, Bundle bundle, dyc dycVar) {
        super(bllVar, bundle);
        this.a = dycVar;
    }

    @Override // defpackage.a
    protected final ac d(Class cls, x xVar) {
        dyc dycVar = this.a;
        dycVar.a = xVar;
        axzl.n(dycVar.a, x.class);
        azqb azqbVar = (azqb) ((amhe) awwc.u(new eat(), amhe.class)).a().get(cls.getName());
        if (azqbVar == null) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 130);
            sb.append("Expected the @AccountViewModel-annotated class '");
            sb.append(name);
            sb.append("' to be available in the multi-binding of @AccountViewModelMap but none was found.");
            throw new IllegalStateException(sb.toString());
        }
        return (ac) azqbVar.get();
    }
}
