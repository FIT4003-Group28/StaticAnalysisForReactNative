package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azmi  reason: default package */
/* loaded from: classes2.dex */
final class azmi extends AtomicReference {
    private static final long serialVersionUID = 2404266111789071508L;
    private Object a;

    public azmi() {
    }

    public final azmi a() {
        return (azmi) get();
    }

    public final Object b() {
        Object obj = this.a;
        this.a = null;
        return obj;
    }

    public azmi(Object obj) {
        this.a = obj;
    }
}
