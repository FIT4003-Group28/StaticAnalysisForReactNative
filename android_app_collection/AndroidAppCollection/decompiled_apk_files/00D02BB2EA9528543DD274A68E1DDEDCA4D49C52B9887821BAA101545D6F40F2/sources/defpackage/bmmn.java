package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmmn  reason: default package */
/* loaded from: classes3.dex */
public class bmmn implements aeqk {
    private final gga a;
    private final ilo b;
    private final dfyz c;

    public bmmn(gga ggaVar, ilo iloVar) {
        this.a = ggaVar;
        this.b = iloVar;
        dfyz cU = iloVar.cU();
        dbsk.s(cU);
        this.c = cU;
    }

    @Override // defpackage.aeqk
    public String a() {
        if (bmmj.a(this.b)) {
            return this.a.getString(R.string.ADMISSION_PRICES_PRICE_TAG_CONTENT_DESCRIPTION_SHOW_TICKET_OPTIONS, new Object[]{b()});
        }
        return this.a.getString(R.string.ADMISSION_PRICES_PRICE_TAG_CONTENT_DESCRIPTION_SHOW_PLACE_DETAILS, new Object[]{b()});
    }

    @Override // defpackage.aeqk
    public String b() {
        return this.c.e;
    }

    @Override // defpackage.aeqk
    public cqss c() {
        return ibm.c();
    }

    @Override // defpackage.aeqk
    public aeqj d() {
        throw null;
    }
}
