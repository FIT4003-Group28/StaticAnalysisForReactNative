package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Tile extends dsqw<Tile, dftt> implements dssk {
    public static final Tile e;
    private static volatile dssr<Tile> g;
    public int a;
    public int b;
    public int c;
    public dftd d;
    private int f;

    static {
        Tile tile = new Tile();
        e = tile;
        dsqw.cc(Tile.class, tile);
    }

    private Tile() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new Tile();
            }
            if (i2 == 4) {
                return new dftt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<Tile> dssrVar = g;
            if (dssrVar == null) {
                synchronized (Tile.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
