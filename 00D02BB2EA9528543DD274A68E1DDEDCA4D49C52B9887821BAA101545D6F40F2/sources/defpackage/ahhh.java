package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahhh  reason: default package */
/* loaded from: classes2.dex */
public class ahhh extends ahhf implements agyq {
    private final Activity a;
    private final agaw b;
    private final jic c;
    private final CharSequence d;
    private final String e;
    @dzsi
    private final CharSequence f;
    private final cjtd g;
    private final CharSequence h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahhh(Activity activity, agaw agawVar, dlds dldsVar, cjta cjtaVar, CharSequence charSequence, ahhv ahhvVar, boolean z) {
        super(activity, null, ahhvVar, 1);
        String str = null;
        this.a = activity;
        this.b = agawVar;
        docg docgVar = dldsVar.b;
        this.e = (docgVar == null ? docg.M : docgVar).l;
        docg docgVar2 = dldsVar.b;
        dnfg dnfgVar = (docgVar2 == null ? docg.M : docgVar2).n;
        dnna dnnaVar = (dnfgVar == null ? dnfg.c : dnfgVar).b;
        dnnaVar = dnnaVar == null ? dnna.m : dnnaVar;
        this.c = new jic(dnnaVar.e, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998, 0);
        this.d = dnnaVar.b;
        this.h = charSequence;
        this.g = cjtaVar.b(dtxu.bM);
        dnmx dnmxVar = dnnaVar.h;
        int i = (dnmxVar == null ? dnmx.e : dnmxVar).b;
        if (i > 0) {
            String string = activity.getString(R.string.LOCAL_GUIDE_PREFIX);
            String quantityString = activity.getResources().getQuantityString(R.plurals.LOCAL_GUIDE_CURRENT_LEVEL, i, Integer.valueOf(i));
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(quantityString).length());
            sb.append(string);
            sb.append(" · ");
            sb.append(quantityString);
            str = sb.toString();
        }
        this.f = str;
    }

    @Override // defpackage.agyq
    @dzsi
    public jic A() {
        return this.c;
    }

    @Override // defpackage.agyq
    @dzsi
    public cqss B() {
        return ibl.b();
    }

    @Override // defpackage.agxd
    public CharSequence a() {
        return y();
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public Boolean b() {
        return true;
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public cqkl c() {
        agaw agawVar = this.b;
        agawVar.d.a().k(this.e, null);
        return cqkl.a;
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public cjtd d() {
        return this.g;
    }

    @Override // defpackage.agxd
    public List<agwt> e() {
        return dcdc.e();
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public String n() {
        return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SHARE_CARD, new Object[]{this.h});
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public Boolean o() {
        return true;
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public String q() {
        return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OPEN_MAP_IN_CARD, new Object[]{this.h});
    }

    @Override // defpackage.ahhe, defpackage.agxd
    public String t() {
        return this.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OVERFLOW_MENU_IN_CARD, new Object[]{this.h});
    }

    @Override // defpackage.agyq
    public CharSequence y() {
        return this.d;
    }

    @Override // defpackage.agyq
    @dzsi
    public CharSequence z() {
        return this.f;
    }
}
