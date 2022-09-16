package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: addw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class addw implements View.OnClickListener {
    public final /* synthetic */ adea a;
    private final /* synthetic */ int b;

    public /* synthetic */ addw(adea adeaVar) {
        this.a = adeaVar;
    }

    public /* synthetic */ addw(adea adeaVar, int i) {
        this.b = i;
        this.a = adeaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            adea adeaVar = this.a;
            adeaVar.b.H(3, new acte(acuo.b(27856)), null);
            adeaVar.c();
            return;
        }
        final adea adeaVar2 = this.a;
        adeaVar2.b.H(3, new acte(acuo.b(27855)), null);
        if (adeaVar2.c.a(false, new adez() { // from class: addx
            @Override // defpackage.adez
            public final void a() {
                adea.this.b();
            }
        }, "")) {
            return;
        }
        adeaVar2.b();
    }
}
