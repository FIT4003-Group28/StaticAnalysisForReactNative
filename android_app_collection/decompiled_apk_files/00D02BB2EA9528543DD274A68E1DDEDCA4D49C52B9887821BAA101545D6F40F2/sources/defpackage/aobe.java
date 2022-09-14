package defpackage;

import android.content.Context;
import defpackage.cqkp;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aobe  reason: default package */
/* loaded from: classes2.dex */
public final class aobe<T extends cqkp> implements cqjb<T, cqfc> {
    public boolean a = true;
    private final cqjb<T, Boolean> b;
    @dzsi
    private cqfc c;

    public aobe(cqjb<T, Boolean> cqjbVar) {
        this.b = cqjbVar;
    }

    @Override // defpackage.cqjb
    @dzsi
    public final /* bridge */ /* synthetic */ cqfc a(cqkp cqkpVar, Context context) {
        Boolean a = this.b.a(cqkpVar, context);
        if (a == null || this.a == a.booleanValue()) {
            return this.c;
        }
        this.a = a.booleanValue();
        aobd aobdVar = new aobd(this);
        this.c = aobdVar;
        return aobdVar;
    }
}
