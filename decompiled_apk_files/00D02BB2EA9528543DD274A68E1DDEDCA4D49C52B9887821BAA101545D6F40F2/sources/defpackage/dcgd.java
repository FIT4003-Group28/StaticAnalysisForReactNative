package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dcgd  reason: default package */
/* loaded from: classes5.dex */
final class dcgd extends Enum<dcgd> implements Iterator<Object> {
    public static final dcgd a;
    private static final /* synthetic */ dcgd[] b;

    static {
        dcgd dcgdVar = new dcgd();
        a = dcgdVar;
        b = new dcgd[]{dcgdVar};
    }

    private dcgd() {
    }

    public static dcgd[] values() {
        return (dcgd[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        dbzb.c(false);
    }
}
