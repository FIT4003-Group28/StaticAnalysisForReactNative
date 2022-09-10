package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: dysc  reason: default package */
/* loaded from: classes6.dex */
final class dysc extends dyik {
    final /* synthetic */ dysd a;

    public dysc(dysd dysdVar) {
        this.a = dysdVar;
    }

    @Override // defpackage.dyik
    public final String a() {
        return this.a.b;
    }

    @Override // defpackage.dyik
    public final void b(dyig dyigVar) {
        dyih a = dyii.a();
        a.a = Collections.singletonList(new dyfw(this.a.a));
        a.b = dyel.b;
        dyigVar.a(a.a());
    }

    @Override // defpackage.dyik
    public final void c() {
    }
}
