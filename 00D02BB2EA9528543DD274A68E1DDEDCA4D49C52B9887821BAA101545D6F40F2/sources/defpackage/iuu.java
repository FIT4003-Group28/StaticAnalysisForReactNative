package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: iuu  reason: default package */
/* loaded from: classes6.dex */
public final class iuu extends cqsj implements cqsn, iuz {
    public final cqsn a;
    public final cqsn b;

    public iuu(cqsn cqsnVar, cqsn cqsnVar2) {
        super(new Object[]{cqsnVar, cqsnVar2});
        dbsk.s(cqsnVar);
        this.a = cqsnVar;
        dbsk.s(cqsnVar2);
        this.b = cqsnVar2;
    }

    @Override // defpackage.cqsj, defpackage.cqur
    public final boolean NJ() {
        return true;
    }

    @Override // defpackage.iuz
    public final /* bridge */ /* synthetic */ Object NS() {
        return this.b;
    }

    @Override // defpackage.cqsn
    public final CharSequence a(Context context) {
        return ((cqsn) iva.k(this)).a(context);
    }

    @Override // defpackage.iuz
    public final /* bridge */ /* synthetic */ Object d() {
        return this.a;
    }
}
