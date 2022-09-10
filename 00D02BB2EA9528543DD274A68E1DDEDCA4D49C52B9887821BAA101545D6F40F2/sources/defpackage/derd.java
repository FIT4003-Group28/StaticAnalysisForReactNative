package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: derd  reason: default package */
/* loaded from: classes6.dex */
public final class derd implements derf {
    private final desq<derg> a;

    public derd(final Context context) {
        this.a = new depn(new desq(context) { // from class: derb
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.desq
            public final Object a() {
                return derg.a(this.a);
            }
        });
    }

    public static deow<derf> component() {
        deov builder = deow.builder(derf.class);
        builder.b(depi.required(Context.class));
        builder.c(derc.a);
        return builder.a();
    }

    @Override // defpackage.derf
    public final int a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean b = this.a.a().b(str, currentTimeMillis);
        boolean c = this.a.a().c(currentTimeMillis);
        if (!b || !c) {
            if (c) {
                return 3;
            }
            return b ? 2 : 1;
        }
        return 4;
    }
}
