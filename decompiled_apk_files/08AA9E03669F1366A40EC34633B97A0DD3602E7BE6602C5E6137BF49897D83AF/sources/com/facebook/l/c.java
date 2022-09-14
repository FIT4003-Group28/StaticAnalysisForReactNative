package com.facebook.l;

import android.content.Context;
import com.facebook.l.j;
import java.io.File;
import java.io.FileInputStream;
/* compiled from: ExoSoSource.java */
/* loaded from: classes.dex */
public final class c extends j {
    public c(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.l.j
    protected j.e a() {
        return new a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoSoSource.java */
    /* loaded from: classes.dex */
    public final class a extends j.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f3027a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f3028b;

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
            */
        a(com.facebook.l.c r19) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.l.c.a.<init>(com.facebook.l.c):void");
        }

        @Override // com.facebook.l.j.e
        protected j.b a() {
            return new j.b(this.f3028b);
        }

        @Override // com.facebook.l.j.e
        protected j.d b() {
            return new C0065a();
        }

        /* compiled from: ExoSoSource.java */
        /* renamed from: com.facebook.l.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private final class C0065a extends j.d {

            /* renamed from: b  reason: collision with root package name */
            private int f3030b;

            private C0065a() {
            }

            @Override // com.facebook.l.j.d
            public boolean a() {
                return this.f3030b < a.this.f3028b.length;
            }

            @Override // com.facebook.l.j.d
            public j.c b() {
                b[] bVarArr = a.this.f3028b;
                int i = this.f3030b;
                this.f3030b = i + 1;
                b bVar = bVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(bVar.f3031a);
                try {
                    return new j.c(bVar, fileInputStream);
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    /* compiled from: ExoSoSource.java */
    /* loaded from: classes.dex */
    private static final class b extends j.a {

        /* renamed from: a  reason: collision with root package name */
        final File f3031a;

        b(String str, String str2, File file) {
            super(str, str2);
            this.f3031a = file;
        }
    }
}
