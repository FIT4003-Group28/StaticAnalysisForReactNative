package defpackage;

import android.accounts.Account;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: rwp  reason: default package */
/* loaded from: classes4.dex */
public final class rwp implements qsj {
    public final int a;
    public final int b;
    public final Account c;
    final boolean d;

    public rwp() {
        this(new rwo());
    }

    public rwp(rwo rwoVar) {
        this.a = rwoVar.a;
        this.b = 1;
        this.d = true;
        this.c = rwoVar.b;
    }

    @Override // defpackage.qsj
    public final Account a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rwp) {
            rwp rwpVar = (rwp) obj;
            if (tnk.j(Integer.valueOf(this.a), Integer.valueOf(rwpVar.a))) {
                int i = rwpVar.b;
                if (tnk.j(1, 1) && tnk.j(this.c, rwpVar.c)) {
                    boolean z = rwpVar.d;
                    if (tnk.j(true, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, this.c, true});
    }
}
