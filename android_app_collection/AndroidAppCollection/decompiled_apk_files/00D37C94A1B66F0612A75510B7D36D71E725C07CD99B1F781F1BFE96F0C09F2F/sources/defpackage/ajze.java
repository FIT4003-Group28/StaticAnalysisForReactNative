package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ajze  reason: default package */
/* loaded from: classes.dex */
public final class ajze implements ajyi {
    private final Context a;
    private final aafo b;
    private final ajsa c;
    private ajzc d;

    public ajze(Context context, aafo aafoVar) {
        context.getClass();
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
        this.c = new ajqw();
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        if (aten.class.isAssignableFrom(cls)) {
            this.c.f(aten.class, b());
        }
    }

    public final ajzc b() {
        if (this.d == null) {
            this.d = new ajzc(this.a, this.b);
        }
        return this.d;
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.c;
    }
}
