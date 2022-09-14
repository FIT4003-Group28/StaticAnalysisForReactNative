package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnkw  reason: default package */
/* loaded from: classes.dex */
public final class cnkw extends cnpg<Status, cnky> {
    private final cnjv a;

    public cnkw(cnjv cnjvVar, GoogleApiClient googleApiClient) {
        super(cnjz.c, googleApiClient);
        this.a = cnjvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r5.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        r4 = r5.next().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r4 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        r5 = defpackage.cnjz.e.iterator();
     */
    @Override // defpackage.cnpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void b(defpackage.cnky r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnkw.b(cnnq):void");
    }

    @Override // defpackage.cnpg, defpackage.cnph
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.p((cnom) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ cnom d(Status status) {
        return status;
    }
}
