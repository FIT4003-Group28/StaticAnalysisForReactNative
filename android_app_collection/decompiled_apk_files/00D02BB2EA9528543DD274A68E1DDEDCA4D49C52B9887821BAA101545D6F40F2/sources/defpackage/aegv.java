package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: aegv  reason: default package */
/* loaded from: classes.dex */
public final class aegv {
    public static aegq a(final aegq... aegqVarArr) {
        return new aegq(aegqVarArr) { // from class: aegr
            private final aegq[] a;

            {
                this.a = aegqVarArr;
            }

            @Override // defpackage.aegq
            public final View a(ViewGroup viewGroup) {
                aegq[] aegqVarArr2 = this.a;
                int length = aegqVarArr2.length;
                int i = 0;
                ViewGroup viewGroup2 = viewGroup;
                while (i < length) {
                    aegq aegqVar = aegqVarArr2[i];
                    if (!(viewGroup2 instanceof ViewGroup)) {
                        return null;
                    }
                    i++;
                    viewGroup2 = aegqVar.a(viewGroup2);
                }
                return viewGroup2;
            }
        };
    }

    public static aegq b(final int i) {
        return new aegq(i) { // from class: aegs
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.aegq
            public final View a(ViewGroup viewGroup) {
                return viewGroup.findViewById(this.a);
            }
        };
    }

    public static aegq c() {
        return new aegq() { // from class: aegt
            @Override // defpackage.aegq
            public final View a(ViewGroup viewGroup) {
                if (viewGroup.getChildCount() > 0) {
                    return viewGroup.getChildAt(0);
                }
                return null;
            }
        };
    }
}
