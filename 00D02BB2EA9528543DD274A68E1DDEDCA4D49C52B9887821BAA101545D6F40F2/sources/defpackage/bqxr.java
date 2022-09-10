package defpackage;
/* compiled from: PG */
/* renamed from: bqxr  reason: default package */
/* loaded from: classes4.dex */
public final class bqxr implements dzkd {
    private final dsox a;

    public bqxr(dspd dspdVar) {
        this.a = dspdVar.iterator();
    }

    private final int b() {
        return this.a.a() & 255;
    }

    @Override // defpackage.dzkd
    public final int a() {
        int b;
        int b2;
        int b3 = b();
        if (b3 < 128) {
            return b3;
        }
        if (b3 < 192) {
            b = b3 & 63;
            b2 = b() << 6;
        } else if (b3 < 224) {
            b = b3 & 31;
            b2 = (b() | (b() << 8)) << 5;
        } else if (b3 < 240) {
            b = b3 & 15;
            b2 = ((b() | (b() << 8)) | (b() << 16)) << 4;
        } else {
            b = b() | (b() << 8) | (b() << 16);
            b2 = b() << 24;
        }
        return b | b2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        throw new UnsupportedOperationException("Call nextInt() instead, it's faster.");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
