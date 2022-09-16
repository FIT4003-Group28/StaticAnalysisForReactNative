package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wji  reason: default package */
/* loaded from: classes4.dex */
public final class wji implements View.OnClickListener {
    final /* synthetic */ wjk a;
    private final /* synthetic */ int b;

    public wji(wjk wjkVar) {
        this.a = wjkVar;
    }

    public /* synthetic */ wji(wjk wjkVar, int i) {
        this.b = i;
        this.a = wjkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            wjk wjkVar = this.a;
            wjkVar.ag = wjkVar.e;
            wjkVar.ag = PhoneNumberUtils.formatNumberToE164(PhoneNumberUtils.normalizeNumber(wjkVar.ag), wjkVar.ae);
            if (TextUtils.isEmpty(wjkVar.ag)) {
                wjkVar.s(wjkVar.N(R.string.error_invalid_phone_number));
                return;
            } else if (wjkVar.af != asbk.CODE_DELIVERY_METHOD_TEXT || PhoneNumberUtils.isWellFormedSmsAddress(wjkVar.ag)) {
                wjkVar.p();
                wjk wjkVar2 = this.a;
                wjj wjjVar = wjkVar2.ah;
                if (wjjVar != null) {
                    wjjVar.aL(wjkVar2.af, wjkVar2.ae, wjkVar2.ag);
                }
                this.a.b.b();
                wjk wjkVar3 = this.a;
                whv whvVar = new whv(wjkVar3, wjkVar3.ai);
                wjk wjkVar4 = this.a;
                asbk asbkVar = wjkVar4.af;
                String str = wjkVar4.ae;
                String str2 = wjkVar4.ag;
                atwg atwgVar = wjkVar4.d.g;
                if (atwgVar == null) {
                    atwgVar = atwg.a;
                }
                apoj apojVar = atwgVar.b;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                apzg apzgVar = apojVar.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                whvVar.c(asbkVar, str, str2, apzgVar);
                this.a.a.setEnabled(false);
                return;
            } else {
                wjkVar.s(wjkVar.N(R.string.error_sms_to_non_mobile));
                return;
            }
        }
        wjk wjkVar5 = this.a;
        wjj wjjVar2 = wjkVar5.ah;
        if (wjjVar2 != null) {
            wjjVar2.a();
        }
        wjkVar5.q();
    }
}
