package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnqv  reason: default package */
/* loaded from: classes3.dex */
public class bnqv implements bnqo {
    public final bnqu a;
    public final bnqp b;
    private final Context c;
    private final jib d;
    private final CharSequence e;
    private final View.OnClickListener f = new bnqs(this);
    private final List<bnqr> g = new ArrayList();
    private final jkf h;

    public bnqv(Context context, jkf jkfVar, dpjn dpjnVar, List<dpca> list, String str, bnqu bnquVar) {
        String str2;
        this.c = context;
        this.h = jkfVar;
        this.a = bnquVar;
        for (dpca dpcaVar : list) {
            this.g.add(new bnqr(context.getResources(), dpcaVar, dpjnVar, str, bnquVar));
        }
        this.b = new bnqp(context.getResources(), dpjnVar, str, bnquVar);
        dpjx dpjxVar = dpjnVar.b;
        dpjxVar = dpjxVar == null ? dpjx.n : dpjxVar;
        if ((dpjxVar.a & 128) != 0) {
            str2 = dpjxVar.e;
        } else {
            dosw doswVar = dpjnVar.c;
            str2 = (doswVar == null ? dosw.f : doswVar).c;
        }
        this.e = str2;
        jhz a = jhz.a();
        a.f(this.f);
        a.g = ibl.b();
        a.x = false;
        a.r = 0;
        a.h = false;
        this.d = a.b();
    }

    @Override // defpackage.bnqo
    public jbk a() {
        return new iyl(this.d);
    }

    @Override // defpackage.bnqo
    public List<bnqr> b() {
        return this.g;
    }

    @Override // defpackage.bnqo
    public cqkl d() {
        this.h.B(jjn.FULLY_EXPANDED);
        return cqkl.a;
    }

    @Override // defpackage.bnqo
    public Boolean e() {
        return Boolean.valueOf(this.h.l().L() == jjn.FULLY_EXPANDED);
    }

    @Override // defpackage.bnqo
    /* renamed from: g */
    public bnqp c() {
        return this.b;
    }

    @Override // defpackage.bnqo
    /* renamed from: h */
    public ivw f() {
        return new bnqt(this, this.c, ivu.SLIDER_TOP, jaq.DAY_NIGHT_BLUE_ON_WHITE, cqrt.f(2131231604), this.c.getString(R.string.DESTINATION_REFINEMENT_DIRECTIONS_ICON_VOICE_DESCRIPTION, this.e));
    }
}
