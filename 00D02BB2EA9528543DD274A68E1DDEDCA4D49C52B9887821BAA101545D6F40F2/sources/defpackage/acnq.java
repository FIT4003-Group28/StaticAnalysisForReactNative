package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.view.View;
/* compiled from: PG */
/* renamed from: acnq  reason: default package */
/* loaded from: classes.dex */
public final class acnq implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof acno) {
            acno acnoVar = acno.a;
            if (((acno) cqkuVar).ordinal() != 0 || !(view instanceof NestedScrollView) || !(obj instanceof qa)) {
                return false;
            }
            ((NestedScrollView) view).setOnScrollChangeListener((qa) obj);
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
