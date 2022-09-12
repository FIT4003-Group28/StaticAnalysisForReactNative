package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzvr  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzvr implements Serializable, dzwm {
    public static final Object e = dzvq.a;
    private transient dzwm a;
    protected final Object b;
    public final String c;
    public final String d;
    private final Class f;

    /* JADX INFO: Access modifiers changed from: protected */
    public dzvr(Object obj, Class cls, String str, String str2) {
        this.b = obj;
        this.f = cls;
        this.c = str;
        this.d = str2;
    }

    public final dzwm c() {
        dzwm dzwmVar = this.a;
        if (dzwmVar == null) {
            f();
            this.a = this;
            return this;
        }
        return dzwmVar;
    }

    public final dzwo d() {
        return dzwe.a(this.f);
    }

    @Override // defpackage.dzwm
    public final Object e() {
        throw null;
    }

    protected abstract void f();
}
