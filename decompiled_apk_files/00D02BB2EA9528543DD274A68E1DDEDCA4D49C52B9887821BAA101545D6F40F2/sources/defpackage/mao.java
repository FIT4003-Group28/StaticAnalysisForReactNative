package defpackage;

import android.content.Context;
import com.google.android.libraries.curvular.value.ForegroundColorViewPropertyValueSpan;
/* compiled from: PG */
/* renamed from: mao  reason: default package */
/* loaded from: classes7.dex */
final class mao implements atsr {
    final /* synthetic */ Context a;

    public mao(Context context) {
        this.a = context;
    }

    @Override // defpackage.atsr
    public final CharSequence a(CharSequence charSequence, CharSequence charSequence2, dpej dpejVar) {
        bvsx bvsxVar = new bvsx(this.a.getResources());
        iuv b = nql.b(dpejVar);
        bvsv a = bvsxVar.a(charSequence);
        a.j(new ForegroundColorViewPropertyValueSpan(this.a, b));
        bvsv a2 = bvsxVar.a(a.c());
        a2.g(" · ");
        a2.g(charSequence2);
        return a2.c();
    }
}
