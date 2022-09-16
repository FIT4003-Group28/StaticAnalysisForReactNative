package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aekb  reason: default package */
/* loaded from: classes.dex */
final class aekb implements aehv {
    public final atp a;
    public final asy b;
    public final ByteBuffer c;
    public final int d;
    public final aehw e;
    public boolean f;
    public final boolean i;
    private orm l;
    private ByteBuffer m;
    private Integer n;
    private final boolean o;
    private final aexf p;
    private final Set j = new HashSet();
    private final ArrayDeque k = new ArrayDeque();
    public long g = 0;
    public int h = -1;

    public aekb(atp atpVar, asy asyVar, ByteBuffer byteBuffer, afjz afjzVar) {
        this.a = atpVar;
        this.b = asyVar;
        this.c = byteBuffer;
        this.i = afjzVar.n().E;
        this.d = afjzVar.n().G;
        this.o = afjzVar.o().X;
        Object obj = asyVar.k;
        this.p = obj instanceof aejz ? ((aejz) obj).f : null;
        this.e = new aehw(this);
    }

    @Override // defpackage.aehv
    public final void a(int i, int i2, ByteBuffer byteBuffer) {
        aexf aexfVar;
        if (this.l == null) {
            orm a = orm.a(i);
            this.l = a;
            if (a == null) {
                return;
            }
            if (this.p == null && a != orm.MEDIA && this.l != orm.MEDIA_HEADER) {
                this.l = null;
                return;
            } else if (byteBuffer.remaining() == 0) {
                this.l = null;
                return;
            } else if (this.l == orm.MEDIA) {
                this.m = ByteBuffer.allocate(aefn.a(byteBuffer.get(byteBuffer.position())));
            } else {
                this.m = ByteBuffer.allocate(byteBuffer.remaining() + i2);
            }
        }
        ByteBuffer byteBuffer2 = this.m;
        if (byteBuffer != null && byteBuffer2 != null) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
            byteBuffer2.put(byteBuffer);
            byteBuffer.limit(limit);
        }
        if (this.l == orm.MEDIA) {
            if (this.n == null) {
                afms.a(this.m);
                if (this.m.remaining() == 0) {
                    this.m.rewind();
                    this.n = aefn.b(this.m);
                }
            }
            Integer num = this.n;
            if (num != null) {
                if (this.j.contains(num)) {
                    this.k.addLast(byteBuffer);
                } else if (this.i) {
                    this.h = 2;
                    return;
                }
            }
        }
        if (i2 == 0) {
            if (this.l != orm.MEDIA) {
                orm ormVar = this.l;
                ByteBuffer byteBuffer3 = this.m;
                afms.a(ormVar);
                afms.d(ormVar != orm.MEDIA);
                afms.a(byteBuffer3);
                int ordinal = ormVar.ordinal();
                if (ordinal != 4) {
                    try {
                        if (ordinal == 12) {
                            aexf aexfVar2 = this.p;
                            if (aexfVar2 != null) {
                                aexfVar2.a.a.l((atoi) ((aopa) atoi.a.createBuilder().mo38mergeFrom(byteBuffer3.array(), aoos.b())).mo39build());
                            }
                        } else if (ordinal == 13 && (aexfVar = this.p) != null) {
                            oqw oqwVar = (oqw) ((aopa) oqw.a.createBuilder().mo38mergeFrom(byteBuffer3.array(), aoos.b())).mo39build();
                            if ((oqwVar.b & 1) != 0) {
                                aexfVar.a.b.h.b(oqwVar.d, new HashSet(oqwVar.c));
                            }
                        }
                    } catch (aopx unused) {
                        this.h = 5;
                    }
                } else {
                    try {
                        orc orcVar = (orc) ((aopa) orc.a.createBuilder().mo38mergeFrom(byteBuffer3.array(), aoos.b())).mo39build();
                        if (orcVar != null && (orcVar.b & 1) != 0) {
                            this.j.add(Integer.valueOf(orcVar.c));
                        }
                    } catch (aopx unused2) {
                        this.h = 1;
                    }
                }
            }
            this.l = null;
            this.m = null;
            this.n = null;
        }
    }

    public final int b(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (!this.k.isEmpty()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.k.peek();
            int remaining = byteBuffer.remaining();
            int i4 = i3 + remaining;
            if (i4 <= i2) {
                ((ByteBuffer) this.k.remove()).get(bArr, i3 + i, remaining);
                i3 = i4;
            } else {
                byteBuffer.get(bArr, i + i3, i2 - i3);
                return i2;
            }
        }
        return i3;
    }

    public final void c() {
        if (!this.o || this.g != 0) {
            return;
        }
        throw new aeka(6, this.b);
    }
}
