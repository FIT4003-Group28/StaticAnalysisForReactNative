package defpackage;
/* compiled from: PG */
/* renamed from: jm  reason: default package */
/* loaded from: classes3.dex */
public final class jm extends jl {
    private final Object a;

    public jm(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.jl, defpackage.jk
    public final Object a() {
        Object a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.jl, defpackage.jk
    public final boolean b(Object obj) {
        boolean b;
        synchronized (this.a) {
            b = super.b(obj);
        }
        return b;
    }
}
