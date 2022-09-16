package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: oir  reason: default package */
/* loaded from: classes3.dex */
public final class oir {
    private final Activity a;
    private final gbu b;
    private final eyj c;

    public oir(Activity activity, eyj eyjVar, gbu gbuVar) {
        this.a = activity;
        this.c = eyjVar;
        this.b = gbuVar;
    }

    public final fry a() {
        return new luj(this.a, this.c, new amqo() { // from class: oiq
            @Override // defpackage.amqo
            public final Object get() {
                return oir.this.b();
            }
        });
    }

    public final String b() {
        gbd i = this.b.i();
        if (i != null) {
            return i.aR();
        }
        return null;
    }
}
