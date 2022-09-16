package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitx  reason: default package */
/* loaded from: classes2.dex */
public class aitx implements aius {
    public aink a;
    private final aito b;

    public aitx(aink ainkVar, aito aitoVar) {
        this.a = ainkVar;
        this.b = aitoVar;
    }

    @Override // defpackage.aius
    public Boolean a() {
        return Boolean.valueOf(this.a.h() == 3);
    }

    @Override // defpackage.aius
    public Boolean b() {
        return Boolean.valueOf(this.a.h() == 4);
    }

    @Override // defpackage.aius
    public cqkl c() {
        deig deigVar;
        if (!b().booleanValue()) {
            airr airrVar = (airr) this.b;
            if (airrVar.aX()) {
                aink ainkVar = airrVar.aU;
                dbsk.s(ainkVar);
                if (ainkVar.d().isEmpty()) {
                    dbsg<btlu> dbsgVar = airrVar.aS;
                    dbsk.s(dbsgVar);
                    if (dbsgVar.a()) {
                        final ajof ajofVar = airrVar.aw;
                        dbsg<btlu> dbsgVar2 = airrVar.aS;
                        dbsk.s(dbsgVar2);
                        final btlu b = dbsgVar2.b();
                        aink ainkVar2 = airrVar.aU;
                        dbsk.s(ainkVar2);
                        final PersonId b2 = ainkVar2.b();
                        final ajpg a = ajofVar.e.a();
                        if (a.b.o(bvjk.gA, b, false)) {
                            deigVar = deha.a(true);
                        } else {
                            alp a2 = alp.a();
                            String t = b.t();
                            dbsk.s(t);
                            String b3 = a2.b(t);
                            final deig d = deig.d();
                            AlertDialog create = new AlertDialog.Builder(a.a, 2132018255).create();
                            cqkf c = a.c.c(new ajpr(), null);
                            View c2 = c.c();
                            c.e(new ajpe(a, new ajpf(a, b3), create, d, c2, b));
                            final cjql d2 = a.e.f(c2).d(cjtd.a(dtxu.eC));
                            create.setView(c2);
                            create.setCancelable(true);
                            create.setOnCancelListener(new DialogInterface.OnCancelListener(a, d2, d) { // from class: ajpd
                                private final ajpg a;
                                private final cjql b;
                                private final deig c;

                                {
                                    this.a = a;
                                    this.b = d2;
                                    this.c = d;
                                }

                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    ajpg ajpgVar = this.a;
                                    cjql cjqlVar = this.b;
                                    deig deigVar2 = this.c;
                                    ajpgVar.d.j(cjqlVar, cjtd.a(dtxu.eD));
                                    deigVar2.j(false);
                                }
                            });
                            if (create.getWindow() != null) {
                                Window window = create.getWindow();
                                dbsk.s(window);
                                window.setBackgroundDrawable(new ColorDrawable(0));
                            }
                            create.show();
                            deigVar = d;
                        }
                        bvqd.a(deew.g(deigVar, new defg(ajofVar, b, b2) { // from class: ajoc
                            private final ajof a;
                            private final btlu b;
                            private final PersonId c;

                            {
                                this.a = ajofVar;
                                this.b = b;
                                this.c = b2;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj) {
                                ajof ajofVar2 = this.a;
                                btlu btluVar = this.b;
                                PersonId personId = this.c;
                                if (((Boolean) obj).booleanValue()) {
                                    return ajofVar2.a(btluVar, personId);
                                }
                                return deha.a(false);
                            }
                        }, ajofVar.d), airrVar.aR);
                    }
                }
            }
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.aius
    public cjtd d() {
        return cjtd.a(b().booleanValue() ? dtxu.fp : dtxu.fo);
    }
}
