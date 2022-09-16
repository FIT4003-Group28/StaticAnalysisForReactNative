package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: srl  reason: default package */
/* loaded from: classes4.dex */
public final class srl extends teb {
    private final Set a;

    public srl(Set set) {
        this.a = set;
    }

    @Override // defpackage.teb
    public final void a(int i, String str, tda tdaVar, Throwable th) {
        for (teb tebVar : this.a) {
            tebVar.a(i, str, tdaVar, th);
        }
    }
}
