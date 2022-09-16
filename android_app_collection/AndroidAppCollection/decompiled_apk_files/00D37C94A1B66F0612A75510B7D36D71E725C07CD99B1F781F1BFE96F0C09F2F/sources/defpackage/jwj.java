package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jwj  reason: default package */
/* loaded from: classes3.dex */
public final class jwj implements ezg {
    public int a;
    public View b;
    public View c;
    public fel[] d;
    private final airr e;
    private final aijf f;
    private int g = -1;
    private final jvo h;

    public jwj(airr airrVar, aijf aijfVar, jvo jvoVar) {
        this.e = airrVar;
        this.h = jvoVar;
        this.f = aijfVar;
    }

    public final void a(float f) {
        this.d[this.a].setAlpha(f);
        int i = (int) (f * 5.0f);
        if (i != this.g) {
            this.g = i;
            ((jwi) this.h.get()).ay.J(Math.max(0.0f, Math.min(1.0f, 1.0f - ((float) (Math.log((5 - i) + 1) / Math.log(6.0d))))));
        }
    }

    public final void b(int i) {
        if (this.a == i) {
            return;
        }
        a(1.0f);
        if (!this.f.m) {
            this.e.a();
        }
        this.e.z(false);
        this.d[this.a].c(this.b, this.c);
        this.a = i;
        this.d[i].b(this.b, this.c);
        jwi jwiVar = (jwi) this.h.get();
        jwiVar.ay.x(jwiVar.aT.c, (aijc) jwiVar.as.get());
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar != ezx.NONE) {
            b(ezxVar.d() ? 1 : 0);
        }
        if (ezxVar == ezx.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED || !ezxVar.f()) {
            return;
        }
        a(1.0f);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
