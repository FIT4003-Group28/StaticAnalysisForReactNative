package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
/* compiled from: PG */
/* renamed from: atnq  reason: default package */
/* loaded from: classes2.dex */
public final class atnq extends ImageView {
    @dzsi
    private Maneuvers$Maneuver a;
    private int b;

    public atnq(Context context) {
        super(context);
        this.b = -1;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(atnq.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(@dzsi Maneuvers$Maneuver maneuvers$Maneuver) {
        return cqjv.i(atnl.MANEUVER, maneuvers$Maneuver, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> c(cqlc<T, Maneuvers$Maneuver> cqlcVar) {
        return cqjv.g(atnl.MANEUVER, cqlcVar, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> d(@dzsi cqss cqssVar) {
        return cqjv.i(atnl.MANEUVER_COLOR, cqssVar, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> e(cqjb<T, cqss> cqjbVar) {
        return cqjv.e(atnl.MANEUVER_COLOR, cqjbVar, atnk.a);
    }

    private final void f() {
        Maneuvers$Maneuver maneuvers$Maneuver = this.a;
        if (maneuvers$Maneuver == null) {
            setImageDrawable(null);
        } else {
            setImageDrawable(vrv.j(maneuvers$Maneuver, this.b));
        }
    }

    public void setColor(int i) {
        this.b = i;
        f();
    }

    public void setManeuver(@dzsi Maneuvers$Maneuver maneuvers$Maneuver) {
        this.a = maneuvers$Maneuver;
        f();
    }

    public atnq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
    }
}
