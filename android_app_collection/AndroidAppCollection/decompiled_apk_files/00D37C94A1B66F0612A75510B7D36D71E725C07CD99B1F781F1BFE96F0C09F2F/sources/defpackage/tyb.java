package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tyb  reason: default package */
/* loaded from: classes4.dex */
public final class tyb implements tyh {
    private final twy a;
    private final vjb b;
    private final tqk c;
    private final String d;
    private final tyk e;
    private final tqv f;
    private final int g;
    private final long h;
    private final String i;
    private final Executor j;
    private final int k;

    public tyb(twy twyVar, vjb vjbVar, tqk tqkVar, int i, tyk tykVar, tqv tqvVar, int i2, long j, String str, Executor executor) {
        this.a = twyVar;
        this.b = vjbVar;
        this.c = tqkVar;
        this.k = i;
        this.d = tzc.g(tqkVar);
        this.e = tykVar;
        this.f = tqvVar;
        this.g = i2;
        this.h = j;
        this.i = str;
        this.j = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ankt c(final tqu tquVar, tqk tqkVar, int i, final twy twyVar, final Executor executor) {
        final tqy a = twx.a(tqkVar, i);
        return anii.i(twyVar.e(a), new anir() { // from class: tya
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tqy tqyVar = tqy.this;
                tqu tquVar2 = tquVar;
                twy twyVar2 = twyVar;
                Executor executor2 = executor;
                tqz tqzVar = (tqz) obj;
                if (tqzVar == null) {
                    typ.d("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", tqyVar);
                    tpy a2 = tqa.a();
                    a2.a = tpz.SHARED_FILE_NOT_FOUND_ERROR;
                    return anlz.p(a2.a());
                }
                aopa mo52toBuilder = tqzVar.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                tqz tqzVar2 = (tqz) mo52toBuilder.instance;
                tqzVar2.d = tquVar2.h;
                tqzVar2.b |= 2;
                return anii.i(twyVar2.g(tqyVar, (tqz) mo52toBuilder.mo39build()), new twr(tqyVar, 3), executor2);
            }
        }, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0150, code lost:
        r20 = r5.a(r0);
        r22 = r5.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015a, code lost:
        if (r20 <= r22) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015c, code lost:
        r4 = defpackage.angn.a.createBuilder();
        r14 = r8.c;
        r4.copyOnWrite();
        r15 = (defpackage.angn) r4.instance;
        r14.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016e, code lost:
        r26 = "DownloaderCallbackImpl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0170, code lost:
        r15.b |= 1;
        r15.c = r14;
        r4.copyOnWrite();
        r6 = (defpackage.angn) r4.instance;
        r6.b |= 2;
        r6.d = r9;
        r4.copyOnWrite();
        r6 = (defpackage.angn) r4.instance;
        r6.b |= 32;
        r6.h = r10;
        r4.copyOnWrite();
        r6 = (defpackage.angn) r4.instance;
        r12.getClass();
        r6.b |= 64;
        r6.i = r12;
        r6 = r8.d;
        r4.copyOnWrite();
        r7 = (defpackage.angn) r4.instance;
        r6.getClass();
        r7.b |= 4;
        r7.e = r6;
        r3.k((defpackage.angn) r4.mo39build(), 3, r20, r22, r13.c, 0);
     */
    @Override // defpackage.tyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ankt a(android.net.Uri r28) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyb.a(android.net.Uri):ankt");
    }

    @Override // defpackage.tyh
    public final ankt b() {
        int i = typ.a;
        return c(tqu.DOWNLOAD_FAILED, this.c, this.k, this.a, this.j);
    }
}
