package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: pls  reason: default package */
/* loaded from: classes4.dex */
public abstract class pls implements pky {
    private boolean d;
    private ByteBuffer c = f;
    public ByteBuffer i = f;
    private pkw a = pkw.a;
    private pkw b = pkw.a;
    protected pkw g = pkw.a;
    protected pkw h = pkw.a;

    protected pkw a(pkw pkwVar) {
        throw null;
    }

    protected void d() {
    }

    protected void e() {
    }

    protected void f() {
    }

    @Override // defpackage.pky
    public final pkw j(pkw pkwVar) {
        this.a = pkwVar;
        this.b = a(pkwVar);
        return o() ? this.b : pkw.a;
    }

    @Override // defpackage.pky
    public ByteBuffer k() {
        ByteBuffer byteBuffer = this.i;
        this.i = f;
        return byteBuffer;
    }

    @Override // defpackage.pky
    public final void l() {
        this.i = f;
        this.d = false;
        this.g = this.a;
        this.h = this.b;
        d();
    }

    @Override // defpackage.pky
    public final void m() {
        this.d = true;
        e();
    }

    @Override // defpackage.pky
    public final void n() {
        l();
        this.c = f;
        this.a = pkw.a;
        this.b = pkw.a;
        this.g = pkw.a;
        this.h = pkw.a;
        f();
    }

    @Override // defpackage.pky
    public boolean o() {
        return this.b != pkw.a;
    }

    @Override // defpackage.pky
    public boolean p() {
        return this.d && this.i == f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer q(int i) {
        if (this.c.capacity() < i) {
            this.c = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.c.clear();
        }
        ByteBuffer byteBuffer = this.c;
        this.i = byteBuffer;
        return byteBuffer;
    }
}
