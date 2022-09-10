package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: acng  reason: default package */
/* loaded from: classes.dex */
public final class acng implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof acnf) {
            acnf acnfVar = acnf.a;
            if (((acnf) cqkuVar).ordinal() != 0 || !(view instanceof acnj) || !(obj instanceof cqmj)) {
                return false;
            }
            acnj acnjVar = (acnj) view;
            ViewPager viewPager = (ViewPager) cqkx.e((View) acnjVar.getParent(), ((cqmj) obj).c(), ViewPager.class);
            if (viewPager == null) {
                return false;
            }
            acnjVar.setViewPager(viewPager);
            return true;
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
