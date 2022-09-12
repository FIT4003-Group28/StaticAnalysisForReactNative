package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acne  reason: default package */
/* loaded from: classes.dex */
public final class acne implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof acnc) {
            acnc acncVar = acnc.a;
            if (((acnc) cqkuVar).ordinal() != 0 || !(view instanceof cpny) || !(obj instanceof acmy)) {
                return false;
            }
            acmy acmyVar = (acmy) obj;
            cpny cpnyVar = (cpny) view;
            acnd.b(cpnyVar, new acmz(acmyVar, cpnyVar), new acna(cpnyVar));
            cpnyVar.setTag(R.id.bar_chart_clearer, new acnb(cpnyVar, acmyVar));
            if (!od.ak(cpnyVar)) {
                return true;
            }
            acnd.c(acmyVar, cpnyVar);
            return true;
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof acnc) {
            acnc acncVar = acnc.a;
            if (((acnc) cqkuVar).ordinal() != 0 || !(view instanceof cpny)) {
                return false;
            }
            cpny cpnyVar = (cpny) view;
            acnd.b(cpnyVar, null, null);
            Runnable runnable = (Runnable) cpnyVar.getTag(R.id.bar_chart_clearer);
            if (runnable == null) {
                return true;
            }
            runnable.run();
            cpnyVar.setTag(R.id.bar_chart_clearer, null);
            return true;
        }
        return false;
    }
}
