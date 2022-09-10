package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: blmx  reason: default package */
/* loaded from: classes3.dex */
public class blmx implements jay, bqlb {
    public final bllc a;
    public final bwrs<ilo> b;
    public final Activity c;
    public final cjqy d;
    public final dxio<bqji> e;
    public final bvrb f;
    public final eeu g;
    public final cpv h;
    public final cebr i;
    public final dxio<cdjj> j;
    @dzsi
    public AlertDialog k;
    private final cdja l;
    @dzsi
    private jht m;

    public blmx(bllc bllcVar, bwrs<ilo> bwrsVar, cdja cdjaVar, Activity activity, eeu eeuVar, cjqy cjqyVar, dxio<bqji> dxioVar, bvrb bvrbVar, btvo btvoVar, cpv cpvVar, cebr cebrVar, dxio<cdjj> dxioVar2) {
        this.a = bllcVar;
        this.b = bwrsVar;
        this.c = activity;
        this.g = eeuVar;
        this.d = cjqyVar;
        this.e = dxioVar;
        this.f = bvrbVar;
        this.l = cdjaVar;
        this.h = cpvVar;
        this.i = cebrVar;
        this.j = dxioVar2;
    }

    @Override // defpackage.jay
    public List a() {
        return dcdc.e();
    }

    @Override // defpackage.jay
    @dzsi
    public jht b() {
        if (this.m == null) {
            boolean z = false;
            String string = this.a.E() > 0 ? this.c.getString(R.string.SELF_POST_WITH_ORDINAL, new Object[]{Integer.valueOf(this.a.E())}) : "";
            jhu h = jhv.h();
            jhi jhiVar = (jhi) h;
            jhiVar.c = Integer.valueOf((int) R.drawable.ic_overflow_selector);
            jhiVar.e = string;
            ArrayList a = dchl.a();
            boolean z2 = this.a.b().b() != null && TextUtils.isEmpty(this.a.b().h());
            ilo c = this.b.c();
            dbsk.s(c);
            if (!this.a.p().booleanValue() && c.br()) {
                z = true;
            }
            boolean equals = cdja.PUBLISHED.equals(this.l);
            boolean booleanValue = this.a.h().booleanValue();
            if (z) {
                a.add(jhm.b(R.string.DELETE_DRAFT_REVIEW).c());
            }
            if (equals) {
                if (z) {
                    a.add(jhm.b(true != z2 ? R.string.DELETE_PUBLISHED_REVIEW : R.string.DELETE_PUBLISHED_RATING).c());
                } else {
                    if (booleanValue) {
                        a.add(jhm.b(z2 ? R.string.EDIT_RATING : R.string.EDIT_REVIEW).c());
                    }
                    a.add(jhm.b(true != z2 ? R.string.DELETE_REVIEW : R.string.DELETE_RATING).c());
                }
            }
            h.e(a);
            jhiVar.b = new jhr(this) { // from class: blmu
                private final blmx a;

                {
                    this.a = this;
                }

                @Override // defpackage.jhr
                public final void a(int i) {
                    cdja cdjaVar;
                    ddho ddhoVar;
                    ddho ddhoVar2;
                    int i2;
                    blmx blmxVar = this.a;
                    if (i == R.string.EDIT_RATING || i == R.string.EDIT_REVIEW) {
                        blmxVar.d.i(cjtd.a(blmxVar.g() ? dtxy.mn : dtxy.jT));
                        blmxVar.a.j();
                        return;
                    }
                    if (i == R.string.DELETE_RATING || i == R.string.DELETE_PUBLISHED_RATING) {
                        blmxVar.d.i(cjtd.a(blmxVar.g() ? dtxy.mm : dtxy.jS));
                        cdjaVar = cdja.PUBLISHED;
                        ddhoVar = dtxy.hS;
                        ddhoVar2 = dtxy.hR;
                        i2 = R.string.CONFIRM_DELETE_PUBLISHED_RATING_AND_MEDIA;
                    } else if (i == R.string.DELETE_REVIEW || i == R.string.DELETE_PUBLISHED_REVIEW) {
                        blmxVar.d.i(cjtd.a(dtxy.jS));
                        cdjaVar = cdja.PUBLISHED;
                        ddhoVar = dtxy.hS;
                        ddhoVar2 = dtxy.hR;
                        i2 = R.string.CONFIRM_DELETE_PUBLISHED_REVIEW_AND_MEDIA;
                    } else if (i != R.string.DELETE_DRAFT_REVIEW) {
                        return;
                    } else {
                        ilo c2 = blmxVar.b.c();
                        dbsk.s(c2);
                        cjtd a2 = c2.a();
                        cjqy cjqyVar = blmxVar.d;
                        cjta c3 = cjtd.c(a2);
                        c3.d = dtxn.eL;
                        cjqyVar.i(c3.a());
                        cdjaVar = cdja.DRAFT;
                        ddhoVar = dtxy.hQ;
                        ddhoVar2 = dtxy.hP;
                        i2 = R.string.CONFIRM_DELETE_DRAFT;
                    }
                    cdja cdjaVar2 = cdjaVar;
                    String C = blmxVar.a.C(cdjaVar2);
                    ilo c4 = blmxVar.b.c();
                    dbsk.s(c4);
                    cjtd a3 = c4.a();
                    blmxVar.k = new AlertDialog.Builder(blmxVar.c).setMessage(i2).setPositiveButton(R.string.YES_BUTTON, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.NO_BUTTON, new DialogInterface.OnClickListener(blmxVar, a3, ddhoVar2) { // from class: blms
                        private final blmx a;
                        private final cjtd b;
                        private final ddho c;

                        {
                            this.a = blmxVar;
                            this.b = a3;
                            this.c = ddhoVar2;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            blmx blmxVar2 = this.a;
                            cjtd cjtdVar = this.b;
                            ddho ddhoVar3 = this.c;
                            cjqy cjqyVar2 = blmxVar2.d;
                            cjta c5 = cjtd.c(cjtdVar);
                            c5.d = ddhoVar3;
                            cjqyVar2.i(c5.a());
                            dialogInterface.dismiss();
                        }
                    }).show();
                    Button button = blmxVar.k.getButton(-1);
                    button.setOnClickListener(new View.OnClickListener(blmxVar, button, a3, ddhoVar, C, cdjaVar2) { // from class: blmt
                        private final blmx a;
                        private final Button b;
                        private final cjtd c;
                        private final ddho d;
                        private final String e;
                        private final cdja f;

                        {
                            this.a = blmxVar;
                            this.b = button;
                            this.c = a3;
                            this.d = ddhoVar;
                            this.e = C;
                            this.f = cdjaVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            blmx blmxVar2 = this.a;
                            Button button2 = this.b;
                            cjtd cjtdVar = this.c;
                            ddho ddhoVar3 = this.d;
                            String str = this.e;
                            cdja cdjaVar3 = this.f;
                            button2.setEnabled(false);
                            cjqy cjqyVar2 = blmxVar2.d;
                            cjta c5 = cjtd.c(cjtdVar);
                            c5.d = ddhoVar3;
                            cjqyVar2.i(c5.a());
                            if (!blmxVar2.i.a() || !blmxVar2.a.p().booleanValue()) {
                                blmxVar2.e.a().e(str, cdjaVar3, dnqh.p, blmxVar2.b, blmxVar2);
                                return;
                            }
                            cdjj a4 = blmxVar2.j.a();
                            dnqg bZ = dnqh.p.bZ();
                            dnmu dnmuVar = dnmu.PROPERTY_GMM;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dnqh dnqhVar = (dnqh) bZ.b;
                            dnqhVar.l = dnmuVar.ap;
                            dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                            a4.b(str, bZ.bK(), blmxVar2.b, new blmw(blmxVar2));
                        }
                    });
                }
            };
            jhiVar.a = new jhs(this) { // from class: blmv
                private final blmx a;

                {
                    this.a = this;
                }

                @Override // defpackage.jhs
                public final void a() {
                    blmx blmxVar = this.a;
                    View currentFocus = blmxVar.c.getCurrentFocus();
                    if (currentFocus != null) {
                        blmxVar.h.f(currentFocus, blmxVar.c.getString(R.string.OVERFLOW_MENU_OPENED_ACCESSIBILITY));
                    }
                }
            };
            this.m = h.b();
        }
        return this.m;
    }

    @Override // defpackage.jay
    public void c(int i) {
    }

    @Override // defpackage.bqlb
    public void d(bqlf bqlfVar) {
        if (!this.g.b()) {
            return;
        }
        bvrb bvrbVar = this.f;
        Activity activity = this.c;
        cjxu.g(bvrbVar, activity, activity.getString(R.string.DELETE_REVIEW_SUCCESS));
        f();
    }

    @Override // defpackage.bqlb
    public void e() {
        if (!this.g.b()) {
            return;
        }
        bvrb bvrbVar = this.f;
        Activity activity = this.c;
        cjxu.g(bvrbVar, activity, activity.getString(R.string.DELETE_REVIEW_FAILED));
        f();
    }

    public final void f() {
        AlertDialog alertDialog = this.k;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public final boolean g() {
        if (!this.i.a()) {
            return false;
        }
        return this.a.p().booleanValue();
    }
}
