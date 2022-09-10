package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.gmm.place.updates.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bngi  reason: default package */
/* loaded from: classes3.dex */
public final class bngi implements jay {
    private jht a = bnfv.b(bngf.a);
    private final crzp<btlu> b;
    private final jho c;
    private final jho d;
    private final jho e;
    private final bnfy f;
    private final View.OnClickListener g;
    private final cjkr h;

    public bngi(Activity activity, akfa akfaVar, dxio<cdjj> dxioVar, dxio<bkpi> dxioVar2, Executor executor, bwrs<ilo> bwrsVar, cdjd cdjdVar) {
        bnge bngeVar = new bnge(this, cdjdVar);
        this.b = bngeVar;
        akfaVar.C().e(bngeVar, executor);
        this.c = bnfv.a(R.string.PHOTO_UPDATE_OVERFLOW_MENU_REPORT_BUTTON, new bngh(dxioVar2, cdjdVar));
        this.d = bnfv.a(R.string.PHOTO_UPDATE_OVERFLOW_MENU_EDIT_BUTTON, new bngc(cdjdVar, dxioVar, bwrsVar));
        this.e = bnfv.a(R.string.PHOTO_UPDATE_OVERFLOW_MENU_DELETE_BUTTON, new bnga(this));
        this.f = new bnfy(this, executor, activity);
        bnfx bnfxVar = new bnfx(this, dxioVar, cdjdVar, bwrsVar);
        this.g = bnfxVar;
        cjkp B = cjkr.B();
        B.x(2131231773);
        B.t(activity.getString(R.string.PHOTO_UPDATE_CONFIRM_DELETE_DIALOG_TITLE));
        ((cjke) B).e = activity.getString(R.string.PHOTO_UPDATE_CONFIRM_DELETE_DIALOG_DESCRIPTION);
        B.w(activity.getString(R.string.PHOTO_UPDATE_CONFIRM_DELETE_DIALOG_DELETE_BUTTON), bnfxVar, bnfv.d(dtxy.ib), false);
        B.y(activity.getString(R.string.PHOTO_UPDATE_CONFIRM_DELETE_DIALOG_CANCEL_BUTTON), bnfw.a, bnfv.d(dtxy.ia));
        cjkr u = B.u(activity);
        dzvx.b(u, "with(Dialog.builder()) {…)\n    build(activity)\n  }");
        this.h = u;
    }

    @Override // defpackage.jay
    public List a() {
        return dcdc.e();
    }

    @Override // defpackage.jay
    public jht b() {
        return this.a;
    }

    @Override // defpackage.jay
    public void c(int i) {
    }

    public final cjkr d() {
        return this.h;
    }
}
