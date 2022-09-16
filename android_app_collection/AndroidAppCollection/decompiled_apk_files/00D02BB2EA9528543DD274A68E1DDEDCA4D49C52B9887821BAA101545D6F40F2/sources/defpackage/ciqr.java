package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ciqr  reason: default package */
/* loaded from: classes4.dex */
final class ciqr extends cqiw<ciqt> implements chzi {
    public static final /* synthetic */ int a = 0;

    private static final cqnf<ciqt> e(int i) {
        return cqgr.U(cqiq.b(Integer.valueOf(i), cqiq.h(ciqe.a), cqiq.h(ciqf.a)));
    }

    @SafeVarargs
    private static final cqmj<ciqt> f(cqmp<ciqt>... cqmpVarArr) {
        cqlc a2 = cqkz.a(cqrt.g(2131232403, ibl.b()));
        cqlc cqlcVar = ciqq.a;
        cqlc cqlcVar2 = cipx.a;
        cqlc cqlcVar3 = cipy.a;
        cqmj<ciqt> f = cibk.f(a2, cqgr.q(cqlcVar2), cipz.a, cqkz.a(true), cqgr.eM(cqlcVar), cqgr.V(cqlcVar3), cqmn.a(cqgr.aR(Integer.valueOf((int) R.id.add_dish_name_button))));
        f.f(cqmpVarArr);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ciqt> a() {
        cqa[] cqaVarArr = {cpp.b(R.id.add_dish_name_button, R.id.skip_dish_button, R.id.edit_dish_name_button, R.id.confirm_dish_name_button)};
        cqmp[] cqmpVarArr = {cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(new cqlc() { // from class: ciqn
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                ckqc ckqcVar;
                String f = ((ciqt) cqkpVar).f();
                if (dbsj.d(f) || !dsna.e(f)) {
                    ckqcVar = ckqc.FULLY_QUALIFIED;
                } else {
                    ckqcVar = ckqc.FIFE;
                }
                return new jic(f, ckqcVar, ibm.h(), 250);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })};
        cqmp[] cqmpVarArr2 = {cqgr.bw(8388659)};
        cqmj a2 = jgn.a(cqgr.aF(cqjv.x(ciqh.a)), cqgr.cd(-2), cqgr.bp(-2), cqgr.cH(cqrp.d(24.0d)), jgn.b(cqrp.d(4.0d)), cqgr.bR(cqrp.d(12.0d)), cqgr.bV(cqrp.d(12.0d)), cqgr.x(ciqs.c), iue.f(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(16), cqgr.dJ(cqrp.d(8.0d)), cqjv.l(cqjv.x(ciqj.a), cqgr.eK(cqiq.e(Integer.valueOf((int) R.plurals.TAG_PUBLISHED_PHOTOS_TASK_NUMBER_OF_PHOTO_VIEWS), 0, cqiq.g(0))), cqgr.eK(cqiq.f(R.plurals.TAG_PUBLISHED_PHOTOS_TASK_NUMBER_OF_PHOTO_VIEWS, ciqk.a, cqiq.h(ciql.a)))), cqgr.aW(2), cqgr.eN(5), ibq.q(), cqgr.eU(ibl.b())));
        a2.f(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = {cqgr.aJ(81), cqgr.bw(80), cqic.f(ciqo.a, new cqmp[0])};
        cqui c = cqui.c(cquh.i(ibm.W(), ibm.W(), ibm.W(), ibm.W(), cqrt.c(R.color.mod_black_alpha30), ibm.a()), cquh.a(0), cquh.d(GradientDrawable.Orientation.BOTTOM_TOP), cquh.b(0));
        cqmp[] cqmpVarArr4 = {cqgr.aJ(81)};
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-2), cqgr.bp(-2), cqmp.e, cqgr.bD(cqrp.d(cibk.d)), cqgr.dJ(cqrp.d(16.0d)), cqgr.gq(cqic.f(cqjv.x(ciqb.a), new cqmp[0]), cqgr.eL(Integer.valueOf((int) R.string.TAG_PUBLISHED_PHOTOS_TASK_DISH_CARD_QUESTION_TEXT)), e((int) R.string.TAG_PUBLISHED_PHOTOS_TASK_PHOTO_RICH_TAG_PHOTO_WITH_PLACE_CONTENT_DESCRIPTION), ciqs.a), cqgr.gq(cqic.c(cqjv.x(ciqc.a), new cqmp[0]), cqgr.eJ(null), ciqs.b), cqgr.gq(cqic.c(cqjv.x(ciqd.a), new cqmp[0]), cqmp.e, cqgr.ar(TextUtils.TruncateAt.END), cqgr.cB(2), ciqs.b), cqgr.aW(2));
        gd.f(cqmpVarArr4);
        cqmj gd2 = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.cH(cqrp.d(180.0d)), cqgr.dB(cqrp.d(12 - cibk.a)), cqgr.x(c), gd, f(cqgr.bw(81)), cqmp.e);
        gd2.f(cqmpVarArr3);
        return cqgr.gd(cqgr.dr(1), cqjv.l(cipw.a, cqgr.cd(-1), cqgr.ce(cqrp.d(268.0d))), jgn.a(cqgr.U(new cqjb(this) { // from class: ciqa
            private final ciqr a;

            {
                this.a = this;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                String string;
                ciqt ciqtVar = (ciqt) cqkpVar;
                Resources resources = context.getResources();
                String k = ciqtVar.k();
                String e = ciqtVar.e();
                Integer j = ciqtVar.j();
                ciqtVar.o();
                int i = dbsj.a;
                if (!ciqtVar.m().booleanValue()) {
                    string = resources.getString(R.string.TAG_PUBLISHED_PHOTOS_TASK_NUMBERED_PHOTO_WITH_PLACE_CONTENT_DESCRIPTION, k, e);
                } else {
                    string = resources.getString(R.string.TAG_PUBLISHED_PHOTOS_TASK_PHOTO_RICH_TAG_PHOTO_WITH_PLACE_CONTENT_DESCRIPTION, k, e);
                }
                if (j == null) {
                    return string;
                }
                String quantityString = resources.getQuantityString(R.plurals.TAG_PUBLISHED_PHOTOS_TASK_NUMBER_OF_PHOTO_VIEWS, j.intValue(), j);
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(quantityString).length());
                sb.append(string);
                sb.append(" ");
                sb.append(quantityString);
                return sb.toString();
            }
        }), cqgr.cW(cqgr.q(ciqi.a)), cqgr.en(true), cqgr.aW(1), cpp.g(cqaVarArr), cqgr.bq(cqrp.d(240.0d)), iue.c(ciqm.a), WebImageView.a(cqmpVarArr), jgn.b(cqrp.d(16.0d)), a2, gd2, f(cqgr.bw(81), cqic.c(ciqp.a, new cqmp[0])), cibk.g(cqkz.a(cqrt.g(2131232209, ibl.b())), cqgr.q(ciqg.a), cqkz.a(cjtd.a(dtxl.hQ)), cqkz.a(ciqs.c), cqgr.aR(Integer.valueOf((int) R.id.skip_dish_button)), cqgr.bA(cqrp.d(12 - cibk.a)), e((int) R.string.TAG_PUBLISHED_PHOTOS_TASK_SKIP_PHOTO_WITH_PLACE_CONTENT_DESCRIPTION), cqmn.a(cqgr.bw(8388661)))), cqmp.e, cqmp.e);
    }

    @Override // defpackage.chzi
    public final cqjg b() {
        return ciqs.d;
    }
}
