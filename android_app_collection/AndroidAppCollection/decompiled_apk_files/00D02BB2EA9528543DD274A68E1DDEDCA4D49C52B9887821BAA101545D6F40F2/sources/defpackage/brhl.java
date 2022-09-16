package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: brhl  reason: default package */
/* loaded from: classes.dex */
public final class brhl implements afhy {
    private final dzsj<bqji> a;

    public brhl(dzsj<bqji> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.afhy
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, String str) {
        b(intent, 1);
        bqji a = this.a.a();
        b(a, 3);
        return new brhk(intent, str, a);
    }
}
