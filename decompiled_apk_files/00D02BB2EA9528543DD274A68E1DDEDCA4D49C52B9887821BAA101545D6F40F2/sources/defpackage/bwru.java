package defpackage;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: bwru  reason: default package */
/* loaded from: classes4.dex */
final class bwru extends ObjectOutputStream {
    private final bwqv a;

    public bwru(OutputStream outputStream, bwqv bwqvVar) {
        super(outputStream);
        this.a = bwqvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        enableReplaceObject(true);
    }

    @Override // java.io.ObjectOutputStream
    protected final Object replaceObject(Object obj) {
        if (obj instanceof bwrs) {
            ((bwrs) obj).e(this.a);
        }
        return obj;
    }
}
