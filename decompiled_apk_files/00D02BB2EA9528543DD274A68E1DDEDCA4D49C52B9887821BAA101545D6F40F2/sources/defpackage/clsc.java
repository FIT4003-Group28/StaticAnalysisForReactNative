package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: clsc  reason: default package */
/* loaded from: classes5.dex */
public abstract class clsc implements clrh {
    private boolean h;
    private ByteBuffer g = a;
    public ByteBuffer d = a;
    private clrf e = clrf.a;
    private clrf f = clrf.a;
    protected clrf b = clrf.a;
    protected clrf c = clrf.a;

    @Override // defpackage.clrh
    public final clrf a(clrf clrfVar) {
        this.e = clrfVar;
        this.f = j(clrfVar);
        return b() ? this.f : clrf.a;
    }

    @Override // defpackage.clrh
    public boolean b() {
        return this.f != clrf.a;
    }

    @Override // defpackage.clrh
    public final void d() {
        this.h = true;
        k();
    }

    @Override // defpackage.clrh
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.d;
        this.d = a;
        return byteBuffer;
    }

    @Override // defpackage.clrh
    public boolean f() {
        return this.h && this.d == a;
    }

    @Override // defpackage.clrh
    public final void g() {
        this.d = a;
        this.h = false;
        this.b = this.e;
        this.c = this.f;
        l();
    }

    @Override // defpackage.clrh
    public final void h() {
        g();
        this.g = a;
        this.e = clrf.a;
        this.f = clrf.a;
        this.b = clrf.a;
        this.c = clrf.a;
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer i(int i) {
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        ByteBuffer byteBuffer = this.g;
        this.d = byteBuffer;
        return byteBuffer;
    }

    protected clrf j(clrf clrfVar) {
        throw null;
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m() {
    }
}
