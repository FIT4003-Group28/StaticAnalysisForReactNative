package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cvhk  reason: default package */
/* loaded from: classes5.dex */
public final class cvhk {
    public final dbty<String> a;
    public final dbty<String> b;
    private final dbty<String> c;

    public cvhk(final Context context) {
        this.c = dbud.a(new dbty(context) { // from class: cvhh
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getPackageName();
            }
        });
        this.a = dbud.a(new dbty(this, context) { // from class: cvhi
            private final cvhk a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return btuv.c(this.b, this.a.a());
            }
        });
        this.b = dbud.a(new dbty(this, context) { // from class: cvhj
            private final cvhk a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return btuv.a(this.b.getPackageManager(), this.a.a());
            }
        });
    }

    public final String a() {
        return this.c.a();
    }
}
