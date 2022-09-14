package com.facebook.imagepipeline.h;

import com.facebook.common.d.i;
import com.facebook.common.d.m;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProgressiveJpegParser.java */
/* loaded from: classes.dex */
public class e {
    private boolean g;
    private final com.facebook.common.g.a h;

    /* renamed from: c  reason: collision with root package name */
    private int f2699c = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f2698b = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f2700d = 0;
    private int f = 0;
    private int e = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f2697a = 0;

    private static boolean a(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    public e(com.facebook.common.g.a aVar) {
        this.h = (com.facebook.common.g.a) i.a(aVar);
    }

    public boolean a(com.facebook.imagepipeline.i.d dVar) {
        if (this.f2697a != 6 && dVar.k() > this.f2699c) {
            com.facebook.common.g.f fVar = new com.facebook.common.g.f(dVar.d(), this.h.a(16384), this.h);
            try {
                com.facebook.common.l.d.a(fVar, this.f2699c);
                return a(fVar);
            } catch (IOException e) {
                m.b(e);
                return false;
            } finally {
                com.facebook.common.d.b.a(fVar);
            }
        }
        return false;
    }

    private boolean a(InputStream inputStream) {
        int read;
        int i = this.e;
        while (this.f2697a != 6 && (read = inputStream.read()) != -1) {
            try {
                this.f2699c++;
                switch (this.f2697a) {
                    case 0:
                        if (read == 255) {
                            this.f2697a = 1;
                            break;
                        } else {
                            this.f2697a = 6;
                            break;
                        }
                    case 1:
                        if (read == 216) {
                            this.f2697a = 2;
                            break;
                        } else {
                            this.f2697a = 6;
                            break;
                        }
                    case 2:
                        if (read != 255) {
                            break;
                        } else {
                            this.f2697a = 3;
                            break;
                        }
                    case 3:
                        if (read != 255) {
                            if (read != 0) {
                                if (read == 217) {
                                    this.g = true;
                                    b(this.f2699c - 2);
                                    this.f2697a = 2;
                                    break;
                                } else {
                                    if (read == 218) {
                                        b(this.f2699c - 2);
                                    }
                                    if (a(read)) {
                                        this.f2697a = 4;
                                        break;
                                    } else {
                                        this.f2697a = 2;
                                        break;
                                    }
                                }
                            } else {
                                this.f2697a = 2;
                                break;
                            }
                        } else {
                            this.f2697a = 3;
                            break;
                        }
                    case 4:
                        this.f2697a = 5;
                        break;
                    case 5:
                        int i2 = ((this.f2698b << 8) + read) - 2;
                        com.facebook.common.l.d.a(inputStream, i2);
                        this.f2699c += i2;
                        this.f2697a = 2;
                        break;
                    default:
                        i.b(false);
                        break;
                }
                this.f2698b = read;
            } catch (IOException e) {
                m.b(e);
            }
        }
        return (this.f2697a == 6 || this.e == i) ? false : true;
    }

    private void b(int i) {
        if (this.f2700d > 0) {
            this.f = i;
        }
        int i2 = this.f2700d;
        this.f2700d = i2 + 1;
        this.e = i2;
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.e;
    }

    public boolean c() {
        return this.g;
    }
}
