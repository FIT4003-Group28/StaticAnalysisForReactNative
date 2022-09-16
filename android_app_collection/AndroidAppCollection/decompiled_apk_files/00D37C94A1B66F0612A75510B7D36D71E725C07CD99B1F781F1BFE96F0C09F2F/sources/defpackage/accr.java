package defpackage;

import java.io.DataOutputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: accr  reason: default package */
/* loaded from: classes.dex */
final class accr {
    public final DataOutputStream a;
    private final accq b;

    public accr() {
        accq accqVar = new accq();
        this.b = accqVar;
        this.a = new DataOutputStream(accqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer a() {
        return ByteBuffer.wrap(this.b.b(), 0, this.b.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b.reset();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.a.writeByte(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(double d) {
        this.a.writeByte(0);
        this.a.writeDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        this.a.writeShort(0);
        this.a.writeByte(9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(String str) {
        this.a.writeShort(str.length());
        this.a.write(str.getBytes("UTF-8"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(String str) {
        this.a.writeByte(2);
        this.a.writeShort(str.length());
        this.a.write(str.getBytes("UTF-8"));
    }
}
