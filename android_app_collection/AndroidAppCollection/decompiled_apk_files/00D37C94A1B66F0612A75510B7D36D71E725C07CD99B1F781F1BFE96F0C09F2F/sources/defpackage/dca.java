package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: dca  reason: default package */
/* loaded from: classes3.dex */
public final class dca {
    final int a;
    boolean b;
    String c;

    public dca(Object obj) {
        boolean z;
        if (obj instanceof View) {
            View view = (View) obj;
            z = view.isClickable();
            z = view.isLongClickable() ? z | true : z;
            if (view.isFocusable()) {
                boolean z2 = z ? 1 : 0;
                char c = z ? 1 : 0;
                z = z2 | true;
            }
            if (view.isEnabled()) {
                boolean z3 = z ? 1 : 0;
                char c2 = z ? 1 : 0;
                z = z3 | true;
            }
            if (view.isSelected()) {
                boolean z4 = z ? 1 : 0;
                char c3 = z ? 1 : 0;
                char c4 = z ? 1 : 0;
                char c5 = z ? 1 : 0;
                z = z4 | true;
            }
        } else {
            z = false;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dca a(dms dmsVar) {
        Object obj = dmsVar.e;
        if (obj instanceof dca) {
            return (dca) obj;
        }
        throw new RuntimeException("MountData should not be null when using Litho's MountState.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Context context, dms dmsVar, String str) {
        dbn dbnVar = (dbn) dmsVar.d.a;
        cyr cyrVar = dbnVar.b;
        if (!this.b) {
            Object obj = dmsVar.a;
            dcm a = czo.a(context, cyrVar);
            if (a != null) {
                a.c(obj);
            }
            this.b = true;
            this.c = str;
            return;
        }
        String o = cyrVar.o();
        String str2 = cyrVar.m;
        String valueOf = String.valueOf(dbnVar.g);
        String str3 = this.c;
        int length = String.valueOf(o).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 98 + length2 + String.valueOf(valueOf).length() + String.valueOf(str3).length());
        sb.append("Releasing released mount content! component: ");
        sb.append(o);
        sb.append(", globalKey: ");
        sb.append(str2);
        sb.append(", transitionId: ");
        sb.append(valueOf);
        sb.append(", previousReleaseCause: ");
        sb.append(str3);
        throw new dbz(sb.toString());
    }
}
