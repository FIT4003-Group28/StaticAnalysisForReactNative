package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Base64;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ybh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ybh implements zdt {
    public final /* synthetic */ ybo a;
    public final /* synthetic */ ashp b;
    private final /* synthetic */ int c;

    public /* synthetic */ ybh(ybo yboVar, ashp ashpVar) {
        this.a = yboVar;
        this.b = ashpVar;
    }

    public /* synthetic */ ybh(ybo yboVar, ashp ashpVar, int i) {
        this.c = i;
        this.a = yboVar;
        this.b = ashpVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        aoob aoobVar;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                this.a.a(this.b, (aade) obj);
                return;
            }
            Throwable th = (Throwable) obj;
            this.a.a(this.b, aade.PRODUCTION);
            return;
        }
        final ybo yboVar = this.a;
        final ashp ashpVar = this.b;
        if (!((Boolean) obj).booleanValue()) {
            if (yboVar.j) {
                yboVar.j = false;
                return;
            } else {
                ylx.n(yboVar.i, ((abfh) yboVar.d.get()).c(), new ybh(yboVar, ashpVar, 2), new ybh(yboVar, ashpVar, 1));
                return;
            }
        }
        ybm ybmVar = yboVar.k;
        if (ybmVar != null) {
            ybmVar.a();
        }
        final byte[] bArr = new byte[0];
        if (ashpVar.c == 7) {
            aoobVar = (aoob) ashpVar.d;
        } else {
            aoobVar = aoob.b;
        }
        String valueOf = String.valueOf(Base64.encodeToString(aoobVar.I(), 0));
        final String concat = valueOf.length() != 0 ? "FAKE_ORDER_ID_".concat(valueOf) : new String("FAKE_ORDER_ID_");
        new AlertDialog.Builder(yboVar.i).setTitle(R.string.payment_fake_wallet_title).setMessage(R.string.payment_fake_wallet_message).setPositiveButton("Succeed", new DialogInterface.OnClickListener() { // from class: ybf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ybo yboVar2 = ybo.this;
                String str = concat;
                byte[] bArr2 = bArr;
                ashp ashpVar2 = ashpVar;
                ybl yblVar = yboVar2.l;
                if (yblVar != null) {
                    yblVar.d();
                }
                yboVar2.f(str, bArr2, bArr2, ashpVar2);
            }
        }).setNegativeButton("Fail", new DialogInterface.OnClickListener() { // from class: ybe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ybo.this.d(null);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ybd
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ybo.this.c();
            }
        }).create().show();
    }
}
