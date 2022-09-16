package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckto  reason: default package */
/* loaded from: classes4.dex */
public final class ckto implements cnon<cpgn> {
    final /* synthetic */ bvrb a;
    final /* synthetic */ cktp b;

    public ckto(cktp cktpVar, bvrb bvrbVar) {
        this.b = cktpVar;
        this.a = bvrbVar;
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(cpgn cpgnVar) {
        cpgn cpgnVar2 = cpgnVar;
        if (cpgnVar2.b.d()) {
            Iterator<cpgl> it = cpgnVar2.iterator();
            while (it.hasNext()) {
                this.b.a(it.next());
            }
        } else {
            Status status = cpgnVar2.b;
        }
        cpgnVar2.b();
        this.a.a(new cktn(this), bvrj.BACKGROUND_THREADPOOL, 5000L);
    }
}
