package defpackage;

import java.util.concurrent.CancellationException;
/* renamed from: avch  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class avch implements dbsl {
    static final dbsl a = new avch();

    private avch() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        int i = avck.c;
        return ((Throwable) obj) instanceof CancellationException;
    }
}
