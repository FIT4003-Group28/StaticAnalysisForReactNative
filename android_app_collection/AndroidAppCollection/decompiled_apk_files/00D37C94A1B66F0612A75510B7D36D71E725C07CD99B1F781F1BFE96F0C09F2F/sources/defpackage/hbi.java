package defpackage;

import android.content.Context;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: hbi  reason: default package */
/* loaded from: classes3.dex */
public final class hbi extends php {
    private final Context a;
    private final hbh b;

    public hbi(Context context, hbh hbhVar) {
        super(context);
        this.a = context;
        this.b = hbhVar;
    }

    @Override // defpackage.php, defpackage.pkg
    public final pkd[] ru(Handler handler, pyk pykVar, pli pliVar, psp pspVar, pom pomVar) {
        return new pkd[]{new pxq(this.a, avw.a, awd.b, handler, pykVar, 50), new pmi(this.a, awd.b, handler, pliVar, new pmf(pkv.a(this.a), new ply(this.b).a)), new hbb(this.a, awd.b, new hbc(this.b))};
    }
}
