package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Revision;
import java.util.Date;
/* compiled from: RevisionScribe.java */
/* loaded from: classes.dex */
public class aq extends bg<Revision> {
    public aq() {
        super(Revision.class, "REV");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Revision b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        return a(str);
    }

    private Revision a(String str) {
        if (str == null || str.length() == 0) {
            return new Revision((Date) null);
        }
        try {
            return new Revision(h(str));
        } catch (IllegalArgumentException unused) {
            throw new ezvcard.a.a(5, new Object[0]);
        }
    }
}
