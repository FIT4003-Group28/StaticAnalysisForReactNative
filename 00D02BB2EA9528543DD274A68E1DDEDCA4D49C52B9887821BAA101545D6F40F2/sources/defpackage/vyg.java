package defpackage;

import android.content.Context;
import android.widget.RemoteViews;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: vyg  reason: default package */
/* loaded from: classes7.dex */
final class vyg extends vyk {
    private final vyk[] b;

    public vyg(Context context, vyk[] vykVarArr) {
        super(context);
        this.b = vykVarArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vyk
    public final List<RemoteViews> a(vyi vyiVar) {
        dccx F = dcdc.F();
        for (vyk vykVar : this.b) {
            F.i(vykVar.a(vyiVar));
        }
        return F.f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.b, ((vyg) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (vyk vykVar : this.b) {
            sb.append(vykVar.toString());
        }
        return sb.toString();
    }
}
