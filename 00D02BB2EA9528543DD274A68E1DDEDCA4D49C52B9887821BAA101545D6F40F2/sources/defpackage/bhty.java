package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhty  reason: default package */
/* loaded from: classes3.dex */
public class bhty implements jay {
    public final bwrs<ilo> a;
    public final cdjd b;
    public final Activity c;
    public final aput d;

    public bhty(bwrs<ilo> bwrsVar, cdjd cdjdVar, Activity activity, aput aputVar) {
        this.a = bwrsVar;
        this.b = cdjdVar;
        this.c = activity;
        this.d = aputVar;
    }

    private final cjtd d(ddho ddhoVar) {
        ilo c = this.a.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = ddhoVar;
        return c2.a();
    }

    @Override // defpackage.jay
    public List a() {
        return dcdc.e();
    }

    @Override // defpackage.jay
    @dzsi
    public jht b() {
        jhu h = jhv.h();
        jhi jhiVar = (jhi) h;
        jhiVar.e = this.c.getString(R.string.OWNER_RESPONSE_ACCESSIBILITY_OVERFLOW_MENU_DESCRIPTION, new Object[]{this.b.a().b().h(bhtv.a).c("")});
        if (this.b.d().a()) {
            cdiy b = this.b.d().b();
            if (b.d().a()) {
                jhm jhmVar = new jhm();
                jhmVar.a = this.c.getString(R.string.OWNER_RESPONSE_EDIT_REPLY);
                jhmVar.b = this.c.getString(R.string.OWNER_RESPONSE_EDIT_REPLY);
                jhmVar.f = d(dtxv.cJ);
                jhmVar.d(new View.OnClickListener(this) { // from class: bhtw
                    private final bhty a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bhty bhtyVar = this.a;
                        bhtyVar.d.e(bhtyVar.a, bhtyVar.b.d().b().d().b(), bhtyVar.c.getString(R.string.EDIT_REVIEW_REPLY_PAGE_TITLE), false);
                    }
                });
                h.d(jhmVar.c());
            }
            if (b.e().a()) {
                jhm jhmVar2 = new jhm();
                jhmVar2.a = this.c.getString(R.string.OWNER_RESPONSE_DELETE_REPLY);
                jhmVar2.b = this.c.getString(R.string.OWNER_RESPONSE_DELETE_REPLY);
                jhmVar2.f = d(dtxv.cH);
                jhmVar2.d(new View.OnClickListener(this) { // from class: bhtx
                    private final bhty a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bhty bhtyVar = this.a;
                        bhtyVar.d.f(bhtyVar.a, bhtyVar.b.d().b().e().b());
                    }
                });
                h.d(jhmVar2.c());
            }
        }
        return jhiVar.b();
    }

    @Override // defpackage.jay
    public void c(int i) {
    }
}
