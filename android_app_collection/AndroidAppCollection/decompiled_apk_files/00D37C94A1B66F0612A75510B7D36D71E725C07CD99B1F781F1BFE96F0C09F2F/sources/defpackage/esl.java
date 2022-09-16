package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: esl  reason: default package */
/* loaded from: classes3.dex */
public final class esl implements aafl {
    public static final /* synthetic */ int g = 0;
    public final Activity a;
    public final afvn b;
    public final Executor c;
    public final Executor d;
    public final azqb e;
    public final vzc f;

    public esl(Activity activity, vzc vzcVar, afvn afvnVar, Executor executor, Executor executor2, azqb azqbVar) {
        this.a = activity;
        this.f = vzcVar;
        this.b = afvnVar;
        this.c = executor;
        this.d = executor2;
        this.e = azqbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ayos.D(apzgVar).E(dzy.i).z(new esj(this)).E(dzy.j).T(new ayqb() { // from class: esi
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                esl eslVar = esl.this;
                Uri uri = (Uri) obj;
                if (!((ajgr) eslVar.e.get()).d(eslVar.a, uri)) {
                    eog.g(eslVar.a, uri);
                }
            }
        }, dzq.h);
    }
}
