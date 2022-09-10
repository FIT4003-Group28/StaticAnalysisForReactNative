package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkov  reason: default package */
/* loaded from: classes3.dex */
public final class bkov {
    final /* synthetic */ bwrs a;
    final /* synthetic */ bkpg b;
    final /* synthetic */ bkow c;

    public bkov(bkow bkowVar, bwrs bwrsVar, bkpg bkpgVar) {
        this.c = bkowVar;
        this.a = bwrsVar;
        this.b = bkpgVar;
    }

    public final void a(cdjd cdjdVar) {
        this.c.e(this.a, cdjdVar, this.b);
    }

    public final void b() {
        gga ggaVar = this.c.a;
        cjxu.i(ggaVar, ggaVar.getString(R.string.OPEN_REVIEW_PAGE_FAILED));
    }
}
