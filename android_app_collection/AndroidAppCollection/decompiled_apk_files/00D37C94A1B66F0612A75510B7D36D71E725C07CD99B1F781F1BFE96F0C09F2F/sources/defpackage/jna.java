package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jna  reason: default package */
/* loaded from: classes3.dex */
public final class jna implements aari {
    public final aaqf a;
    public final jup b;
    private final Executor c;
    private final Executor e;

    public jna(aaqf aaqfVar, Executor executor, Executor executor2, jup jupVar) {
        this.a = aaqfVar;
        this.c = executor;
        this.e = executor2;
        this.b = jupVar;
    }

    @Override // defpackage.aari
    public final aaqs a(ajfz ajfzVar) {
        aaqf aaqfVar = this.a;
        ampq k = llm.k(ajfzVar);
        if (k.h()) {
            int i = ((aqoy) k.c()).b;
            if (i == 3) {
                return new jnb("downloads_page_recommendations_item_section_identifier", aqpb.a.createBuilder(), aaqfVar, k);
            }
            if (i == 4) {
                return new jnb("downloads_page_smart_downloads_item_section_identifier", aqpb.a.createBuilder(), aaqfVar, k);
            }
        }
        return new jnb("downloads_page_downloads_item_section_identifier", aqpb.a.mo52toBuilder(), aaqfVar, k);
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        if (!(aaqsVar instanceof jnb)) {
            return;
        }
        ayos.A(new jmy(this, (jnb) aaqsVar)).K(azpj.b(this.c)).G(azpj.b(this.e)).T(new jmx(afzfVar, 1), new jmx(afzfVar));
    }
}
