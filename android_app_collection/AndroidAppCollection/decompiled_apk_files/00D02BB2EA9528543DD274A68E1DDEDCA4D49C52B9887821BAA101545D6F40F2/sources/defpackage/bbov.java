package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbov  reason: default package */
/* loaded from: classes3.dex */
public class bbov implements bbmb {
    final /* synthetic */ bbow a;
    private final List<bblz> b;

    public bbov(bbow bbowVar, bbpm bbpmVar, ilo iloVar) {
        this.a = bbowVar;
        cjta b = cjtd.b();
        b.g = decs.a(iloVar.ai().c);
        String string = bbowVar.b.getString(R.string.EXEMPLAR_VOTE_NO);
        cqtd f = bbow.f(R.raw.thumbs_down);
        b.d = dtxy.bj;
        bbpl b2 = bbpm.b(string, f, b.a(), bbowVar.e(0, new Runnable(this) { // from class: bbos
            private final bbov a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbow bbowVar2 = this.a.a;
                bbowVar2.i = bbowVar2.f;
            }
        }));
        String string2 = bbowVar.b.getString(R.string.EXEMPLAR_VOTE_SOMEWHAT);
        cqtd f2 = bbow.f(R.raw.neutral);
        b.d = dtxy.bk;
        bbpl b3 = bbpm.b(string2, f2, b.a(), bbowVar.e(1, new Runnable(this) { // from class: bbot
            private final bbov a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbow bbowVar2 = this.a.a;
                bbowVar2.i = bbowVar2.g;
            }
        }));
        String string3 = bbowVar.b.getString(R.string.EXEMPLAR_VOTE_YES);
        cqtd f3 = bbow.f(R.raw.thumbs_up);
        b.d = dtxy.bl;
        this.b = dcdc.h(b2, b3, bbpm.b(string3, f3, b.a(), bbowVar.e(2, new Runnable(this) { // from class: bbou
            private final bbov a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbow bbowVar2 = this.a.a;
                bbowVar2.i = bbowVar2.h;
            }
        })));
    }

    @Override // defpackage.bbmb
    public String a() {
        bbow bbowVar = this.a;
        gga ggaVar = bbowVar.b;
        ilo c = bbowVar.c.c();
        dbsk.s(c);
        return ggaVar.getString(R.string.PERSONAL_SCORE_FEEDBACK_SHEET_TITLE, new Object[]{c.n()});
    }

    @Override // defpackage.bbmb
    public List<bblz> b() {
        return this.b;
    }

    @Override // defpackage.bbmb
    public cjtd c() {
        return cjtd.a(dtxy.bg);
    }
}
