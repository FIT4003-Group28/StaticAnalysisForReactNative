package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: acvk  reason: default package */
/* loaded from: classes2.dex */
public class acvk implements acvg {
    private final List<acvh> a;
    private final CharSequence b;
    private final cjtd c;
    @dzsi
    private final bgvw d;

    public acvk(Activity activity, cqat cqatVar, boxa boxaVar, bhat bhatVar, bgvx bgvxVar, ilo iloVar) {
        dcdc f;
        String string;
        acvj acvjVar = iloVar.aY() ? new acvj(iloVar, boxaVar) : null;
        if (!iloVar.al().d()) {
            f = dcdc.e();
        } else {
            dccx F = dcdc.F();
            F.g(acve.c(iloVar.q(), iloVar.al()));
            F.i(iloVar.am());
            f = F.f();
        }
        dcdc dcdcVar = f;
        if (iloVar.bf().r) {
            string = activity.getString(R.string.OPEN_HOURS_SUGGEST_AN_EDIT_MERCHANT_LABEL);
        } else {
            string = activity.getString(R.string.OPEN_HOURS_SUGGEST_AN_EDIT);
        }
        String str = string;
        ArrayList arrayList = new ArrayList();
        int size = dcdcVar.size();
        boolean z = true;
        int i = 0;
        boolean z2 = true;
        while (i < size) {
            acve acveVar = (acve) dcdcVar.get(i);
            arrayList.add(new acvm(activity, acveVar.a(), acveVar.b(), cqatVar, z2, z != z2 ? null : acvjVar, str));
            i++;
            size = size;
            z2 = false;
            z = true;
        }
        this.a = arrayList;
        this.b = iloVar.al().b.c("");
        this.c = cjtd.a(dtxy.kp);
        this.d = null;
    }

    @Override // defpackage.acvg
    public List<acvh> a() {
        return this.a;
    }

    @Override // defpackage.acvg
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.acvg
    public cjtd c() {
        return this.c;
    }

    @Override // defpackage.acvg
    @dzsi
    public bgvw d() {
        return null;
    }
}
