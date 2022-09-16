package defpackage;

import android.os.Bundle;
import com.google.cardboard.sdk.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axnr  reason: default package */
/* loaded from: classes2.dex */
public final class axnr extends a {
    final /* synthetic */ dyd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axnr(bll bllVar, Bundle bundle, dyd dydVar) {
        super(bllVar, bundle);
        this.a = dydVar;
    }

    @Override // defpackage.a
    protected final ac d(Class cls, x xVar) {
        dyd dydVar = this.a;
        dydVar.a = xVar;
        axzl.n(dydVar.a, x.class);
        azqb azqbVar = (azqb) ((axns) awwc.u(new eau(), axns.class)).a().get(cls.getName());
        if (azqbVar == null) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + R.styleable.AppCompatTheme_windowMinWidthMajor);
            sb.append("Expected the @HiltViewModel-annotated class '");
            sb.append(name);
            sb.append("' to be available in the multi-binding of @HiltViewModelMap but none was found.");
            throw new IllegalStateException(sb.toString());
        }
        return (ac) azqbVar.get();
    }
}
