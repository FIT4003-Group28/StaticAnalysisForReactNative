package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
/* compiled from: PG */
/* renamed from: fps  reason: default package */
/* loaded from: classes3.dex */
final class fps implements ybm {
    final /* synthetic */ fpt a;

    public fps(fpt fptVar) {
        this.a = fptVar;
    }

    @Override // defpackage.ybm
    public final void a() {
        this.a.e("transactionStarted");
    }

    @Override // defpackage.ybm
    public final void b() {
        this.a.e("transactionCanceled");
    }

    @Override // defpackage.ybm
    public final void c(CharSequence charSequence) {
        this.a.e("transactionError");
    }

    @Override // defpackage.ybm
    public final void e(ashn ashnVar) {
        this.a.e("transactionCompleted");
        fpt fptVar = this.a;
        fpr fprVar = fptVar.d;
        if (fprVar != null) {
            fptVar.e.add(fprVar.b);
        }
        fptVar.d = null;
        this.a.d();
    }

    @Override // defpackage.ybm
    public final void f() {
        this.a.e("transactionError");
    }

    @Override // defpackage.ybm
    public final void d(abez abezVar) {
        ScreenId screenId;
        fpr fprVar = this.a.d;
        if (fprVar == null || (screenId = fprVar.a) == null) {
            zep.c("RemoteTransactionController", "onTransactionReady: no valid screenID");
            return;
        }
        String str = screenId.c;
        if (str.length() != 0) {
            "setting the screenID back to CompleteTxnRequest to: ".concat(str);
        }
        abezVar.x = this.a.d.a.c;
    }
}
