package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ajqz  reason: default package */
/* loaded from: classes.dex */
public final class ajqz implements ajry {
    public final Context a;
    public final amqo b;
    public final ajsa c;

    public ajqz(Context context, amqo amqoVar, ajsa ajsaVar) {
        context.getClass();
        this.a = context;
        amqoVar.getClass();
        this.b = amqoVar;
        this.c = ajsaVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        return new ajqq(this.a, (ajrx) this.b.get(), this.c);
    }
}
