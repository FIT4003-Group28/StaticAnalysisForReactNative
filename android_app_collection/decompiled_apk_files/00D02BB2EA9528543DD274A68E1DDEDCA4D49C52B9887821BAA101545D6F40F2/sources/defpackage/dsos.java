package defpackage;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsos  reason: default package */
/* loaded from: classes.dex */
public final class dsos extends dsot {
    final /* synthetic */ dspd a;
    private int b = 0;
    private final int c;

    public dsos(dspd dspdVar) {
        this.a = dspdVar;
        this.c = dspdVar.c();
    }

    @Override // defpackage.dsox
    public final byte a() {
        int i = this.b;
        if (i < this.c) {
            this.b = i + 1;
            return this.a.b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
