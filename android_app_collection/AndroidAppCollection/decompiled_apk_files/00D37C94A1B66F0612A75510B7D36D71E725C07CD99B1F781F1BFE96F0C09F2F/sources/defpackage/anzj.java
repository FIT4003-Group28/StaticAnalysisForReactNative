package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: anzj  reason: default package */
/* loaded from: classes.dex */
public final class anzj implements anzl {
    private final aoaf a;

    public anzj(final Context context) {
        this.a = new anye(new aoaf() { // from class: anzi
            @Override // defpackage.aoaf
            public final Object a() {
                return anzm.a(context);
            }
        });
    }

    @Override // defpackage.anzl
    public final int a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean c = ((anzm) this.a.a()).c(str, currentTimeMillis);
        boolean b = ((anzm) this.a.a()).b(currentTimeMillis);
        if (!c || !b) {
            if (b) {
                return 3;
            }
            return c ? 2 : 1;
        }
        return 4;
    }
}
