package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: enu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class enu implements DialogInterface.OnClickListener {
    public final /* synthetic */ env a;
    private final /* synthetic */ int b;

    public /* synthetic */ enu(env envVar, int i) {
        this.b = i;
        this.a = envVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            env envVar = this.a;
            envVar.b.startActivity(envVar.a());
            return;
        }
        env envVar2 = this.a;
        envVar2.b.startActivity(envVar2.a());
    }
}
