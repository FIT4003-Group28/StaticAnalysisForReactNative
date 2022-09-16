package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ral  reason: default package */
/* loaded from: classes4.dex */
final class ral implements rar {
    private final /* synthetic */ int a;

    public ral() {
    }

    public ral(int i) {
        this.a = i;
    }

    @Override // defpackage.rar
    public final raq a(Context context, String str, rap rapVar) {
        int b;
        int i = this.a;
        int i2 = 0;
        if (i == 0) {
            raq raqVar = new raq();
            int a = rapVar.a(context, str);
            raqVar.a = a;
            if (a != 0) {
                b = rapVar.b(context, str, false);
                raqVar.b = b;
            } else {
                b = rapVar.b(context, str, true);
                raqVar.b = b;
            }
            int i3 = raqVar.a;
            if (i3 != 0) {
                i2 = i3;
            } else if (b == 0) {
                raqVar.c = 0;
                return raqVar;
            }
            if (i2 >= b) {
                raqVar.c = -1;
            } else {
                raqVar.c = 1;
            }
            return raqVar;
        } else if (i == 1) {
            raq raqVar2 = new raq();
            int b2 = rapVar.b(context, str, true);
            raqVar2.b = b2;
            if (b2 != 0) {
                raqVar2.c = 1;
            } else {
                int a2 = rapVar.a(context, str);
                raqVar2.a = a2;
                if (a2 != 0) {
                    raqVar2.c = -1;
                }
            }
            return raqVar2;
        } else {
            raq raqVar3 = new raq();
            raqVar3.a = rapVar.a(context, str);
            int b3 = rapVar.b(context, str, true);
            raqVar3.b = b3;
            int i4 = raqVar3.a;
            if (i4 != 0) {
                i2 = i4;
            } else if (b3 == 0) {
                raqVar3.c = 0;
                return raqVar3;
            }
            if (b3 >= i2) {
                raqVar3.c = 1;
            } else {
                raqVar3.c = -1;
            }
            return raqVar3;
        }
    }
}
