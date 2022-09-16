package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: acgj  reason: default package */
/* loaded from: classes2.dex */
public final class acgj<T> extends btrh<T> {
    private final int d;

    public acgj(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((acgh) this.a).aj.p(((ahlc) obj).a);
            return;
        }
        acgh acghVar = (acgh) this.a;
        GmmLocation a = ((amqo) obj).a();
        acik acikVar = acghVar.ai;
        if (acikVar.a != null || a == null) {
            return;
        }
        acikVar.a = a.B();
        if (!a.c) {
            return;
        }
        acghVar.ai.b = Long.valueOf(a.getTime());
    }
}
