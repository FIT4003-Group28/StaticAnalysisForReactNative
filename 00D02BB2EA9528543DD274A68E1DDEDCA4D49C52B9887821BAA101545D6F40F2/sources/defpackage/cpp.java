package defpackage;

import android.view.View;
import android.widget.Button;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpp  reason: default package */
/* loaded from: classes5.dex */
public final class cpp {
    private static final cpm a = new cpm();

    public static final <T extends cqkp> cqa a(cqlc<T, ? extends Map<oy, ? extends View.OnClickListener>> cqlcVar) {
        dzvx.c(cqlcVar, "actionMapVmFun");
        return a;
    }

    public static final cqa b(int... iArr) {
        return new cpy(iArr);
    }

    public static final <T extends cqkp> cqa c(cqlc<T, ? extends CharSequence> cqlcVar) {
        dzvx.c(cqlcVar, "label");
        return e(new cpn(cqlcVar));
    }

    public static final cqa d(cqsn cqsnVar) {
        return e(new cpo(cqsnVar));
    }

    public static final <T extends cqkp> cqa e(cqjb<T, ? extends CharSequence> cqjbVar) {
        oy oyVar = oy.c;
        dzvx.b(oyVar, "AccessibilityActionCompat.ACTION_CLICK");
        return oyVar.a() != 0 ? new cpl(oyVar, cqjbVar) : a;
    }

    public static final cqa f() {
        return new cpt(Button.class);
    }

    public static final <T extends cqkp> cqnf<T> g(cqa... cqaVarArr) {
        return cqjv.j(cqfe.ACCESSIBILITY_DELEGATE, new cpz(cqaVarArr));
    }
}
