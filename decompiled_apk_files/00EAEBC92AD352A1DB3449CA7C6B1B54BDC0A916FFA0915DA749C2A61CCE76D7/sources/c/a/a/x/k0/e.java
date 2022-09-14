package c.a.a.x.k0;

import c.a.a.x.k0.c;
import h.f;
import java.io.EOFException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends c {
    private static final f o = f.d("'\\");
    private static final f p = f.d("\"\\");
    private static final f q = f.d("{}[]:, \n\t\r\f/\\;#=");
    private static final f r = f.d("\n\r");
    private static final f s = f.d("*/");
    private final h.e i;
    private final h.c j;
    private int k = 0;
    private long l;
    private int m;
    private String n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(h.e eVar) {
        if (eVar != null) {
            this.i = eVar;
            this.j = eVar.q();
            b(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private void D() {
        if (this.f2649f) {
            return;
        }
        b("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private int E() {
        int i;
        int[] iArr = this.f2646c;
        int i2 = this.f2645b;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 != 2) {
            if (i3 == 3 || i3 == 5) {
                this.f2646c[this.f2645b - 1] = 4;
                if (i3 == 5) {
                    int a2 = a(true);
                    this.j.readByte();
                    if (a2 != 44) {
                        if (a2 != 59) {
                            if (a2 != 125) {
                                b("Unterminated object");
                                throw null;
                            }
                            i = 2;
                        } else {
                            D();
                        }
                    }
                }
                int a3 = a(true);
                if (a3 == 34) {
                    this.j.readByte();
                    i = 13;
                } else if (a3 == 39) {
                    this.j.readByte();
                    D();
                    i = 12;
                } else if (a3 != 125) {
                    D();
                    if (!c((char) a3)) {
                        b("Expected name");
                        throw null;
                    }
                    i = 14;
                } else if (i3 == 5) {
                    b("Expected name");
                    throw null;
                } else {
                    this.j.readByte();
                    i = 2;
                }
            } else if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int a4 = a(true);
                this.j.readByte();
                if (a4 != 58) {
                    if (a4 != 61) {
                        b("Expected ':'");
                        throw null;
                    }
                    D();
                    if (this.i.f(1L) && this.j.a(0L) == 62) {
                        this.j.readByte();
                    }
                }
            } else if (i3 == 6) {
                iArr[i2 - 1] = 7;
            } else if (i3 == 7) {
                if (a(false) == -1) {
                    i = 18;
                }
                D();
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.k = i;
            return i;
        } else {
            int a5 = a(true);
            this.j.readByte();
            if (a5 != 44) {
                if (a5 != 59) {
                    if (a5 == 93) {
                        this.k = 4;
                        return 4;
                    }
                    b("Unterminated array");
                    throw null;
                }
                D();
            }
        }
        int a6 = a(true);
        if (a6 != 34) {
            if (a6 == 39) {
                D();
                this.j.readByte();
                this.k = 8;
                return 8;
            }
            if (a6 != 44 && a6 != 59) {
                if (a6 == 91) {
                    this.j.readByte();
                    this.k = 3;
                    return 3;
                } else if (a6 != 93) {
                    if (a6 == 123) {
                        this.j.readByte();
                        this.k = 1;
                        return 1;
                    }
                    int G = G();
                    if (G != 0) {
                        return G;
                    }
                    int H = H();
                    if (H != 0) {
                        return H;
                    }
                    if (!c(this.j.a(0L))) {
                        b("Expected value");
                        throw null;
                    }
                    D();
                    i = 10;
                } else if (i3 == 1) {
                    this.j.readByte();
                    i = 4;
                }
            }
            if (i3 != 1 && i3 != 2) {
                b("Unexpected value");
                throw null;
            }
            D();
            this.k = 7;
            return 7;
        }
        this.j.readByte();
        i = 9;
        this.k = i;
        return i;
    }

    private String F() {
        long c2 = this.i.c(q);
        return c2 != -1 ? this.j.b(c2) : this.j.d();
    }

    private int G() {
        int i;
        String str;
        String str2;
        byte a2 = this.j.a(0L);
        if (a2 == 116 || a2 == 84) {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (a2 == 102 || a2 == 70) {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (a2 != 110 && a2 != 78) {
            return 0;
        } else {
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.i.f(i3)) {
                return 0;
            }
            byte a3 = this.j.a(i2);
            if (a3 != str.charAt(i2) && a3 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (!this.i.f(length + 1) || !c(this.j.a(length))) {
            this.j.skip(length);
            this.k = i;
            return i;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
        if (c(r11) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
        if (r6 != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
        if (r7 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
        if (r8 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
        if (r8 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
        if (r10 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a0, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
        r16.l = r8;
        r16.j.skip(r5);
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
        r16.k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
        if (r6 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b1, code lost:
        if (r6 == 4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b4, code lost:
        if (r6 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
        r16.m = r5;
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int H() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.x.k0.e.H():int");
    }

    private char I() {
        int i;
        int i2;
        if (!this.i.f(1L)) {
            b("Unterminated escape sequence");
            throw null;
        }
        byte readByte = this.j.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            if (this.f2649f) {
                return (char) readByte;
            }
            b("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        } else if (!this.i.f(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + e());
        } else {
            char c2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                byte a2 = this.j.a(i3);
                char c3 = (char) (c2 << 4);
                if (a2 < 48 || a2 > 57) {
                    if (a2 >= 97 && a2 <= 102) {
                        i = a2 - 97;
                    } else if (a2 < 65 || a2 > 70) {
                        b("\\u" + this.j.b(4L));
                        throw null;
                    } else {
                        i = a2 - 65;
                    }
                    i2 = i + 10;
                } else {
                    i2 = a2 - 48;
                }
                c2 = (char) (c3 + i2);
            }
            this.j.skip(4L);
            return c2;
        }
    }

    private boolean J() {
        long b2 = this.i.b(s);
        boolean z = b2 != -1;
        h.c cVar = this.j;
        cVar.skip(z ? b2 + s.g() : cVar.e());
        return z;
    }

    private void K() {
        long c2 = this.i.c(r);
        h.c cVar = this.j;
        cVar.skip(c2 != -1 ? c2 + 1 : cVar.e());
    }

    private void L() {
        long c2 = this.i.c(q);
        h.c cVar = this.j;
        if (c2 == -1) {
            c2 = cVar.e();
        }
        cVar.skip(c2);
    }

    private int a(String str, c.a aVar) {
        int length = aVar.f2651a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f2651a[i])) {
                this.k = 0;
                this.f2647d[this.f2645b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.j.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.i.f(2) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        D();
        r3 = r6.j.a(1L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.j.readByte();
        r6.j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        r6.j.readByte();
        r6.j.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (J() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        b("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r1 != 35) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
        D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            h.e r2 = r6.i
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.f(r4)
            if (r2 == 0) goto L7f
            h.c r2 = r6.j
            long r4 = (long) r1
            byte r1 = r2.a(r4)
            r2 = 10
            if (r1 == r2) goto L7d
            r2 = 32
            if (r1 == r2) goto L7d
            r2 = 13
            if (r1 == r2) goto L7d
            r2 = 9
            if (r1 != r2) goto L25
            goto L7d
        L25:
            h.c r2 = r6.j
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            h.e r3 = r6.i
            r4 = 2
            boolean r3 = r3.f(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.D()
            h.c r3 = r6.j
            r4 = 1
            byte r3 = r3.a(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            h.c r1 = r6.j
            r1.readByte()
            h.c r1 = r6.j
            r1.readByte()
        L58:
            r6.K()
            goto L1
        L5c:
            h.c r1 = r6.j
            r1.readByte()
            h.c r1 = r6.j
            r1.readByte()
            boolean r1 = r6.J()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            r6.b(r7)
            r7 = 0
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7c
            r6.D()
            goto L58
        L7c:
            return r1
        L7d:
            r1 = r3
            goto L2
        L7f:
            if (r7 != 0) goto L83
            r7 = -1
            return r7
        L83:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.x.k0.e.a(boolean):int");
    }

    private boolean c(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        D();
        return false;
    }

    private String d(f fVar) {
        StringBuilder sb = null;
        while (true) {
            long c2 = this.i.c(fVar);
            if (c2 == -1) {
                b("Unterminated string");
                throw null;
            } else if (this.j.a(c2) != 92) {
                String b2 = this.j.b(c2);
                if (sb == null) {
                    this.j.readByte();
                    return b2;
                }
                sb.append(b2);
                this.j.readByte();
                return sb.toString();
            } else {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.j.b(c2));
                this.j.readByte();
                sb.append(I());
            }
        }
    }

    private void e(f fVar) {
        while (true) {
            long c2 = this.i.c(fVar);
            if (c2 == -1) {
                b("Unterminated string");
                throw null;
            } else if (this.j.a(c2) != 92) {
                this.j.skip(c2 + 1);
                return;
            } else {
                this.j.skip(c2 + 1);
                I();
            }
        }
    }

    @Override // c.a.a.x.k0.c
    public c.b A() {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        switch (i) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // c.a.a.x.k0.c
    public void B() {
        f fVar;
        if (this.f2650g) {
            throw new a("Cannot skip unexpected " + A() + " at " + e());
        }
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 14) {
            L();
        } else {
            if (i == 13) {
                fVar = p;
            } else if (i == 12) {
                fVar = o;
            } else if (i != 15) {
                throw new a("Expected a name but was " + A() + " at path " + e());
            }
            e(fVar);
        }
        this.k = 0;
        this.f2647d[this.f2645b - 1] = "null";
    }

    @Override // c.a.a.x.k0.c
    public void C() {
        f fVar;
        if (this.f2650g) {
            throw new a("Cannot skip unexpected " + A() + " at " + e());
        }
        int i = 0;
        do {
            int i2 = this.k;
            if (i2 == 0) {
                i2 = E();
            }
            if (i2 == 3) {
                b(1);
            } else if (i2 == 1) {
                b(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new a("Expected a value but was " + A() + " at path " + e());
                    }
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new a("Expected a value but was " + A() + " at path " + e());
                    }
                } else {
                    if (i2 == 14 || i2 == 10) {
                        L();
                    } else {
                        if (i2 == 9 || i2 == 13) {
                            fVar = p;
                        } else if (i2 == 8 || i2 == 12) {
                            fVar = o;
                        } else if (i2 == 17) {
                            this.j.skip(this.m);
                        } else if (i2 == 18) {
                            throw new a("Expected a value but was " + A() + " at path " + e());
                        }
                        e(fVar);
                    }
                    this.k = 0;
                }
                this.f2645b--;
                this.k = 0;
            }
            i++;
            this.k = 0;
        } while (i != 0);
        int[] iArr = this.f2648e;
        int i3 = this.f2645b;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f2647d[i3 - 1] = "null";
    }

    @Override // c.a.a.x.k0.c
    public int a(c.a aVar) {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return a(this.n, aVar);
        }
        int a2 = this.i.a(aVar.f2652b);
        if (a2 != -1) {
            this.k = 0;
            this.f2647d[this.f2645b - 1] = aVar.f2651a[a2];
            return a2;
        }
        String str = this.f2647d[this.f2645b - 1];
        String w = w();
        int a3 = a(w, aVar);
        if (a3 == -1) {
            this.k = 15;
            this.n = w;
            this.f2647d[this.f2645b - 1] = str;
        }
        return a3;
    }

    @Override // c.a.a.x.k0.c
    public void a() {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 3) {
            b(1);
            this.f2648e[this.f2645b - 1] = 0;
            this.k = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + A() + " at path " + e());
    }

    @Override // c.a.a.x.k0.c
    public void b() {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 1) {
            b(3);
            this.k = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + A() + " at path " + e());
    }

    @Override // c.a.a.x.k0.c
    public void c() {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 4) {
            this.f2645b--;
            int[] iArr = this.f2648e;
            int i2 = this.f2645b - 1;
            iArr[i2] = iArr[i2] + 1;
            this.k = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + A() + " at path " + e());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.k = 0;
        this.f2646c[0] = 8;
        this.f2645b = 1;
        this.j.a();
        this.i.close();
    }

    @Override // c.a.a.x.k0.c
    public void d() {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i != 2) {
            throw new a("Expected END_OBJECT but was " + A() + " at path " + e());
        }
        this.f2645b--;
        String[] strArr = this.f2647d;
        int i2 = this.f2645b;
        strArr[i2] = null;
        int[] iArr = this.f2648e;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.k = 0;
    }

    @Override // c.a.a.x.k0.c
    public boolean f() {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // c.a.a.x.k0.c
    public boolean g() {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 5) {
            this.k = 0;
            int[] iArr = this.f2648e;
            int i2 = this.f2645b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.k = 0;
            int[] iArr2 = this.f2648e;
            int i3 = this.f2645b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + A() + " at path " + e());
        }
    }

    @Override // c.a.a.x.k0.c
    public double h() {
        String F;
        f fVar;
        double parseDouble;
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 16) {
            this.k = 0;
            int[] iArr = this.f2648e;
            int i2 = this.f2645b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.l;
        }
        try {
            if (i == 17) {
                F = this.j.b(this.m);
            } else {
                if (i == 9) {
                    fVar = p;
                } else if (i == 8) {
                    fVar = o;
                } else if (i != 10) {
                    if (i != 11) {
                        throw new a("Expected a double but was " + A() + " at path " + e());
                    }
                    this.k = 11;
                    parseDouble = Double.parseDouble(this.n);
                    if (!this.f2649f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                        this.n = null;
                        this.k = 0;
                        int[] iArr2 = this.f2648e;
                        int i3 = this.f2645b - 1;
                        iArr2[i3] = iArr2[i3] + 1;
                        return parseDouble;
                    }
                    throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + e());
                } else {
                    F = F();
                }
                F = d(fVar);
            }
            parseDouble = Double.parseDouble(this.n);
            if (!this.f2649f) {
            }
            this.n = null;
            this.k = 0;
            int[] iArr22 = this.f2648e;
            int i32 = this.f2645b - 1;
            iArr22[i32] = iArr22[i32] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.n + " at path " + e());
        }
        this.n = F;
        this.k = 11;
    }

    @Override // c.a.a.x.k0.c
    public int i() {
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 16) {
            long j = this.l;
            int i2 = (int) j;
            if (j == i2) {
                this.k = 0;
                int[] iArr = this.f2648e;
                int i3 = this.f2645b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new a("Expected an int but was " + this.l + " at path " + e());
        }
        if (i == 17) {
            this.n = this.j.b(this.m);
        } else if (i == 9 || i == 8) {
            this.n = d(i == 9 ? p : o);
            try {
                int parseInt = Integer.parseInt(this.n);
                this.k = 0;
                int[] iArr2 = this.f2648e;
                int i4 = this.f2645b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new a("Expected an int but was " + A() + " at path " + e());
        }
        this.k = 11;
        try {
            double parseDouble = Double.parseDouble(this.n);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.n = null;
                this.k = 0;
                int[] iArr3 = this.f2648e;
                int i6 = this.f2645b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new a("Expected an int but was " + this.n + " at path " + e());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.n + " at path " + e());
        }
    }

    public String toString() {
        return "JsonReader(" + this.i + ")";
    }

    @Override // c.a.a.x.k0.c
    public String w() {
        String str;
        f fVar;
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 14) {
            str = F();
        } else {
            if (i == 13) {
                fVar = p;
            } else if (i == 12) {
                fVar = o;
            } else if (i != 15) {
                throw new a("Expected a name but was " + A() + " at path " + e());
            } else {
                str = this.n;
            }
            str = d(fVar);
        }
        this.k = 0;
        this.f2647d[this.f2645b - 1] = str;
        return str;
    }

    @Override // c.a.a.x.k0.c
    public String z() {
        String b2;
        f fVar;
        int i = this.k;
        if (i == 0) {
            i = E();
        }
        if (i == 10) {
            b2 = F();
        } else {
            if (i == 9) {
                fVar = p;
            } else if (i == 8) {
                fVar = o;
            } else if (i == 11) {
                b2 = this.n;
                this.n = null;
            } else if (i == 16) {
                b2 = Long.toString(this.l);
            } else if (i != 17) {
                throw new a("Expected a string but was " + A() + " at path " + e());
            } else {
                b2 = this.j.b(this.m);
            }
            b2 = d(fVar);
        }
        this.k = 0;
        int[] iArr = this.f2648e;
        int i2 = this.f2645b - 1;
        iArr[i2] = iArr[i2] + 1;
        return b2;
    }
}
