package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bkap  reason: default package */
/* loaded from: classes3.dex */
public final class bkap implements bkal {
    private final gga a;
    private final bkao b;
    private final cjtd c;

    public bkap(gga ggaVar, bkao bkaoVar, cjtd cjtdVar) {
        this.a = ggaVar;
        this.b = bkaoVar;
        this.c = cjtdVar;
    }

    @Override // defpackage.bkal
    public final void a(dqcq dqcqVar, int i) {
        if (i != 2) {
            bjeo bjeoVar = ((bjen) this.b).a;
            if ((i ^ 1) != 0) {
                bjeoVar.c.add(dqcqVar);
            } else {
                bjeoVar.c.remove(dqcqVar);
            }
            bjeo.b(bjeoVar.a, bjeoVar.c);
            bjeoVar.d.b(bjeoVar.c.size());
            cqkx.p(bjeoVar);
        }
    }

    @Override // defpackage.bkal
    public final CharSequence b(dqcq dqcqVar, int i) {
        return this.a.getString(i != 0 ? i != 1 ? R.string.PLACE_QA_ADD_TAGS_PAGE_TAG_DEFAULT_CONTENT_DESCRIPTION : R.string.PLACE_QA_ADD_TAGS_PAGE_TAG_SELECTED_CONTENT_DESCRIPTION : R.string.PLACE_QA_ADD_TAGS_PAGE_TAG_ENABLED_CONTENT_DESCRIPTION, new Object[]{dqcqVar.a});
    }

    @Override // defpackage.bkal
    public final cjtd c(int i) {
        if (i == 1 || i == 0) {
            cjta c = cjtd.c(this.c);
            c.d = i == 1 ? dtxl.U : dtxl.V;
            return c.a();
        }
        return cjtd.b;
    }
}
