package defpackage;
/* compiled from: PG */
/* renamed from: dxed  reason: default package */
/* loaded from: classes.dex */
public final class dxed {
    private static final double[] e = new double[128];
    public int a = 0;
    private char b;
    private final CharSequence c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = e;
            int length = dArr.length;
            if (i < 128) {
                dArr[i] = Math.pow(10.0d, i);
                i++;
            } else {
                return;
            }
        }
    }

    public dxed(CharSequence charSequence) {
        this.c = charSequence;
        this.d = charSequence.length();
        this.b = charSequence.charAt(0);
    }

    private final char d() {
        int i = this.a;
        int i2 = this.d;
        if (i < i2) {
            i++;
            this.a = i;
        }
        if (i == i2) {
            return (char) 0;
        }
        return this.c.charAt(i);
    }

    private static final void e(char c) {
        StringBuilder sb = new StringBuilder(20);
        sb.append("Unexpected char '");
        sb.append(c);
        sb.append("'.");
        throw new RuntimeException(sb.toString());
    }

    public final void a() {
        while (true) {
            int i = this.a;
            if (i >= this.d || !Character.isWhitespace(this.c.charAt(i))) {
                return;
            }
            b();
        }
    }

    public final void b() {
        this.b = d();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 200
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public final float c() {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxed.c():float");
    }
}
