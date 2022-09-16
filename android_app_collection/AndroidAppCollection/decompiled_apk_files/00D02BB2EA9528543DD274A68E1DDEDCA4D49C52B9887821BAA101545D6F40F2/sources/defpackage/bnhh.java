package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bnhh  reason: default package */
/* loaded from: classes3.dex */
public class bnhh implements bnex {
    public final cdjj a;
    public final ilo b;
    private final bnem c;

    public bnhh(cdjj cdjjVar, bnfp bnfpVar, ilo iloVar) {
        this.a = cdjjVar;
        this.c = bnfpVar;
        this.b = iloVar;
    }

    @Override // defpackage.bnex
    public bnem a() {
        return this.c;
    }

    @Override // defpackage.bnex
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: bnhg
            private final bnhh a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bnhh bnhhVar = this.a;
                bnhhVar.a.c(bwrs.a(bnhhVar.b), cdjf.e().a());
            }
        };
    }

    @Override // defpackage.bnex
    public cjtd c() {
        return cjtd.a(dtxy.mG);
    }

    @Override // defpackage.bnex
    public cjtd d() {
        return cjtd.a(dtxy.mH);
    }
}
