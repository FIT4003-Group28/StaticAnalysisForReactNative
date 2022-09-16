package defpackage;
/* compiled from: PG */
/* renamed from: yph  reason: default package */
/* loaded from: classes4.dex */
public final class yph implements yre {
    private final yni a;
    private final ymg b;
    private final ymg c;
    private final ymg d;
    private final ymg e;

    public yph(yni yniVar, ymg ymgVar, ymg ymgVar2, ymg ymgVar3, ymg ymgVar4) {
        this.a = yniVar;
        this.b = ymgVar;
        this.c = ymgVar2;
        this.d = ymgVar3;
        this.e = ymgVar4;
    }

    @Override // defpackage.yre
    public final void a() {
        this.a.d(this.c);
    }

    @Override // defpackage.yre
    public final void b() {
        this.a.d(this.b);
    }

    @Override // defpackage.yre
    public final void c() {
        ymg ymgVar = this.e;
        if (ymgVar != null) {
            this.a.d(ymgVar);
        }
    }

    @Override // defpackage.yre
    public final void d() {
        ymg ymgVar = this.d;
        if (ymgVar != null) {
            this.a.d(ymgVar);
        }
    }
}
