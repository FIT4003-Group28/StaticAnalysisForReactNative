package ezvcard.a.b;

import ezvcard.property.Anniversary;
import ezvcard.util.PartialDate;
import java.util.Date;
/* compiled from: AnniversaryScribe.java */
/* loaded from: classes.dex */
public class c extends l<Anniversary> {
    public c() {
        super(Anniversary.class, "ANNIVERSARY");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Anniversary b(String str) {
        return new Anniversary(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Anniversary b(Date date, boolean z) {
        return new Anniversary(date, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Anniversary b(PartialDate partialDate) {
        return new Anniversary(partialDate);
    }
}
