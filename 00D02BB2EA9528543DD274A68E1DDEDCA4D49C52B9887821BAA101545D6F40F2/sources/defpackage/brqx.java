package defpackage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: brqx  reason: default package */
/* loaded from: classes4.dex */
public class brqx implements brqu {
    private static final dcqe a = dcqe.c("brqx");
    private final CharSequence b;
    private final String c;
    private final dcdc<cqkp> d;
    private final cqqw e;

    /* JADX WARN: Multi-variable type inference failed */
    public brqx(brlu brluVar, brrm brrmVar, cqqw cqqwVar, Resources resources, bvsl bvslVar, ahjq ahjqVar, cqg cqgVar) {
        dwhp dwhpVar;
        String string;
        boolean z;
        brlu brluVar2 = brluVar;
        this.e = cqqwVar;
        bvrt<dwhp> bvrtVar = brluVar2.k;
        if (bvrtVar != null) {
            dwhpVar = bvrtVar.e((dssr) dwhp.c.cu(7), dwhp.c);
        } else {
            dwhpVar = dwhp.c;
        }
        String str = dwhpVar.a;
        String str2 = "";
        if (str.isEmpty()) {
            bvoo.h("Annotated query is empty.", new Object[0]);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            for (dqfj dqfjVar : dwhpVar.b) {
                int i = dqfjVar.b;
                int i2 = dqfjVar.c;
                if (i >= 0 && i < i2 && i2 <= str.length()) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 17);
                } else {
                    bvoo.h("Missing term has invalid offsets: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
                    break;
                }
            }
            str2 = spannableStringBuilder;
        }
        this.b = str2;
        if (dwhpVar.b.isEmpty()) {
            string = resources.getString(R.string.PARTIAL_UNDERSTANDING_PARTIAL_MATCHES);
        } else {
            string = resources.getString(R.string.PARTIAL_UNDERSTANDING_DESCRIPTION, TextUtils.join(resources.getString(R.string.PARTIAL_UNDERSTANDING_DESCRIPTION_UNMATCHED_PHRASES_DELIMITER), dcft.o(dwhpVar.b, brqv.a)));
        }
        this.c = string;
        dccx F = dcdc.F();
        GmmLocation a2 = ahjqVar.a();
        int i3 = 0;
        while (true) {
            if (i3 >= brluVar.E()) {
                z = false;
                break;
            }
            broh D = brluVar2.D(i3);
            if (D.c()) {
                dpzu dpzuVar = D.d().h().bh;
                if ((dpzuVar == null ? dpzu.b : dpzuVar).a.size() > 0) {
                    z = true;
                    break;
                }
            }
            i3++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < brluVar.E()) {
            broh D2 = brluVar2.D(i4);
            if (D2.c()) {
                F.g(new brrn(D2.d(), z, brrmVar, i5, a2, bvslVar, resources));
                i5++;
            }
            i4++;
            brluVar2 = brluVar;
        }
        F.g(new brqw(cqgVar));
        this.d = F.f();
    }

    @Override // defpackage.brqu
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.brqu
    public List<cqkp> b() {
        return this.d;
    }

    @Override // defpackage.brqu
    public String c() {
        return this.c;
    }

    @Override // defpackage.brqu
    public cqqw d() {
        return this.e;
    }
}
