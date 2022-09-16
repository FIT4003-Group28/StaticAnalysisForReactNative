package defpackage;

import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: aizy  reason: default package */
/* loaded from: classes.dex */
public final class aizy implements ajae {
    private final /* synthetic */ int a;

    public aizy() {
    }

    public aizy(int i) {
        this.a = i;
    }

    @Override // defpackage.ajae
    public final long b() {
        return this.a != 0 ? 8192L : 0L;
    }

    @Override // defpackage.ajae
    public final long c(long j) {
        return this.a != 0 ? j | 8321 : j;
    }

    @Override // defpackage.ajae
    public final long d() {
        return this.a != 0 ? 8192L : 0L;
    }

    @Override // defpackage.ajae
    public final void e() {
    }

    @Override // defpackage.ajae
    public final void g() {
    }

    @Override // defpackage.ajae
    public final List a() {
        if (this.a == 0) {
            return amuk.q();
        }
        return amuk.q();
    }

    @Override // defpackage.ajae
    public final Bundle f() {
        if (this.a == 0) {
            return new Bundle();
        }
        return new Bundle();
    }
}
