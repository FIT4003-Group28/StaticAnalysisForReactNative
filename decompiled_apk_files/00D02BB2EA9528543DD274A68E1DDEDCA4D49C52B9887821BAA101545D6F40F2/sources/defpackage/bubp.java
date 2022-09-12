package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bubp  reason: default package */
/* loaded from: classes.dex */
public final class bubp {
    private final dbty<String> a;
    private final dbty<String> b;
    private final dbty<String> c;

    public bubp(final Context context) {
        this.a = dbud.a(new dbty(context) { // from class: bubm
            private final Context a;

            {
                this.a = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getPackageName();
            }
        });
        this.b = dbud.a(new dbty(this, context) { // from class: bubn
            private final bubp a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return btuv.c(this.b, this.a.c());
            }
        });
        this.c = dbud.a(new dbty(this, context) { // from class: bubo
            private final bubp a;
            private final Context b;

            {
                this.a = this;
                this.b = context;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return btuv.a(this.b.getPackageManager(), this.a.c());
            }
        });
    }

    public final String a() {
        return this.b.a();
    }

    public final String b() {
        return this.c.a();
    }

    public final String c() {
        return this.a.a();
    }
}
