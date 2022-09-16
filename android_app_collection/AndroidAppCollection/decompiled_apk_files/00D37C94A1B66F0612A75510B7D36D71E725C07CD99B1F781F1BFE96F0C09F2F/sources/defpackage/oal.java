package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: oal  reason: default package */
/* loaded from: classes3.dex */
final class oal extends WeakReference {
    private Object a;

    public oal(Object obj, int i) {
        super(obj);
        if (i == 1) {
            this.a = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        if (i == 0) {
            this.a = null;
        } else {
            this.a = get();
        }
    }
}
