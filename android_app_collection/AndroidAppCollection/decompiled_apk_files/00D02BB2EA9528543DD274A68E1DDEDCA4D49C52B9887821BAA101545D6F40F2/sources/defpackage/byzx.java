package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: byzx  reason: default package */
/* loaded from: classes4.dex */
final class byzx implements dbty<Intent> {
    private final Intent a;

    public byzx(Intent intent) {
        this.a = intent;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ Intent a() {
        return this.a;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof byzx) {
            return this.a.filterEquals(((byzx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
