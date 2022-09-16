package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axvb  reason: default package */
/* loaded from: classes3.dex */
public final class axvb {
    public static axvp a(final axub axubVar) {
        return new axvp(axubVar) { // from class: axva
            private final axub a;

            {
                this.a = axubVar;
            }

            @Override // defpackage.axvp
            public final void E(boolean z, azvc azvcVar, Context context) {
                axub axubVar2 = this.a;
                if (z) {
                    axubVar2.a(azvcVar);
                } else {
                    axubVar2.b();
                }
            }
        };
    }
}
