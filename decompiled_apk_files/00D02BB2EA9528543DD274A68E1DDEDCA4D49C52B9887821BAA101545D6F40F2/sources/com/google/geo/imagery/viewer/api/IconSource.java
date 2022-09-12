package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class IconSource extends dsqw<IconSource, dfst> implements dssk {
    public static final IconSource d;
    private static volatile dssr<IconSource> e;
    public int a;
    public String b = "";
    public long c;

    static {
        IconSource iconSource = new IconSource();
        d = iconSource;
        dsqw.cc(IconSource.class, iconSource);
    }

    private IconSource() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new IconSource();
            }
            if (i2 == 4) {
                return new dfst();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<IconSource> dssrVar = e;
            if (dssrVar == null) {
                synchronized (IconSource.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
