package defpackage;

import android.text.TextUtils;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adxn  reason: default package */
/* loaded from: classes2.dex */
public class adxn implements advo {
    public boolean a = false;
    final /* synthetic */ adxo b;
    private final CharSequence c;
    private final dlds d;
    private final ilo e;
    @dzsi
    private final jic f;
    @dzsi
    private final CharSequence g;
    private final cjtd h;

    public adxn(adxo adxoVar, dlds dldsVar, ilo iloVar, cjtd cjtdVar) {
        this.b = adxoVar;
        this.d = dldsVar;
        this.e = iloVar;
        docg docgVar = dldsVar.b;
        this.c = (docgVar == null ? docg.M : docgVar).r;
        docg docgVar2 = dldsVar.b;
        dnfg dnfgVar = (docgVar2 == null ? docg.M : docgVar2).n;
        dnna dnnaVar = (dnfgVar == null ? dnfg.c : dnfgVar).b;
        dnnaVar = dnnaVar == null ? dnna.m : dnnaVar;
        CharSequence charSequence = null;
        this.f = (dnnaVar.a & 8) != 0 ? new jic(dnnaVar.e, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998, 0) : null;
        String str = dnnaVar.b;
        docg docgVar3 = dldsVar.b;
        String str2 = (docgVar3 == null ? docg.M : docgVar3).o;
        if (str.length() != 0 || str2.length() != 0) {
            if (str.length() > 0) {
                charSequence = str2.length() > 0 ? TextUtils.concat(str, " · ", str2) : str;
            } else {
                charSequence = str2;
            }
        }
        this.g = charSequence;
        this.h = cjtdVar;
    }

    @Override // defpackage.advo
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.advo
    public cqkl b() {
        bkpi bkpiVar = this.b.a;
        bwrs<ilo> a = bwrs.a(this.e);
        docg docgVar = this.d.b;
        if (docgVar == null) {
            docgVar = docg.M;
        }
        bkpiVar.f(a, bwrs.a(cdrr.r(docgVar, cdja.PUBLISHED)), bkpg.f(cdjk.YOUR_EXPLORE));
        return cqkl.a;
    }

    @Override // defpackage.advo
    @dzsi
    public jic c() {
        if (this.a) {
            return this.f;
        }
        return null;
    }

    @Override // defpackage.advo
    public cqfd d() {
        return new cqfd(this) { // from class: adxm
            private final adxn a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                adxn adxnVar = this.a;
                if (!adxnVar.a) {
                    adxnVar.a = true;
                    cqkx.p(adxnVar);
                }
                return true;
            }
        };
    }

    @Override // defpackage.advo
    @dzsi
    public CharSequence e() {
        return this.g;
    }

    @Override // defpackage.advo
    public cjtd f() {
        return this.h;
    }
}
