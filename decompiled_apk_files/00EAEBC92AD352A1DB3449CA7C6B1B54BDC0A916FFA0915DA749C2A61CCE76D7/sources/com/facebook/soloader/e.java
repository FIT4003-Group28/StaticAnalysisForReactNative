package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.n;
import java.io.File;
import java.io.FileInputStream;
/* loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b extends n.f {

        /* renamed from: b  reason: collision with root package name */
        private final c[] f6461b;

        /* loaded from: classes.dex */
        private final class a extends n.e {

            /* renamed from: b  reason: collision with root package name */
            private int f6462b;

            private a() {
            }

            @Override // com.facebook.soloader.n.e
            public boolean a() {
                return this.f6462b < b.this.f6461b.length;
            }

            @Override // com.facebook.soloader.n.e
            public n.d b() {
                c[] cVarArr = b.this.f6461b;
                int i = this.f6462b;
                this.f6462b = i + 1;
                c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f6464d);
                try {
                    return new n.d(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r10 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        b(com.facebook.soloader.e r17, com.facebook.soloader.n r18) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.e.b.<init>(com.facebook.soloader.e, com.facebook.soloader.n):void");
        }

        @Override // com.facebook.soloader.n.f
        protected n.c a() {
            return new n.c(this.f6461b);
        }

        @Override // com.facebook.soloader.n.f
        protected n.e b() {
            return new a();
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends n.b {

        /* renamed from: d  reason: collision with root package name */
        final File f6464d;

        c(String str, String str2, File file) {
            super(str, str2);
            this.f6464d = file;
        }
    }

    public e(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.n
    protected n.f b() {
        return new b(this, this);
    }
}
