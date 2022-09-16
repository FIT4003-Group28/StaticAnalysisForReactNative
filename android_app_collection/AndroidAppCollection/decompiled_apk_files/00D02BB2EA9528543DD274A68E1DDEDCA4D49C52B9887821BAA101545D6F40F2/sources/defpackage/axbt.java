package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: axbt  reason: default package */
/* loaded from: classes3.dex */
final class axbt implements axce {
    final /* synthetic */ axbv a;

    public axbt(axbv axbvVar) {
        this.a = axbvVar;
    }

    @Override // defpackage.axce
    public final void a(@dzsi dviw dviwVar, @dzsi dviq dviqVar, @dzsi btlu btluVar, int i, Map<awvv<?>, awwa> map) {
        synchronized (this.a) {
            if (dviwVar != null) {
                this.a.d.b(dviwVar, dviqVar, btluVar, i);
            }
        }
    }
}
