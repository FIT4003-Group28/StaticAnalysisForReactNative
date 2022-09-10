package defpackage;
/* compiled from: PG */
/* renamed from: hvh  reason: default package */
/* loaded from: classes.dex */
public final class hvh<T> extends btrh<T> {
    private final int d;

    public hvh(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            hvg hvgVar = ((hvf) this.a).a;
            hvgVar.a = (dwwr) obj;
            hvgVar.b();
        } else if (i != 1) {
            hvf hvfVar = (hvf) this.a;
            alif alifVar = (alif) obj;
        } else {
            hvf hvfVar2 = (hvf) this.a;
            afop afopVar = (afop) obj;
            throw null;
        }
    }
}
