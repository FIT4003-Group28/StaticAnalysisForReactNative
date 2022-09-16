package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ahgl  reason: default package */
/* loaded from: classes2.dex */
class ahgl implements bblx {
    private final String a;
    private final jic b;
    private final cjtd c;

    public ahgl(gga ggaVar, dqbq dqbqVar) {
        String g;
        dpug dpugVar = dqbqVar.c;
        dpugVar = dpugVar == null ? dpug.d : dpugVar;
        ArrayList arrayList = new ArrayList();
        for (dnoj dnojVar : dpugVar.b) {
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) dnojVar.a);
            dnpq dnpqVar = dnojVar.b;
            SpannableStringBuilder append2 = append.append((CharSequence) (dnpqVar == null ? dnpq.g : dnpqVar).d).append((CharSequence) dnojVar.c);
            if (append2.length() > 0) {
                arrayList.add(new SpannableString(append2));
            }
        }
        if (arrayList.isEmpty()) {
            g = ggaVar.getString(R.string.LOCALSTREAM_PERSONAL_RECOMMENDATION_DEFAULT_JUSTIFICATION);
        } else {
            g = dbrz.f('\n').g(arrayList);
        }
        this.a = g;
        boolean z = (dpugVar.a & 2) != 0 && !dpugVar.c.isEmpty();
        this.b = new jic(z ? dpugVar.c : null, ckqc.FULLY_QUALIFIED, !z ? cqrt.i(iup.e(R.raw.localstream_check_icon_svg), ibm.x()) : null, 0);
        cjta b = cjtd.b();
        b.g(dqbqVar.f);
        b.d = dtxu.cg;
        this.c = b.a();
    }

    @Override // defpackage.bblx
    public jic a() {
        return this.b;
    }

    @Override // defpackage.bblx
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.bblx
    public cjtd c() {
        return this.c;
    }

    @Override // defpackage.bblx
    public Boolean d() {
        return false;
    }
}
