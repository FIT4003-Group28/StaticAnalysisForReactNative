package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gke  reason: default package */
/* loaded from: classes3.dex */
final class gke implements ybm {
    public final ahcb a;
    final /* synthetic */ gkf b;
    private final apzg c;
    private final ybm d;
    private final aafo e;

    public gke(gkf gkfVar, apzg apzgVar, ahcb ahcbVar, ybm ybmVar, aafo aafoVar) {
        this.b = gkfVar;
        this.c = apzgVar;
        this.a = ahcbVar;
        this.d = ybmVar;
        this.e = aafoVar;
    }

    @Override // defpackage.ybm
    public final void a() {
        this.b.b.d(new euu());
        ybm ybmVar = this.d;
        if (ybmVar != null) {
            ybmVar.a();
        }
    }

    @Override // defpackage.ybm
    public final void b() {
        this.b.b.d(new eup());
        this.b.c.k();
        gkf gkfVar = this.b;
        ydi ydiVar = gkfVar.w;
        if (ydiVar != null) {
            ydiVar.b();
        } else {
            gkfVar.s.c(R.string.payment_purchase_cancelled);
        }
        ybm ybmVar = this.d;
        if (ybmVar != null) {
            ybmVar.b();
        }
    }

    @Override // defpackage.ybm
    public final void c(CharSequence charSequence) {
        String charSequence2;
        this.b.b.d(new euq());
        this.b.u.a();
        this.b.c.n();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = this.b.d.getString(R.string.error_generic);
        } else {
            charSequence2 = charSequence.toString();
        }
        gkf gkfVar = this.b;
        ydi ydiVar = gkfVar.w;
        if (ydiVar != null) {
            ydiVar.c(charSequence2);
        } else {
            gkfVar.s.d(charSequence2);
        }
        ybm ybmVar = this.d;
        if (ybmVar != null) {
            ybmVar.c(charSequence);
        }
    }

    @Override // defpackage.ybm
    public final void d(abez abezVar) {
        ybm ybmVar = this.d;
        if (ybmVar != null) {
            ybmVar.d(abezVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ybm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.ashn r17) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gke.e(ashn):void");
    }

    @Override // defpackage.ybm
    public final void f() {
        this.b.u.a();
        this.b.c.n();
        String string = this.b.d.getString(R.string.payment_wallet_processing_error);
        gkf gkfVar = this.b;
        ydi ydiVar = gkfVar.w;
        if (ydiVar != null) {
            ydiVar.c(string);
        } else {
            gkfVar.s.d(string);
        }
        ybm ybmVar = this.d;
        if (ybmVar != null) {
            ybmVar.f();
        }
    }

    public final void g(String str, attl attlVar) {
        h(this.b.p.a().m().a(str, attlVar, agqn.OFFLINE_IMMEDIATELY, this.c.c.I(), 0));
    }

    public final void h(int i) {
        gkf gkfVar = this.b;
        int s = ahbm.s(i, gkfVar.h, gkfVar.g, gkfVar.n, gkfVar.o);
        if (s != 0) {
            this.b.i.e(s);
        }
    }
}
