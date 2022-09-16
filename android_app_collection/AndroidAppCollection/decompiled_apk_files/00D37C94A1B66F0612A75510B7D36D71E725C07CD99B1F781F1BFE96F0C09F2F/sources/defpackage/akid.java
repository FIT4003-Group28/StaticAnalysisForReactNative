package defpackage;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/* compiled from: PG */
/* renamed from: akid  reason: default package */
/* loaded from: classes.dex */
public final class akid implements akgm, akgs {
    public akvm a;
    public acvh b;
    private akhh c;
    private final String d;

    public akid(File file) {
        String absolutePath = file.getAbsolutePath();
        zgh.m(absolutePath);
        this.d = absolutePath;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private final synchronized defpackage.akhh f() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akid.f():akhh");
    }

    private final synchronized void g() {
        File file = new File(this.d, "zeroprefixparsed.cache");
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(this.d, "zeroprefix.cache");
        if (file2.exists()) {
            file2.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x007c -> B:70:0x007c). Please submit an issue!!! */
    private final synchronized void h(akhh akhhVar) {
        ObjectOutputStream objectOutputStream;
        File file = new File(this.d, "zeroprefix.cache");
        if (file.exists()) {
            file.delete();
        }
        BufferedOutputStream bufferedOutputStream = "zeroprefixparsed.cache";
        BufferedOutputStream bufferedOutputStream2 = null;
        r1 = null;
        ObjectOutputStream objectOutputStream2 = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        try {
            try {
                try {
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.d, (String) bufferedOutputStream)));
                        try {
                            try {
                                objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
                            } catch (IOException e) {
                                e = e;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream2 = bufferedOutputStream;
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                }
            } catch (IOException unused2) {
            }
            try {
                try {
                    objectOutputStream.writeInt(akhhVar.b());
                    objectOutputStream.writeInt(akhhVar.f().length);
                    objectOutputStream.write(akhhVar.f());
                    if (!TextUtils.isEmpty(akhhVar.e())) {
                        objectOutputStream.writeInt(akhhVar.e().length());
                        objectOutputStream.write(akhhVar.e().getBytes());
                    }
                    objectOutputStream.flush();
                    objectOutputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream2 = objectOutputStream;
                    apwt.u("Exception when writing to zeroprefixrawsuggestResponseCache", e);
                    if (objectOutputStream2 != null) {
                        objectOutputStream2.close();
                    }
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    th = th3;
                    objectOutputStream2 = objectOutputStream;
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    try {
                        throw th;
                    } catch (FileNotFoundException e4) {
                        e = e4;
                        bufferedOutputStream3 = bufferedOutputStream;
                        zep.n("Error creating zero-prefix cache file.", e);
                        if (bufferedOutputStream3 == null) {
                            return;
                        }
                        try {
                            bufferedOutputStream3.close();
                            return;
                        } catch (IOException unused4) {
                            return;
                        }
                    }
                }
                bufferedOutputStream.close();
            } catch (IOException unused5) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.akgm
    public final void a(akvm akvmVar) {
        throw null;
    }

    public final synchronized akhh b() {
        ylr.b();
        if (this.c == null) {
            this.c = f();
        }
        return this.c;
    }

    @Override // defpackage.akgs
    public final acvh c() {
        return this.b;
    }

    public final synchronized void d() {
        ylr.b();
        this.c = null;
        g();
    }

    public final synchronized void e(akhh akhhVar) {
        ylr.b();
        this.c = akhhVar;
        h(akhhVar);
    }
}
