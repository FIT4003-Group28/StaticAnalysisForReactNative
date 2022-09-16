package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: adlr  reason: default package */
/* loaded from: classes.dex */
public class adlr extends aczs implements adlk {
    public final Runnable a;
    private final cjtd b;
    private final cjtd c;

    public adlr(final dxio<awwq> dxioVar) {
        this(new Runnable(dxioVar) { // from class: adlp
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((awwq) this.a.a()).j(awwm.MANUAL_RETRY);
            }
        }, cjtd.a(dtxr.aq), cjtd.a(dtxr.ar));
    }

    @Override // defpackage.adlk
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: adlq
            private final adlr a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.run();
            }
        };
    }

    @Override // defpackage.adlk
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return this.b;
    }

    public adlr(Runnable runnable, cjtd cjtdVar, cjtd cjtdVar2) {
        this.a = runnable;
        this.b = cjtdVar;
        this.c = cjtdVar2;
    }
}
