package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bahl  reason: default package */
/* loaded from: classes3.dex */
public class bahl extends bazl {
    private final gga c;
    private final cklf d;

    public bahl(gga ggaVar, cklf cklfVar, cjqy cjqyVar) {
        super(ggaVar, cjqyVar, ggaVar.getString(R.string.UPCOMING_RESERVATIONS_SUBHEADER_LINK_FORMAT_GMAIL_AND_CALENDAR), ggaVar.getString(R.string.LEARN_MORE), dtyi.bW);
        this.c = ggaVar;
        this.d = cklfVar;
    }

    @Override // defpackage.bayn
    public Boolean a() {
        return true;
    }

    @Override // defpackage.bazl, defpackage.bayn
    public cqkl b() {
        this.d.a("answers_cards_android");
        return cqkl.a;
    }

    @Override // defpackage.bazl, defpackage.bayn
    public acpa c() {
        return bbbk.e(this.c);
    }
}
