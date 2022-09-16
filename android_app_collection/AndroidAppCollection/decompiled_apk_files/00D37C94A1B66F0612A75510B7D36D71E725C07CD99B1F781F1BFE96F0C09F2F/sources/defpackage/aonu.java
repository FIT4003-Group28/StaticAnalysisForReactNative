package defpackage;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aonu  reason: default package */
/* loaded from: classes.dex */
public final class aonu extends aonv {
    final /* synthetic */ aoob a;
    private int b = 0;
    private final int c;

    public aonu(aoob aoobVar) {
        this.a = aoobVar;
        this.c = aoobVar.d();
    }

    @Override // defpackage.aonx
    public final byte a() {
        int i = this.b;
        if (i < this.c) {
            this.b = i + 1;
            return this.a.b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
