package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dbvt  reason: default package */
/* loaded from: classes5.dex */
final class dbvt extends dbus {
    final /* synthetic */ Callable a;

    public dbvt(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.dbus
    public final Object b(Object obj) {
        return this.a.call();
    }
}
