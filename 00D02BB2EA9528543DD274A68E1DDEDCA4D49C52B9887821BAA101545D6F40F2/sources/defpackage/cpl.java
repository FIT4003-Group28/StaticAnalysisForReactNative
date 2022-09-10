package defpackage;

import android.view.View;
import defpackage.cqkp;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpl  reason: default package */
/* loaded from: classes5.dex */
public final class cpl<T extends cqkp> implements cpk {
    private final oy a;
    private final cqjb<T, ? extends CharSequence> b;
    private final pp c;

    public cpl(oy oyVar, cqjb<T, ? extends CharSequence> cqjbVar) {
        dzvx.c(oyVar, "action");
        this.a = oyVar;
        this.b = cqjbVar;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final oy c(View view) {
        cqjb<T, ? extends CharSequence> cqjbVar = this.b;
        cqkp o = cqjz.o(view);
        if (true != (o instanceof cqkp)) {
            o = null;
        }
        CharSequence charSequence = o != null ? (CharSequence) cqjbVar.a(o, view.getContext()) : null;
        if (charSequence != null) {
            return new oy(this.a.a(), charSequence);
        }
        return null;
    }

    @Override // defpackage.cpk
    public final void a(Map<Integer, pp> map) {
        dzvx.c(map, "actionMap");
    }

    @Override // defpackage.cqa
    public final void b(View view, pc pcVar) {
        oy c;
        dzvx.c(view, "host");
        if (dzvx.d(this.a, oy.h)) {
            pcVar.N(true);
        }
        if (dzvx.d(this.a, oy.c)) {
            if (!view.isClickable() || !view.hasOnClickListeners() || (c = c(view)) == null) {
                return;
            }
            pcVar.h(c);
            return;
        }
        oy c2 = c(view);
        if (c2 == null) {
            c2 = this.a;
        }
        pcVar.h(c2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cpl)) {
                return false;
            }
            cpl cplVar = (cpl) obj;
            if (!dzvx.d(this.a, cplVar.a) || !dzvx.d(this.b, cplVar.b)) {
                return false;
            }
            pp ppVar = cplVar.c;
            return dzvx.d(null, null);
        }
        return true;
    }

    public final int hashCode() {
        oy oyVar = this.a;
        return (((oyVar != null ? oyVar.hashCode() : 0) * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "AccessibilityActionSingle(action=" + this.a + ", label=" + this.b + ", command=" + ((Object) null) + ")";
    }
}
