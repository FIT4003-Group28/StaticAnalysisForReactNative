package ezvcard.a.b;

import ezvcard.property.Birthday;
import ezvcard.util.PartialDate;
import java.util.Date;
/* compiled from: BirthdayScribe.java */
/* loaded from: classes.dex */
public class e extends l<Birthday> {
    public e() {
        super(Birthday.class, "BDAY");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Birthday b(String str) {
        return new Birthday(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Birthday b(Date date, boolean z) {
        return new Birthday(date, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Birthday b(PartialDate partialDate) {
        return new Birthday(partialDate);
    }
}
