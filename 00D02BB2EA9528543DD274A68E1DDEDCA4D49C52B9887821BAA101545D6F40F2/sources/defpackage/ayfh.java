package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayfh  reason: default package */
/* loaded from: classes3.dex */
public final class ayfh implements degu<dibd> {
    final /* synthetic */ ayfk a;
    private final ayfj b;

    public ayfh(ayfk ayfkVar) {
        this.a = ayfkVar;
        this.b = new ayfj(ayfkVar);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ayfk ayfkVar = this.a;
        if (!ayfkVar.b.aD) {
            return;
        }
        ayfkVar.f.b(new Runnable(this) { // from class: ayfg
            private final ayfh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ayfh ayfhVar = this.a;
                cztq a = cztt.a(ayfhVar.a.g);
                a.c = ayfhVar.a.a.getString(R.string.LIST_METADATA_FAILED_MESSAGE);
                a.d(cztr.LONG);
                a.c();
                ayfhVar.a.k();
            }
        }, bvrj.UI_THREAD);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r2 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
        if (r2 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e4, code lost:
        r2 = defpackage.dqhy.UNKNOWN_STATUS_CODE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
        r5.f(r4, r2);
     */
    @Override // defpackage.degu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(defpackage.dibd r17) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayfh.b(java.lang.Object):void");
    }
}
