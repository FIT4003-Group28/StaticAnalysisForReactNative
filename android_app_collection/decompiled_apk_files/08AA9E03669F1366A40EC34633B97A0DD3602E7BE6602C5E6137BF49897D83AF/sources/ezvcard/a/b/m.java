package ezvcard.a.b;

import ezvcard.property.Deathdate;
import ezvcard.util.PartialDate;
import java.util.Date;
/* compiled from: DeathdateScribe.java */
/* loaded from: classes.dex */
public class m extends l<Deathdate> {
    public m() {
        super(Deathdate.class, "DEATHDATE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Deathdate b(String str) {
        return new Deathdate(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Deathdate b(Date date, boolean z) {
        return new Deathdate(date, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.l
    /* renamed from: a */
    public Deathdate b(PartialDate partialDate) {
        return new Deathdate(partialDate);
    }
}
