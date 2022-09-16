package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: tcj  reason: default package */
/* loaded from: classes4.dex */
public final class tcj {
    public static final /* synthetic */ int a = 0;
    private static final amqo b = aqxo.i(gsh.e);

    /* JADX INFO: Access modifiers changed from: protected */
    public static ImageView a(Context context) {
        return new ImageView(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(cyv cyvVar, float f) {
        if (f > 0.0f) {
            tfp tfpVar = new tfp(f);
            int i = tcd.C;
            tcd.B(tfpVar, cyvVar.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(dad dadVar, dad dadVar2, dad dadVar3) {
        return !tfy.c((aodt) dadVar.b, (aodt) dadVar.a) || !tfy.c((aodt) dadVar2.b, (aodt) dadVar2.a) || !tfy.c((aodt) dadVar3.b, (aodt) dadVar3.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(cyv cyvVar, cyz cyzVar, aodt aodtVar, int i, aodt aodtVar2, aodt aodtVar3, dcz dczVar, dcz dczVar2) {
        Context context = cyvVar.b;
        dczVar2.a = new ddj(cyzVar.H(), cyzVar.C());
        cgd o = tfo.o(context, aodtVar, aodtVar2, aodtVar3, cyzVar.H(), cyzVar.C());
        if (o == null) {
            return;
        }
        if (i == 1) {
            o.k((cgh) b.get());
        }
        dczVar.a = o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(cgd cgdVar, ddj ddjVar, aodt aodtVar) {
        String m;
        if (cgdVar == null || aodtVar.aa() == 0 || (m = aodtVar.ab(0).m()) == null) {
            return;
        }
        String scheme = tfo.l(m).getScheme();
        if ((!"http".equals(scheme) && !"https".equals(scheme)) || ddjVar.a <= 0 || ddjVar.b <= 0) {
            return;
        }
        ((cgd) cgdVar.m().s(ckb.b)).o(ddjVar.a, ddjVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void f(cyv cyvVar, ImageView imageView, aodt aodtVar, aodt aodtVar2, aodt aodtVar3, akcq akcqVar, Boolean bool, tda tdaVar, tfl tflVar, cgd cgdVar, ddj ddjVar, teb tebVar, teh tehVar, boolean z) {
        if (cgdVar == null) {
            if (!z || tfo.n(cyvVar.b)) {
                return;
            }
            int aa = aodtVar.aa();
            StringBuilder sb = new StringBuilder(207);
            sb.append("Failed to find a valid source for the image. Sources: ");
            sb.append(aa);
            sb.append(". Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data.");
            tebVar.c(23, sb.toString(), tdaVar);
            return;
        }
        cgdVar.a(new tci());
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, tfy.h(aodtVar));
        }
        cgdVar.p(new tch(ddjVar, imageView, aodtVar, akcqVar, aodtVar2, aodtVar3, tflVar, tebVar, tehVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(cyv cyvVar, ImageView imageView, Boolean bool, tfl tflVar) {
        Context context = cyvVar.b;
        if (!tfo.n(context)) {
            cfk.c(context).i(imageView);
        }
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, null);
        }
        if (tflVar != null) {
            tflVar.d();
            tflVar.a();
        }
    }
}
