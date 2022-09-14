package ezvcard.a.b;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Organization;
/* compiled from: OrganizationScribe.java */
/* loaded from: classes.dex */
public class aj extends bg<Organization> {
    public aj() {
        super(Organization.class, "ORG");
    }

    @Override // ezvcard.a.b.bg
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.a.b.bg
    /* renamed from: a */
    public Organization b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ezvcard.a.c cVar) {
        Organization organization = new Organization();
        organization.getValues().addAll(com.b.a.a.b.e.c(str));
        return organization;
    }
}
