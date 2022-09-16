package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: smz  reason: default package */
/* loaded from: classes4.dex */
final class smz implements amqo {
    final /* synthetic */ snb a;

    public smz(snb snbVar) {
        this.a = snbVar;
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        snb snbVar = this.a;
        Bundle bundle = new Bundle();
        bundle.putString("methodName", "getAccountName");
        Bundle a = snbVar.b.a("getSignature", bundle);
        return a == null ? amon.a : ampq.j(Integer.valueOf(a.getInt("version")));
    }
}
