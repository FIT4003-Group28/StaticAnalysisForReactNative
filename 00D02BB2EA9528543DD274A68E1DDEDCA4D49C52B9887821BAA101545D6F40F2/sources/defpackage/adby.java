package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: adby  reason: default package */
/* loaded from: classes.dex */
public class adby extends aczs implements adlk {
    public final dxio<awwq> a;
    private final cjtd b = cjtd.a(dtxr.aZ);
    private final cjtd c = cjtd.a(dtxr.ba);

    public adby(dxio<awwq> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.adlk
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: adbx
            private final adby a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a().j(awwm.MANUAL_RETRY);
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
}
