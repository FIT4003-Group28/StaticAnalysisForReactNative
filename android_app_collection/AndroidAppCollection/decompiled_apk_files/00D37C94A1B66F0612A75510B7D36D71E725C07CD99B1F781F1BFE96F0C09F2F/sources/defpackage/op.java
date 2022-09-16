package defpackage;

import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: op  reason: default package */
/* loaded from: classes3.dex */
public final class op extends oo {
    public final pg a;
    final /* synthetic */ ot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(ot otVar, pg pgVar) {
        super(otVar);
        this.b = otVar;
        this.a = pgVar;
    }

    @Override // defpackage.oo
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.oo
    public final void b() {
        this.b.T();
    }
}
