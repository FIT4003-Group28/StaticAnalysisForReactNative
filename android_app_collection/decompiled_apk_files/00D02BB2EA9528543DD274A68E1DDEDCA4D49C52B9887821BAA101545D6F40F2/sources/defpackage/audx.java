package defpackage;

import android.content.Context;
import android.text.Spannable;
import com.google.android.apps.maps.R;
import com.google.android.libraries.curvular.value.ForegroundColorViewPropertyValueSpan;
/* compiled from: PG */
/* renamed from: audx  reason: default package */
/* loaded from: classes2.dex */
final class audx implements atsr {
    final /* synthetic */ Context a;

    public audx(Context context) {
        this.a = context;
    }

    @Override // defpackage.atsr
    public final CharSequence a(CharSequence charSequence, CharSequence charSequence2, dpej dpejVar) {
        bvsx bvsxVar = new bvsx(this.a.getResources());
        cqss a = yyq.a(dpejVar);
        bvsv a2 = bvsxVar.a(charSequence);
        a2.i();
        a2.j(new ForegroundColorViewPropertyValueSpan(this.a, a));
        Spannable c = a2.c();
        bvsu c2 = bvsxVar.c(R.string.DURATION_AND_DISTANCE);
        c2.a(c, charSequence2);
        return c2.c();
    }
}
