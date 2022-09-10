package defpackage;

import java.io.InputStream;
import java.io.ObjectInputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwrt  reason: default package */
/* loaded from: classes4.dex */
public final class bwrt extends ObjectInputStream {
    private final bwqv a;

    public bwrt(InputStream inputStream, bwqv bwqvVar) {
        super(inputStream);
        this.a = bwqvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        enableResolveObject(true);
    }

    @Override // java.io.ObjectInputStream
    protected final Object resolveObject(Object obj) {
        bwqj bwqjVar;
        return (!(obj instanceof bwrs) || (bwqjVar = ((bwrs) obj).a) == null) ? obj : this.a.b(bwqjVar);
    }
}
