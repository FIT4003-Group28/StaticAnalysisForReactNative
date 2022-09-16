package defpackage;
/* compiled from: PG */
/* renamed from: xnd  reason: default package */
/* loaded from: classes4.dex */
public final class xnd {
    private final ajqm a;
    private final ajwc b;
    private final ajzt c;

    public xnd(ajyj ajyjVar) {
        ajzt ajztVar = null;
        this.a = ajyjVar != null ? ajyjVar.lA() : null;
        this.b = ajyjVar instanceof ajwc ? (ajwc) ajyjVar : null;
        this.c = ajyjVar instanceof ajzt ? (ajzt) ajyjVar : ajztVar;
    }

    private final void b(aplr aplrVar) {
        ajzt ajztVar;
        if (aplrVar == null || (ajztVar = this.c) == null) {
            return;
        }
        ajztVar.G(aplrVar);
    }

    private static int c(Object obj) {
        if (obj instanceof aqbw) {
            int j = alwb.j(((aqbw) obj).k);
            if (j != 0) {
                return j;
            }
            return 1;
        } else if (obj instanceof ajhh) {
            return d(((ajhh) obj).a);
        } else {
            if (!(obj instanceof aqtb)) {
                return 1;
            }
            return d((aqtb) obj);
        }
    }

    private static int d(aqtb aqtbVar) {
        aqtc aqtcVar = aqtbVar.d;
        if (aqtcVar == null) {
            aqtcVar = aqtc.a;
        }
        int j = alwb.j(((aqta) aqtcVar.qm(aqta.b)).c);
        if (j == 0) {
            return 1;
        }
        return j;
    }

    public final void a(Object obj, boolean z) {
        ajzt ajztVar;
        obj.getClass();
        ajqm ajqmVar = this.a;
        if (ajqmVar == null || this.b == null) {
            return;
        }
        int a = ajqmVar.a();
        int c = c(obj) - 1;
        aplr aplrVar = null;
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            Object c2 = this.a.c(i2);
            if (c2 instanceof aqbx) {
                i = -1;
            } else if (c2 instanceof aplr) {
                aplrVar = (aplr) c2;
            } else {
                int c3 = c(c2) - 1;
                if (c >= c3) {
                    this.b.lw(obj, i2 + i);
                    if (z && (ajztVar = this.c) != null && c == c3) {
                        ajztVar.G(c2);
                    }
                    b(aplrVar);
                    return;
                }
            }
        }
        this.b.z(obj);
        b(aplrVar);
    }
}
