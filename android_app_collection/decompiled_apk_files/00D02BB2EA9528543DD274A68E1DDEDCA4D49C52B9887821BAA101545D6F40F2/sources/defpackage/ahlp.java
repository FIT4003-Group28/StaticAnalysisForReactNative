package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahlp  reason: default package */
/* loaded from: classes2.dex */
public final class ahlp implements cogc {
    private final Iterator<byte[]> a;

    public ahlp(List<byte[]> list) {
        this.a = list.iterator();
    }

    @Override // defpackage.cogc
    public final void a(cohh cohhVar) {
        if (this.a.hasNext()) {
            cohhVar.a(this.a.next(), null);
        } else {
            cohhVar.a(null, null);
        }
    }

    @Override // defpackage.cogc
    public final void b() {
    }

    @Override // defpackage.cogc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
