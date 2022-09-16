package defpackage;
/* compiled from: PG */
/* renamed from: azya  reason: default package */
/* loaded from: classes2.dex */
public final class azya {
    public static final azyg a = new azyg("REMOVE_FROZEN");
    private final int c;
    private final boolean d;
    private final int e;
    private final aztq g;
    private final aztu f = ayme.f(null);
    public final aztt b = ayme.e(0);

    public azya(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        this.g = new aztq(i);
        if (i2 <= 1073741823) {
            if ((i & i2) != 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a(Object obj) {
        aztt azttVar = this.b;
        while (true) {
            long j = azttVar.b;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((j & 1152921503533105152L) >> 30);
            int i3 = this.e;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.d && this.g.a(i2 & i3).a != null) {
                int i4 = this.c;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (this.b.b(j, azxy.a(j, 1152921503533105152L) | (((i2 + 1) & 1073741823) << 30))) {
                aztu a2 = this.g.a(i2 & i3);
                int i5 = aztv.a;
                a2.a = obj;
                azya azyaVar = this;
                while ((azyaVar.b.b & 1152921504606846976L) != 0) {
                    azyaVar = azyaVar.c();
                    Object obj2 = azyaVar.g.a(azyaVar.e & i2).a;
                    if (!(obj2 instanceof azxz) || ((azxz) obj2).a != i2) {
                        azyaVar = null;
                        continue;
                    } else {
                        azyaVar.g.a(azyaVar.e & i2).a = obj;
                        continue;
                    }
                    if (azyaVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    public final Object b() {
        Object obj;
        aztt azttVar = this.b;
        while (true) {
            long j = azttVar.b;
            long j2 = 1152921504606846976L;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.e;
            int i3 = i & i2;
            if ((i2 & ((int) ((1152921503533105152L & j) >> 30))) == i3) {
                return null;
            }
            Object obj2 = this.g.a(i3).a;
            if (obj2 == null) {
                if (this.d) {
                    return null;
                }
            } else if (obj2 instanceof azxz) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (this.b.b(j, azxy.b(j, i4))) {
                    aztu a2 = this.g.a(this.e & i);
                    int i5 = aztv.a;
                    a2.a = null;
                    return obj2;
                } else if (this.d) {
                    azya azyaVar = this;
                    while (true) {
                        aztt azttVar2 = azyaVar.b;
                        while (true) {
                            long j3 = azttVar2.b;
                            int i6 = (int) (j3 & 1073741823);
                            boolean z = azuy.a;
                            if ((j3 & j2) == 0) {
                                if (azyaVar.b.b(j3, azxy.b(j3, i4))) {
                                    aztu a3 = azyaVar.g.a(i6 & azyaVar.e);
                                    int i7 = aztv.a;
                                    obj = null;
                                    a3.a = null;
                                    azyaVar = null;
                                    break;
                                }
                                j2 = 1152921504606846976L;
                            } else {
                                azyaVar = azyaVar.c();
                                obj = null;
                                break;
                            }
                        }
                        if (azyaVar == null) {
                            return obj2;
                        }
                        j2 = 1152921504606846976L;
                    }
                }
            }
        }
    }

    public final azya c() {
        long j;
        aztt azttVar = this.b;
        while (true) {
            j = azttVar.b;
            if ((j & 1152921504606846976L) == 0) {
                long j2 = j | 1152921504606846976L;
                if (azttVar.b(j, j2)) {
                    j = j2;
                    break;
                }
            } else {
                break;
            }
        }
        aztu aztuVar = this.f;
        while (true) {
            azya azyaVar = (azya) aztuVar.a;
            if (azyaVar != null) {
                return azyaVar;
            }
            aztu aztuVar2 = this.f;
            int i = this.c;
            azya azyaVar2 = new azya(i + i, this.d);
            int i2 = (int) (1073741823 & j);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i4 = this.e;
                int i5 = i2 & i4;
                if (i5 != (i4 & i3)) {
                    Object obj = this.g.a(i5).a;
                    if (obj == null) {
                        obj = new azxz(i2);
                    }
                    aztu a2 = azyaVar2.g.a(azyaVar2.e & i2);
                    int i6 = aztv.a;
                    a2.a = obj;
                    i2++;
                }
            }
            aztt azttVar2 = azyaVar2.b;
            int i7 = aztv.a;
            azttVar2.b = azxy.a(j, 1152921504606846976L);
            aztuVar2.c(null, azyaVar2);
        }
    }

    public final boolean d() {
        long j;
        aztt azttVar = this.b;
        do {
            j = azttVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!azttVar.b(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
