package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: afmt  reason: default package */
/* loaded from: classes.dex */
public final class afmt extends afmw {
    private final amqo a;
    private final amqo b;

    public afmt(Context context) {
        this.a = aqxo.i(new nfd(context, 12));
        this.b = aqxo.i(new nfd(context, 13));
    }

    @Override // defpackage.amqo
    /* renamed from: a */
    public final afmv get() {
        return (afmv) this.a.get();
    }

    public final afmv b() {
        return (afmv) this.b.get();
    }
}
