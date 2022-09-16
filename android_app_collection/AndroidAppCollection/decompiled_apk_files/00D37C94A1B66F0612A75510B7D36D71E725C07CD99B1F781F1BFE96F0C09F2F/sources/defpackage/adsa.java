package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: adsa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adsa implements View.OnClickListener {
    public final /* synthetic */ adsg a;
    private final /* synthetic */ int b;

    public /* synthetic */ adsa(adsg adsgVar, int i) {
        this.b = i;
        this.a = adsgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        int i2 = 2;
        if (i == 0) {
            adsg adsgVar = this.a;
            if (adsgVar.c == null) {
                return;
            }
            if (true != adsgVar.B) {
                i2 = 3;
            }
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = asja.a.createBuilder();
            createBuilder2.copyOnWrite();
            asja asjaVar = (asja) createBuilder2.instance;
            asjaVar.c = i2 - 1;
            asjaVar.b |= 1;
            asja asjaVar2 = (asja) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asjaVar2.getClass();
            asjjVar.m = asjaVar2;
            asjjVar.b = 32768 | asjjVar.b;
            adsgVar.h.H(3, new acte(acuo.b(61401)), (asjj) createBuilder.mo39build());
            adsgVar.c.ag(adnr.KEY_BACK);
        } else if (i == 1) {
            adsg adsgVar2 = this.a;
            adsgVar2.h.H(3, new acte(acuo.b(61403)), null);
            if (adsgVar2.a.mJ() != null) {
                adsgVar2.a.mJ().finish();
            }
            adsgVar2.C = false;
        } else if (i != 2) {
            if (i == 3) {
                this.a.h.H(3, new acte(acuo.b(61402)), null);
            } else if (i == 4) {
                adsg adsgVar3 = this.a;
                if (adsgVar3.k) {
                    adsgVar3.h();
                }
                adsgVar3.f();
            } else {
                adsg adsgVar4 = this.a;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", adsgVar4.l.getPackageName(), null));
                intent.addFlags(268435456);
                adsgVar4.l.startActivity(intent);
            }
        } else {
            adsg adsgVar5 = this.a;
            if (true == adsgVar5.k) {
                i2 = 3;
            }
            aopa createBuilder3 = asjj.a.createBuilder();
            aopa createBuilder4 = asja.a.createBuilder();
            createBuilder4.copyOnWrite();
            asja asjaVar3 = (asja) createBuilder4.instance;
            asjaVar3.c = i2 - 1;
            asjaVar3.b |= 1;
            asja asjaVar4 = (asja) createBuilder4.mo39build();
            createBuilder3.copyOnWrite();
            asjj asjjVar2 = (asjj) createBuilder3.instance;
            asjaVar4.getClass();
            asjjVar2.m = asjaVar4;
            asjjVar2.b = 32768 | asjjVar2.b;
            adsgVar5.h.H(3, new acte(acuo.b(61407)), (asjj) createBuilder3.mo39build());
            adsgVar5.h();
            adsgVar5.C = false;
        }
    }
}
