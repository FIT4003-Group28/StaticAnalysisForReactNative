package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgo  reason: default package */
/* loaded from: classes2.dex */
public final class cgo extends ByteArrayOutputStream {
    final /* synthetic */ cgp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgo(cgp cgpVar, int i) {
        super(i);
        this.a = cgpVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, this.a.a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
