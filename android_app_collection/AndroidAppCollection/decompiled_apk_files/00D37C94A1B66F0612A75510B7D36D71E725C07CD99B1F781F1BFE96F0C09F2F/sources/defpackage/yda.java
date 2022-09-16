package defpackage;

import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yda  reason: default package */
/* loaded from: classes4.dex */
public final class yda implements aafl {
    public final aafo a;
    public final abeq b;
    public final yzj c;
    public final yat d = new yat();
    public final Executor e;
    private final Activity f;
    private final ydo g;

    public yda(Activity activity, aafo aafoVar, abeq abeqVar, ydo ydoVar, yzj yzjVar, Executor executor) {
        this.f = activity;
        this.b = abeqVar;
        this.g = ydoVar;
        this.a = aafoVar;
        this.c = yzjVar;
        this.e = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.d.show(this.f.getFragmentManager(), yat.a);
        ydo ydoVar = this.g;
        ycz yczVar = new ycz(this, apzgVar);
        ylx.n(ydoVar.a, ((abfh) ydoVar.b.get()).c(), new ydn(ydoVar, yczVar), new ydn(ydoVar, yczVar, 1));
    }
}
