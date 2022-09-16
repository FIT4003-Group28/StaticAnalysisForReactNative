package com.b.a.a.b;

import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: VObjectReader.java */
/* loaded from: classes.dex */
public class f implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final Reader f1443b;

    /* renamed from: c  reason: collision with root package name */
    private final c f1444c;
    private Charset e;
    private final a f;
    private final b h;

    /* renamed from: a  reason: collision with root package name */
    private final String f1442a = System.getProperty("line.separator");

    /* renamed from: d  reason: collision with root package name */
    private boolean f1445d = true;
    private final com.b.a.a.b.a g = new com.b.a.a.b.a();
    private int i = -1;
    private int j = 1;
    private boolean k = false;

    private static boolean a(char c2) {
        return c2 == '\n' || c2 == '\r';
    }

    private static boolean b(char c2) {
        return c2 == ' ' || c2 == '\t';
    }

    public f(Reader reader, c cVar) {
        this.f1443b = reader;
        this.f1444c = cVar;
        this.f = new a(cVar.a());
        this.h = new b(this.f.f1447a);
        if (reader instanceof InputStreamReader) {
            this.e = Charset.forName(((InputStreamReader) reader).getEncoding());
        } else {
            this.e = Charset.defaultCharset();
        }
    }

    public Charset a() {
        return this.e;
    }

    public void a(Charset charset) {
        this.e = charset;
    }

    public boolean b() {
        return this.f1445d;
    }

    public void a(boolean z) {
        this.f1445d = z;
    }

    public void a(d dVar) {
        this.h.f1436d = false;
        while (!this.k && !this.h.f1436d) {
            this.h.f1435c = this.j;
            this.g.a();
            this.h.f1434b.a();
            com.b.a.a.d b2 = b(dVar);
            if (this.h.f1434b.e() == 0) {
                return;
            }
            if (b2 == null) {
                dVar.a(g.MALFORMED_LINE, null, null, this.h);
            } else if ("BEGIN".equalsIgnoreCase(b2.b().trim())) {
                String upperCase = b2.d().trim().toUpperCase();
                if (upperCase.length() == 0) {
                    dVar.a(g.EMPTY_BEGIN, null, null, this.h);
                } else {
                    dVar.a(upperCase, this.h);
                    this.f.a(upperCase);
                }
            } else if ("END".equalsIgnoreCase(b2.b().trim())) {
                String upperCase2 = b2.d().trim().toUpperCase();
                if (upperCase2.length() == 0) {
                    dVar.a(g.EMPTY_END, null, null, this.h);
                } else {
                    int b3 = this.f.b(upperCase2);
                    if (b3 == 0) {
                        dVar.a(g.UNMATCHED_END, null, null, this.h);
                    } else {
                        while (b3 > 0) {
                            dVar.b(this.f.a(), this.h);
                            b3--;
                        }
                    }
                }
            } else {
                if ("VERSION".equalsIgnoreCase(b2.b())) {
                    String b4 = this.f.b();
                    if (this.f1444c.a(b4)) {
                        com.b.a.a.a a2 = this.f1444c.a(b4, b2.d());
                        if (a2 == null) {
                            dVar.a(g.UNKNOWN_VERSION, b2, null, this.h);
                        } else {
                            dVar.c(b2.d(), this.h);
                            this.f.a(a2);
                        }
                    }
                }
                dVar.a(b2, this.h);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private com.b.a.a.d b(d dVar) {
        com.b.a.a.d dVar2 = new com.b.a.a.d();
        com.b.a.a.a c2 = this.f.c();
        com.b.a.a.d dVar3 = null;
        boolean z = true;
        String str = null;
        char c3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        char c4 = 0;
        boolean z5 = false;
        while (true) {
            int c5 = c();
            if (c5 < 0) {
                this.k = z;
            } else {
                char c6 = (char) c5;
                if (c3 != '\r' || c6 != '\n') {
                    if (a(c6)) {
                        z3 = z2 && c3 == '=' && dVar2.c().a();
                        if (z3) {
                            this.g.d();
                            this.h.f1434b.d();
                        }
                        int i = this.j;
                        int i2 = z ? 1 : 0;
                        int i3 = z ? 1 : 0;
                        int i4 = z ? 1 : 0;
                        int i5 = z ? 1 : 0;
                        int i6 = z ? 1 : 0;
                        int i7 = z ? 1 : 0;
                        this.j = i + i2;
                    } else {
                        if (a(c3)) {
                            if (b(c6)) {
                                c3 = c6;
                                z4 = true;
                            } else if (!z3) {
                                this.i = c6;
                            }
                        }
                        if (z4) {
                            if (!b(c6) || c2 != com.b.a.a.a.OLD) {
                                z4 = false;
                            }
                        }
                        this.h.f1434b.a(c6);
                        if (z2) {
                            this.g.a(c6);
                        } else if (c4 == 0) {
                            if (str != null) {
                                switch (c2) {
                                    case OLD:
                                        if (c6 == '\\') {
                                            c3 = c6;
                                            c4 = c3;
                                            dVar3 = null;
                                            z = true;
                                            break;
                                        }
                                        break;
                                    case NEW:
                                        if (c6 == '^' && this.f1445d) {
                                            c3 = c6;
                                            c4 = c3;
                                            dVar3 = null;
                                            z = true;
                                            break;
                                        }
                                        break;
                                }
                            }
                            if (c6 == '.' && dVar2.a() == null && dVar2.b() == null) {
                                dVar2.a(this.g.c());
                            } else if ((c6 == ';' || c6 == ':') && !z5) {
                                if (dVar2.b() == null) {
                                    dVar2.b(this.g.c());
                                } else {
                                    String c7 = this.g.c();
                                    if (c2 == com.b.a.a.a.OLD) {
                                        c7 = com.b.a.a.b.a(c7);
                                    }
                                    dVar2.c().a(str, c7);
                                    str = null;
                                }
                                if (c6 == ':') {
                                    c3 = c6;
                                    dVar3 = null;
                                    z = true;
                                    z2 = true;
                                }
                            } else {
                                if (dVar2.b() != null) {
                                    if (c6 == ',' && str != null && !z5 && c2 != com.b.a.a.a.OLD) {
                                        dVar2.c().a(str, this.g.c());
                                    } else if (c6 == '=' && str == null) {
                                        String upperCase = this.g.c().toUpperCase();
                                        if (c2 == com.b.a.a.a.OLD) {
                                            upperCase = com.b.a.a.b.b(upperCase);
                                        }
                                        str = upperCase;
                                    } else if (c6 == '\"' && str != null && c2 != com.b.a.a.a.OLD) {
                                        z5 = !z5;
                                    }
                                }
                                this.g.a(c6);
                            }
                        } else if (c4 != '\\') {
                            if (c4 == '^') {
                                if (c6 == '\'') {
                                    this.g.a('\"');
                                } else if (c6 == '^') {
                                    this.g.a(c6);
                                } else if (c6 == 'n') {
                                    this.g.a(this.f1442a);
                                }
                                c3 = c6;
                                dVar3 = null;
                                z = true;
                                c4 = 0;
                            }
                            this.g.a(c4).a(c6);
                            c3 = c6;
                            dVar3 = null;
                            z = true;
                            c4 = 0;
                        } else {
                            if (c6 == ';') {
                                this.g.a(c6);
                            } else {
                                if (c6 == '\\') {
                                    this.g.a(c6);
                                }
                                this.g.a(c4).a(c6);
                            }
                            c3 = c6;
                            dVar3 = null;
                            z = true;
                            c4 = 0;
                        }
                        c3 = c6;
                        dVar3 = null;
                        z = true;
                    }
                }
                c3 = c6;
            }
        }
        if (!z2) {
            return dVar3;
        }
        dVar2.c(this.g.c());
        if (dVar2.c().a()) {
            a(dVar2, dVar);
        }
        return dVar2;
    }

    private void a(com.b.a.a.d dVar, d dVar2) {
        Charset b2 = b(dVar, dVar2);
        if (b2 == null) {
            b2 = this.e;
        }
        try {
            dVar.c(new com.b.a.a.a.b(b2.name()).a(dVar.d()));
        } catch (com.b.a.a.a.a e) {
            dVar2.a(g.QUOTED_PRINTABLE_ERROR, dVar, e, this.h);
        }
    }

    private Charset b(com.b.a.a.d dVar, d dVar2) {
        try {
            return dVar.c().b();
        } catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
            dVar2.a(g.UNKNOWN_CHARSET, dVar, e, this.h);
            return null;
        }
    }

    private int c() {
        if (this.i >= 0) {
            int i = this.i;
            this.i = -1;
            return i;
        }
        return this.f1443b.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VObjectReader.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f1447a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<com.b.a.a.a> f1448b = new ArrayList();

        public a(com.b.a.a.a aVar) {
            this.f1448b.add(aVar);
        }

        public void a(String str) {
            this.f1447a.add(str);
            this.f1448b.add(c());
        }

        public String a() {
            this.f1448b.remove(this.f1448b.size() - 1);
            return this.f1447a.remove(this.f1447a.size() - 1);
        }

        public int b(String str) {
            int lastIndexOf = this.f1447a.lastIndexOf(str);
            if (lastIndexOf < 0) {
                return 0;
            }
            return this.f1447a.size() - lastIndexOf;
        }

        public String b() {
            if (this.f1447a.isEmpty()) {
                return null;
            }
            return this.f1447a.get(this.f1447a.size() - 1);
        }

        public com.b.a.a.a c() {
            if (this.f1448b.isEmpty()) {
                return null;
            }
            return this.f1448b.get(this.f1448b.size() - 1);
        }

        public void a(com.b.a.a.a aVar) {
            this.f1448b.set(this.f1448b.size() - 1, aVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1443b.close();
    }
}
