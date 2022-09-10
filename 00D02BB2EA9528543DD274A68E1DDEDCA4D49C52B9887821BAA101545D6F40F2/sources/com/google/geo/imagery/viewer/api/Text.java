package com.google.geo.imagery.viewer.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Text extends dsqw<Text, dfts> implements dssk {
    public static final Text k;
    private static volatile dssr<Text> l;
    public int a;
    public String b = "";
    public float c;
    public int d;
    public float e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;

    static {
        Text text = new Text();
        k = text;
        dsqw.cc(Text.class, text);
    }

    private Text() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new Text();
            }
            if (i2 == 4) {
                return new dfts();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<Text> dssrVar = l;
            if (dssrVar == null) {
                synchronized (Text.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
