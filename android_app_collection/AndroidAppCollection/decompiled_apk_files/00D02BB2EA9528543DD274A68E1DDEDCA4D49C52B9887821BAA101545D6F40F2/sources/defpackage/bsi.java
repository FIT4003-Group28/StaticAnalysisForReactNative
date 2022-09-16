package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
/* compiled from: PG */
/* renamed from: bsi  reason: default package */
/* loaded from: classes4.dex */
final class bsi extends ByteArrayOutputStream {
    final /* synthetic */ bsj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsi(bsj bsjVar, int i) {
        super(i);
        this.a = bsjVar;
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
