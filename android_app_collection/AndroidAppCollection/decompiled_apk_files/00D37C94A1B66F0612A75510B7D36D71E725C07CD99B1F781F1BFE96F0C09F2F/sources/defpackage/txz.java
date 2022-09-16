package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: txz  reason: default package */
/* loaded from: classes4.dex */
public final class txz implements tyh {
    public final Context a;
    public final twy b;
    public final vjb c;
    public final trv d;
    public final tqk e;
    public final tsb f;
    public final tqo g;
    public final tyk h;
    public final tqv i;
    public final int j;
    public final long k;
    public final String l;
    public final ampq m;
    public final Executor n;
    public final int o;

    public txz(Context context, twy twyVar, vjb vjbVar, trv trvVar, tqk tqkVar, int i, tsb tsbVar, tqo tqoVar, tyk tykVar, tqv tqvVar, int i2, long j, String str, ampq ampqVar, Executor executor) {
        this.a = context;
        this.b = twyVar;
        this.c = vjbVar;
        this.d = trvVar;
        this.e = tqkVar;
        this.o = i;
        this.f = tsbVar;
        this.g = tqoVar;
        this.h = tykVar;
        this.i = tqvVar;
        this.j = i2;
        this.k = j;
        this.l = str;
        this.m = ampqVar;
        this.n = executor;
    }

    @Override // defpackage.tyh
    public final ankt a(final Uri uri) {
        int i = typ.a;
        if (!tyc.c(this.c, uri, this.g.e)) {
            typ.e("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, this.g.e);
            tpy a = tqa.a();
            a.a = tpz.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            return anlz.p(a.a());
        }
        final Uri u = tzc.u(uri);
        aopa createBuilder = tqy.a.createBuilder();
        tqi tqiVar = this.g.g;
        if (tqiVar == null) {
            tqiVar = tqi.a;
        }
        String str = tqiVar.b;
        createBuilder.copyOnWrite();
        tqy tqyVar = (tqy) createBuilder.instance;
        str.getClass();
        tqyVar.b |= 4;
        tqyVar.e = str;
        int i2 = this.o;
        createBuilder.copyOnWrite();
        tqy tqyVar2 = (tqy) createBuilder.instance;
        tqyVar2.f = i2 - 1;
        tqyVar2.b |= 8;
        final tqy tqyVar3 = (tqy) createBuilder.mo39build();
        return anii.i(anii.i(this.b.e(tqyVar3), new anir() { // from class: txy
            /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
            @Override // defpackage.anir
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final defpackage.ankt a(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 326
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.txy.a(java.lang.Object):ankt");
            }
        }, this.n), new anir() { // from class: txx
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                txz txzVar = txz.this;
                Uri uri2 = u;
                Void r5 = (Void) obj;
                if (!tyc.c(txzVar.c, uri2, txzVar.e.g)) {
                    typ.d("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", uri2);
                    tpy a2 = tqa.a();
                    a2.a = tpz.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                    return anlz.p(a2.a());
                }
                return tyb.c(tqu.DOWNLOAD_COMPLETE, txzVar.e, txzVar.o, txzVar.b, txzVar.n);
            }
        }, this.n);
    }

    @Override // defpackage.tyh
    public final ankt b() {
        String str = this.e.g;
        int i = typ.a;
        return tyb.c(tqu.DOWNLOAD_FAILED, this.e, this.o, this.b, this.n);
    }
}
