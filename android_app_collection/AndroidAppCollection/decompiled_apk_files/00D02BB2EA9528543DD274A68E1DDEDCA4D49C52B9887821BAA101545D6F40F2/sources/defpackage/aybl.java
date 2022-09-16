package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: aybl  reason: default package */
/* loaded from: classes3.dex */
public final class aybl {
    public static final /* synthetic */ int a = 0;
    private static final aybk b;
    private static final dclu<baal> c;
    private final Context d;
    private final cqat e;
    private final ahjq f;

    static {
        aybk aybkVar = new aybk();
        b = aybkVar;
        c = dclu.d(aybkVar).g(aybf.a);
    }

    public aybl(gga ggaVar, cqat cqatVar, ahjq ahjqVar) {
        this.d = ggaVar.getApplicationContext();
        this.e = cqatVar;
        this.f = ahjqVar;
    }

    public final List<baal> a(baad baadVar) {
        if (baadVar.W()) {
            return dcbg.b(baadVar.i()).A(c);
        }
        return dcbg.b(baadVar.i()).o(aybc.a).A(dclu.d(new aybh(this.e)).h(dclu.d(new aybg(this.f.a())).g(aybe.a)).h(new aybi(this.d)));
    }

    public final List<baal> b(List<baal> list) {
        return dcbg.b(list).A(dclu.d(new aybi(this.d)));
    }

    public final <T extends azwm<T>> List<T> c(List<T> list) {
        return dcbg.b(list).A(d());
    }

    public final dclu<azwm<?>> d() {
        return dclu.d(new aybg(this.f.a())).g(aybd.a).h(new aybj(this.d));
    }
}
