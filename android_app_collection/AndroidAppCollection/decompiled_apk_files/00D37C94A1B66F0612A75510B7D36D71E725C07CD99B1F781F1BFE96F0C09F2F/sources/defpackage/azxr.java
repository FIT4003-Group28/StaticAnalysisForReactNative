package defpackage;

import java.lang.reflect.Constructor;
/* compiled from: PG */
/* renamed from: azxr  reason: default package */
/* loaded from: classes2.dex */
public final class azxr extends azsu implements azsc {
    final /* synthetic */ Constructor a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azxr(Constructor constructor) {
        super(1);
        this.a = constructor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azxr(Constructor constructor, int i) {
        super(1);
        this.b = i;
        this.a = constructor;
    }

    @Override // defpackage.azsc
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Object p;
        Object newInstance;
        Object p2;
        Object newInstance2;
        Throwable th;
        Object newInstance3;
        Throwable th2;
        Object newInstance4;
        int i = this.b;
        Object obj2 = null;
        if (i == 0) {
            Throwable th3 = (Throwable) obj;
            th3.getClass();
            try {
                newInstance = this.a.newInstance(th3);
            } catch (Throwable th4) {
                p = azqj.p(th4);
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            p = (Throwable) newInstance;
            if (true != (p instanceof azqg)) {
                obj2 = p;
            }
            return (Throwable) obj2;
        } else if (i == 1) {
            Throwable th5 = (Throwable) obj;
            th5.getClass();
            try {
                newInstance2 = this.a.newInstance(th5.getMessage(), th5);
            } catch (Throwable th6) {
                p2 = azqj.p(th6);
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            p2 = (Throwable) newInstance2;
            if (true != (p2 instanceof azqg)) {
                obj2 = p2;
            }
            return (Throwable) obj2;
        } else if (i != 2) {
            Throwable th7 = (Throwable) obj;
            th7.getClass();
            try {
                newInstance4 = this.a.newInstance(new Object[0]);
            } catch (Throwable th8) {
                th2 = azqj.p(th8);
            }
            if (newInstance4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th9 = (Throwable) newInstance4;
            th9.initCause(th7);
            th2 = th9;
            if (true != (th2 instanceof azqg)) {
                obj2 = th2;
            }
            return (Throwable) obj2;
        } else {
            Throwable th10 = (Throwable) obj;
            th10.getClass();
            try {
                newInstance3 = this.a.newInstance(th10.getMessage());
            } catch (Throwable th11) {
                th = azqj.p(th11);
            }
            if (newInstance3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th12 = (Throwable) newInstance3;
            th12.initCause(th10);
            th = th12;
            if (true != (th instanceof azqg)) {
                obj2 = th;
            }
            return (Throwable) obj2;
        }
    }
}
