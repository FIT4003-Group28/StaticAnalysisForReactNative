package defpackage;

import android.view.View;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caut  reason: default package */
/* loaded from: classes4.dex */
public class caut implements jay {
    final /* synthetic */ gga a;
    final /* synthetic */ int b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ cjtd d;

    public caut(gga ggaVar, int i, Runnable runnable, cjtd cjtdVar) {
        this.a = ggaVar;
        this.b = i;
        this.c = runnable;
        this.d = cjtdVar;
    }

    @Override // defpackage.jay
    public List a() {
        return dcdc.e();
    }

    @Override // defpackage.jay
    public jht b() {
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.a = this.a.getString(this.b);
        final Runnable runnable = this.c;
        jhmVar.d(new View.OnClickListener(runnable) { // from class: caus
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.run();
            }
        });
        jhmVar.f = this.d;
        h.d(jhmVar.c());
        return h.b();
    }

    @Override // defpackage.jay
    public void c(int i) {
    }
}
